package HomePage;
import base.BaseUtil;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;
import javax.xml.ws.Action;

public class MainPage extends BaseUtil {
    @FindBy(xpath = ("//a [@class='chaseanalytics-track-link']"))
    public static WebElement ViewAtmBranch;
    @FindBy(xpath = ("//a [@class='header__section--dropdown__title__link chaseanalytics-track-link']"))
    public static WebElement ViewExploreProducts;
    @FindBy(xpath = ("/html/body/div/div[5]/header/div[4]/div[3]/ul/li[2]/a"))
    public static WebElement ViewEspaneol;
    @FindBy(xpath = ("//a[@class='geo-module--link' and @id='firstFocusableElement']"))
    public static WebElement ViewHomeDeal;
    @FindBy(xpath = ("//div[@class='carousel--custom-pager__item slick-slide slick-active' and @id='slick-slide00']"))
    public static WebElement ViewCheckingAccount;
    @FindBy(xpath = (" //div[@class='carousel--custom-pager__item slick-slide slick-active' and @id='slick-slide01']"))
    public static WebElement ViewCreditScore;
    @FindBy(xpath = ("//div[@class='carousel--custom-pager__item slick-slide slick-current slick-active slick-center' and @id='slick-slide02']"))
    public static WebElement ViewFindCreditCard;
    @FindBy(xpath = ("//div[@class='carousel--custom-pager__item slick-slide slick-active' and @id='slick-slide03']"))
    public static WebElement ViewHomeLending;
    @FindBy(xpath = ("//div[@class='carousel--custom-pager__item slick-slide slick-active' and @id='slick-slide04']"))
    public static WebElement ViewCarBuying;
    @FindBy(xpath = ("//div[@class='carousel--custom-pager__item slick-slide slick-active' and @id='slick-slide04']"))
    public static WebElement ViewHomeDeal1;
    @FindBy(xpath = ("//div[@class='carousel--custom-pager__item slick-slide slick-active' and @id='slick-slide04']"))
    public static WebElement ViewDepositChecks;
    @FindBy(xpath = ("//div[@class='carousel--custom-pager__item slick-slide slick-active' and @id='slick-slide04']"))
    public static WebElement ViewChasePay;








    public void ClickViewAtmBranch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
           ViewAtmBranch.click();
    }
    public void ClickExploreProducts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewExploreProducts.click();
    }
    public void ClickEspaneol() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewEspaneol.click();
    }
    public void ClickViewHomeDeal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewHomeDeal.click();
        }
    public void ClickCheckingAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewCheckingAccount.click();
    }
    public void ClickCreditScore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewCreditScore.click();
    }
    public void ClickFindCreditCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFindCreditCard.click();
    }
    public void ClickHomeLending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewHomeLending.click();
    }

    public void ClickCarBuying() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewCarBuying.click();
    }
    public void ClickHomeDeal1() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            ViewHomeDeal1.click();
        }
    public void ClickDepositChecks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewDepositChecks.click();
    }
    public void ClickChasePay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewChasePay.click();
    }

}
