package MercuryTestMethods;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbstractClass_MethodOverride;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by moe on 6/10/2017.
 */
public class BookFlight extends AbstractClass_MethodOverride{


    @Test(priority = 3)
    public void BookFlight(String value, String date, String arrival) throws IOException {

        try {
            test.log(LogStatus.INFO, "Selecting value " + value + "on the deaprting field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromPort")), value);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select New york on the deaprting field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError1");

        }

        try {
            test.log(LogStatus.INFO, "Selecting date " + date + "on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromDay")), date);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select date on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError2");

        }

        try {
            test.log(LogStatus.INFO, "Selecting arrival " + arrival +  "on the arriving in field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toPort")), arrival);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select Paris on the arriving in field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError3");

        }

        try {
            test.log(LogStatus.INFO, "Selecting return month on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toMonth")), "August");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError4");

        }

        try {
            test.log(LogStatus.INFO, "Selecting return date on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toDay")), "25");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError5");

        }

        try {
            test.log(LogStatus.INFO, "Clicking service class on the field");
            driver.findElement(By.name("servClass")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError6");

        }

        try {
            test.log(LogStatus.INFO, "Selecting airline on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("airline")), "Blue Skies Airlines");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select airline on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError7");

        }

        try {
            test.log(LogStatus.INFO, "Clicking the continue button on the field");
            driver.findElement(By.name("findFlights")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError8");

        }

        try {
            test.log(LogStatus.INFO, "Clicking the continue button on the field");
            driver.findElement(By.name("reserveFlights")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError9");

        }

        try {
            test.log(LogStatus.INFO, "Clicking on home on the field");
            driver.findElement(By.xpath("//*[text()='Home']")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on home on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "HomeClickError");

        }



        try {
            test.log(LogStatus.INFO, "Entering user name on the field");
            driver.findElement(By.name("userName")).sendKeys("H.Potter");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter user name on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "UserNameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            driver.findElement(By.name("password")).sendKeys("Harry90210");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "PasswordError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking on submit on the field");
            driver.findElement(By.name("login")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on submit on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SubmitError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting New York on the deaprting field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromPort")), "New York");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select New york on the deaprting field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError10");

        }

        try {
            test.log(LogStatus.INFO, "Selecting date on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("fromDay")), "25");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select date on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError11");

        }

        try {
            test.log(LogStatus.INFO, "Selecting Paris on the arriving in field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toPort")), "Paris");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select Paris on the arriving in field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError12");

        }

        try {
            test.log(LogStatus.INFO, "Selecting return month on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toMont")), "August");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError13");

        }

        try {
            test.log(LogStatus.INFO, "Selecting return date on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("toDay")), "25");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select return month on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError14");

        }

        try {
            test.log(LogStatus.INFO, "Clicking service class on the field");
            driver.findElement(By.name("servClass")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError15");

        }

        try {
            test.log(LogStatus.INFO, "Selecting airline on the field");
            reusableMethods.selectElementFromDropDownByText(driver.findElement(By.name("airlin")), "Blue Skies Airlines");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select airline on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError16");

        }

        try {
            test.log(LogStatus.INFO, "Clicking the continue button on the field");
            driver.findElement(By.name("findFlights")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError17");

        }

        try {
            test.log(LogStatus.INFO, "Clicking the continue button on the field");
            driver.findElement(By.name("reserveFlights")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select service class on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SelectionError18");

        }



    }

}
