package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase
        {
public HomePage(WebDriver driver) {
        super(driver);


        }

                 @FindBy(linkText="Register")
	             WebElement Registerlbl;

                @FindBy(linkText="Log in")
                WebElement Loginlbl;

                @FindBy(linkText="Books")
                WebElement Bookslbl;

                @FindBy(css="div.result")
                public WebElement resultlbl;


                public void registerPage()
                {

                        clickButton(Registerlbl);
                }
                public void loginPage()
                {

                        clickButton(Loginlbl);
                }
                public void booksPage()
                {

                        clickButton(Bookslbl);
                }



        }
