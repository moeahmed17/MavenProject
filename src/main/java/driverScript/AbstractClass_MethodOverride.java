package driverScript;

import Utilities.reusableMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

/**
 * Created by moe on 6/4/2017.
 */
public class AbstractClass_MethodOverride {

    public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest test;
    public static String reportPath = null;


    @BeforeSuite
    @Parameters("BrowserUrl")
    public static void openBrowser(String BrowserUrl) throws InterruptedException, IOException {
        System.out.println(":::::::::::::::::::CLOSING ALL INSTANCE OF CHROME DRIVER::::::::::::::::::::::::");
        //Kill ALL instances and services of CHrome and ChromeDriver then free memory
        Runtime.getRuntime().exec("src\\main\\resources\\CleanUp.cmd");
        reportPath = "src\\main\\java\\ExtentReport\\extentReport.html";
        report = new ExtentReports(reportPath, true);
        driver = reusableMethods.wDriver();
        Thread.sleep(3000);
        driver.navigate().to(BrowserUrl);

    }


    @AfterSuite(alwaysRun = true)
    public static void closeBrowser() {
        //to end extent test you need to call the command below
        report.endTest(test);
        //line below will flush the report
        report.flush();
        //line below will close the report
        //report.close();

        //line below will open the report
        driver.get("C:\\Users\\moe\\Documents\\MavenProject\\" + reportPath);

        //line below will close the report
        //report.close();

        // driver.quit();
    }
}
