package com.studentapp.cucumber.steps;






import com.details.model.SenderClass;
import com.studentapp.cucumber.serenity.TestSerenitySteps;
import com.studentapp.junit.studentsinfo.ParseDynamicJson;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestStepDefination {
	static String email=null;
	
	@Steps
	TestSerenitySteps steps;
	@Steps
	SenderClass user;
	@Steps
	ParseDynamicJson json;

	
	
	
	
	@When("^User send a GET request to the api$")
	public void verifyStudentName()
	{

		json.getSenderDetails();	
		
	}
	
	@And("^User is on application page and click on create Account link$")
	public void user_is_on_application_page_and_click_on_create_account_link()
	{

		steps.openApplication();
		steps.userClickOnCreacteAccountLink();
		
	}
	
	@And("^User enters all the input fields for registeration$")
	public void user_enters_all_the_input_fields_for_registeration()
	{
		

		steps.userEnterFirstName(json.firstName);
		steps.userEnterLastName(json.lastName);
		steps.userEnterEmail(json.email);
		steps.userEnterPassword(json.password);
		steps.userEnterConfirmPassword(json.password);
		
	}
	
	@And("^User click on Create an Account Button$")
	public void user_click_on_create_account_button() throws InterruptedException
	{

		steps.userClickOnCreacteAccountButton();
		Thread.sleep(5000);
	}
	
	@And("^Verify user is on home page$")
	public void verify_user_is_on_home_page() throws InterruptedException
	{Thread.sleep(5000);

	steps.verifyUserIsOnHomePage();
		
	}
	
	@And("^User selects the product and click on add to cart$")
	public void user_selects_the_product_and_click_on_add_to_cart() throws InterruptedException
	{
		Thread.sleep(2000);

	steps.userClickOnMenClothingSection();
	Thread.sleep(2000);
	steps.userClickOnclothesCategory();
	Thread.sleep(2000);
	steps.userClickOnSelectProduct();
	Thread.sleep(2000);
	steps.userClickOnSizeForClothes();
	
	steps.userClickOnColourOfClothes();
	
	steps.userClickOnAddToCartButton();
	Thread.sleep(2000);
	steps.userClickOnAddCart();
	Thread.sleep(2000);
    steps.userClickOnProceedToCheckoutButton();
	
	}
	
		
	@And("^User enters the address details and click on next$")
	public void user_enters_the_address_details_and_click_on_next() throws InterruptedException
	{
		Thread.sleep(3000);

	steps.userEnterStreetAddress();
	Thread.sleep(2000);
	steps.userEnterCity();
	Thread.sleep(2000);
	steps.userSelectCountryFromDropdown();
	Thread.sleep(2000);
	steps.userSelectStateFromDropdown();
	
	steps.userEnterPostcode();
	
	steps.userEnterPhoneNumber();
	Thread.sleep(2000);
//	steps.userClickOnShippingModeCheckBox();
//	Thread.sleep(1000);
	steps.userClickOnnextButton();
	Thread.sleep(4000);
	
	}
	
	@And("^User click On place order Button$")
	public void user_click_On_place_order_Button() throws InterruptedException
	{

		steps.userclickOnPlaceOrderButton();
		Thread.sleep(2000);
	}

	@Then("^Verify the order is successfully placed$")
	public void verify_the_order_is_successfully_placed() throws InterruptedException
	{Thread.sleep(3000);

	steps.userVerifySuccessOrderPlaced();
		
	}
}
