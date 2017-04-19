package featuretest.helper;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Андрей on 02.03.2017.
 */
public class AnalyseHelper {
    private static Logger logger = LoggerFactory.getLogger(AnalyseHelper.class);

    public static void execute(WebDriver webDriver) {
        logger.info("============ Analyse ===========================");
        logger.info("Analyse - executed");
    }
}
