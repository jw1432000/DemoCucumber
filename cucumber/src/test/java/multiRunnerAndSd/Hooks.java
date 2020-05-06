package multiRunnerAndSd;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;
	public static ExtentHtmlReporter htmlReporter ;    //for look and feel of report
	public static ExtentReports extentReport ;         //To create entry of test in report
	public static ExtentTest extentTest;               //To update status of test in report
	String currentDateTime;

	String currentDir = System.getProperty("user.dir");


	@Before()
	public WebDriver beforeStup()
	{
		if (driver == null)
		{
			System.out.println("++++++++BEFORE SETUP++++++++++++");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");

		}
		return driver;

	}

	/*
	 * @Before(order=1) public void beforeScenario(Scenario scene) { currentDateTime
	 * = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date());
	 * 
	 * htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +
	 * "/extentReport/TestAutomationReport_" + currentDateTime + ".html");
	 * htmlReporter.config().setDocumentTitle("Automation Report");
	 * htmlReporter.config().setReportName("Functional Report");
	 * htmlReporter.config().setTheme(Theme.STANDARD);
	 * 
	 * 
	 * extentReport = new ExtentReports();
	 * extentReport.attachReporter(htmlReporter);
	 * 
	 * extentReport.setSystemInfo("HostName", "John Williams");
	 * extentReport.setSystemInfo("OS", "WIN 07");
	 * extentReport.setSystemInfo("Browser", "Firefox");
	 * extentReport.setSystemInfo("Environment", "Dev"); }
	 */

	/*
	 * @After public void afterScenario(Scenario scene) {
	 * 
	 * switch (scene.getStatus()) {
	 * 
	 * case PASSED: extentTest. break;
	 * 
	 * case FAILED: extentTest.log(Status.FAIL, "FAILED" + scene.getName()); break;
	 * 
	 * default: extentTest.log(Status.SKIP, "SKIPPED" + scene.getName());
	 * 
	 * }
	 * 
	 * 
	 * extentReport.flush(); driver.quit(); driver = null; }
	 */


	@After 
	public void tearDwn(Scenario scene) throws InterruptedException { 
		if(!scene.isFailed()) 
		{
			System.out.println("Scenario passed is : "+scene.getName());
			System.out.println("+++++++++++++++ NOT FAILED AFTER SETUP++++++++++++++"); }
		else 
		{ 
			System.out.println("+++++++++++++++FAILED AFTER SETUP++++++++++++++");
		} 
		driver.quit(); 
		driver = null;

	}

}
