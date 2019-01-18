package HomePageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import HomePage.*;

import static base.BaseUtil.convertToString;

public class MainPageTest extends MainPage {
    MainPage firstPage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage = PageFactory.initElements(driver, MainPage.class);


    }
    @Test
    public void testAtmBranch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewAtmBranch();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testExploProducts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickExploreProducts();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testEspaneol() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickEspaneol();
        driver.navigate().back();
        driver.close();
        }
    @Test
    public void testHomeDeal() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickViewHomeDeal();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testCheckingAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickCheckingAccount();
        driver.navigate().back();
        driver.close();
        }
    @Test
    public void testCreditScore() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickCreditScore();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testFindCreditCard() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickFindCreditCard();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testHomeLending() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickHomeLending();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testCarBuying() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickCarBuying();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testHomeDeal1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickHomeDeal1();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testDepositChecks() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickDepositChecks();
        driver.navigate().back();
        driver.close();
    }
    @Test
    public void testMobilePay() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        firstPage.ClickChasePay();
        driver.navigate().back();
        driver.close();
    }
}
