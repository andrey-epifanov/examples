package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.List;

/**
 * Created by Андрей on 11.02.2017.
 */
public class GooglePage {

    public GooglePage(final WebDriver webDriver) {
        PageFactory.initElements(new HtmlElementLocatorFactory(webDriver), this);
    }

    @FindBy(name = "q")
    public WebElement search;

    @FindBy(css = "div._NId div.g div.rc a")
    public List<WebElement> links;

}
