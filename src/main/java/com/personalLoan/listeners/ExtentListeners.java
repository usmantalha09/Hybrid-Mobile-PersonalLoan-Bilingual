package com.personalLoan.listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.personalLoan.base.BaseClass;
import com.personalLoan.base.PropertiesReader;
import com.personalLoan.utilities.Waits;
import com.personalLoan.utilities.ZipUtils;



public class ExtentListeners extends BaseClass implements ITestListener, ISuiteListener {

	static Date d = new Date();
	static String fileName = PropertiesReader.getPropertyValue("platform").toUpperCase()+" Automation Test Report.html".toUpperCase();
	static Map<Long, ExtentTest> extentTestMap = new HashMap<Long, ExtentTest>();
	private static ExtentReports extent = ExtentManager
			.createInstance(System.getProperty("user.dir") + "/reports/" + fileName);
	public static String currentDateString;
	public static String currentTestMethodName = "Test";

	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		currentTestMethodName = result.getMethod().getMethodName();
		ExtentTest test = extent.createTest(result.getMethod().getMethodName())
				.assignCategory(result.getMethod().getGroups())
				.assignDevice(platformName).assignAuthor("M Usman Talha");
		extentTestMap.put(Thread.currentThread().getId(), test);
		testReport.set(test);
		System.out.println("Start Testing: "+result.getMethod().getMethodName());
		System.out.println("**********************************************");
	}

	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "TEST CASE:- " + methodName.toUpperCase() + " PASSED" + "</b>";
		try {

			ExtentManager.captureScreenshot();
			testReport.get().pass("<b>" + "<font color=" + "green>" + "Screenshot of Test Pass" + "</font>" + "</b>",
					MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName).build());
		} catch (IOException e) {

		}

		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		testReport.get().pass(m);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) (platformName.toLowerCase().equalsIgnoreCase("ios") ?getIOSDriver():getAndroidDriver());
			jse.executeScript(
					"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \""
							+ "TEST CASE:- " + methodName.toUpperCase() + " PASSED" + "\"}}");
		} catch (Exception e) {
		}
		if ((platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver) != null) {
			(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver).quit();
		}
		System.out.println(result.getMethod().getMethodName()+": Passed");
		System.out.println("**********************************************");
	}

	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());//result.getThrowable().getLocalizedMessage();
		
		System.out.println("Exception: "+result.getThrowable().getMessage());
		testReport.get()
				.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
						+ "</font>" + "</b >" + "</summary>" + result.getThrowable().getMessage() + "</details>"
						+ " \n");

		try {

			ExtentManager.captureScreenshot();
			testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
					MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName).build());
		} catch (Exception e) {

		}

		String failureLogg = "TEST CASE FAILED";
		Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
		testReport.get().log(Status.FAIL, m);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) (platformName.toLowerCase().equalsIgnoreCase("ios") ?getIOSDriver():getAndroidDriver());
			jse.executeScript(
					"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \""
							+ excepionMessage + "\"}}");

		} catch (Exception e) {
		}
		if ((platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver) != null) {
			(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver).quit();
		}
		System.err.println(result.getMethod().getMethodName()+": Failed");
		System.out.println("**********************************************");
	}

	public void onTestSkipped(ITestResult result) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) (platformName.toLowerCase().equalsIgnoreCase("ios") ?getIOSDriver():getAndroidDriver());
			jse.executeScript(
					"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \""
							+ "TEST CASE:- " + result.getMethod().getMethodName().toUpperCase() + " PASSED" + "\"}}");
			if ((platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver) != null) {
				(platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.iosDriver:BaseClass.androidDriver).quit();
			}
		} catch (Exception e) {
		}
		try {

			String methodName = result.getMethod().getMethodName();
			if (methodNamelist.get(methodName) > 0) {
				extent.removeTest(getTest());
				return;
			}
			String logText = "<b>" + "Test Case:- " + methodName + " Skipped" + "</b>";
			try {
				if (result.getThrowable() != null) {
					logText = result.getThrowable().getLocalizedMessage() + "</br>" + logText;
				}
			} catch (Exception e) {
			}
			Markup m = MarkupHelper.createLabel("<font color=" + "blue>" + logText + "</font>", ExtentColor.YELLOW);
			testReport.get().skip(m);
			printString("Skipped: " + methodName);
		} catch (Exception e) {

		}
		System.out.println(result.getMethod().getMethodName()+": Skipped");
		System.out.println("**********************************************");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
		if (extent != null) {
//			System.out.println("Skipped Test Scenario" + extent.getStats().getParentCountSkip());
//			System.out.println("Passed Test Scenario" + extent.getStats().getParentCountPass());
//			System.out.println("Failed Test Scenario" + extent.getStats().getParentCountFail());
			System.out.println("Creating Report...");
			extent.flush();
			System.out.println("Report Created at "+System.getProperty("user.dir")+File.separator+"reports"+File.separator+fileName);
			
		}
	}

	public static ExtentTest getTest() {
		return (ExtentTest) extentTestMap.get((Thread.currentThread().getId()));
	}

	public static void captureErrorAndScreenshot(Throwable result) {
		String excepionMessage = Arrays.toString(result.getStackTrace());
		testReport.get()
				.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
						+ "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
						+ " \n");
		try {
			ExtentManager.captureScreenshot();
			testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
					MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName).build());
		} catch (Exception e) {

		}
	}

	@Override
	public void onStart(ISuite suite) {
		try {
			Waits.wait5s();
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir") + "/reports/"));
		} catch (IOException e) {

		}
		currentDateString = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());

	}

	@Override
	public void onFinish(ISuite suite) {
		String emailLinkString = null;
		ZipUtils.generateZipFile();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		try {
			Map<String, ISuiteResult> getResults = suite.getResults();
			ISuiteResult iSuiteResult = getResults.get(getResults.keySet().toArray()[0]);
			ITestContext iTestContext = iSuiteResult.getTestContext();
			String nameString = iTestContext.getName();

			int total = TestFilterListener.testCount;
			int pass = iTestContext.getPassedTests().size();
			int fail = iTestContext.getFailedTests().size();
			int skip = total - (pass + fail);
			// Failed Test Cases
			Object[] FailedTest = iTestContext.getFailedTests().getAllMethods().toArray();
			String FailedTestCases = "-------------------------------------\nFailed Test Cases: ";
			for (int i = 0; i < FailedTest.length; i++) {
				String ClassName = FailedTest[i].toString().split("\\(")[0];
				String MethodName = ClassName.toString().split("\\.")[1];
				FailedTestCases = FailedTestCases + "\n-> " + MethodName;
			}
			FailedTestCases = FailedTestCases + "\n-------------------------------------\n";

			// Passed Test Cases
			Object[] PassedTest = iTestContext.getPassedTests().getAllMethods().toArray();
			String PassedTestCases = "-------------------------------------\nPassed Test Cases: ";
			for (int i = 0; i < PassedTest.length; i++) {
				String ClassName = PassedTest[i].toString().split("\\(")[0];
				String MethodName = ClassName.toString().split("\\.")[1];
				PassedTestCases = PassedTestCases + "\n-> " + MethodName;
			}
			PassedTestCases = PassedTestCases + "\n-------------------------------------\n";

			String emailBody = "=============================================================\n" + nameString + "\n"
					+ "Tests Run: " + total + ", Passed: " + pass + ", Failures: " + fail + ", Skipped: " + skip + "\n"
					+ FailedTestCases + "\n" + PassedTestCases + "\n"
					+ "=============================================================\n";
			System.out.print(emailBody);
		} catch (Exception e) {
			printString("Unable to send Email: " + e.getMessage());
		}
	}

	public static void attachScreenShot(String name) {
		try {

			ExtentManager.captureScreenshot();
			testReport.get().pass("<b>" + "<font color=" + "green>" + name + "</font>" + "</b>",
					MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName).build());
		} catch (IOException e) {

		}
	}
}
