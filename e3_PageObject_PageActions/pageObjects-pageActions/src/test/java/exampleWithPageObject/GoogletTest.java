package exampleWithPageObject;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.GooglePage;

/**
 * Andrey
 */
public class GoogletTest {

    private static WebDriver driver;
    private static GooglePage googlePage;

    @Before
    public void beforeTest() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        googlePage = new GooglePage(driver);
    }

    @Test
    public void simpleTest() {
        driver.get("http://www.google.com");

        googlePage.search.sendKeys("Selenium");
        googlePage.search.submit();

        System.out.println("Page title is: " + driver.getTitle());

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());

        googlePage.links.get(5).click();
    }

    @AfterClass
    public static void afterTest01() {
        driver.quit();
    }
}
