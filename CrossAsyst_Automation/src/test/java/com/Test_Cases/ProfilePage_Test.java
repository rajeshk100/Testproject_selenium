package com.Test_Cases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base_Class.Base_Class;
import com.Pages.Products_Page;
import com.Pages.Profile_Page;

public class ProfilePage_Test extends Base_Class {

	Profile_Page profilepage;
	Products_Page productPage;

	public ProfilePage_Test(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		profilepage = new Profile_Page();	
	}

	@Test(priority=1)
	public void orders(){
		profilepage.orders_details();

	}

	@Test(priority=2)
	public void verifyamount(){
		String order_pagetotal = profilepage.order_total;
		String product_pagetotal= productPage.product_total;
		Assert.assertEquals(order_pagetotal,product_pagetotal,"Order values are not match");

	}

}
