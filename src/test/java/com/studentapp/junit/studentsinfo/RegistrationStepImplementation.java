package com.studentapp.junit.studentsinfo;










import org.junit.Assert;
import org.openqa.selenium.By;




import net.serenitybdd.core.pages.PageObject;

public class RegistrationStepImplementation  extends PageObject{
	
	
	private static final String createAccount="//a[text()='Create an Account']";
    private static final String firstName="//input[@name='firstname']";
    private static final String lastName="//input[@name='lastname']";
	private static final String email="//input[@name='email']";
	private static final String password="//input[@name='password']";
	private static final String confirmPassword ="//input[@name='password_confirmation']";
	private static final String createAnAccountButton ="//button[@title='Create an Account']";
	
	
	
	public void  userClickOnCreacteAccountLink()
	{
		waitFor(createAccount);
		$( By.xpath(createAccount)).click();
	}
	
	public void  userEnterFirstName(String firstName)
	{
	
		waitFor(RegistrationStepImplementation.firstName);
		$(By.xpath(RegistrationStepImplementation.firstName)).type(firstName);
	}
	
	public void  userEnterLastName(String lastName)
	{
		waitFor(RegistrationStepImplementation.lastName);
		$( By.xpath(RegistrationStepImplementation.lastName)).type(lastName);
	}
	
	public void  userEnterEmail(String email)
	{
		waitFor(RegistrationStepImplementation.email);
		$( By.xpath(RegistrationStepImplementation.email)).type(email);
	}
	
	public void  userEnterPassword(String password)
	{
		waitFor(RegistrationStepImplementation.password);
		$( By.xpath(RegistrationStepImplementation.password)).type(password);
	}
	
	public void  userEnterConfirmPassword(String password)
	{
		waitFor(RegistrationStepImplementation.confirmPassword);
		$( By.xpath(RegistrationStepImplementation.confirmPassword)).type(password);
	}
	
	
	public void  userClickOnCreacteAccountButton()
	{
		waitFor(createAnAccountButton);
		$( By.xpath(createAnAccountButton)).click();
	}
	
	public boolean verifyUserIsOnHomePage()
	{String homeUrl="https://magento.softwaretestingboard.com/customer/account/";
	
		Assert.assertEquals("https://magento.softwaretestingboard.com/customer/account/", getDriver().getCurrentUrl());
	return homeUrl.equals(getDriver().getCurrentUrl());
	
	}
	
}
