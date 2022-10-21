package com.studentapp.cucumber.serenity;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.studentapp.junit.studentsinfo.OrderStepImplementation;
import com.studentapp.junit.studentsinfo.RegistrationStepImplementation;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class TestSerenitySteps {

	RegistrationStepImplementation register;
	OrderStepImplementation order;
	
	
	@Step
	public void openApplication() {
		// Set resolution to 1920x1080
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("resolution", "1920x1080");
		
		register.open();
		Dimension dimension = new Dimension(1920,1080); 
		register.getDriver().manage().window().setSize(dimension);
		//login.getDriver().manage().window().maximize();
		
	}
	
	@Step("Getting information of the username")
	public ValidatableResponse getStudentByName(){
		return 
		SerenityRest
		.rest()
		.given()
		.when()
		.get("/api").then().log().all();
		
	}
	
	@Step
	public void  userClickOnCreacteAccountLink()
	{
		register.userClickOnCreacteAccountLink();
	}
	
	@Step
	public void  userEnterFirstName(String firstName)
	{
		register.userEnterFirstName(firstName);
	}
	
	@Step
	public void  userEnterLastName(String lastName)
	{
		register.userEnterLastName(lastName);
	}
	
	@Step
	public void  userEnterEmail(String email)
	{
		register.userEnterEmail(email);
	}
	
	@Step
	public void  userEnterPassword(String password)
	{
		register.userEnterPassword(password);
	}
	
	@Step
	public void  userEnterConfirmPassword(String password)
	{
		register.userEnterConfirmPassword(password);
	}
	
	@Step
	public void  userClickOnCreacteAccountButton()
	{
		register.userClickOnCreacteAccountButton();
	}
	
	@Step
	public boolean verifyUserIsOnHomePage()
	{return register.verifyUserIsOnHomePage();
	}
	
	
	//adding order to cart methods
	   @Step
		public void  userClickOnMenClothingSection()
		{
			order.userClickOnMenClothingSection();
		}
		
	   @Step
		public void  userClickOnclothesCategory()
		{
			order.userClickOnclothesCategory();
		}
		
	   @Step
		public void  userClickOnSelectProduct()
		{
			order.userClickOnSelectProduct();
		}
		
	   @Step
		public void  userClickOnSizeForClothes()
		{
			order.userClickOnSizeForClothes();
		}
		
	   @Step
		public void  userClickOnColourOfClothes()
		{
			order.userClickOnColourOfClothes();
		}
		
	   @Step
	   public void  userClickOnAddToCartButton()
		{
			order.userClickOnAddToCartButton();
		}
	   
	   @Step
		public void  userClickOnAddCart()
		{
			order.userClickOnAddCart();
		}
		
	   @Step
		public void  userClickOnProceedToCheckoutButton()
		{
			order.userClickOnProceedToCheckoutButton();
		}
		
		
		//adding details for shipping methods
		
	   @Step
		public void  userEnterStreetAddress()
		{
			order.userEnterStreetAddress();
		}
		
	   @Step
		public void  userEnterCity()
		{
			order.userEnterCity();
		}
		
	   @Step
		public void  userSelectCountryFromDropdown()
		{
			order.userSelectCountryFromDropdown();
			
		}
		
	   @Step
		public void  userSelectStateFromDropdown()
		{
			order.userSelectStateFromDropdown();
		}
			
	   @Step
		public void  userEnterPhoneNumber()
		{
			order.userEnterPhoneNumber();
		}
		
	   @Step
		public void  userClickOnShippingModeCheckBox()
		{
			order.userClickOnShippingModeCheckBox();
		}
		
	   @Step
		public void  userClickOnnextButton()
		{
			order.userClickOnnextButton();
		}
		
	   @Step
	   public void  userEnterPostcode()
		{
			order.userEnterPostcode();
			
		}
	   
	 //Placing order
		
	   @Step
		public void userclickOnPlaceOrderButton()
		{
			order.userclickOnPlaceOrderButton();
		}
		
	   @Step
		public void userVerifySuccessOrderPlaced()
		{
				order.userVerifySuccessOrderPlaced();
		}
	
}
