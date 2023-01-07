package org.nzbhydra.mapping.newznab;

import org.assertj.core.api.AbstractComparableAssert;

/**
 * Abstract base class for {@link ActionAttribute} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractActionAttributeAssert<S extends AbstractActionAttributeAssert<S, A>, A extends ActionAttribute> extends AbstractComparableAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractActionAttributeAssert}</code> to make assertions on actual ActionAttribute.
     *
     * @param actual the ActionAttribute we want to make assertions on.
     */
    protected AbstractActionAttributeAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual ActionAttribute is search.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual ActionAttribute is not search.
     */
    public S isSearch() {
        // check that actual ActionAttribute we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isSearch()) {
            failWithMessage("\nExpecting that actual ActionAttribute is search but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual ActionAttribute is not search.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual ActionAttribute is search.
     */
    public S isNotSearch() {
        // check that actual ActionAttribute we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isSearch()) {
            failWithMessage("\nExpecting that actual ActionAttribute is not search but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

}
