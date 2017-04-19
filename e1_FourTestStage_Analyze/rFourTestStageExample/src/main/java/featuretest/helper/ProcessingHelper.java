package featuretest.helper;

import featuretest.authentification.TestCase;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created by Андрей on 02.03.2017.
 */
public class ProcessingHelper {
    private static Logger logger = LoggerFactory.getLogger(ProcessingHelper.class);

    public static void execute(TestCase testCase) {
        logger.info("============ Processing ===========================");
        logger.info("Processing - executed for user : \n" + testCase.getLogin().getName());
    }

    public static void execute(TestCase testCase, WebDriver driver) {
        logger.info("============ Processing ===========================");
        logger.info("Processing - executed for user : \n" + testCase.getLogin().getName());
        driver.get(getPathToMailPage());
    }

    public static String getPathToMailPage() {
        File list = new File("./..");
        String path = list.getAbsolutePath();
        System.out.println(path);
        return path + "/email_v01.html";
    }

}
