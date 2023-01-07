package org.nzbhydra.config.indexer;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link CheckCapsResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractCheckCapsResponseAssert<S extends AbstractCheckCapsResponseAssert<S, A>, A extends CheckCapsResponse> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractCheckCapsResponseAssert}</code> to make assertions on actual CheckCapsResponse.
     *
     * @param actual the CheckCapsResponse we want to make assertions on.
     */
    protected AbstractCheckCapsResponseAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual CheckCapsResponse is all caps checked.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual CheckCapsResponse is not all caps checked.
     */
    public S isAllCapsChecked() {
        // check that actual CheckCapsResponse we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isAllCapsChecked()) {
            failWithMessage("\nExpecting that actual CheckCapsResponse is all caps checked but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CheckCapsResponse is not all caps checked.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual CheckCapsResponse is all caps checked.
     */
    public S isNotAllCapsChecked() {
        // check that actual CheckCapsResponse we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isAllCapsChecked()) {
            failWithMessage("\nExpecting that actual CheckCapsResponse is not all caps checked but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CheckCapsResponse is config complete.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual CheckCapsResponse is not config complete.
     */
    public S isConfigComplete() {
        // check that actual CheckCapsResponse we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isConfigComplete()) {
            failWithMessage("\nExpecting that actual CheckCapsResponse is config complete but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CheckCapsResponse is not config complete.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual CheckCapsResponse is config complete.
     */
    public S isNotConfigComplete() {
        // check that actual CheckCapsResponse we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isConfigComplete()) {
            failWithMessage("\nExpecting that actual CheckCapsResponse is not config complete but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CheckCapsResponse's indexerConfig is equal to the given one.
     *
     * @param indexerConfig the given indexerConfig to compare the actual CheckCapsResponse's indexerConfig to.
     * @return this assertion object.
     * @throws AssertionError - if the actual CheckCapsResponse's indexerConfig is not equal to the given one.
     */
    public S hasIndexerConfig(IndexerConfig indexerConfig) {
        // check that actual CheckCapsResponse we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting indexerConfig of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        IndexerConfig actualIndexerConfig = actual.getIndexerConfig();
        if (!Objects.areEqual(actualIndexerConfig, indexerConfig)) {
            failWithMessage(assertjErrorMessage, actual, indexerConfig, actualIndexerConfig);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
