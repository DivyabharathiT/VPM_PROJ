package com.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestClass1 extends PojoClass{
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
    	//mobile1
    	launchmob("3594acce0804");
	       
    	  }
     @Test
    public void Creater_Creates_A_New_Room() throws InterruptedException, IOException {
    	PojoClass p1=new PojoClass();
    	click(p1.getVideoIcon());
    	send(p1.getRoomName(), read(1, 0));
    	Thread.sleep(1000);
    	click(p1.getCreate());
        
        
    }
    
    @Test(enabled=false)
    public void Creater_Click_back_button() throws InterruptedException, IOException {
    	PojoClass p3=new PojoClass();
    	click(p3.getVideoIcon());
    	send(p3.getRoomName(), read(1, 0));
    	Thread.sleep(1000);
    	click(p3.getCreate());
    	Thread.sleep(1000);
    	click(p3.getBack());
        
        
    }
    
    
    
    @Test(enabled=false)
    public void Creater_end_The_Session() throws InterruptedException, IOException {
    	PojoClass p5=new PojoClass();
    	click(p5.getVideoIcon());
    	send(p5.getRoomName(), read(1, 0));
    	Thread.sleep(1000);
    	click(p5.getCreate());
    	Thread.sleep(1000);
    	click(getDisconnect());
    
    }
    
    
    

    @AfterMethod
    public void tearDown() {
        
    }
}


