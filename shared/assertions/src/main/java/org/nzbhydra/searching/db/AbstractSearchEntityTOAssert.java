package org.nzbhydra.searching.db;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link SearchEntityTO} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractSearchEntityTOAssert<S extends AbstractSearchEntityTOAssert<S, A>, A extends SearchEntityTO> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractSearchEntityTOAssert}</code> to make assertions on actual SearchEntityTO.
     *
     * @param actual the SearchEntityTO we want to make assertions on.
     */
    protected AbstractSearchEntityTOAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual SearchEntityTO's author is equal to the given one.
     *
     * @param author the given author to compare the actual SearchEntityTO's author to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's author is not equal to the given one.
     */
    public S hasAuthor(String author) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting author of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualAuthor = actual.getAuthor();
        if (!Objects.areEqual(actualAuthor, author)) {
            failWithMessage(assertjErrorMessage, actual, author, actualAuthor);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's categoryName is equal to the given one.
     *
     * @param categoryName the given categoryName to compare the actual SearchEntityTO's categoryName to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's categoryName is not equal to the given one.
     */
    public S hasCategoryName(String categoryName) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting categoryName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualCategoryName = actual.getCategoryName();
        if (!Objects.areEqual(actualCategoryName, categoryName)) {
            failWithMessage(assertjErrorMessage, actual, categoryName, actualCategoryName);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's episode is equal to the given one.
     *
     * @param episode the given episode to compare the actual SearchEntityTO's episode to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's episode is not equal to the given one.
     */
    public S hasEpisode(String episode) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting episode of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualEpisode = actual.getEpisode();
        if (!Objects.areEqual(actualEpisode, episode)) {
            failWithMessage(assertjErrorMessage, actual, episode, actualEpisode);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's id is equal to the given one.
     *
     * @param id the given id to compare the actual SearchEntityTO's id to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's id is not equal to the given one.
     */
    public S hasId(int id) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualId = actual.getId();
        if (actualId != id) {
            failWithMessage(assertjErrorMessage, actual, id, actualId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's identifiers contains the given IdentifierKeyValuePairTO elements.
     *
     * @param identifiers the given elements that should be contained in actual SearchEntityTO's identifiers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchEntityTO's identifiers does not contain all given IdentifierKeyValuePairTO elements.
     */
    public S hasIdentifiers(IdentifierKeyValuePairTO... identifiers) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // check that given IdentifierKeyValuePairTO varargs is not null.
        if (identifiers == null) {
            failWithMessage("Expecting identifiers parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getIdentifiers(), identifiers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's identifiers contains the given IdentifierKeyValuePairTO elements in Collection.
     *
     * @param identifiers the given elements that should be contained in actual SearchEntityTO's identifiers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchEntityTO's identifiers does not contain all given IdentifierKeyValuePairTO elements.
     */
    public S hasIdentifiers(java.util.Collection<? extends IdentifierKeyValuePairTO> identifiers) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // check that given IdentifierKeyValuePairTO collection is not null.
        if (identifiers == null) {
            failWithMessage("Expecting identifiers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getIdentifiers(), identifiers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's identifiers contains <b>only</b> the given IdentifierKeyValuePairTO elements and nothing else in whatever order.
     *
     * @param identifiers the given elements that should be contained in actual SearchEntityTO's identifiers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchEntityTO's identifiers does not contain all given IdentifierKeyValuePairTO elements.
     */
    public S hasOnlyIdentifiers(IdentifierKeyValuePairTO... identifiers) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // check that given IdentifierKeyValuePairTO varargs is not null.
        if (identifiers == null) {
            failWithMessage("Expecting identifiers parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getIdentifiers(), identifiers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's identifiers contains <b>only</b> the given IdentifierKeyValuePairTO elements in Collection and nothing else in whatever order.
     *
     * @param identifiers the given elements that should be contained in actual SearchEntityTO's identifiers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchEntityTO's identifiers does not contain all given IdentifierKeyValuePairTO elements.
     */
    public S hasOnlyIdentifiers(java.util.Collection<? extends IdentifierKeyValuePairTO> identifiers) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // check that given IdentifierKeyValuePairTO collection is not null.
        if (identifiers == null) {
            failWithMessage("Expecting identifiers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getIdentifiers(), identifiers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's identifiers does not contain the given IdentifierKeyValuePairTO elements.
     *
     * @param identifiers the given elements that should not be in actual SearchEntityTO's identifiers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchEntityTO's identifiers contains any given IdentifierKeyValuePairTO elements.
     */
    public S doesNotHaveIdentifiers(IdentifierKeyValuePairTO... identifiers) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // check that given IdentifierKeyValuePairTO varargs is not null.
        if (identifiers == null) {
            failWithMessage("Expecting identifiers parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getIdentifiers(), identifiers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's identifiers does not contain the given IdentifierKeyValuePairTO elements in Collection.
     *
     * @param identifiers the given elements that should not be in actual SearchEntityTO's identifiers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchEntityTO's identifiers contains any given IdentifierKeyValuePairTO elements.
     */
    public S doesNotHaveIdentifiers(java.util.Collection<? extends IdentifierKeyValuePairTO> identifiers) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // check that given IdentifierKeyValuePairTO collection is not null.
        if (identifiers == null) {
            failWithMessage("Expecting identifiers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getIdentifiers(), identifiers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO has no identifiers.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual SearchEntityTO's identifiers is not empty.
     */
    public S hasNoIdentifiers() {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have identifiers but had :\n  <%s>";

        // check
        if (actual.getIdentifiers().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getIdentifiers());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual SearchEntityTO's ip is equal to the given one.
     *
     * @param ip the given ip to compare the actual SearchEntityTO's ip to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's ip is not equal to the given one.
     */
    public S hasIp(String ip) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting ip of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualIp = actual.getIp();
        if (!Objects.areEqual(actualIp, ip)) {
            failWithMessage(assertjErrorMessage, actual, ip, actualIp);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's query is equal to the given one.
     *
     * @param query the given query to compare the actual SearchEntityTO's query to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's query is not equal to the given one.
     */
    public S hasQuery(String query) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting query of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualQuery = actual.getQuery();
        if (!Objects.areEqual(actualQuery, query)) {
            failWithMessage(assertjErrorMessage, actual, query, actualQuery);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's searchType is equal to the given one.
     *
     * @param searchType the given searchType to compare the actual SearchEntityTO's searchType to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's searchType is not equal to the given one.
     */
    public S hasSearchType(org.nzbhydra.config.searching.SearchType searchType) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting searchType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        org.nzbhydra.config.searching.SearchType actualSearchType = actual.getSearchType();
        if (!Objects.areEqual(actualSearchType, searchType)) {
            failWithMessage(assertjErrorMessage, actual, searchType, actualSearchType);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's season is equal to the given one.
     *
     * @param season the given season to compare the actual SearchEntityTO's season to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's season is not equal to the given one.
     */
    public S hasSeason(Integer season) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting season of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualSeason = actual.getSeason();
        if (!Objects.areEqual(actualSeason, season)) {
            failWithMessage(assertjErrorMessage, actual, season, actualSeason);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's source is equal to the given one.
     *
     * @param source the given source to compare the actual SearchEntityTO's source to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's source is not equal to the given one.
     */
    public S hasSource(org.nzbhydra.config.SearchSource source) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting source of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        org.nzbhydra.config.SearchSource actualSource = actual.getSource();
        if (!Objects.areEqual(actualSource, source)) {
            failWithMessage(assertjErrorMessage, actual, source, actualSource);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's time is equal to the given one.
     *
     * @param time the given time to compare the actual SearchEntityTO's time to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's time is not equal to the given one.
     */
    public S hasTime(java.time.Instant time) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting time of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        java.time.Instant actualTime = actual.getTime();
        if (!Objects.areEqual(actualTime, time)) {
            failWithMessage(assertjErrorMessage, actual, time, actualTime);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's title is equal to the given one.
     *
     * @param title the given title to compare the actual SearchEntityTO's title to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's title is not equal to the given one.
     */
    public S hasTitle(String title) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTitle = actual.getTitle();
        if (!Objects.areEqual(actualTitle, title)) {
            failWithMessage(assertjErrorMessage, actual, title, actualTitle);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's userAgent is equal to the given one.
     *
     * @param userAgent the given userAgent to compare the actual SearchEntityTO's userAgent to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's userAgent is not equal to the given one.
     */
    public S hasUserAgent(String userAgent) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting userAgent of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualUserAgent = actual.getUserAgent();
        if (!Objects.areEqual(actualUserAgent, userAgent)) {
            failWithMessage(assertjErrorMessage, actual, userAgent, actualUserAgent);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchEntityTO's username is equal to the given one.
     *
     * @param username the given username to compare the actual SearchEntityTO's username to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchEntityTO's username is not equal to the given one.
     */
    public S hasUsername(String username) {
        // check that actual SearchEntityTO we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting username of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualUsername = actual.getUsername();
        if (!Objects.areEqual(actualUsername, username)) {
            failWithMessage(assertjErrorMessage, actual, username, actualUsername);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
