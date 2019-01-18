package HomePage;
import base.BaseUtil;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;
        import static base.BaseUtil.convertToString;
    public class Search extends BaseUtil {
        @FindBy(how = How.XPATH, using ="//a[@class='header__section__item header__section--search icon-search']")
        public static WebElement ViewInputWebElement;
    public void ClickViewInputWebElement() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            ViewInputWebElement.click();
        }
    @FindBy(how = How.XPATH, using ="//input[@class='header__section--search__bar--search-input']")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.XPATH, using ="//button[@class='header__section--search__bar--search-icon icon-search chaseanalytics-track-link']")
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton() throws InterruptedException {
        getSubmitButtonWebElement().click();
        driver.navigate().back();
        ViewInputWebElement.click();
        Thread.sleep(2000);
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton() throws IOException, InterruptedException {
        List<String> list = getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            //validate books data
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems() throws InterruptedException, IOException {
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Student loans");
        itemsList.add("Private Loans");
        itemsList.add("Car loans");
        itemsList.add("Home loans");
        itemsList.add("Credit cards");
        itemsList.add("Credit building");
        itemsList.add("Jobs");
        itemsList.add("Customer service");
        return itemsList;
    }
}