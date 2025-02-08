package com.personalLoan.utilities;

import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.personalLoan.base.PropertiesReader;

public class Constant {
	public static boolean closeDriver = false;
	public static WebDriverWait wait;
	public static String browser;
	public static String env;
	public static ExtentTest extentReport;
	public static SoftAssert softAssert;
	public static URL url;
	public static DesiredCapabilities capabilities;

	public static HashMap<String, Integer> methodNamelist = new HashMap<>();

	public static boolean runOnLocal = false;
	public static String platformName = PropertiesReader.getPropertyValue("platform");

	// This is the default path to data package
	public static final String excelFilePath = System.getProperty("user.dir") + "/src/test/resources/data/";

	// This is the default path to imageUpload
	public static String imagePath = System.getProperty("user.dir") + "/src/test/resources/data/Images/";

	// This is column name from which we need to get row
	public static final String colName = "env";
	// This is row index of environment column from which we need to get data
	public static int rowIndex = 0;

	// Test Suite Runner File Name
	public static final String testSuiteRunnerFileName = "SuiteTests_Android";
	// Test Suite Runner Sheet Name
	public static final String testSuiteRunnerSheetName = "Tests";

	public static final int defaultTimeForVisibility = 30;
	public static final int defaultTimeTOBeClickable = 30;
	public static final String buildNumber = PropertiesReader.getPropertyValue("build");

	// BrowserStack Config
	public static String userName = PropertiesReader.getPropertyValue("BrowserStack_UserName");
	public static String accessKey = PropertiesReader.getPropertyValue("BrowserStack_AccessKey");

	// IOS Device And Application Config
	public static final String iosDeviceName = PropertiesReader.getPropertyValue("BrowserStack_iosDeviceName");
	public static String iosApplication = PropertiesReader.getPropertyValue("BrowserStack_iosApplication");

	// Test Data
	public static String JobTitle = "Other";
	public static String InstallmentDuration = "30";
	public static String HouseholdIncome = "10000";
	public static String NumberOfMemberEarning = "3";
	public static String CashDeposit = "2000";
	public static String LoanPurpose = "Debt consolidation";
	public static String RetirementPlan = "In 10 to 20 Years";
	public static String MonthlyLifestyleExpense = "4000";
	public static String MonthlyUtilities = "200";
	public static String MonthlyOtherFinance = "200";
	public static String MonthlyExpenses = "2000";
	public static String Dependents = "2";
	public static String Name = "AutomationUser";
	public static String Email = "AutomationUser_" + GenericUtilities.generateRandomNumberWithGivenNumberOfDigits(4)
			+ "h@gmail.com";
	public static String EmployerName = "OTHER";
	public static String Salary = "10000";
	public static String Otp = "111111";
	public static String Iban = "AE070331234567890123456";
	public static String VillaName = "Villa";
	public static String VillaNo = "30";
	public static String StreetNumber = "68C";
	public static String PoBox = "500001";
	public static String Country = "United Arab Emirates";
	public static String HouseName = "Rashidiyah House";
	public static String HouseNumber = "42B";
	public static String AreaName = "Rashidiyah";
	public static String CityTown = "Dubai";
	public static String PostalCode = "25314";
	public static String MobileNumberWithCode = "+971509841345";
}
