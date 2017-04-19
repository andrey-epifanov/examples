package fourTestStage;

import featuretest.authentification.TestCase;
import featuretest.dataprovider.DataProviderAuthentication;
import featuretest.helper.AnalyseHelper;
import featuretest.helper.PreconditionHelper;
import featuretest.helper.ProcessingHelper;
import featuretest.helper.VerificationHelper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by aepifanov on 16.02.2017.
 */
public class FourTestStage2Test {
    private static Logger logger = LoggerFactory.getLogger(FourTestStage2Test.class);

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
    }

    @Test(dataProvider = "Passed", dataProviderClass = DataProviderAuthentication.class)
    public void standardUsageTest03(TestCase testCase) throws InterruptedException {
        testCase.log();

        PreconditionHelper.execute(testCase);

        ProcessingHelper.execute(testCase, driver);

        VerificationHelper.execute(testCase, driver);
    }

    @AfterMethod
    public void afterMethod() {
        AnalyseHelper.execute(driver);

        driver.quit();
    }

}
