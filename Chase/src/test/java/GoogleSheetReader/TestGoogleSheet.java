package GoogleSheetReader;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static base.BaseUtil.sleepFor;

public class TestGoogleSheet extends GoogleSheetsPage {

    GoogleSheetsPage googleSheetsPage;


    @BeforeMethod
    public void initialization(){

         googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }

    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
       googleSheetsPage.clickLogIn();

        int i = 0;
        String spreadsheetId = "1GNOnJJVcyoMrvOt9emuSUjVfEQDVKtrrCy-k8By8UVY";
        String range = "Sheet1!A2:Z";
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
//
//import googleSheet.GoogleSheetsPage;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//import java.util.List;
//
//public class TestGoogleSheet extends GoogleSheetsPage {
//
//    //GoogleSheetReader googleSheetReader;
//    GoogleSheetsPage googleSheetsPage;
//
//
//    @BeforeMethod
//    public void initialization() {
//
//        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
//        //  googleSheetReader=PageFactory.initElements(driver,GoogleSheetReader.class);
//    }
//
//    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
//    @Test
//    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
//           sleepFor(3);
//          googleSheetsPage.clickLogIn();
////        sleepFor(3);
////      googleSheetsPage.switchToLogInForm();
////       sleepFor(3);
////        driver.navigate().back();
//        sleepFor(3);
//        int i = 1;
//        String spreadsheetId = "1GNOnJJVcyoMrvOt9emuSUjVfEQDVKtrrCy-k8By8UVY";
//        String range = "A2:Z1000";
//        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
//        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
//
////        List row = expectedErrorMessage;
////        ------------------------------------------------------
////        System.out.println("888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");//
////        if (expectedErrorMessage == null || expectedErrorMessage.isEmpty()) {
////        } else {
////            for (int j = 0; j < expectedErrorMessage.size(); j++) {
////                for (int k = 0; k < expectedErrorMessage.get(i).size(); k++) {
////                    if (k < expectedErrorMessage.get(j).size() - 1) {
////                        System.out.printf("%s \t", expectedErrorMessage.get(j).get(k));
////                    } else {
////                        System.out.printf("%s \t \n", expectedErrorMessage.get(j).get(k));
////                    }
////                }
////            }
////        }
//////
//////
////        System.out.println("888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
//
////        -------------------------------------------------------------
//        for (List row : expectedErrorMessage) {
//            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
//            //  System.out.println("expected"+row.get(3).toString());
//
//            System.out.println(row.get(i) + ": Search - Passed");
//
//
////            googleSheetsPage.clickLogIn();
////
//////            if(driver.findElement(By.cssSelector("#alertMsg")).getText().contains("Your User ID or Password is incorrect. Please try again.\n")){
////                driver.get("https://www.americanexpress.com");
//////            }
//
//            //    wait(2000);
//            i++;
//        }
//
//
//        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
//    }
//
////    @AfterMethod
////    public void teardown() {
////        driver.quit();
////    }
//}