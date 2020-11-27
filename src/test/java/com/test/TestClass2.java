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

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestClass2 extends PojoClass {
	String path="C:\\Users\\Divya Bharathi\\Downloads\\VPM-main\\VPM-main\\Excel\\Vpm_Excel.xlsx";
    
      @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
    	//Thread.sleep(5000);
    	  //mobile2
    	launchmob("9f9c90e1");
      }
    
       
   @Test(enabled=false)
    public void Joiner_Joines_The_Room_Created() throws InterruptedException, IOException {
        
       Thread.sleep(5000);
    	
    	
    	PojoClass p2=new PojoClass();
    	click(p2.getFeed());
    	click(p2.getPlusIcon());
    	send(p2.getRoomName(), read(1, 1, path));
    	Thread.sleep(1000); 
    	click(p2.getStart());
    }
    
    
  @Test(priority=2)
    public void live_session_visisble() throws InterruptedException, IOException {
    PojoClass p4=new PojoClass();
	  click(p4.getFeed());
   	click(p4.getPlusIcon());
  	send(p4.getRoomName(), read(1, 1, path));
  	Thread.sleep(1000); 
  	click(p4.getStart());
  	Thread.sleep(1000);
  	click(p4.getBack());
  	if(p4.getLive().isDisplayed())
  	{
  		System.out.println("Live session  is visible");
  	}
  	else
  	{
  		System.out.println("Live session is not visible");
  	}
     // driver.findElement(By.xpath("//*[@id='ivBackArrow']")).click();

		
	}
  
  @Test(enabled=false)
  public void Joiner_end_The_session() throws InterruptedException, IOException {
      
    // Thread.sleep(5000);
  	
  	
  	PojoClass p6=new PojoClass();
  	click(p6.getFeed());
  	click(p6.getPlusIcon());
  	send(p6.getRoomName(), read(1, 1, path));
  	Thread.sleep(1000); 
  	click(p6.getStart());
  	Thread.sleep(2000);
  	click(p6.getDisconnect());
  }
//  	driver.findElement(By.xpath("//*[@id='btnCallDisconnect']")).click();

  

    @AfterMethod
    public void tearDown() {
        
    }


}


