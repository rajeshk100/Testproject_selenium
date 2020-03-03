package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base_Class.Base_Class;

public class AccountCreation_Page extends Base_Class {


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

	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?mylogout=']")
	WebElement signout;


	//Initializing the Page Objects:
	public AccountCreation_Page(){
		PageFactory.initElements(driver, this);
	}

	//New Account creation
	public void newaccount() {
		signin.click();
		email.sendKeys(prop.getProperty("email"));
		createbtn.click();

		//move to lastname element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",l_name_address );
		//actions.moveToElement(l_name_address);
		//actions.perform();
		mr_btn.click();
		f_name.sendKeys(prop.getProperty("first_name"));
		l_name.sendKeys(prop.getProperty("last_name"));
		password.sendKeys(prop.getProperty("password"));

		//select Date of birth
		Select date=new Select(day);
		date.selectByValue("5");
		Select mnt=new Select(month);
		mnt.selectByValue("2");
		Select yr=new Select(year);
		yr.selectByValue("2019");

		//check box1
		checkbox1.click();
		//check box2
		checkbox2.click();
		//address
		add1.sendKeys(prop.getProperty("address"));
		//city
		city.sendKeys(prop.getProperty("city"));

		//state
		Select con=new Select(state);
		con.selectByValue("5");
		//zipcode
		zipcode.sendKeys(prop.getProperty("zipcode"));
		//additional info
		other_box.sendKeys(prop.getProperty("additionalinfo"));

		//mobiile num
		mobile_num.sendKeys(prop.getProperty("mobilenumber"));
		//click Register btn
		submit_Account.click();
		//click signout btn
		signout.click();

	}

}
