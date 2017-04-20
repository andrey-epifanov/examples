package exampleWithPageObject;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SoftwareTestingPage;

/**
 * Andrey
 */
public class SoftwareTestingRuTest {

    private static WebDriver driver;
    private static SoftwareTestingPage softwareTestingPage;

    @BeforeMethod
    public void beforeTest() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        softwareTestingPage = new SoftwareTestingPage(driver);
    }

    @Test
    public void simpleClicks() {
        driver.get("http://software-testing.ru/");
        softwareTestingPage.mainMenus.get(0).click();

        driver.get("http://software-testing.ru/");
        softwareTestingPage.mainMenus.get(1).click();

        driver.get("http://software-testing.ru/");
        softwareTestingPage.mainMenus.get(2).click();
    }

    @AfterMethod
    public static void afterTest01() {
        driver.quit();
    }
}
