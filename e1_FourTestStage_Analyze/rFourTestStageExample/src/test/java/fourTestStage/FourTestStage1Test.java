package fourTestStage;

import featuretest.authentification.TestCase;
import featuretest.dataprovider.DataProviderAuthentication;
import featuretest.helper.PreconditionHelper;
import featuretest.helper.ProcessingHelper;
import featuretest.helper.VerificationHelper;
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

        PreconditionHelper.execute(testCase);

        ProcessingHelper.execute(testCase);

        VerificationHelper.execute(testCase);
    }

    @Test(dataProvider = "Failed", dataProviderClass = DataProviderAuthentication.class)
    public void builderTest04(TestCase testCase) throws InterruptedException {
        testCase.log();

        PreconditionHelper.execute(testCase);

        ProcessingHelper.execute(testCase);

        VerificationHelper.execute(testCase);
    }

    @AfterMethod
    public void afterMethod() { }

}
