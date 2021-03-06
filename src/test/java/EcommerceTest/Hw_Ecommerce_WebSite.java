package EcommerceTest;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import driverScript.AbstractClass_MethodOverride;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by moe on 6/6/2017.
 */
public class Hw_Ecommerce_WebSite extends AbstractClass_MethodOverride {

    @Test(priority = 1)
    public static void SignUp() throws IOException, BiffException, InterruptedException, WriteException {
        //line below will declare that test will be used in this extent report
        test = report.startTest("Sign Up Test", "Ecommerce Registration");
        test.log(LogStatus.INFO, "navigating to Ecommerce Wesite");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(3000);

        try {
            test.log(LogStatus.INFO, "Clicking on Sign In on the field");
            driver.findElement(By.className("login")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to Click on Sign In on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SignInClickError");

        }

        try {
            test.log(LogStatus.INFO, "Inputting e-mail address on the field");
            driver.findElement(By.name("email_create")).sendKeys("HPotter@yahoo.com");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to send key in the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "senKeyError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking on create an account on the field");
            driver.findElement(By.name("SubmitCreate")).click();
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on create an account on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "ClickError");

        }

        try {
            test.log(LogStatus.INFO, "scrolling into element title on the field");
            reusableMethods.scrollIntoElement(driver, driver.findElement(By.xpath("//*[text()='Title']")));
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to scroll into element title on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "scrolltitleError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking a gender on the field");
            driver.findElement(By.id("id_gender1")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click gender on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "genderClickError");

        }

        try {
            test.log(LogStatus.INFO, "Entering first name on the field");
            driver.findElement(By.id("customer_firstname")).sendKeys("Harry");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter first name on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "firstnameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering last name on the field");
            driver.findElement(By.id("customer_lastname")).sendKeys("Potter");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter last name on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "lastnameError");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            driver.findElement(By.name("passwd")).sendKeys("HPotter11218");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "passwordError");

        }

        try {
            test.log(LogStatus.INFO, "Selection birthday from dropdown on the field");
            reusableMethods.selectElementFromDropDownByValue(driver.findElement(By.id("days")), "5");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select birthday from dropdown on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "dayError");

        }

        try {
            test.log(LogStatus.INFO, "Selection birth month from dropdown on the field");
            reusableMethods.selectElementFromDropDownByValue(driver.findElement(By.id("months")), "5");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select birth month from dropdown on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "monthError");

        }

        try {
            test.log(LogStatus.INFO, "Selection birth year from dropdown on the field");
            reusableMethods.selectElementFromDropDownByValue(driver.findElement(By.id("years")), "1991");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select birth year from dropdown on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "yearError");

        }

        try {
            test.log(LogStatus.INFO, "scrolling into element address on the field");
            reusableMethods.scrollIntoElement(driver, driver.findElement(By.xpath("//*[text()='Address ']")));
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to scroll into element address on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "scrolladdressError");

        }

        try {
            test.log(LogStatus.INFO, "Entering street address on the field");
            driver.findElement(By.id("address1")).sendKeys("593 E 29th ST.");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter street address on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "streetError");

        }

        try {
            test.log(LogStatus.INFO, "Entering city on the field");
            driver.findElement(By.id("city")).sendKeys("Brooklyn, NY");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "cityError");

        }

        try {
            test.log(LogStatus.INFO, "Selecting the state from dropdown on the field");
            reusableMethods.selectElementFromDropDownByValue(driver.findElement(By.id("id_state")), "32");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to select state from dropdown on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "stateError");

        }

        try {
            test.log(LogStatus.INFO, "Entering post code on the field");
            driver.findElement(By.id("postcode")).sendKeys("90210");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter post code on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "postcodeError");

        }

        try {
            test.log(LogStatus.INFO, "Entering phone number on the field");
            driver.findElement(By.id("phone_mobile")).sendKeys("(718)392-4903");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter phone number on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "numberError");

        }

        try {
            test.log(LogStatus.INFO, "Entering alias address on the field");
            driver.findElement(By.id("alias")).sendKeys("635 E 73rd ST.");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to alias address on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "aliasError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking on register button on the field");
            driver.findElement(By.id("submitAccount")).click();
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on register button on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "registerError");

        }

        }

    @Test(dependsOnMethods = "SignUp")
    public static void OrderandPayment() throws IOException, BiffException, InterruptedException {
        //line below will declare that test will be used in this extent report
        test = report.startTest("Make an Order", "Ecommerce ordering a dress");
        test.log(LogStatus.INFO, "navigating to Ecommerce page");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(3000);

        try {
            test.log(LogStatus.INFO, "Clicking on Sign In on the field");
            driver.findElement(By.className("login")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to Click on Sign In on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SignInClickError");

        }

        try {
            test.log(LogStatus.INFO, "Inputting e-mail address on the field");
            driver.findElement(By.id("email")).sendKeys("HPotter@yahoo.com");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to send key in the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "sendError");

        }

        try {
            test.log(LogStatus.INFO, "Entering password on the field");
            driver.findElement(By.name("passwd")).sendKeys("HPotter11218");

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to enter password on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "passError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking on Sign In on the field");
            driver.findElement(By.id("SubmitLogin")).click();

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to Click on Sign In on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "SignInError");

        }

        try {
            test.log(LogStatus.INFO, "Clicking on dresses title on the field");
            driver.findElement(By.className("sf-with-ul")).click();
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click dresses title on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "dressestitleError");

        }

        try {
            test.log(LogStatus.INFO, "Scrolling into view of showing on the field");
            reusableMethods.scrollIntoElement(driver, driver.findElement(By.id("pagination")));
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to scroll into view of showing on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "viewError");

        }

        try {
            test.log(LogStatus.INFO, "Mouse hovering on a dress on the field");
            WebElement element = driver.findElement(By.className("left-block"));
            //line below will define Actions for mouse movement
            Actions mousemovement = new Actions(driver);
            mousemovement.moveToElement(element).perform();
            Thread.sleep(1000);
        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to mouse hover on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "hoverError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on add to cart on the field");
            driver.findElement(By.xpath("//*[@title='Add to cart']")).click();
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click add to cart on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "addtocartError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on proceed to checkout on the field");
            driver.findElement(By.xpath("//*[@title='Proceed to checkout']")).click();
            Thread.sleep(3000);

        } catch (Exception err) {
            test.log(LogStatus.FAIL, "Unable to click on proceed to checkout on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "checkoutError");
        }

        try {
            test.log(LogStatus.INFO, "Scrolling down to proceed to checkout on the field");
            reusableMethods.scrollIntoElement(driver, driver.findElement(By.className("cart_total_price")));
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to scroll down to proceed to checkout on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "scrollproceedcheckoutError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on proceed to checkout on the field");
            driver.findElement(By.xpath("//*[@title='Proceed to checkout']//*[text()='Proceed to checkout']")).click();
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to clicking on proceed to checkout on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "proceedcheckoutError");
        }

        try {
            test.log(LogStatus.INFO, "Scrolling into view of Your Delivery Address on the field");
            reusableMethods.scrollIntoElement(driver, driver.findElement(By.className("address_title")));
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to scroll into view of Your Delivery Address on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "scrolldeliveryError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on proceed to checkout on the field");
            driver.findElement(By.xpath("//*[@type='submit']//*[text()='Proceed to checkout']")).click();
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to click on proceed to checkout on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "proceedoutError");
        }

        try {
            test.log(LogStatus.INFO, "Scrolling into view of shipping on the field");
            reusableMethods.scrollIntoElement(driver, driver.findElement(By.id("carrier_area")));
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to scroll into view of shipping on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "shippingError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on check box on the field");
            driver.findElement(By.name("cgv")).click();
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to click on check box on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "checkboxtError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on proceed to checkout on the field");
            driver.findElement(By.name("processCarrier")).click();
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to click on proceed to checkout on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "finalproceedoutError");
        }

        try {
            test.log(LogStatus.INFO, "Scrolling into view of payment method on the field");
            reusableMethods.scrollIntoElement(driver, driver.findElement(By.id("slider_row")));
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to scroll into view of payment method on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "paymentmethodviewError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on pay by check on the field");
            driver.findElement(By.className("cheque")).click();
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to click on pay by check on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "paycheckError");
        }

        if(driver.findElements(By.xpath("//*[text()='Check payment']")).size() > 0){
              test.log(LogStatus.PASS, "Check payment is visible");
        } else{
            test.log(LogStatus.FAIL, "Unable to see check payment on the fiels ");
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "paymentError");
        }

        try {
            test.log(LogStatus.INFO, "Clicking on confirming order on the field");
            driver.findElement(By.xpath("//*[@type='submit']//*[text()='I confirm my order']")).click();
            Thread.sleep(3000);

        }catch(Exception err){
            test.log(LogStatus.FAIL, "Unable to click on confirm oder button on the field - " + err.getMessage());
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "confirmingError");
        }

        if(driver.findElements(By.xpath("//*[text()='Order confirmation']")).size() > 0){
            test.log(LogStatus.PASS, "Your order on My Store is complete is visible");
        } else{
            test.log(LogStatus.FAIL, "Unable to see Your order on My Store is complete ");
            reusableMethods.getScreenshot(driver, test, "src\\main\\java\\ExtentReport\\ScreenShots\\", "paymentError");
        }




    }
}