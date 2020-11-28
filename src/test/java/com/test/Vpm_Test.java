package com.test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vpm_Test extends PojoClass{
	
    
    @BeforeMethod
  public void setUp() throws MalformedURLException, InterruptedException {
  	launchmob("9f9c90e1");
     
  }

    //1) Landing screen 
    
    @Test
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
    
    //2) Feed list item should show creater and joiner option
    
    @Test
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
    
    //5) Feed list show history of prior calls & 8) room name 
    
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
    
    //4) Feed item should show type of call name by viewing symbol
    @Test
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
    
    //7) Feed title should show the live indicator & 9)live call should be at the top of the list
    
    
    @Test(enabled=false)
    public void live_session_visisble() throws InterruptedException, IOException {
	  Thread.sleep(5000);
    PojoClass p4=new PojoClass();
	  click(p4.getFeed());
   	click(p4.getPlusIcon());
  	send(p4.getRoomName(), read(1, 1));
  	Thread.sleep(1000); 
  	click(p4.getStart());
  	Thread.sleep(1000);
  	click(p4.getBack());
  	if(p4.getLive().isDisplayed())
  	{
  		System.out.println("Live session  is visible and at the top of the list");
  	}
  	else
  	{
  		System.out.println("Live session is not visible");
  	}
     // driver.findElement(By.xpath("//*[@id='ivBackArrow']")).click();

		
	}
    
    
   // 21) call view show room name at the top
    
    @Test
    public void call_show_roomname() throws InterruptedException, IOException {
        
      // Thread.sleep(5000);
    	
    	
    	PojoClass p2=new PojoClass();
    	click(p2.getFeed());
    	click(p2.getPlusIcon());
    	send(p2.getRoomName(), read(1, 1));
    	Thread.sleep(1000); 
    	click(p2.getStart());
    	Thread.sleep(1000);
    	if(p2.getContactName().isDisplayed())
    	{
    		System.out.println("room name is displayed");
    	}
    	else
    	{
    		System.out.println("room name is not displayed");
    	}
    }
    
    //31)change sl server setting & 32) after changes made app doesn't restart ,we can continue
    
    @Test
    public void enable_SL_server()
    {
    	PojoClass p2=new PojoClass();
    	click(p2.getSetting());
    	click(p2.getSlServersetting());
    	click(p2.getSlServersetting());
    	if(p2.getSlServersetting().isEnabled())
    	{
    		System.out.println("SL server is on and doesnot require any app restart");
    	}
    	else
    	{
    		System.out.println("SL server is off");
    	}
    	
    }
    
    
    //33) stability creator -5 successfull creater cl
    @Test(priority=1,enabled=false)
    public void laun() throws MalformedURLException {
    	 launchmob("9f9c90e1");
    	 }
    @Test(priority=2,invocationCount=5,enabled=false)
    public void Creater_Create() throws InterruptedException, IOException {
    	
    	PojoClass p1=new PojoClass();
    	click(p1.getVideoIcon());
    	send(p1.getRoomName(), read(1, 0));
    	Thread.sleep(1000);
    	click(p1.getCreate());
    	click(p1.getBack());
    	click(p1.getEndOk());
    	Thread.sleep(1000);
        
        
    }
    
    
    
    //34) stability joiner -5 successfull joiner cl
    @Test(priority=1,enabled=false)
    public void launc() throws MalformedURLException {
    	 launchmob("9f9c90e1");
    	 }
    @Test(priority=2,invocationCount=5,enabled=false)
    public void joiner_create() throws InterruptedException, IOException {
    	PojoClass p2=new PojoClass();
    	click(p2.getFeed());
    	click(p2.getPlusIcon());
    	send(p2.getRoomName(), read(1, 1));
    	Thread.sleep(1000); 
    	click(p2.getStart());
    	click(p2.getDisconnect());
    	Thread.sleep(1000);
    	
        
        
    }
    
    
    //42)click on the tile and initiate the playback
    @Test
    public void click_on_video() throws InterruptedException {
    PojoClass p2=new PojoClass();
    //play rtsp video
    click(p2.getRtspvideo());
    Thread.sleep(4000);
    }
    
    
  //45)click on the tile and initiate the playback
    @Test
    public void play_pause_video() throws InterruptedException {
    PojoClass p2=new PojoClass();
    //play rtsp video
    click(p2.getRtspvideo());
    
    Thread.sleep(4000);
    click(p2.getWake());
    //pause
    click(p2.getPausevideo());
    //play
    click(p2.getPlayvideo());
    }
    
    
  //47)seek the video 10 sec forward & backward
    @Test
    public void seek_video() throws InterruptedException {
    PojoClass p2=new PojoClass();
    //play rtsp video
    click(p2.getRtspvideo());
    
    Thread.sleep(4000);
    click(p2.getWake());
    //pause
    click(p2.getSeekForward());
    
    click(p2.getSeekBackward());
    //play
    
    }
    
    
  //48)show video information 
    @Test
    public void video_info_button() throws InterruptedException {
    PojoClass p2=new PojoClass();
    //play rtsp video
    click(p2.getRtspvideo());
    Thread.sleep(4000);
    click(p2.getWake());
    if(p2.getVideoInfo().isDisplayed())
    {
    	System.out.println("Information is displayed");
    }
    else
    {
    	System.out.println("Info is not displayed");
    }
    
    
     click(p2.getVideoInfo());
    Thread.sleep(1000);
   
}
    
    
    
  //49) video information all contents of video
    @Test(enabled=false)
    public void video_info() throws InterruptedException {
    PojoClass p2=new PojoClass();
    //play rtsp video
    click(p2.getRtspvideo());
    
    Thread.sleep(4000);
    click(p2.getWake());
    click(p2.getVideoInfo());
    String loc = p2.getLocation().getText();
    System.out.println(loc);    
    String mime = p2.getMime().getText();
    System.out.println(mime);  
    String width = p2.getWidth().getText();
    System.out.println(width);  
    String ht = p2.getHeight().getText();
    System.out.println(ht);  
   
    
    }
  
    //37) video list displays list of content playback & 38)list may include local,https,rtsp
    
    @Test(enabled=false)
    public void videolist_display_listof_content() throws InterruptedException
    {
    	PojoClass p2=new PojoClass();
    	
    	click(p2.getSetting());
        scrollToAnElementByText(driver,"Load RTSP from Json" );
        Thread.sleep(1000);
    	click(p2.getHttpsetting());
    	click(p2.getRttpsetting());
    	
    	if(p2.getHttpsetting().isEnabled() && p2.getRttpsetting().isEnabled())
    	{
    		System.out.println("Https and Rtsp are on and it will show the video contents");
    	}
    	else
    	{
    		System.out.println("Https and Rtsp are Off ");
    	}
    	click(p2.getSettingback());
    	if(p2.getForeVideo().isDisplayed() && p2.getRtspvideo().isDisplayed())
    	{
    		System.out.println("videos are avaiable");
    	}
    	else
    	{
    		System.out.println("videos are not available");
    	}
    	
    }
    
  //42)click video only playback
    @Test(enabled=false)
    public void click_on_video_only() throws InterruptedException {
    PojoClass p2=new PojoClass();
    //play rtsp video
    scrollToAnElementByText(driver, "RTSP Video Only MP4");
   click(p2.getVideoOnly());
    Thread.sleep(4000);
    }
    
    //39) filtering rtsp videos only
    @Test(enabled=false)
    public void filter_rtsp_video() throws InterruptedException, IOException {
        
      // Thread.sleep(5000);
    	PojoClass p2=new PojoClass();
    	
    	click(p2.getSetting());
        scrollToAnElementByText(driver,"Load RTSP from Json" );
        Thread.sleep(1000);
    	click(p2.getRttpsetting());
    	click(p2.getSettingback());
    	if(p2.getRtspvideo().isDisplayed())
    	{
    		System.out.println("Rtsp videos are displayed");
    	}
    	else
    	{
    		System.out.println("Rtsp videos are not displayed");
    	}
    	
    }
    
  //40) filtering http videos only
    @Test(enabled=false)
    public void filter_http_video() throws InterruptedException, IOException {
        
      // Thread.sleep(5000);
    	PojoClass p2=new PojoClass();
    	
    	click(p2.getSetting());
        scrollToAnElementByText(driver,"Load RTSP from Json" );
        Thread.sleep(1000);
    	click(p2.getHttpsetting());
    	click(p2.getSettingback());
    	if(p2.getHlsvideo().isDisplayed())
    	{
    		System.out.println("http and hls videos are displayed");
    	}
    	else
    	{
    		System.out.println("http and hls videos are not displayed");
    	}
    	
    }
    @Test(enabled=false)
    public void Joiner_Joines_The_Room_Created() throws InterruptedException, IOException {
        
      // Thread.sleep(5000);
    	PojoClass p2=new PojoClass();
    	click(p2.getFeed());
    	click(p2.getPlusIcon());
    	send(p2.getRoomName(), read(1, 1));
    	Thread.sleep(1000); 
    	click(p2.getStart());
    }
}
