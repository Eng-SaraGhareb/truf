package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookPage extends PageBase{
    public BookPage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;

    }

    @FindBy(id="products-orderby")
    WebElement positionbtn;

    @FindBy(linkText="Fahrenheit 451 by Ray Bradbury")
    WebElement cartbtn;

    @FindBy(id="topcartlink")
    WebElement cartlbl;



    Select s = new Select(positionbtn);

    public void booksort() throws InterruptedException {
        s.selectByVisibleText("Price: Low to High");
        jse.executeScript("scrollBy(0,300)");
       // scrollToBottom();
       // clickButton(cartbtn);
       // Thread.sleep(3000);
        //clickButton(cartlbl);

    }

}
