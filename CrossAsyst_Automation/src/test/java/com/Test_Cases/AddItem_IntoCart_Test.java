package com.Test_Cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base_Class.Base_Class;
import com.Pages.Products_Page;

public class AddItem_IntoCart_Test extends Base_Class   {


	Products_Page productPage;

	public AddItem_IntoCart_Test(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		productPage = new Products_Page();	
	}

	@Test(priority=1)
	public void addcart(){
		productPage.addproduct();
	}

	@Test(priority=2)
	public void verify_amounts(){
		productPage.verifyamt();
	}

	@Test(priority=3)
	public void payment(){
		productPage.payment();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
