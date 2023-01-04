/*
 *  (C) Copyright 2023 TheOtherP (theotherp@posteo.net)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.nzbhydra.config;

import com.google.common.base.Strings;
import org.nzbhydra.config.validation.ConfigValidationResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class ValidatingConfig<T> {

    private static final Logger logger = LoggerFactory.getLogger(ValidatingConfig.class);

    /**
     * @param oldConfig old config state (e.g. to compare what has changed)
     * @param newConfig the new config. Will always be the same object as the one on which the method was called
     * @param newBaseConfig
     * @return a list of error messages or an empty list when everything is fine
     */
    public abstract ConfigValidationResult validateConfig(BaseConfig oldConfig, T newConfig, BaseConfig newBaseConfig);

    protected void checkRegex(List<String> errorMessages, String regex, String errorMessage) {
        if (!Strings.isNullOrEmpty(regex)) {
            try {
                Pattern.compile(regex);
            } catch (PatternSyntaxException e) {
                errorMessages.add(errorMessage);
            }
        }
    }

    /**
     * Detects if any setting was changed that requires a restart to be effective
     *
     * @param configToCompare the old config (its settings will be compared with the ones from the calling instance)
     * @return
     */
    protected boolean isRestartNeeded(Object configToCompare) {
        for (Field field : configToCompare.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(RestartRequired.class)) {
                try {
                    //PropertyDescriptor doesn't work for some reason, this is just as fine for what we need
                    String getterName = (field.getType() == Boolean.class || field.getType() == boolean.class ? "is" : "get") + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                    Method method = configToCompare.getClass().getDeclaredMethod(getterName);
                    Object oldValue = method.invoke(configToCompare);
                    Object newValue = method.invoke(this);

                    if (!Objects.equals(oldValue, newValue)) {
                        logger.debug("Restart needed because field {} has changed", field.getName());
                        return true;
                    }
                } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
                    logger.error("Unable to determine if field '{}' in class {} was changed", field.getName(), configToCompare.getClass().getName());
                }
            }
        }
        return false;
    }

    /**
     * Called before the config is saved after the user made some changes. Use this to convert data, e.g. passwords.
     *
     * @param oldBaseConfig
     */
    public abstract T prepareForSaving(BaseConfig oldBaseConfig);

    /**
     * Called before the config is transferred to the GUI. Use this to prepare data, e.g. passwords.
     */
    public abstract T updateAfterLoading();

    /**
     * Called for a new config to initialize itself
     */
    public abstract T initializeNewConfig();


}
