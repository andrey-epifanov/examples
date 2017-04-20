package featuretest.dataprovider;

import featuretest.authentification.TestCase;
import featuretest.authentification.TestCaseWithoutBuilder;
import featuretest.content.Login;
import org.testng.annotations.DataProvider;

/**
 * Created by aepifanov on 18.11.2016.
 */
public class DataProviderAuthentication {

    @DataProvider(name = "PassedWithout")
    public static Object[][] createPassedTestWithoutData() {
        return new Object[][] {
                { new TestCaseWithoutBuilder(new Login("user1", "123"), true, true, false)},
        };
    }

    @DataProvider(name = "FailedWithout")
    public static Object[][] createFailWithoutBuilderTestData() {
        return new Object[][] {
                { new TestCaseWithoutBuilder(new Login("user2", "123"), false, true, false) },
                { new TestCaseWithoutBuilder(new Login("user2", "123"), false, "123", "Invalid username or password", false, false) },
                { new TestCaseWithoutBuilder(new Login("user2", "123"), false, "123", "Invalid username or password") }, // equal previous

                { new TestCaseWithoutBuilder(new Login("user3", "123"), true, "wrong", "Invalid username or password", false, false)},
                { new TestCaseWithoutBuilder(new Login("user3", "123"), false, "wrong", "Invalid username or password", false, false) },

                { new TestCaseWithoutBuilder(new Login("", "123"), false, "123", "Please fill in this field", false, false) },
                { new TestCaseWithoutBuilder(new Login("user4", "123"), true, "", "Please fill in this field", false, false) },
        };
    }

    @DataProvider(name = "Passed")
    public static Object[][] createPassedTestData() {
        return new Object[][] {
                { new TestCase(new Login("user1", "123"), true).addCustomScreenshot() },
        };
    }

    @DataProvider(name = "Failed")
    public static Object[][] createFailTestData() {
        return new Object[][] {
                { new TestCase(new Login("user2", "123"), false).addCustomScreenshot() },
                { new TestCase(new Login("user2", "123"), false, "123", "Invalid username or password") },

                { new TestCase(new Login("user3", "123"), true, "wrong", "Invalid username or password") },
                { new TestCase(new Login("user3", "123"), false, "wrong", "Invalid username or password") },

                { new TestCase(new Login("", "123"), false, "123", "Please fill in this field") },
                { new TestCase(new Login("user4", "123"), true, "", "Please fill in this field") },
        };
    }

}
