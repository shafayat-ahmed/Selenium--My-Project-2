package HomePageTest;


import DataDriven.ExcelSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import DataDriven.ExcelSearch;

import reporting.TestLogger;

import java.io.IOException;

public class TestExcelSearch extends ExcelSearch {
    //HomePage objHomePage;
    ExcelSearch objExcelFile;

    @BeforeMethod
    public void initialization(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //    objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objExcelFile = PageFactory.initElements(driver, ExcelSearch.class);
    }
    @Test
    public void searchOnly() throws IOException, InterruptedException {
        objExcelFile.ClickViewInputWebElement();
        String[] actualItems = objExcelFile.searchProduct("DataChase.xls");
    }

    @Test
    public void searchProductUsingExcel() throws IOException, InterruptedException {
        objExcelFile.ClickViewInputWebElement();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] expectedItems = objExcelFile.getAssertData("DataChase.xls");
        String[] actualItems = objExcelFile.searchProduct("DataChase.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Test - Passed"+actualItems[i]);
        }
        System.out.println("searchProductUsingExcel test pass");
        //implicitWait(driver, 20);
    }

}
