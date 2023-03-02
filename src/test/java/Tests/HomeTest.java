package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class HomeTest extends TestBase{
    HomePage homeObject ;
    RegisterPage registerObject;
    Faker f = new Faker();
    String fname = f.name().firstName();
    String lname = f.name().lastName();
    String email = f.internet().emailAddress();
    String password = f.internet().password();


    @Test(priority=0)
    public void userRegistration()
    {
        homeObject = new HomePage(driver);
        homeObject.registerPage();
        registerObject = new RegisterPage(driver);
        registerObject.registerform(fname,lname,email,password);
    }
}
