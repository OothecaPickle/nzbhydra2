package org.nzbhydra.downloading.downloaders.sabnzbd.mapping;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link HistoryEntry} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractHistoryEntryAssert<S extends AbstractHistoryEntryAssert<S, A>, A extends HistoryEntry> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractHistoryEntryAssert}</code> to make assertions on actual HistoryEntry.
     *
     * @param actual the HistoryEntry we want to make assertions on.
     */
    protected AbstractHistoryEntryAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual HistoryEntry's action_line is equal to the given one.
     *
     * @param action_line the given action_line to compare the actual HistoryEntry's action_line to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's action_line is not equal to the given one.
     */
    public S hasAction_line(String action_line) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting action_line of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualAction_line = actual.getAction_line();
        if (!Objects.areEqual(actualAction_line, action_line)) {
            failWithMessage(assertjErrorMessage, actual, action_line, actualAction_line);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's bytes is equal to the given one.
     *
     * @param bytes the given bytes to compare the actual HistoryEntry's bytes to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's bytes is not equal to the given one.
     */
    public S hasBytes(Long bytes) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting bytes of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualBytes = actual.getBytes();
        if (!Objects.areEqual(actualBytes, bytes)) {
            failWithMessage(assertjErrorMessage, actual, bytes, actualBytes);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's category is equal to the given one.
     *
     * @param category the given category to compare the actual HistoryEntry's category to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's category is not equal to the given one.
     */
    public S hasCategory(String category) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting category of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualCategory = actual.getCategory();
        if (!Objects.areEqual(actualCategory, category)) {
            failWithMessage(assertjErrorMessage, actual, category, actualCategory);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's completed is equal to the given one.
     *
     * @param completed the given completed to compare the actual HistoryEntry's completed to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's completed is not equal to the given one.
     */
    public S hasCompleted(Long completed) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting completed of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualCompleted = actual.getCompleted();
        if (!Objects.areEqual(actualCompleted, completed)) {
            failWithMessage(assertjErrorMessage, actual, completed, actualCompleted);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's completeness is equal to the given one.
     *
     * @param completeness the given completeness to compare the actual HistoryEntry's completeness to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's completeness is not equal to the given one.
     */
    public S hasCompleteness(Integer completeness) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting completeness of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualCompleteness = actual.getCompleteness();
        if (!Objects.areEqual(actualCompleteness, completeness)) {
            failWithMessage(assertjErrorMessage, actual, completeness, actualCompleteness);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's download_time is equal to the given one.
     *
     * @param download_time the given download_time to compare the actual HistoryEntry's download_time to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's download_time is not equal to the given one.
     */
    public S hasDownload_time(Integer download_time) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting download_time of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualDownload_time = actual.getDownload_time();
        if (!Objects.areEqual(actualDownload_time, download_time)) {
            failWithMessage(assertjErrorMessage, actual, download_time, actualDownload_time);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's downloaded is equal to the given one.
     *
     * @param downloaded the given downloaded to compare the actual HistoryEntry's downloaded to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's downloaded is not equal to the given one.
     */
    public S hasDownloaded(Long downloaded) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting downloaded of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualDownloaded = actual.getDownloaded();
        if (!Objects.areEqual(actualDownloaded, downloaded)) {
            failWithMessage(assertjErrorMessage, actual, downloaded, actualDownloaded);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's fail_message is equal to the given one.
     *
     * @param fail_message the given fail_message to compare the actual HistoryEntry's fail_message to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's fail_message is not equal to the given one.
     */
    public S hasFail_message(String fail_message) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting fail_message of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualFail_message = actual.getFail_message();
        if (!Objects.areEqual(actualFail_message, fail_message)) {
            failWithMessage(assertjErrorMessage, actual, fail_message, actualFail_message);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's has_rating is equal to the given one.
     *
     * @param has_rating the given has_rating to compare the actual HistoryEntry's has_rating to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's has_rating is not equal to the given one.
     */
    public S hasHas_rating(Boolean has_rating) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting has_rating of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Boolean actualHas_rating = actual.getHas_rating();
        if (!Objects.areEqual(actualHas_rating, has_rating)) {
            failWithMessage(assertjErrorMessage, actual, has_rating, actualHas_rating);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's id is equal to the given one.
     *
     * @param id the given id to compare the actual HistoryEntry's id to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's id is not equal to the given one.
     */
    public S hasId(Long id) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualId = actual.getId();
        if (!Objects.areEqual(actualId, id)) {
            failWithMessage(assertjErrorMessage, actual, id, actualId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's loaded is equal to the given one.
     *
     * @param loaded the given loaded to compare the actual HistoryEntry's loaded to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's loaded is not equal to the given one.
     */
    public S hasLoaded(Boolean loaded) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting loaded of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Boolean actualLoaded = actual.getLoaded();
        if (!Objects.areEqual(actualLoaded, loaded)) {
            failWithMessage(assertjErrorMessage, actual, loaded, actualLoaded);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's md5sum is equal to the given one.
     *
     * @param md5sum the given md5sum to compare the actual HistoryEntry's md5sum to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's md5sum is not equal to the given one.
     */
    public S hasMd5sum(String md5sum) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting md5sum of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualMd5sum = actual.getMd5sum();
        if (!Objects.areEqual(actualMd5sum, md5sum)) {
            failWithMessage(assertjErrorMessage, actual, md5sum, actualMd5sum);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's meta is equal to the given one.
     *
     * @param meta the given meta to compare the actual HistoryEntry's meta to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's meta is not equal to the given one.
     */
    public S hasMeta(Object meta) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting meta of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Object actualMeta = actual.getMeta();
        if (!Objects.areEqual(actualMeta, meta)) {
            failWithMessage(assertjErrorMessage, actual, meta, actualMeta);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's name is equal to the given one.
     *
     * @param name the given name to compare the actual HistoryEntry's name to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's name is not equal to the given one.
     */
    public S hasName(String name) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualName = actual.getName();
        if (!Objects.areEqual(actualName, name)) {
            failWithMessage(assertjErrorMessage, actual, name, actualName);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's nzb_name is equal to the given one.
     *
     * @param nzb_name the given nzb_name to compare the actual HistoryEntry's nzb_name to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's nzb_name is not equal to the given one.
     */
    public S hasNzb_name(String nzb_name) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting nzb_name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualNzb_name = actual.getNzb_name();
        if (!Objects.areEqual(actualNzb_name, nzb_name)) {
            failWithMessage(assertjErrorMessage, actual, nzb_name, actualNzb_name);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's nzo_id is equal to the given one.
     *
     * @param nzo_id the given nzo_id to compare the actual HistoryEntry's nzo_id to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's nzo_id is not equal to the given one.
     */
    public S hasNzo_id(String nzo_id) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting nzo_id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualNzo_id = actual.getNzo_id();
        if (!Objects.areEqual(actualNzo_id, nzo_id)) {
            failWithMessage(assertjErrorMessage, actual, nzo_id, actualNzo_id);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's password is equal to the given one.
     *
     * @param password the given password to compare the actual HistoryEntry's password to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's password is not equal to the given one.
     */
    public S hasPassword(String password) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting password of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualPassword = actual.getPassword();
        if (!Objects.areEqual(actualPassword, password)) {
            failWithMessage(assertjErrorMessage, actual, password, actualPassword);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's path is equal to the given one.
     *
     * @param path the given path to compare the actual HistoryEntry's path to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's path is not equal to the given one.
     */
    public S hasPath(String path) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting path of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualPath = actual.getPath();
        if (!Objects.areEqual(actualPath, path)) {
            failWithMessage(assertjErrorMessage, actual, path, actualPath);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's postproc_time is equal to the given one.
     *
     * @param postproc_time the given postproc_time to compare the actual HistoryEntry's postproc_time to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's postproc_time is not equal to the given one.
     */
    public S hasPostproc_time(Long postproc_time) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting postproc_time of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualPostproc_time = actual.getPostproc_time();
        if (!Objects.areEqual(actualPostproc_time, postproc_time)) {
            failWithMessage(assertjErrorMessage, actual, postproc_time, actualPostproc_time);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's pp is equal to the given one.
     *
     * @param pp the given pp to compare the actual HistoryEntry's pp to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's pp is not equal to the given one.
     */
    public S hasPp(String pp) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting pp of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualPp = actual.getPp();
        if (!Objects.areEqual(actualPp, pp)) {
            failWithMessage(assertjErrorMessage, actual, pp, actualPp);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's report is equal to the given one.
     *
     * @param report the given report to compare the actual HistoryEntry's report to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's report is not equal to the given one.
     */
    public S hasReport(String report) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting report of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualReport = actual.getReport();
        if (!Objects.areEqual(actualReport, report)) {
            failWithMessage(assertjErrorMessage, actual, report, actualReport);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's retry is equal to the given one.
     *
     * @param retry the given retry to compare the actual HistoryEntry's retry to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's retry is not equal to the given one.
     */
    public S hasRetry(Integer retry) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting retry of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualRetry = actual.getRetry();
        if (!Objects.areEqual(actualRetry, retry)) {
            failWithMessage(assertjErrorMessage, actual, retry, actualRetry);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's script is equal to the given one.
     *
     * @param script the given script to compare the actual HistoryEntry's script to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's script is not equal to the given one.
     */
    public S hasScript(String script) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting script of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualScript = actual.getScript();
        if (!Objects.areEqual(actualScript, script)) {
            failWithMessage(assertjErrorMessage, actual, script, actualScript);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's script_line is equal to the given one.
     *
     * @param script_line the given script_line to compare the actual HistoryEntry's script_line to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's script_line is not equal to the given one.
     */
    public S hasScript_line(String script_line) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting script_line of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualScript_line = actual.getScript_line();
        if (!Objects.areEqual(actualScript_line, script_line)) {
            failWithMessage(assertjErrorMessage, actual, script_line, actualScript_line);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's script_log is equal to the given one.
     *
     * @param script_log the given script_log to compare the actual HistoryEntry's script_log to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's script_log is not equal to the given one.
     */
    public S hasScript_log(String script_log) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting script_log of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualScript_log = actual.getScript_log();
        if (!Objects.areEqual(actualScript_log, script_log)) {
            failWithMessage(assertjErrorMessage, actual, script_log, actualScript_log);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's series is equal to the given one.
     *
     * @param series the given series to compare the actual HistoryEntry's series to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's series is not equal to the given one.
     */
    public S hasSeries(String series) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting series of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualSeries = actual.getSeries();
        if (!Objects.areEqual(actualSeries, series)) {
            failWithMessage(assertjErrorMessage, actual, series, actualSeries);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's show_details is equal to the given one.
     *
     * @param show_details the given show_details to compare the actual HistoryEntry's show_details to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's show_details is not equal to the given one.
     */
    public S hasShow_details(String show_details) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting show_details of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualShow_details = actual.getShow_details();
        if (!Objects.areEqual(actualShow_details, show_details)) {
            failWithMessage(assertjErrorMessage, actual, show_details, actualShow_details);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's size is equal to the given one.
     *
     * @param size the given size to compare the actual HistoryEntry's size to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's size is not equal to the given one.
     */
    public S hasSize(String size) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting size of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualSize = actual.getSize();
        if (!Objects.areEqual(actualSize, size)) {
            failWithMessage(assertjErrorMessage, actual, size, actualSize);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's stage_log contains the given StageLogEntry elements.
     *
     * @param stage_log the given elements that should be contained in actual HistoryEntry's stage_log.
     * @return this assertion object.
     * @throws AssertionError if the actual HistoryEntry's stage_log does not contain all given StageLogEntry elements.
     */
    public S hasStage_log(StageLogEntry... stage_log) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // check that given StageLogEntry varargs is not null.
        if (stage_log == null) {
            failWithMessage("Expecting stage_log parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getStage_log(), stage_log);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's stage_log contains the given StageLogEntry elements in Collection.
     *
     * @param stage_log the given elements that should be contained in actual HistoryEntry's stage_log.
     * @return this assertion object.
     * @throws AssertionError if the actual HistoryEntry's stage_log does not contain all given StageLogEntry elements.
     */
    public S hasStage_log(java.util.Collection<? extends StageLogEntry> stage_log) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // check that given StageLogEntry collection is not null.
        if (stage_log == null) {
            failWithMessage("Expecting stage_log parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getStage_log(), stage_log.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's stage_log contains <b>only</b> the given StageLogEntry elements and nothing else in whatever order.
     *
     * @param stage_log the given elements that should be contained in actual HistoryEntry's stage_log.
     * @return this assertion object.
     * @throws AssertionError if the actual HistoryEntry's stage_log does not contain all given StageLogEntry elements.
     */
    public S hasOnlyStage_log(StageLogEntry... stage_log) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // check that given StageLogEntry varargs is not null.
        if (stage_log == null) {
            failWithMessage("Expecting stage_log parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getStage_log(), stage_log);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's stage_log contains <b>only</b> the given StageLogEntry elements in Collection and nothing else in whatever order.
     *
     * @param stage_log the given elements that should be contained in actual HistoryEntry's stage_log.
     * @return this assertion object.
     * @throws AssertionError if the actual HistoryEntry's stage_log does not contain all given StageLogEntry elements.
     */
    public S hasOnlyStage_log(java.util.Collection<? extends StageLogEntry> stage_log) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // check that given StageLogEntry collection is not null.
        if (stage_log == null) {
            failWithMessage("Expecting stage_log parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getStage_log(), stage_log.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's stage_log does not contain the given StageLogEntry elements.
     *
     * @param stage_log the given elements that should not be in actual HistoryEntry's stage_log.
     * @return this assertion object.
     * @throws AssertionError if the actual HistoryEntry's stage_log contains any given StageLogEntry elements.
     */
    public S doesNotHaveStage_log(StageLogEntry... stage_log) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // check that given StageLogEntry varargs is not null.
        if (stage_log == null) {
            failWithMessage("Expecting stage_log parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getStage_log(), stage_log);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's stage_log does not contain the given StageLogEntry elements in Collection.
     *
     * @param stage_log the given elements that should not be in actual HistoryEntry's stage_log.
     * @return this assertion object.
     * @throws AssertionError if the actual HistoryEntry's stage_log contains any given StageLogEntry elements.
     */
    public S doesNotHaveStage_log(java.util.Collection<? extends StageLogEntry> stage_log) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // check that given StageLogEntry collection is not null.
        if (stage_log == null) {
            failWithMessage("Expecting stage_log parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getStage_log(), stage_log.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry has no stage_log.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual HistoryEntry's stage_log is not empty.
     */
    public S hasNoStage_log() {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have stage_log but had :\n  <%s>";

        // check
        if (actual.getStage_log().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getStage_log());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual HistoryEntry's status is equal to the given one.
     *
     * @param status the given status to compare the actual HistoryEntry's status to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's status is not equal to the given one.
     */
    public S hasStatus(String status) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting status of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualStatus = actual.getStatus();
        if (!Objects.areEqual(actualStatus, status)) {
            failWithMessage(assertjErrorMessage, actual, status, actualStatus);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's storage is equal to the given one.
     *
     * @param storage the given storage to compare the actual HistoryEntry's storage to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's storage is not equal to the given one.
     */
    public S hasStorage(String storage) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting storage of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualStorage = actual.getStorage();
        if (!Objects.areEqual(actualStorage, storage)) {
            failWithMessage(assertjErrorMessage, actual, storage, actualStorage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's url is equal to the given one.
     *
     * @param url the given url to compare the actual HistoryEntry's url to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's url is not equal to the given one.
     */
    public S hasUrl(String url) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting url of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualUrl = actual.getUrl();
        if (!Objects.areEqual(actualUrl, url)) {
            failWithMessage(assertjErrorMessage, actual, url, actualUrl);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual HistoryEntry's url_info is equal to the given one.
     *
     * @param url_info the given url_info to compare the actual HistoryEntry's url_info to.
     * @return this assertion object.
     * @throws AssertionError - if the actual HistoryEntry's url_info is not equal to the given one.
     */
    public S hasUrl_info(String url_info) {
        // check that actual HistoryEntry we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting url_info of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualUrl_info = actual.getUrl_info();
        if (!Objects.areEqual(actualUrl_info, url_info)) {
            failWithMessage(assertjErrorMessage, actual, url_info, actualUrl_info);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
