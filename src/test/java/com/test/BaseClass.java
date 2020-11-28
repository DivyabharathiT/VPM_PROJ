package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
		public static AndroidDriver<AndroidElement> driver;
		
		public 	static ExtentReports extent;
		
		static DesiredCapabilities dc = new DesiredCapabilities();
		public static void launchmob(String udid) throws MalformedURLException {
			 dc.setCapability(MobileCapabilityType.UDID, udid);
		        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.adt.vpm.testapp");
		        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.adt.vpm.activity.HomeActivity");
		        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
		        driver.setLogLevel(Level.INFO);
		}
		

		public static void send(WebElement e,String txt) {
			e.sendKeys(txt);

		}
		
		public static void click(WebElement e) {
			e.click();
		}
		public static String read(int row,int col) throws IOException {
		
			String path=System.getProperty("user.dir")+"\\Excel\\Vpm_Excel.xlsx";
			File f=new File(path);
			FileInputStream fin=new FileInputStream(f);
			String value="";
			Workbook w=new XSSFWorkbook(fin);
			Sheet s = w.getSheet("Sheet1");
			Row r = s.getRow(row);
			Cell c = r.getCell(col);
			int celltype = c.getCellType();
			
			if(celltype==1)
			{
			value = c.getStringCellValue();
			}
			else if (celltype==0) {
				if(DateUtil.isCellDateFormatted(c))
				{
					
					 java.util.Date date = c.getDateCellValue();
					 SimpleDateFormat sim=new SimpleDateFormat("mm-dd-yyyy");
					  value = sim.format(date);
				}
				else
				{
					double d = c.getNumericCellValue();
					long l=(long)d;
				 value = String.valueOf(l);
				}
				
			}
			return value;
			
			

		}
		

		/*public static void screen(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Divya Bharathi\\Downloads\\VPM-main\\VPM-main\\ScreenShot\\"+ name +".png");
		FileUtils.copyFile(src, dest);
		}
		
		public static void report(String name) {
			String path=System.getProperty("user.dir")+"\\ExtentReports\\" + name +".html";
			ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
			reporter.config().setDocumentTitle("TestReport");
			reporter.config().setReportName("VPM Test");
			extent =new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "divya");

		
		}*/
		public WebElement scrollToAnElementByText(AndroidDriver<AndroidElement> driver2, String text) {
	        return driver2.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
	                ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
	}
		
		
		
	}




