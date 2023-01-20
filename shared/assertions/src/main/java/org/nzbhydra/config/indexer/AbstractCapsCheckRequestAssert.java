package org.nzbhydra.config.indexer;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link CapsCheckRequest} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractCapsCheckRequestAssert<S extends AbstractCapsCheckRequestAssert<S, A>, A extends CapsCheckRequest> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractCapsCheckRequestAssert}</code> to make assertions on actual CapsCheckRequest.
     *
     * @param actual the CapsCheckRequest we want to make assertions on.
     */
    protected AbstractCapsCheckRequestAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual CapsCheckRequest's checkType is equal to the given one.
     *
     * @param checkType the given checkType to compare the actual CapsCheckRequest's checkType to.
     * @return this assertion object.
     * @throws AssertionError - if the actual CapsCheckRequest's checkType is not equal to the given one.
     */
    public S hasCheckType(CapsCheckRequest.CheckType checkType) {
        // check that actual CapsCheckRequest we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting checkType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        CapsCheckRequest.CheckType actualCheckType = actual.getCheckType();
        if (!Objects.areEqual(actualCheckType, checkType)) {
            failWithMessage(assertjErrorMessage, actual, checkType, actualCheckType);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CapsCheckRequest's indexerConfig is equal to the given one.
     *
     * @param indexerConfig the given indexerConfig to compare the actual CapsCheckRequest's indexerConfig to.
     * @return this assertion object.
     * @throws AssertionError - if the actual CapsCheckRequest's indexerConfig is not equal to the given one.
     */
    public S hasIndexerConfig(IndexerConfig indexerConfig) {
        // check that actual CapsCheckRequest we want to make assertions on is not null.
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
