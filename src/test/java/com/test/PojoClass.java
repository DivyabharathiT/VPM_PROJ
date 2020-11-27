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

	public WebElement getLive() {
		return live;
	}
	public WebElement getDisconnect() {
		return disconnect;
	}
	public WebElement getBack() {
		return back;
	} 
}

