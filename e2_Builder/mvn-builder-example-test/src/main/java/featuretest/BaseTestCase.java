package featuretest;

import featuretest.authentification.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by aepifanov on 21.11.2016.
 */
public class BaseTestCase {
    private static Logger logger = LoggerFactory.getLogger(TestCase.class);

    private boolean customScreenshot = false;
    private boolean checkLocalization = false;

    public BaseTestCase() {}

    public BaseTestCase(boolean customScreenshot, boolean checkLocalization) {
        this.customScreenshot = customScreenshot;
        this.checkLocalization = checkLocalization;
    }

    public BaseTestCase addCustomScreenshot() {
        this.customScreenshot = true;
        return this;
    }

    public BaseTestCase addCheckLocalization() {
        this.checkLocalization = true;
        return this;
    }

    public boolean isCustomScreenshot() {
        return customScreenshot;
    }

    public boolean isCheckLocalization() {
        return checkLocalization;
    }

    public void log() {
        logger.info("Custom Screenshot = " + customScreenshot + " (Screenshot into custom/private folder)");
        logger.info("Check localization = " + checkLocalization);
    }
}
