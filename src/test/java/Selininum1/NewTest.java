package Selininum1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NewTest {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/"
				+ new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date()) + ".htm");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("host Name", "GFT Selenium");
		extent.setSystemInfo("user", "v.vishnu");
		extent.setSystemInfo("environment", "Selenium");
		htmlReporter.config().setDocumentTitle("Title comes here");
		htmlReporter.config().setReportName("tesst result");
		htmlReporter.config().setTheme(Theme.STANDARD);

	}

	@Test
	public void passTest() {
		// extent.startTest("TestCaseName", "Description")
		// TestCaseName – Name of the test
		// Description – Description of the test
		// Starting test
		logger = extent.createTest("passTest");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed

	}

	@Test
	public void failTest() {
		
		logger = extent.createTest("failTest");
		Assert.assertTrue(false);

	}

	@Test
	public void skipTest() {
		logger = extent.createTest("skipTest");
		throw new SkipException("Skipping - This is not ready for testing ");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + "Test Case Failed", ExtentColor.RED));
			
			
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + "Test Case Skipped", ExtentColor.ORANGE));

		}

		else {

			logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));

		}

		// ending test
		// endTest(logger) : It ends the current test and prepares to create HTML report

	}

	@AfterTest
	public void endReport() {
		// writing everything to document
		// flush() - to write or update test information to your report.
		extent.flush();

	}
}
