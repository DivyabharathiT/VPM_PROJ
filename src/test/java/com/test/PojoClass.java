package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	 public WebElement getVideoIcon() {
		return videoIcon;
	}

	public WebElement getRoomName() {
		return roomName;
	}

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFeed() {
		return feed;
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getStart() {
		return start;
	}
	@FindBy(xpath="//*[@id='ivVideoIcon']")
	    private WebElement videoIcon; 
	 
	 @FindBy(xpath="//*[@id='edtRoomName']")
	    private WebElement roomName; 
	 
	 @FindBy(xpath="//*[@text='Create']")
	    private WebElement create; 
	 
	 @FindBy(xpath="//*[@text='Feeds']")
	    private WebElement feed; 
	 

	 @FindBy(xpath="//*[@id='fabPlusIcon']")
	    private WebElement plusIcon; 
	 
	 @FindBy(xpath="//*[@text='Start']")
	    private WebElement start; 
	 
	 
	 @FindBy(xpath="//*[@id='ivBackArrow']")
	    private WebElement back;
	 
	 @FindBy(xpath="//*[@id='btnCallDisconnect']")
	    private WebElement disconnect;
	 public WebElement getVideo() {
		return video;
	}
	@FindBy(xpath="//*[@text='Videos']")
	    private WebElement video;


	@FindBy(xpath="//*[@text='and557']")
    private WebElement room1;
	
	public WebElement getRoom1() {
		return room1;
	}
	public WebElement getRoom2() {
		return room2;
	}
	@FindBy(xpath="//*[@text='and555']")
    private WebElement room2;
	
	public WebElement getFeedtype() {
		return feedtype;
	}
	@FindBy(xpath="//*[@id='ic_feed_type']")
    private WebElement feedtype;
	
	@FindBy(xpath="//*[@text='Live']")
    private WebElement live;
	
	@FindBy(xpath="//*[@id='tvContactNameCall']")
    private WebElement contactName;


	@FindBy(xpath="//*[@id='ivSettingIcon']")
    private WebElement setting;

	
	@FindBy(xpath="//*[@id='switch_widget' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Use SL Server']]]]")
    private WebElement slServersetting;

	
	public WebElement getSlServersetting() {
		return slServersetting;
	}
	public WebElement getSetting() {
		return setting;
	}
	public WebElement getContactName() {
		return contactName;
	}
	public WebElement getLive() {
		return live;
	}
	public WebElement getDisconnect() {
		return disconnect;
	}
	public WebElement getBack() {
		return back;
	}
       @FindBy(xpath="//*[@id='switch_widget' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Load HTTP from Json']]]]")
	    private WebElement httpsetting;
       public WebElement getHttpsetting() {
		return httpsetting;
	}
	public WebElement getRttpsetting() {
		return rttpsetting;
	}
	@FindBy(xpath="//*[@id='switch_widget' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Load RTSP from Json']]]]")
       private WebElement rttpsetting;

	@FindBy(xpath="//*[@id='ivBackBtn']")
    private WebElement settingback;
	public WebElement getSettingback() {
		return settingback;
	}
	
	
	@FindBy(xpath="//*[@text='foreman_assest.mp4']")
    private WebElement foreVideo;
	
	public WebElement getForeVideo() {
		return foreVideo;
	}
	public WebElement getRtspvideo() {
		return rtspvideo;
	}
	@FindBy(xpath="//*[@text='RTSP 554 Sample']")
    private WebElement rtspvideo;
	
	@FindBy(xpath="//*[@text='OK']")
    private WebElement endOk;
	
	@FindBy(xpath="//*[@id='ivPlay']")
    private WebElement playvideo;
	
	public WebElement getPlayvideo() {
		return playvideo;
	}
	public WebElement getPausevideo() {
		return pausevideo;
	}
	@FindBy(xpath="//*[@id='ivPause']")
    private WebElement pausevideo;

	@FindBy(xpath="//*[@id='exo_subtitles']")
    private WebElement wake;
	
	@FindBy(xpath="//*[@text='10' and (./preceding-sibling::* | ./following-sibling::*)[@id='ivForward']]")
    private WebElement seekForward;
	
	
	@FindBy(xpath="//*[@id='ivInfo']")
    private WebElement videoInfo;
	
	@FindBy(xpath="//*[@text='Location']")
    private WebElement location;
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getMime() {
		return mime;
	}
	public WebElement getWidth() {
		return width;
	}
	public WebElement getHeight() {
		return height;
	}
	@FindBy(xpath="//*[@text='MimeType']")
    private WebElement  mime;
	
	@FindBy(xpath="//*[@text='Width']")
    private WebElement  width;
	
	@FindBy(xpath="//*[@text='Height']")
    private WebElement  height;
	
	
	
	@FindBy(xpath="//*[@id='tvValue']")
    private WebElement infovalue;
	
	
	
	@FindBy(xpath="//*[@text='RTSP Video Only MP4']")
    private WebElement videoOnly;
	
	
	@FindBy(xpath="//*[@text='HLS HTTPS Apple 4x3 30 min']")
    private WebElement hlsvideo;
	
	

	
	public WebElement getHlsvideo() {
		return hlsvideo;
	}
	public WebElement getVideoOnly() {
		return videoOnly;
	}
	public WebElement getInfovalue() {
		return infovalue;
	}
	public WebElement getVideoInfo() {
		return videoInfo;
	}
	public WebElement getSeekForward() {
		return seekForward;
	}
	public WebElement getSeekBackward() {
		return seekBackward;
	}
	@FindBy(xpath="//*[@text='10' and (./preceding-sibling::* | ./following-sibling::*)[@id='ivBackward']]")
    private WebElement seekBackward;

	public WebElement getWake() {
		return wake;
	}
	public WebElement getEndOk() {
		return endOk;
	} 
	
	
}

