package org.nzbhydra.searching.dtoseventsenums;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link IndexerSearchMetaData} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractIndexerSearchMetaDataAssert<S extends AbstractIndexerSearchMetaDataAssert<S, A>, A extends IndexerSearchMetaData> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractIndexerSearchMetaDataAssert}</code> to make assertions on actual IndexerSearchMetaData.
     *
     * @param actual the IndexerSearchMetaData we want to make assertions on.
     */
    protected AbstractIndexerSearchMetaDataAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is did search.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is not did search.
     */
    public S isDidSearch() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isDidSearch()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is did search but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is not did search.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is did search.
     */
    public S isNotDidSearch() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isDidSearch()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is not did search but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData's errorMessage is equal to the given one.
     *
     * @param errorMessage the given errorMessage to compare the actual IndexerSearchMetaData's errorMessage to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData's errorMessage is not equal to the given one.
     */
    public S hasErrorMessage(String errorMessage) {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting errorMessage of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualErrorMessage = actual.getErrorMessage();
        if (!Objects.areEqual(actualErrorMessage, errorMessage)) {
            failWithMessage(assertjErrorMessage, actual, errorMessage, actualErrorMessage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is has more results.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is not has more results.
     */
    public S isHasMoreResults() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isHasMoreResults()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is has more results but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is not has more results.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is has more results.
     */
    public S isNotHasMoreResults() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isHasMoreResults()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is not has more results but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData's indexerName is equal to the given one.
     *
     * @param indexerName the given indexerName to compare the actual IndexerSearchMetaData's indexerName to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData's indexerName is not equal to the given one.
     */
    public S hasIndexerName(String indexerName) {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting indexerName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualIndexerName = actual.getIndexerName();
        if (!Objects.areEqual(actualIndexerName, indexerName)) {
            failWithMessage(assertjErrorMessage, actual, indexerName, actualIndexerName);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData's notPickedReason is equal to the given one.
     *
     * @param notPickedReason the given notPickedReason to compare the actual IndexerSearchMetaData's notPickedReason to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData's notPickedReason is not equal to the given one.
     */
    public S hasNotPickedReason(String notPickedReason) {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting notPickedReason of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualNotPickedReason = actual.getNotPickedReason();
        if (!Objects.areEqual(actualNotPickedReason, notPickedReason)) {
            failWithMessage(assertjErrorMessage, actual, notPickedReason, actualNotPickedReason);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData's numberOfAvailableResults is equal to the given one.
     *
     * @param numberOfAvailableResults the given numberOfAvailableResults to compare the actual IndexerSearchMetaData's numberOfAvailableResults to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData's numberOfAvailableResults is not equal to the given one.
     */
    public S hasNumberOfAvailableResults(int numberOfAvailableResults) {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting numberOfAvailableResults of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualNumberOfAvailableResults = actual.getNumberOfAvailableResults();
        if (actualNumberOfAvailableResults != numberOfAvailableResults) {
            failWithMessage(assertjErrorMessage, actual, numberOfAvailableResults, actualNumberOfAvailableResults);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData's numberOfFoundResults is equal to the given one.
     *
     * @param numberOfFoundResults the given numberOfFoundResults to compare the actual IndexerSearchMetaData's numberOfFoundResults to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData's numberOfFoundResults is not equal to the given one.
     */
    public S hasNumberOfFoundResults(int numberOfFoundResults) {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting numberOfFoundResults of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualNumberOfFoundResults = actual.getNumberOfFoundResults();
        if (actualNumberOfFoundResults != numberOfFoundResults) {
            failWithMessage(assertjErrorMessage, actual, numberOfFoundResults, actualNumberOfFoundResults);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData's offset is equal to the given one.
     *
     * @param offset the given offset to compare the actual IndexerSearchMetaData's offset to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData's offset is not equal to the given one.
     */
    public S hasOffset(int offset) {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting offset of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualOffset = actual.getOffset();
        if (actualOffset != offset) {
            failWithMessage(assertjErrorMessage, actual, offset, actualOffset);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData's responseTime is equal to the given one.
     *
     * @param responseTime the given responseTime to compare the actual IndexerSearchMetaData's responseTime to.
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData's responseTime is not equal to the given one.
     */
    public S hasResponseTime(long responseTime) {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting responseTime of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        long actualResponseTime = actual.getResponseTime();
        if (actualResponseTime != responseTime) {
            failWithMessage(assertjErrorMessage, actual, responseTime, actualResponseTime);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is total results known.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is not total results known.
     */
    public S isTotalResultsKnown() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isTotalResultsKnown()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is total results known but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is not total results known.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is total results known.
     */
    public S isNotTotalResultsKnown() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isTotalResultsKnown()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is not total results known but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is was successful.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is not was successful.
     */
    public S isWasSuccessful() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isWasSuccessful()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is was successful but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual IndexerSearchMetaData is not was successful.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual IndexerSearchMetaData is was successful.
     */
    public S isNotWasSuccessful() {
        // check that actual IndexerSearchMetaData we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isWasSuccessful()) {
            failWithMessage("\nExpecting that actual IndexerSearchMetaData is not was successful but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

}
