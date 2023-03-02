package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="Email")
    WebElement Emailtxt;

    @FindBy(id="Password")
    WebElement Passwordtxt;

    @FindBy(css="button.button-1.login-button")
    WebElement Loginbtn;

    public void loginUser(String email,String password)
    {

        setTextElementText(Emailtxt,email);
        setTextElementText(Passwordtxt,password);
        clickButton(Loginbtn);
    }

}
