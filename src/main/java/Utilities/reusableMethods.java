package Utilities;



import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

/**
 * Created by moe on 5/7/2017.
 */
public class reusableMethods {

    public static WebDriver wDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        //Chrome options is a built in selenium command with java which allows you to pass additional
        //arguments before defining the driver.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //line below define the type of driver you are using by calling Web.
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }

//line below will select element by visible text from 'select' tag name
    public static void selectElementFromDropDownByText(WebElement element, String visibleText){

        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(visibleText);
    }
    //line below will select element by value from a 'select' tag name
    public static void selectElementFromDropDownByValue(WebElement element, String value ){

        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
    }

    public static void scrollIntoElement(WebDriver driver, WebElement element) {

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    //method below will define webdriverwait
    public static void  webDriverWait(WebDriver driver, int seconds, String xpathExpression){

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));

    }

    //method below will take screenshot
    public static void getScreenshot(WebDriver wDriver, ExtentTest test, String path, String screenshotName) throws IOException{
        String fileName = screenshotName + ".png";
        File sourceFile = ((TakesScreenshot)wDriver).getScreenshotAs(OutputType.FILE);
        //Now you can do whatever you need to do with, for example copy somewhere
        FileUtils.copyFile(sourceFile, new File(path + fileName));
        //String imgPath = directory + fileName;
        String image = test.addScreenCapture(path + fileName);
        test.log(LogStatus.FAIL, "", image);

    }
}
