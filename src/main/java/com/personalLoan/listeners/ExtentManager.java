package com.personalLoan.listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.personalLoan.base.BaseClass;
import com.personalLoan.utilities.Constant;
import com.personalLoan.utilities.GenericUtilities;

public class ExtentManager {

	private static ExtentReports extent;
	public static String configFilesPath = System.getProperty("user.dir") + File.separator + "extent-config.xml";
	private static ExtentTest test;
	    public static ExtentReports createInstance(String fileName) {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	               
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        htmlReporter.loadConfig(configFilesPath);
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Automation Tester", "M Usman Talha");
	        extent.setSystemInfo("Organization", "RakBank");
	        extent.setSystemInfo("Build Number", Constant.buildNumber);
	        extent.setSystemInfo("Project", "Personal Loan");
	        return extent;
	    }

	    
	    public static String screenshotPath;
		public static String screenshotName;
		
		public static void captureScreenshot() {

			File scrFile = ((TakesScreenshot) (BaseClass.platformName.toLowerCase().equalsIgnoreCase("ios") ?BaseClass.getIOSDriver():BaseClass.getAndroidDriver())).getScreenshotAs(OutputType.FILE);

			Date d = new Date();
			screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

			try {				
//				FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/reports/" + screenshotName));
				GenericUtilities.compressImage(scrFile, System.getProperty("user.dir") + "/reports/" + screenshotName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage()+"\n\n"+e.getStackTrace());
			}
		}
		
		

	

	}
