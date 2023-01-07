package org.nzbhydra.config.auth;

/**
 * {@link AuthType} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractAuthTypeAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class AuthTypeAssert extends AbstractAuthTypeAssert<AuthTypeAssert, AuthType> {

    /**
     * Creates a new <code>{@link AuthTypeAssert}</code> to make assertions on actual AuthType.
     *
     * @param actual the AuthType we want to make assertions on.
     */
    public AuthTypeAssert(AuthType actual) {
        super(actual, AuthTypeAssert.class);
    }

    /**
     * An entry point for AuthTypeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myAuthType)</code> and get specific assertion with code completion.
     *
     * @param actual the AuthType we want to make assertions on.
     * @return a new <code>{@link AuthTypeAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static AuthTypeAssert assertThat(AuthType actual) {
        return new AuthTypeAssert(actual);
    }
}
