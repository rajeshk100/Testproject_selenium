package com.Test_Cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base_Class.Base_Class;
import com.Pages.AccountCreation_Page;

public class Account_Creation_Test extends Base_Class {
	AccountCreation_Page newaccountPage;

	public Account_Creation_Test(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		newaccountPage = new AccountCreation_Page();	
	}

	@Test(priority=1)
	public void Newaccount(){
		newaccountPage.newaccount();
	}



	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}

}
