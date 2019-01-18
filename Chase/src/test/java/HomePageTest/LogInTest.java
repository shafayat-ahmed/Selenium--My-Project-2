package HomePageTest;

import HomePage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LogInTest extends LogIn {
    //LogIn logIn;
    @BeforeMethod
    public void initLogIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }
    @Test
    public void TestlogIn() {
        LogIn logIn = PageFactory.initElements(driver, LogIn.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logIn.ClickViewLogInUser();
        logIn.ClickViewPass();
        logIn.ClickSignInButton();
        driver.navigate().back();
        driver.close();
    }
}
