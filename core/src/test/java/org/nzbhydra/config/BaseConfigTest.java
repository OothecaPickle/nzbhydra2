package org.nzbhydra.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.google.common.collect.Sets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.nzbhydra.config.category.Category;
import org.nzbhydra.config.indexer.IndexerConfig;
import org.reflections.Reflections;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class BaseConfigTest {

    //If true the actual content of the config in code and in baseConfig.yml will be compared
    //If false only the structure will be compare, meaning both sides have to have the same keys but the values can be different
    private static final boolean COMPARE_CONFIG_VALUES = false;
    private Set<String> dontCheckTheseLists = Sets.newHashSet("categories");

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    private BaseConfig testee = new BaseConfig();


    @Test
    void shouldRecognizeRestartRequired() {
        MainConfig mainConfig1 = new MainConfig();
        mainConfig1.setPort(123);
        MainConfig mainConfig2 = new MainConfig();
        mainConfig2.setPort(234);
        assertTrue(mainConfig1.isRestartNeeded(mainConfig2));

        mainConfig2.setPort(123);
        assertThat(mainConfig1.isRestartNeeded(mainConfig2)).isFalse();

        mainConfig1.setSsl(true);
        mainConfig2.setSsl(false);
        assertTrue(mainConfig1.isRestartNeeded(mainConfig2));
    }

    @Test
    void applicationPropertiesShouldHaveTheSameKeysAsConfigClasses() throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        jsonMapper.registerModule(new Jdk8Module());
        String jsonFromBaseConfig = jsonMapper.writeValueAsString(new BaseConfig());

        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
        yamlMapper.registerModule(new Jdk8Module());
        BufferedReader reader = new BufferedReader(new InputStreamReader(BaseConfig.class.getResource("/config/baseConfig.yml").openStream()));
        String applicationYmlContent = reader.lines().collect(Collectors.joining("\n"));
        BaseConfig fromApplicationYml = yamlMapper.readValue(applicationYmlContent, BaseConfig.class);
        String jsonFromApplicationProperties = jsonMapper.writeValueAsString(fromApplicationYml);

        if (COMPARE_CONFIG_VALUES) {
            assertEquals("JSON generated from baseConfig.yml and base config should be the same", jsonFromApplicationProperties, jsonFromBaseConfig);
        }

        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
        };
        HashMap<String, Object> mapFromApplicationYml = yamlMapper.readValue(applicationYmlContent, typeRef);
        HashMap<String, Object> mapFromBaseConfig = jsonMapper.readValue(jsonFromBaseConfig, typeRef);

        compare(mapFromApplicationYml, mapFromBaseConfig);
    }

    @Test
    void shouldValidateIndexers() {
        IndexerConfig indexerConfigMock = mock(IndexerConfig.class);
        when(indexerConfigMock.validateConfig(any(), any(), any())).thenReturn(new ValidatingConfig.ConfigValidationResult(true, false, new ArrayList<String>(), new ArrayList<String>()));
        testee.getIndexers().add(indexerConfigMock);
        testee.validateConfig(new BaseConfig(), testee, new BaseConfig());
        verify(indexerConfigMock).validateConfig(any(), any(), any());
    }

    @Test
    void shouldRecognizeDuplicateIndexerNames() {
        IndexerConfig indexerConfigMock = mock(IndexerConfig.class);
        when(indexerConfigMock.getName()).thenReturn("name");
        IndexerConfig indexerConfigMock2 = mock(IndexerConfig.class);
        when(indexerConfigMock2.getName()).thenReturn("name");
        when(indexerConfigMock.validateConfig(any(), any(), any())).thenReturn(new ValidatingConfig.ConfigValidationResult(true, false, new ArrayList<String>(), new ArrayList<String>()));
        when(indexerConfigMock2.validateConfig(any(), any(), any())).thenReturn(new ValidatingConfig.ConfigValidationResult(true, false, new ArrayList<String>(), new ArrayList<String>()));
        testee.getIndexers().add(indexerConfigMock);
        testee.getIndexers().add(indexerConfigMock2);
        ValidatingConfig.ConfigValidationResult result = testee.validateConfig(new BaseConfig(), testee, new BaseConfig());
        assertThat(result.getErrorMessages()).hasSize(3);
        assertTrue(result.getErrorMessages().get(2).contains("Duplicate"));
    }

    @Test
    void shouldInitializeAllListsAsEmptyInBaseConfigYaml() throws Exception {
        BaseConfig baseConfig = new ConfigReaderWriter().originalConfig();
        validateListsNotNull(baseConfig);
    }

    @Test
    void shouldInitializeAllListsAsEmptyInClasses() throws Exception {
        Reflections reflections = new Reflections("org.nzbhydra");
        Set<Class<? extends ValidatingConfig>> classes = reflections.getSubTypesOf(ValidatingConfig.class);
        for (Class<? extends ValidatingConfig> configClass : classes) {
            boolean constructorFound = false;
            for (Constructor<?> constructor : configClass.getDeclaredConstructors()) {
                if (constructor.getParameterCount() == 0) {
                    ValidatingConfig config = (ValidatingConfig) constructor.newInstance();
                    validateListsNotNull(config);
                    constructorFound = true;
                    break;
                }
            }
            assertTrue(constructorFound, "No default constructor found for class " + configClass.getName());
        }
    }

    protected void validateListsNotNull(ValidatingConfig config) throws IntrospectionException, IllegalAccessException, InvocationTargetException {
        BeanInfo beanInfo = Introspector.getBeanInfo(config.getClass());
        for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
            if (pd.getReadMethod().getReturnType().isAssignableFrom(List.class)) {
                List list = (List) pd.getReadMethod().invoke(config);
                assertNotNull(list, "Property of " + config.getClass().getName() + "#" + pd.getReadMethod().getName() + " should be initialized as empty list");
                if (!list.isEmpty()) {
                    if (list.get(0).getClass().getSuperclass() == ValidatingConfig.class) {
                        for (Object o : list) {
                            validateListsNotNull((ValidatingConfig) o);
                        }
                    }
                }
            } else if (pd.getReadMethod().getReturnType().getSuperclass() == ValidatingConfig.class) {
                ValidatingConfig subConfig = (ValidatingConfig) pd.getReadMethod().invoke(config);
                validateListsNotNull(subConfig);
            }
        }
    }

    private void compare(Object left, Object right) {
        if (left instanceof HashMap) {
            compareMaps((HashMap) left, (HashMap) right);
        } else if (left instanceof List) {
            compareLists((List) left, (List) right);
        } else {
            assertEquals(left, left, "Setting in baseConfig.yml is different than in base config");
        }
    }

    private void compareMaps(HashMap<String, Object> left, HashMap<String, Object> right) {
        for (Entry<String, Object> entry : left.entrySet()) {
            assertTrue(right.containsKey(entry.getKey()), entry.getValue() + " is contained in baseConfig.yml but not in base config");
            if (entry.getValue() instanceof LinkedHashMap) {
                compareMaps((HashMap) entry.getValue(), (HashMap) right.get(entry.getKey()));
            } else if (entry.getValue() instanceof List) {
                if (!dontCheckTheseLists.contains(entry.getKey())) {
                    compareLists((List) entry.getValue(), (List) right.get(entry.getKey()));
                }
            } else if (COMPARE_CONFIG_VALUES) {
                assertEquals(entry.getValue(), right.get(entry.getKey()), "Setting " + entry.getKey() + " in baseConfig.yml is different than in base config");
            }
        }
        Set<String> rightKeys = right.keySet();
        rightKeys.removeAll(left.keySet());
        if (!rightKeys.isEmpty()) {
            fail("Some keys in base config are not contained in the baseConfig.yml: " + rightKeys);
        }
    }


    private void compareLists(List left, List right) {
        if (right == null || left.contains(".mp4") || left.contains("nzbgeek.info")) { //Don't compare the list for trailing stuff to be removed, it's just too much stuff in there
            return;
        }
        if (left.size() != right.size()) {
            List newLeft = new ArrayList(left);
            newLeft.removeAll(right);
            if (!newLeft.isEmpty()) {
                fail("Different lists. Found in left but not right: " + newLeft);
            }
            List newRight = new ArrayList(right);
            newRight.removeAll(left);
            if (!newRight.isEmpty()) {
                fail("Different lists. Found in right but not left: " + newRight);
            }
        }
        assertEquals(left.size(), right.size(), "Both should contain the same amount of config entries");
        if (COMPARE_CONFIG_VALUES) {
            for (int i = 0; i < left.size(); i++) {
                Object l = left.get(i);
                assertThat(right.getClass()).isEqualTo(l.getClass());
                if (l instanceof Category) {
                    assertTrue(((Category) l).deepEquals((Category) right.get(i)), "Both categories should be the same");
                } else {
                    assertEquals(l, right.get(i), "Setting in baseConfig.yml is different than in base config");
                }
            }
        }
    }

}
