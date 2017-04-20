package example;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Andrey Epifanov
 */
public class SoftwareTestingRuTest {

    @Test
    public void simpleClicks() {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://software-testing.ru/");
        driver.findElement(By.cssSelector("span.tpparenttitle")).click();

        driver.get("http://software-testing.ru/");
        driver.findElements(By.cssSelector("span.tpparenttitle")).get(1).click();

        driver.get("http://software-testing.ru/");
        driver.findElements(By.cssSelector("span.tpparenttitle")).get(2).click();

        driver.quit();
    }
}
