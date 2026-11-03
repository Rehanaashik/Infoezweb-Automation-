
	
	package stepdefinition;


	import org.junit.Assert;

import baseclass.Base;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import locator.Registration;



	public class Registrationstepdefinition extends Base{
		
		Registration r;
		
		@Given("user launch the application")
		public void user_launch_the_application() {
			launchbrowser();
			maximizebrowser();
			openurl("https://d2mojgetgp5xie.cloudfront.net/register");
			r=new Registration(driver);
		}
		    
	@When("user selects the customer")
	public void user_selects_the_customer() {
		click(r.Customer);
	    
	}

	@When("user enters a name {string}")
	public void user_enters_a_name(String name) {
		r.name.sendKeys(name);
	   
	}

	@When("user enters the email {string}")
	public void user_enters_the_email(String email) {
		r.email.sendKeys(email);
	    
	}

	@When("user enters the phone no{string}")
	public void user_enters_the_phone_no(String phone) {
		r.phone.sendKeys(phone);
	    
	}

	@When("user enters the password{string}")
	public void user_enters_the_password(String password) {
		r.password.sendKeys(password);
	    
	}

	@Then("{string} should be displayed after registration")
	public void expected_result_should_be_displayed_after_registration(String expectedResult) throws InterruptedException {
		
		Thread.sleep(6000);
		
		if(expectedResult.equals("success")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("cloudfront"));
		}
		else
		if(expectedResult.equals("Invalid email")) {
			String message=r.email.getAttribute("validationMessage");
			System.out.println(message);
			Assert.assertTrue(message.contains("Please include an '@'"));
			
		}
		
		
		else
	    if(expectedResult.equals("Invalid password")) {
	    	String message=r.password.getAttribute("validationMessage");
	    	System.out.println(message);
	    	Assert.assertTrue(message.contains("Please lengthen this text to 6 characters"));
	    }
		
		
		
	}




}
