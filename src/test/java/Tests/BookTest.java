package Tests;

import Pages.BookPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class BookTest extends TestBase{
    HomePage homeobject;
    BookPage bookobject;

    @Test(priority=3)
    public void bookShow() throws InterruptedException {
        homeobject = new HomePage(driver);
        homeobject.booksPage();
        bookobject = new BookPage(driver);
        bookobject.booksort();

    }
}
