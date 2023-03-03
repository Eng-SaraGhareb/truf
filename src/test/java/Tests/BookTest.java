package Tests;

import Pages.BookPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BookTest extends TestBase{
    HomePage homeobject;
    BookPage bookobject;


    @Deprecated
    @Test(priority=3)
    public void bookShow() throws InterruptedException {
        homeobject = new HomePage(driver);
        homeobject.booksPage();
        bookobject = new BookPage(driver);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        bookobject.booksort();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/login/checkoutasguest?returnUrl=%2Fcart");
    }
}
