package org.nzbhydra.searching;

import com.google.common.collect.HashMultiset;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.nzbhydra.config.BaseConfig;
import org.nzbhydra.config.ConfigProvider;
import org.nzbhydra.config.SearchSourceRestriction;
import org.nzbhydra.config.SearchingConfig;
import org.nzbhydra.config.category.Category;
import org.nzbhydra.config.indexer.IndexerConfig;
import org.nzbhydra.indexers.Indexer;
import org.nzbhydra.indexers.IndexerEntity;
import org.nzbhydra.indexers.Newznab;
import org.nzbhydra.searching.dtoseventsenums.SearchResultItem;
import org.nzbhydra.searching.searchrequests.InternalData;
import org.nzbhydra.searching.searchrequests.SearchRequest;
import org.nzbhydra.searching.searchrequests.SearchRequest.SearchSource;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.when;

public class SearchResultAcceptorTest {

    @Mock
    private BaseConfig baseConfig;
    private SearchResultItem item;
    @Mock
    private SearchingConfig searchingConfig;
    @Mock
    private SearchRequest searchRequest;
    @Mock
    private IndexerConfig indexerConfig;
    @Mock
    private ConfigProvider configProvider;
    private InternalData internalData = new InternalData();
    private Category category = new Category();

    @InjectMocks
    private SearchResultAcceptor testee = new SearchResultAcceptor();

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(configProvider.getBaseConfig()).thenReturn(baseConfig);
        when(baseConfig.getSearching()).thenReturn(searchingConfig);
        when(searchingConfig.isIgnorePassworded()).thenReturn(false);
        when(indexerConfig.getHost()).thenReturn("someHost");
        when(searchRequest.getInternalData()).thenReturn(internalData);
        when(searchRequest.getCategory()).thenReturn(category);
        item = new SearchResultItem();
        item.setCategory(category);
    }

    @Test
    public void shouldCheckForRequiredWords() throws Exception {
        internalData.getRequiredWords().clear();
        internalData.getRequiredWords().add("abc.def");
        item.setTitle("abc.def ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abc.DEF ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abc.dEF ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abcdef ghi");
        assertFalse(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abc def ghi");
        assertFalse(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));

        internalData.getRequiredWords().clear();
        internalData.getRequiredWords().add("abc");
        item.setTitle("abc def ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abc.def ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abcdef ghi");
        assertFalse(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("def ghi");
        assertFalse(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));

        internalData.getRequiredWords().add("def");
        item.setTitle("abc def ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abc de");
        assertFalse(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));

        internalData.getRequiredWords().add("def");
        item.setTitle("abc def ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abc DEF ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
        item.setTitle("abc dEF ghi");
        assertTrue(testee.checkRequiredWords(HashMultiset.create(), internalData.getRequiredWords(), item, null));
    }


    @Test
    public void shouldCheckForForbiddenWords() throws Exception {
        internalData.getForbiddenWords().clear();
        internalData.getForbiddenWords().add("abc.def");
        item.setTitle("abc.def ghi");
        assertFalse(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
        item.setTitle("abc.DEF ghi");
        assertFalse(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
        item.setTitle("abc.dEF ghi");
        assertFalse(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));

        item.setTitle("abcdef ghi");
        assertTrue(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
        item.setTitle("abc def ghi");
        assertTrue(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));


        internalData.getForbiddenWords().clear();
        internalData.getForbiddenWords().add("abc");
        item.setTitle("abc def ghi");
        assertFalse(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
        item.setTitle("ABC def ghi");
        assertFalse(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
        item.setTitle("aBC def ghi");
        assertFalse(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
        item.setTitle("abcdef ghi");
        assertTrue(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
        item.setTitle("def ghi");
        assertTrue(testee.checkForForbiddenWords(indexerConfig, HashMultiset.create(), internalData.getForbiddenWords(), item, null));
    }

    @Test
    public void shouldCheckForPassword() throws Exception {
        when(searchingConfig.isIgnorePassworded()).thenReturn(false);
        SearchResultItem item = new SearchResultItem();

        item.setPassworded(false);
        assertTrue(testee.checkForPassword(HashMultiset.create(), item));

        item.setPassworded(true);
        assertTrue(testee.checkForPassword(HashMultiset.create(), item));

        when(searchingConfig.isIgnorePassworded()).thenReturn(true);
        item.setPassworded(false);
        assertTrue(testee.checkForPassword(HashMultiset.create(), item));

        item.setPassworded(true);
        assertFalse(testee.checkForPassword(HashMultiset.create(), item));
    }

    @Test
    public void shouldCheckForAge() {
        when(searchRequest.getMinage()).thenReturn(Optional.of(10));
        when(searchRequest.getMaxage()).thenReturn(Optional.of(100));
        SearchResultItem item = new SearchResultItem();

        item.setPubDate(Instant.now().minus(20, ChronoUnit.DAYS));
        assertTrue(testee.checkForAge(searchRequest, HashMultiset.create(), item));

        item.setPubDate(Instant.now().minus(5, ChronoUnit.DAYS));
        assertFalse(testee.checkForAge(searchRequest, HashMultiset.create(), item));

        item.setPubDate(Instant.now().plus(105, ChronoUnit.DAYS));
        assertFalse(testee.checkForAge(searchRequest, HashMultiset.create(), item));
    }

    @Test
    public void shouldCheckForSize() {
        when(searchRequest.getMinsize()).thenReturn(Optional.of(10));
        when(searchRequest.getMaxsize()).thenReturn(Optional.of(100));
        SearchResultItem item = new SearchResultItem();
        item.setCategory(category);

        item.setSize(50 * 1024 * 1024L);
        assertTrue(testee.checkForSize(searchRequest, HashMultiset.create(), item));

        item.setSize(5 * 1024 * 1024L);
        assertFalse(testee.checkForSize(searchRequest, HashMultiset.create(), item));

        item.setSize(105 * 1024 * 1024L);
        assertFalse(testee.checkForSize(searchRequest, HashMultiset.create(), item));

        //Apply limits for API searches
        when(searchRequest.getMinsize()).thenReturn(Optional.empty());
        when(searchRequest.getMaxsize()).thenReturn(Optional.empty());

        category.setMaxSizePreset(1);
        category.setApplySizeLimitsToApi(true);
        when(searchRequest.getSource()).thenReturn(SearchSource.API);
        assertFalse(testee.checkForSize(searchRequest, HashMultiset.create(), item));
        when(searchRequest.getSource()).thenReturn(SearchSource.INTERNAL);
        assertTrue(testee.checkForSize(searchRequest, HashMultiset.create(), item));

        category.setMinSizePreset(null);
        category.setMinSizePreset(200);
        category.setApplySizeLimitsToApi(true);
        when(searchRequest.getSource()).thenReturn(SearchSource.API);
        assertFalse(testee.checkForSize(searchRequest, HashMultiset.create(), item));
        when(searchRequest.getSource()).thenReturn(SearchSource.INTERNAL);
        assertTrue(testee.checkForSize(searchRequest, HashMultiset.create(), item));
    }

    @Test
    public void shouldCheckForForbiddenPoster() {
        when(searchingConfig.getForbiddenPosters()).thenReturn(Arrays.asList("spammer"));

        item.setPoster("niceGuy");
        assertTrue(testee.checkForForbiddenPoster(HashMultiset.create(), item));

        item.setPoster(null);
        assertTrue(testee.checkForForbiddenPoster(HashMultiset.create(), item));

        item.setPoster("spammer");
        assertFalse(testee.checkForForbiddenPoster(HashMultiset.create(), item));

        when(searchingConfig.getForbiddenPosters()).thenReturn(Arrays.asList());
        assertTrue(testee.checkForForbiddenPoster(HashMultiset.create(), item));
    }

    @Test
    public void shouldCheckForForbiddenGroup() {
        when(searchingConfig.getForbiddenGroups()).thenReturn(Arrays.asList("spammergroup"));

        item.setGroup("niceGroup");
        assertTrue(testee.checkForForbiddenGroup(HashMultiset.create(), item));

        item.setGroup(null);
        assertTrue(testee.checkForForbiddenGroup(HashMultiset.create(), item));

        item.setGroup("spammergroup");
        assertFalse(testee.checkForForbiddenGroup(HashMultiset.create(), item));

        when(searchingConfig.getForbiddenGroups()).thenReturn(Collections.emptyList());
        assertTrue(testee.checkForForbiddenGroup(HashMultiset.create(), item));
    }

    @Test
    public void shouldCheckForForbiddenCategory() {
        category.setIgnoreResultsFrom(SearchSourceRestriction.BOTH);

        when(searchRequest.getSource()).thenReturn(SearchSource.INTERNAL);
        assertFalse(testee.checkForCategoryShouldBeIgnored(searchRequest, HashMultiset.create(), item));
        when(searchRequest.getSource()).thenReturn(SearchSource.API);
        assertFalse(testee.checkForCategoryShouldBeIgnored(searchRequest, HashMultiset.create(), item));

        category.setIgnoreResultsFrom(SearchSourceRestriction.API);

        when(searchRequest.getSource()).thenReturn(SearchSource.INTERNAL);
        assertTrue(testee.checkForCategoryShouldBeIgnored(searchRequest, HashMultiset.create(), item));
        when(searchRequest.getSource()).thenReturn(SearchSource.API);
        assertFalse(testee.checkForCategoryShouldBeIgnored(searchRequest, HashMultiset.create(), item));

        category.setIgnoreResultsFrom(SearchSourceRestriction.INTERNAL);

        when(searchRequest.getSource()).thenReturn(SearchSource.INTERNAL);
        assertFalse(testee.checkForCategoryShouldBeIgnored(searchRequest, HashMultiset.create(), item));
        when(searchRequest.getSource()).thenReturn(SearchSource.API);
        assertTrue(testee.checkForCategoryShouldBeIgnored(searchRequest, HashMultiset.create(), item));
    }

    @Test
    public void shouldCheckForCategoryDisabledForIndexer() {
        Indexer indexer = new Newznab(null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        indexer.initialize(indexerConfig, new IndexerEntity());
        item.setIndexer(indexer);

        //All categories enabled
        when(indexerConfig.getEnabledCategories()).thenReturn(Collections.emptyList());
        assertTrue(testee.checkForCategoryDisabledForIndexer(searchRequest, HashMultiset.create(), item));

        //Used category enabled
        when(indexerConfig.getEnabledCategories()).thenReturn(Arrays.asList(category.getName()));
        assertTrue(testee.checkForCategoryDisabledForIndexer(searchRequest, HashMultiset.create(), item));

        //Only other category enabled
        when(indexerConfig.getEnabledCategories()).thenReturn(Arrays.asList("Other"));
        assertFalse(testee.checkForCategoryDisabledForIndexer(searchRequest, HashMultiset.create(), item));
    }

    @Test
    public void shouldCheckRegexes() {
        item.setTitle("aabccd");
        assertTrue(testee.checkRegexes(item, HashMultiset.create(), "", ""));
        assertTrue(testee.checkRegexes(item, HashMultiset.create(), "a+b", ""));
        assertTrue(testee.checkRegexes(item, HashMultiset.create(), "", ""));
        assertFalse(testee.checkRegexes(item, HashMultiset.create(), "a+b", "c+d"));
        assertFalse(testee.checkRegexes(item, HashMultiset.create(), "", "c+d"));

        item.setTitle("My.favorite.Show.s01e03.720p.HDTV.mkv");
        assertTrue(testee.checkRegexes(item, HashMultiset.create(), "720p.HDTV", ""));
        assertTrue(testee.checkRegexes(item, HashMultiset.create(), "", "SDTV"));
        assertFalse(testee.checkRegexes(item, HashMultiset.create(), "", "720p.HDTV"));
        assertFalse(testee.checkRegexes(item, HashMultiset.create(), "Show", "720p.HDTV"));

        item.setTitle("My.favorite.camera.Show.s01e03.720p.HDTV.mkv");
        assertTrue(testee.checkRegexes(item, HashMultiset.create(), "", "\\.(SDTV|CAM)\\."));
        assertTrue(testee.checkRegexes(item, HashMultiset.create(), "(720p|1080p).*.mkv$", ""));
        item.setTitle("My.favorite.camera.Show.s01e03.720p.HDTV.avi");
        assertFalse(testee.checkRegexes(item, HashMultiset.create(), "(720p|1080p).*.mkv$", ""));
        item.setTitle("My.movie.about.mkv.avi");
        assertFalse(testee.checkRegexes(item, HashMultiset.create(), "\\.mkv$", ""));


    }


}
