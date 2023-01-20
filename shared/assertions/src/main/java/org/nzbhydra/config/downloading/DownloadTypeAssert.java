package org.nzbhydra.config.downloading;

/**
 * {@link DownloadType} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractDownloadTypeAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class DownloadTypeAssert extends AbstractDownloadTypeAssert<DownloadTypeAssert, DownloadType> {

    /**
     * Creates a new <code>{@link DownloadTypeAssert}</code> to make assertions on actual DownloadType.
     *
     * @param actual the DownloadType we want to make assertions on.
     */
    public DownloadTypeAssert(DownloadType actual) {
        super(actual, DownloadTypeAssert.class);
    }

    /**
     * An entry point for DownloadTypeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myDownloadType)</code> and get specific assertion with code completion.
     *
     * @param actual the DownloadType we want to make assertions on.
     * @return a new <code>{@link DownloadTypeAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static DownloadTypeAssert assertThat(DownloadType actual) {
        return new DownloadTypeAssert(actual);
    }
}
