package org.nzbhydra.config.mediainfo;

/**
 * {@link MediaIdType} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractMediaIdTypeAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class MediaIdTypeAssert extends AbstractMediaIdTypeAssert<MediaIdTypeAssert, MediaIdType> {

    /**
     * Creates a new <code>{@link MediaIdTypeAssert}</code> to make assertions on actual MediaIdType.
     *
     * @param actual the MediaIdType we want to make assertions on.
     */
    public MediaIdTypeAssert(MediaIdType actual) {
        super(actual, MediaIdTypeAssert.class);
    }

    /**
     * An entry point for MediaIdTypeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myMediaIdType)</code> and get specific assertion with code completion.
     *
     * @param actual the MediaIdType we want to make assertions on.
     * @return a new <code>{@link MediaIdTypeAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static MediaIdTypeAssert assertThat(MediaIdType actual) {
        return new MediaIdTypeAssert(actual);
    }
}