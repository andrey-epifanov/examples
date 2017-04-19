package example.testng;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * Created by Андрей on 01.03.2017.
 */
public class AssertWithLogging {
    private final static Logger logger = LoggerFactory.getLogger(AssertWithLogging.class);

    /** int ?? int
     *
     * @param actual
     * @param expected
     * @param message
     */
    public static void assertEquals(int actual, int expected, String message) {
        logger.info("AssertEquals. Expected = " + expected +
                ", Actual = " + actual);
        Assert.assertEquals(actual, expected,
                message + ExceptionUtils.getStackTrace(new Exception()));
    }

    /** string ?? string
     *
     * @param actual
     * @param expected
     * @param message
     */
    public static void assertEquals(String actual, String expected, String message) {
        logger.info("AssertEquals. Expected = " + expected +
                ", Actual = " + actual);
        Assert.assertEquals(actual, expected,
                message + ExceptionUtils.getStackTrace(new Exception()));
    }

}
