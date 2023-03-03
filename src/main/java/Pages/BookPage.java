package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class BookPage extends PageBase{

    public BookPage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
        action = new Actions(driver);

    }

  //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(id="products-orderby")
    WebElement positionbtn;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement cartbtn;

    @FindBy(id="topcartlink")
    WebElement cartlbl;

    @FindBy(id="termsofservice")
    WebElement termscheck;

    @FindBy(id="checkout")
    WebElement checkoutbtn;


    public void booksort() throws InterruptedException {

        select = new Select(positionbtn);
        select.selectByVisibleText("Price: Low to High");
        //WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")));
        jse.executeScript("arguments[0].scrollIntoView();",cartbtn);
        Thread.sleep(3000);
        action.click(cartbtn).build().perform();
        Thread.sleep(6000);
        jse.executeScript("arguments[0].scrollIntoView();",cartlbl);
        clickButton(cartlbl);
        Thread.sleep(6000);
        jse.executeScript("arguments[0].scrollIntoView();",termscheck );
        termscheck.click();
        Thread.sleep(3000);
         clickButton(checkoutbtn);
         Thread.sleep(3000);

    }

    }

