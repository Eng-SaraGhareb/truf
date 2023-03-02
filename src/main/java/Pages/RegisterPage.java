package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase
{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="FirstName")
    WebElement firstNametxt;

    @FindBy(id="LastName")
    WebElement lastNametxt;

    @FindBy(id="Email")
    WebElement emailtxt;

    @FindBy(id="Password")
    WebElement passwordtxt;

    @FindBy(id="ConfirmPassword")
    WebElement confirmPasswordtxt;

    @FindBy(id="register-button")
    WebElement registerbtn;

   @FindBy(className="result")
   public WebElement resulttxt;

     @FindBy(css="a.button-1.register-continue-button")
      WebElement continuebtn;

    public void registerform(String fname,String lname,String email,String password)
    {
        firstNametxt.sendKeys(fname);
        lastNametxt.sendKeys(lname);
        emailtxt.sendKeys(email);
        passwordtxt.sendKeys(password);
        confirmPasswordtxt.sendKeys(password);
        clickButton(registerbtn);
        clickButton(continuebtn);
    }


}
