package org.nzbhydra.downloading.downloaders.sabnzbd.mapping;

/**
 * {@link CategoriesResponse} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractCategoriesResponseAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class CategoriesResponseAssert extends AbstractCategoriesResponseAssert<CategoriesResponseAssert, CategoriesResponse> {

    /**
     * Creates a new <code>{@link CategoriesResponseAssert}</code> to make assertions on actual CategoriesResponse.
     *
     * @param actual the CategoriesResponse we want to make assertions on.
     */
    public CategoriesResponseAssert(CategoriesResponse actual) {
        super(actual, CategoriesResponseAssert.class);
    }

    /**
     * An entry point for CategoriesResponseAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myCategoriesResponse)</code> and get specific assertion with code completion.
     *
     * @param actual the CategoriesResponse we want to make assertions on.
     * @return a new <code>{@link CategoriesResponseAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static CategoriesResponseAssert assertThat(CategoriesResponse actual) {
        return new CategoriesResponseAssert(actual);
    }
}
