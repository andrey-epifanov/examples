package builder;

import featuretest.authentification.TestCase;
import featuretest.authentification.TestCaseWithoutBuilder;
import featuretest.dataprovider.DataProviderAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by aepifanov on 16.02.2017.
 */
public class BuilderTest {
    private static Logger logger = LoggerFactory.getLogger(BuilderTest.class);

    @Test(dataProvider = "PassedWithout", dataProviderClass = DataProviderAuthentication.class)
    public void withoutBuilderTest01(TestCaseWithoutBuilder testCase) throws InterruptedException {
        testCase.log();

        Assert.assertFalse(testCase.getLogin().getName().equals("anything"));
    }

    @Test(dataProvider = "FailedWithout", dataProviderClass = DataProviderAuthentication.class)
    public void withoutBuilderTest02(TestCaseWithoutBuilder testCase) throws InterruptedException {
        testCase.log();

        Assert.assertFalse(testCase.getLogin().getName().equals("anything"));
    }

    @Test(dataProvider = "Passed", dataProviderClass = DataProviderAuthentication.class)
    public void builderTest03(TestCase testCase) throws InterruptedException {
        testCase.log();

        Assert.assertFalse(testCase.getLogin().getName().equals("anything"));
    }

    @Test(dataProvider = "Failed", dataProviderClass = DataProviderAuthentication.class)
    public void builderTest04(TestCase testCase) throws InterruptedException {
        testCase.log();

        Assert.assertFalse(testCase.getLogin().getName().equals("anything"));
    }
}
