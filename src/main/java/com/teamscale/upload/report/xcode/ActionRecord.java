package com.teamscale.upload.report.xcode;

/**
 * An {@link ActionRecord} in an {@link ActionsInvocationRecord}.
 */
public class ActionRecord {

    /**
     * The {@link ActionResult}.
     */
    public final ActionResult actionResult;

    public ActionRecord(ActionResult actionResult) {
        this.actionResult = actionResult;
    }

    /**
     * Returns true if the {@link #actionResult} indicates that the XCResult bundle contains coverage data.
     */
    public boolean hasCoverageData() {
        return actionResult.coverage != null && actionResult.coverage.hasCoverageData;
    }
}
