package example;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;

/**
 * @author Andrey Epifanov
 */
public class ExampleMailTest {

    @Test
    public void testMailPageSave() {
        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();

        driver.get(getPathToMailPage());

        String headStr = driver.findElement(By.cssSelector("h2")).getText();
        Assert.assertEquals(headStr, "Email");

        // select type
        driver.findElement(By.id("emailEditForm:f_typeCode:select")).click(); // input class=my
        driver.findElements(By.cssSelector("option")).get(2).click();

        // email text
        driver.findElement(By.id("emailEditForm:f_address:emailInput:regexpInputText:input")).clear();
        driver.findElement(By.id("emailEditForm:f_address:emailInput:regexpInputText:input")).sendKeys("myownmail@mail.ru");

        // save
        driver.findElements(By.cssSelector("button")).get(0).click();

        driver.quit();
    }

    @Test
    public void testMailPageCancel() {
        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();

        driver.get(getPathToMailPage());

        String headStr = driver.findElement(By.cssSelector("h2")).getText();
        Assert.assertEquals(headStr, "Email");

        // select type
        driver.findElement(By.id("emailEditForm:f_typeCode:select")).click();
        driver.findElements(By.cssSelector("option")).get(1).click();

        // email text
        driver.findElement(By.id("emailEditForm:f_address:emailInput:regexpInputText:input")).clear();
        driver.findElement(By.id("emailEditForm:f_address:emailInput:regexpInputText:input")).sendKeys("myownmail@mail.ru");

        // cancel
        driver.findElements(By.cssSelector("button")).get(1).click();

        driver.quit();
    }

    @Test
    public void openExampleMailPage() {
        File list = new File("./..");
        String path = list.getAbsolutePath();
        System.out.println(path);
    }

    public String getPathToMailPage() {
        File list = new File("./..");
        String path = list.getAbsolutePath();
        System.out.println(path);
        return path + "/email_v01.html";
    }
}
