package org.nzbhydra.downloading.downloaders.sabnzbd.mapping;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link HistoryResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractHistoryResponseAssert<S extends AbstractHistoryResponseAssert<S, A>, A extends HistoryResponse> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractHistoryResponseAssert}</code> to make assertions on actual HistoryResponse.
     *
     * @param actual the HistoryResponse we want to make assertions on.
     */
    protected AbstractHistoryResponseAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual HistoryResponse's history is equal to the given one.
     *
     * @param history the given history to compare the actual HistoryResponse's history to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryResponse's history is not equal to the given one.
     */
    public S hasHistory(History history) {
        // check that actual HistoryResponse we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting history of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        History actualHistory = actual.getHistory();
        if (!Objects.areEqual(actualHistory, history)) {
            failWithMessage(assertjErrorMessage, actual, history, actualHistory);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
