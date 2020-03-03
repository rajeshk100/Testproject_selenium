package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base_Class.Base_Class;


public class Login_Page extends Base_Class{

	//Create account Page Elements
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	WebElement signin;

	@FindBy(id="email_create")
	WebElement email;

	@FindBy(id="SubmitCreate")
	WebElement createbtn;

	@FindBy(id="id_gender1")
	WebElement mr_btn;

	@FindBy(id="customer_firstname")
	WebElement f_name;

	@FindBy(id="customer_lastname")
	WebElement l_name;

	@FindBy(id="email")
	WebElement email1;

	@FindBy(id="passwd")
	WebElement password;

	@FindBy(id="days")
	WebElement day;

	@FindBy(id="months")
	WebElement month;

	@FindBy(id="years")
	WebElement year;

	@FindBy(id="newsletter")
	WebElement checkbox1;

	@FindBy(id="optin")
	WebElement checkbox2;

	@FindBy(id="lastname")
	WebElement l_name_address;

	@FindBy(id="company")
	WebElement company;

	@FindBy(id="address1")
	WebElement add1;

	@FindBy(id="city")
	WebElement city;

	@FindBy(id="id_state")
	WebElement state;

	@FindBy(id="postcode")
	WebElement zipcode;


	@FindBy(id="other")
	WebElement other_box;

	@FindBy(id="phone_mobile")
	WebElement mobile_num;

	@FindBy(id="submitAccount")
	WebElement submit_Account;

	@FindBy(id="email")
	WebElement l_email;

	@FindBy(id="SubmitLogin")
	WebElement login;

	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?mylogout=']")
	WebElement signout;


	//Initializing the Page Objects:
	public Login_Page(){
		PageFactory.initElements(driver, this);
	}

	//login 
	public void login(String em,String pass) {
		signin.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",login );
		l_email.sendKeys(em);
		password.sendKeys(pass);
		//click login btn
		login.click();
	}

	


}