package HomePageTest;

//public class SearchTest {
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import HomePage.*;

import java.io.IOException;

import static base.BaseUtil.convertToString;

    public class SearchTest extends Search {
        Search search;

        @BeforeMethod
        public void initElements() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            search = PageFactory.initElements(driver, Search.class);
        }
        @Test
        /*public void testInputWebElement() throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            search.ClickViewInputWebElement();
            Thread.sleep(3000);
        }*/

        public void searchItems() throws IOException, InterruptedException {
            search.ClickViewInputWebElement();
            Thread.sleep(3000);
            Search searchPage = PageFactory.initElements(driver, Search.class);
            searchPage.searchItemsAndSubmitButton();
        }
    }

