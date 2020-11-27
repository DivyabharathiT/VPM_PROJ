package com.test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vpm_Test extends PojoClass{
	String path="C:\\Users\\Divya Bharathi\\Downloads\\VPM-main\\VPM-main\\Excel\\Vpm_Excel.xlsx";
    
    @BeforeMethod
  public void setUp() throws MalformedURLException, InterruptedException {
  	launchmob("9f9c90e1");
     
  }

    @Test(enabled=false)
	public void User_lands_on_feedscreen() {
		 PojoClass p1=new PojoClass();
		if(p1.getVideo().isDisplayed())	{
			System.out.println("Landing screen :");
			System.err.println("User lands on videoScreen but not feed screen");
		}
		else
		{
			System.out.println("It lands on the feed screen");
		}
    
    
    }
    
    
    @Test(enabled=false)
	public void feedlist_view_createandjoin_option() throws InterruptedException {
		 PojoClass p1=new PojoClass();
		  click(p1.getFeed());
		  Thread.sleep(1000);
		if(p1.getVideoIcon().isDisplayed() && p1.getPlusIcon().isDisplayed())	{
			System.out.println("feed list contain create option and join option");
		}
		else
		{
			System.out.println("feed list doesnot contain create option and join option");
		}
    
    
    }
    
    @Test(enabled=false)
	public void Feed_shows_priorcalls() {
		 PojoClass p1=new PojoClass();
		  click(p1.getFeed());
		if(p1.getRoom1().isDisplayed() && p1.getRoom2().isDisplayed())	{
			System.out.println("feed list shows history of prior calls and  room name ");
		}
		else
		{
			System.out.println("feed list does't shows history of prior calls and room name");
		}
 }
    @Test(enabled=false)
  	public void Feed_shows_type_of_call() {
  		 PojoClass p1=new PojoClass();
  		  click(p1.getFeed());
  		if(p1.getFeedtype().isDisplayed())	{
  			System.out.println("feed list shows type of call");
  		}
  		else
  		{
  			System.out.println("feed list does't shows type of call");
  		}
   }
    
    @Test(enabled=false)
    public void Joiner_Joines_The_Room_Created() throws InterruptedException, IOException {
        
      // Thread.sleep(5000);
    	
    	
    	PojoClass p2=new PojoClass();
    	click(p2.getFeed());
    	click(p2.getPlusIcon());
    	send(p2.getRoomName(), read(1, 1, path));
    	Thread.sleep(1000); 
    	click(p2.getStart());
    }
    
    
}
