package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest<homeObject> extends TestBase
{
    HomePage homeObject ;
    LoginPage loginObject ;
    HomeTest hometest = new HomeTest();


    @Test(priority=1)
    public void userLogin()
    {
        homeObject=new HomePage(driver);
        homeObject.loginPage();
        loginObject = new LoginPage(driver);
        loginObject.loginUser(hometest.email, hometest.password);
    }
}
