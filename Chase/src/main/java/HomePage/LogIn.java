package HomePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends BaseUtil {
    @FindBy(xpath = ("//*[@id=\"userId-input-field\"]"))
    public static WebElement ViewLogInUser;
    @FindBy(xpath = ("//*[@id=\"password-input-field\"]"))
    public static WebElement ViewPass;
    @FindBy(xpath = ("//*[@id=\"signin-button\"]/span"))
    public static WebElement ViewSignInButton;

    public void ClickViewLogInUser() {
        ViewLogInUser.sendKeys("Shafayat");
    }
    public void ClickViewPass() {
        ViewPass.sendKeys("Shafaya123");
    }
    public void ClickSignInButton() {
        ViewSignInButton.click();
    }
}
