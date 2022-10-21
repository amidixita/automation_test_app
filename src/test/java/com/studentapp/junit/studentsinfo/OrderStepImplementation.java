package com.studentapp.junit.studentsinfo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import net.serenitybdd.core.pages.PageObject;

public class OrderStepImplementation extends PageObject {

	//adding order to cart
	private static final String menClothingSection="//a[@href='https://magento.softwaretestingboard.com/men.html']";
    private static final String clothesCategory="//a[text()='Hoodies & Sweatshirts']";
    private static final String selectProduct="(//li[@class='item product product-item'])[1]";
    private static final String sizeForClothes="(//div[text()='XS'])[1]";
	private static final String colourOfClothes="//div[@aria-label='Blue']";
	private static final String addToCartButton="//button[@type='submit']//span[text()='Add to Cart']";	
	private static final String addCart="//a[@href='https://magento.softwaretestingboard.com/checkout/cart/']";
	private static final String proceedToCheckoutButton ="//button[text()='Proceed to Checkout']";
	
	
	//adding details for shipping
	private static final String streetAddress ="//input[@name='street[0]']";
	private static final String city ="//input[@name='city']";
	private static final String country ="//select[@name='country_id']";
	private static final String state ="//select[@name='region_id']";
	private static final String postcode ="//input[@name='postcode']";
	private static final String phoneNumber ="//input[@name='telephone']";
	private static final String shippingModeCheckBox ="//input[@name='ko_unique_1']";
	private static final String nextButton ="//button[@type='submit']//span[text()='Next']";
	
	//placing order
	private static final String placeOrder ="//button[@title='Place Order']";
	
	
	//adding order to cart methods
	public void  userClickOnMenClothingSection()
	{
		waitFor(menClothingSection);
		$( By.xpath(menClothingSection)).click();
	}
	
	public void  userClickOnclothesCategory()
	{
		waitFor(clothesCategory);
		$( By.xpath(clothesCategory)).click();
	}
	
	public void  userClickOnSelectProduct()
	{
		waitFor(selectProduct);
		$( By.xpath(selectProduct)).click();
	}
	
	public void  userClickOnSizeForClothes()
	{
		waitFor(sizeForClothes);
		$( By.xpath(sizeForClothes)).click();
	}
	
	public void  userClickOnColourOfClothes()
	{
		waitFor(colourOfClothes);
		$( By.xpath(colourOfClothes)).click();
	}
	
	public void  userClickOnAddToCartButton()
	{
		waitFor(addToCartButton);
		$( By.xpath(addToCartButton)).click();
	}
	
	public void  userClickOnAddCart()
	{
		waitFor(addCart);
		$( By.xpath(addCart)).click();
	}
	
	public void  userClickOnProceedToCheckoutButton()
	{
		waitFor(proceedToCheckoutButton);
		$( By.xpath(proceedToCheckoutButton)).click();
	}
	
	
	//adding details for shipping methods
	
	
	public void  userEnterStreetAddress()
	{
		waitFor(streetAddress);
		$( By.xpath(streetAddress)).type("house no 2000 , sector 62");
	}
	
	public void  userEnterCity()
	{
		waitFor(city);
		$( By.xpath(city)).type("Gurgaon");
	}
	
	public void  userEnterPostcode()
	{
		waitFor(postcode);
		$( By.xpath(postcode)).type("121004");
	}
	
	public void  userSelectCountryFromDropdown()
	{
		waitFor(country);
		Select select = new Select($( By.xpath(country)));
		select.selectByValue("IN");
		
		
		
	}
	
	public void  userSelectStateFromDropdown()
	{
		waitFor(state);
		Select select = new Select($( By.xpath(state)));
		select.selectByValue("545");
	}
		
	
	public void  userEnterPhoneNumber()
	{
		waitFor(phoneNumber);
		$( By.xpath(phoneNumber)).type("9993547367");
	}
	
	public void  userClickOnShippingModeCheckBox()
	{
		waitFor(shippingModeCheckBox);
		$( By.xpath(shippingModeCheckBox)).click();
	}
	
	
	public void  userClickOnnextButton()
	{
		waitFor(nextButton);
		$( By.xpath(nextButton)).click();
	}
	
	
	//Placing order
	
	public void userclickOnPlaceOrderButton()
	{
		waitFor(placeOrder);
		$( By.xpath(placeOrder)).click();
	}
	
	public void userVerifySuccessOrderPlaced()
	{
			Assert.assertEquals("https://magento.softwaretestingboard.com/checkout/onepage/success/", getDriver().getCurrentUrl());
	}
}

