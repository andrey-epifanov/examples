package exampleWithout;

import featuretest.authentification.TestCase;
import featuretest.dataprovider.DataProviderAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by aepifanov on 16.02.2017.
 */
public class FourTestStage1Test {
    private static Logger logger = LoggerFactory.getLogger(FourTestStage1Test.class);

    @BeforeMethod
    public void beforeMethod() { }

    @Test(dataProvider = "Passed", dataProviderClass = DataProviderAuthentication.class)
    public void standardUsageTest03(TestCase testCase) throws InterruptedException {
        testCase.log();

        logger.info("============ Precondition ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());

        logger.info("============ Processing ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());

        logger.info("============ Verification ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());
    }

    @Test(dataProvider = "Failed", dataProviderClass = DataProviderAuthentication.class)
    public void builderTest04(TestCase testCase) throws InterruptedException {
        testCase.log();
        logger.info("============ Precondition ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());

        logger.info("============ Processing ===========================");
        logger.info("Processing - executed for user : \n" + testCase.getLogin().getName());
        logger.info("Processing - Some Anything Another Action!");

        logger.info("============ Verification ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());
    }

    @AfterMethod
    public void afterMethod() { }

}
