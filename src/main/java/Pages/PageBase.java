package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    private static final int TIMEOUT = 10;
    protected static WebDriver driver ;
    public JavascriptExecutor jse ;
    public Select select ;
    public Actions action ;

    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);

         //PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    protected static void setTextElementText(WebElement textElement , String value)
    {
        textElement.sendKeys(value);
    }

    public void scrollToBottom()

    {
        jse.executeScript("scrollBy(0,2000)");
    }

    public void clearText(WebElement element)
    {
        element.clear();
    }
    public static void waitForVisibility(WebElement element,Integer Wait)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Wait));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
