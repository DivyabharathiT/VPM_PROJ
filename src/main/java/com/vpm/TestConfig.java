package com.vpm;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestConfig {
	public boolean flag = true;
	private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo5ODc5NjU1LCJ4cC5wIjo5ODc5NjU0LCJ4cC5tIjoxNjA2MjA2MDAwNDM5LCJleHAiOjE5MjE1NjYwMjQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.Jzd-cAolymFniiCiYqzSmBPWQjvGK5CJhsT8f2v90n8";
	protected AndroidDriver<AndroidElement> driver = null, driver2 = null;
	public AppiumDriver dd=null;
	DesiredCapabilities dc = new DesiredCapabilities();
	DesiredCapabilities dc2 = new DesiredCapabilities();

	
	public void keepDriverActive() throws InterruptedException {
		Runnable r = new Runnable() {
			public void run() {

				int i = 0;
				while (flag) {
					driver.getOrientation();
					System.out.println("Keeping Creater Device Active ==> " + i);
					i++;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t = new Thread(r);
		// Lets run Thread in background..
		// Sometimes you need to run thread in background for your Timer application..
		t.start(); // starts thread in background..
//		 t.run(); // is going to execute the code in the thread's run method on the current thread..
		System.out.println("Main() Program Exited...\n");
	}
	
	public void Simulator() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		// cap.setCapability(MobileCapabilityType.DEVICE_NAME, "m21");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/App/vpm.apk");
		dc.setCapability("appPackage", "com.adt.vpm.testapp");
		dc.setCapability("appActivity", "com.adt.vpm.activity.HomeActivity");
		dc.setCapability("automationName", "UiAutomator1");
		dc.setCapability("newCommandTimeout", 300);
		dc.setCapability("autoGrantPermissions", true);
//		dc.setCapability("use-fake-ui-for-media-stream", true);
//		dc.setCapability("use-fake-device-for-media-stream", true);
		dd = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	}



	@Test(priority = 1)
	public void Creater_Creates_A_New_Room() throws MalformedURLException {
		Execute.DeviceA = "9";
		Execute.DeviceB = "6.0.1";
		
//		Simulator();
		System.out.println("Performing Actions for Creation");
		driver.findElement(By.id("ivVideoIcon")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("edtRoomName")).sendKeys("autoroom012");
		driver.findElement(By.id("btnStart")).click();
	}

	@Test(priority = 2)
	public void Joiner_Joines_The_Room_Created() throws MalformedURLException, InterruptedException {
		keepDriverActive();
		
		Thread.sleep(1000);
		System.out.println("Performing Actions for Joining");
		try {
			driver2.findElement(By.xpath("//*[@text='Feeds']")).click();
		} catch (Exception e) {
			driver2.findElement(By.xpath("//*[@contentDescription='Feeds']")).click();
		}
		driver2.findElement(By.id("fabPlusIcon")).click();
		driver2.hideKeyboard();
		driver.getOrientation();
		driver2.findElement(By.id("edtRoomName")).sendKeys("autoroom012");
		driver.getOrientation();
		driver2.findElement(By.id("btnStart")).click();
	}
	
	@Test(priority = 3)
	public void Joiner_Leaves_The_Room_Joined() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
//		driver2.quit();
	}
	
	@Test(priority = 4)
	public void Creater_Leaves_The_Room_Created() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		flag=false;
//		driver.quit();
	}

}
