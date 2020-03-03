package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base_Class.Base_Class;

public class Profile_Page extends Base_Class {
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	WebElement profile;

	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=history']")
	WebElement history;

	@FindBy(className ="history_price")
	WebElement h_totalprice;
	
	//Initializing the Page Objects:
	public Profile_Page(){
		PageFactory.initElements(driver, this);
	}

	public void orders_details() {
		profile.click();
		history.click();	
	}
	 public String order_total=h_totalprice.getText();
}
