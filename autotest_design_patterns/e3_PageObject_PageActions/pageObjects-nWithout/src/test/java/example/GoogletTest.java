package example;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 2:51 PM
 */
public class GoogletTest {

    @Test
    public void afterSearchingUserShouldSeSearchResults() {
        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Selenium");

        element.submit();

        System.out.println("Page title is: " + driver.getTitle());

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());

        List<WebElement> links = driver.findElements(By.cssSelector("div._NId div.g div.rc a"));

        driver.quit();
    }
}
