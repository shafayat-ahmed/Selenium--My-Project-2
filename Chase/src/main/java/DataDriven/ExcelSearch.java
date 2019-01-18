package DataDriven;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import utility.ExcelDataReader;

import java.io.IOException;

import static org.openqa.selenium.support.How.XPATH;

public class ExcelSearch extends BaseUtil {
        @FindBy(how = How.XPATH, using ="//a[@class='header__section__item header__section--search icon-search']")
        public static WebElement ViewInputWebElement;

        public void ClickViewInputWebElement() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            ViewInputWebElement.click();
        }
    @FindBy(how = XPATH, using ="//input[@class='header__section--search__bar--search-input']")
    public static WebElement searchBox;
    @FindBy(how = XPATH, using ="//button[@class='header__section--search__bar--search-icon icon-search chaseanalytics-track-link']")
    public static WebElement resultText;

    ExcelDataReader dtr = new ExcelDataReader();

    //Read data for input search
    public String[] getExcelData(String fileName) throws IOException {
        String path = "../Chase/data/" + fileName;
        String[] output = dtr.colReader(path, 2); //Reading from column2
        return output;
    }
    //Read data for Expected result
    public String[] getAssertData(String fileName) throws IOException {
        String path = "../Chase/data/" + fileName;
        String[] output = dtr.colReader(path, 3);  //Reading from Column3 which has Expected data
        return output;
    }
    //Search Product using Excel data
    public String[] searchProduct(String fileName) throws IOException, InterruptedException {
        String[] searchItem = getExcelData(fileName);
        String[] actual = new String[searchItem.length];
        for (int i = 0; i < searchItem.length; i++) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(searchBox, searchItem[i]);
            sleepFor(2);
            actual[i] = driver.getTitle();
            driver.navigate().back();
            sleepFor(2);
            ViewInputWebElement.click();

            //actual[i] = getTextByWebElement(resultText);
            clearInputBox(searchBox);
            sleepFor(1);
        }
        return actual;
    }
    // Search feature using Excel data
 /*   public String[] getDatafromExcelFileForFeatureChoice(String fileName) throws IOException {
        String path = "C:\\Users\\ahmed\\Desktop\\My-Project2\\Chase\\data\\DataChase.xls" + fileName;
        String[] output = dtr.colReader(path, 2);
        return output;
    }*/
}


