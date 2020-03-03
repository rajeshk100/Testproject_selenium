package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base_Class.Base_Class;

public class Products_Page extends Base_Class {

	//Product Page Elements
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")
	WebElement woman;

	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_product=1&controller=product']")
	WebElement quickview;

	@FindBy(className ="btn btn-default button-plus product_quantity_up")
	WebElement plus;

	@FindBy(name="Submit")
	WebElement cart;

	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order']")
	WebElement checkout;

	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
	WebElement p_checkout1;

	@FindBy(name="processAddress")
	WebElement p_checkout2;

	@FindBy(id="cgv")
	WebElement cgv;

	@FindBy(name="processCarrier")
	WebElement p_checkout3;

	//prices
	@FindBy(id="product_price_1_1_282083")
	WebElement unitprice;

	//qty
	@FindBy(name="quantity_1_1_0_282083_hidden")
	WebElement quty;

	//total
	@FindBy(id="total_product_price_1_1_282083")
	WebElement total;

	//total products
	@FindBy(id="total_product")
	WebElement total_pro;

	//shipping
	@FindBy(id="total_shipping")
	WebElement shipping;

	//tax
	@FindBy(id="total_tax")
	WebElement tax;

	//total price
	@FindBy(id="total_price")
	WebElement total_price;

	//payment
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment']")
	WebElement pay;

	//confirm order
	//total price
	@FindBy(className ="button btn btn-default button-medium")
	WebElement confirm;


	//Initializing the Page Objects:
	public Products_Page(){
		PageFactory.initElements(driver, this);
	}

	public String product_total=total.getText();

	//add product into cart
	public void addproduct() {
		woman.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",quickview );
		quickview.click();
		plus.click();
		cart.click();
		checkout.click();
		p_checkout1.click();
		p_checkout2.click();
		cgv.click();
	}

	public void verifyamt() {
		String qty=quty.getAttribute("value");
		String u_price=unitprice.getText();
		//String p_total=total.getText();

		float unit =convert_raj(u_price);
		float quinty = convert_raj(qty);
		float total = convert_raj(product_total);
		float mlt=unit*quinty;

		if (mlt==total){
			System.out.println("values are correct");
			return;
		}else {
			System.out.println("values are not correct");
			return;

		}
	}

	public float convert_raj(String ele) {
		String liveprice = ele;
		String newStr = liveprice.replaceAll("[$,]", "");
		float value = Float.parseFloat(newStr);

		return value;
	}


	public void checkout() {
		p_checkout1.click();
		p_checkout2.click();
		cgv.click();
		p_checkout3.click();

	}
	
	public void payment() {
		pay.click();
		confirm.click();
		
	}
}
