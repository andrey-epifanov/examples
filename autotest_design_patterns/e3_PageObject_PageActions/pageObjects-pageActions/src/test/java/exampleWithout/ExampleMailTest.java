package exampleWithout;

import example.content.Email;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

/**
 * @author Andrey Epifanov
 */
public class ExampleMailTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
    }

    @Test
    public void testMailPageSaveSimple01() throws Exception {
        Email email = new Email("Private", "myownmail@mail.ru");

        driver.get(getPathToMailPage());

        driver.findElement(By.id("emailEditForm:f_typeCode:select")).click();

        List<WebElement> types = driver.findElements(By.cssSelector("option"));
        for(WebElement type : types)
            if (type.getText().equals(email.getTypeEmail()))
                type.click();

        driver.findElement(By.id("emailEditForm:f_address:emailInput:regexpInputText:input")).clear();
        driver.findElement(By.id("emailEditForm:f_address:emailInput:regexpInputText:input")).sendKeys(email.getEmail());

        driver.findElement(By.xpath("//button[text()='Save']")).click();
    }

    @Test
    public void testMailPageSave01() throws Exception {
        Email email = new Email("Private", "myownmail@mail.ru");

        driver.get(getPathToMailPage());

        Email expectedEmail = new Email("...", "mymail@mail.ru");
        if (expectedEmail.getTypeEmail() != null)
            Assert.assertEquals(
                    // this is need for extract text from select
                    driver.findElement(By.id("emailEditForm:f_typeCode:select")).findElement(By.cssSelector("select option")).getText(), //.split("\n")[0]
                    expectedEmail.getTypeEmail(),
                    "Type of email is incorrect.");

        if (expectedEmail.getEmail() != null)
            Assert.assertEquals(
                    //emailTextBox.getText(), // standard
                    driver.findElement(By.id("emailEditForm:f_address:emailInput:regexpInputText:input")).getAttribute("value"),
                    expectedEmail.getEmail(),
                    "Email is incorrect.");
    }

    @Test
    public void testMailPageSave02() throws Exception {
        driver.get(getPathToMailPage());

        driver.findElement(By.xpath("//button[text()='Save']")).click();
    }

    public String getPathToMailPage() {
        File list = new File("./..");
        String path = list.getAbsolutePath();
        System.out.println(path);
        return path + "/email_v01.html";
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
