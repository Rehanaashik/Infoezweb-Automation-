
	
package stepdefinition;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	public void user_enters_a_name(String String) {
		sendkeys(r.name,String);
	   
	}

	@When("user enters the email {string}")
	public void user_enters_the_email(String String) {
		sendkeys(r.email,String);
	    
	}

	@When("user enters the phone no{string}")
	public void user_enters_the_phone_no(String String) {
		sendkeys(r.phone,String);
	    
	}

	@When("user enters the password{string}")
	public void user_enters_the_password(String String) {
		sendkeys(r.password,String);
	    
	}
	
	@When("user clicks the submitted buttons")
	public void user_clicks_the_submitted_buttons() {
		click(r.submit);
	}

	@Then("{string} should be displayed after registration")
	public void expected_result_should_be_displayed_after_registration(String expectedResult) throws InterruptedException {
		
		;
		
		if(expectedResult.equals("URL redirected")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("https://d2mojgetgp5xie.cloudfront.net/"));
		}
		else
		if(expectedResult.equals("Invalid email")) {
			String message=r.email.getAttribute("validationMessage");
			
			Assert.assertTrue(message.contains("Please include an '@'"));
			
		}
		
		
		else
	    if(expectedResult.equals("Invalid password")) {
	    	String message=r.password.getAttribute("validationMessage");
	    	
	    	Assert.assertTrue(message.contains("Please lengthen this text to 6 characters"));
	    }
		
	    else
	    	if(expectedResult.equals("Please fill out this field.")) {
	    		
	    		String message=r.name.getAttribute("validationMessage");
	    		Assert.assertEquals(message,"Please fill out this field.");
	    		
	    	}
	    	
	    		
		
	    else
	    	    if(expectedResult.equals("Welcome to infoez!")) {
	    	    	
	    	    	Assert.assertTrue(driver.getPageSource().contains("Welcome to infoez!"));
	    	    }
	     else
	    			if(expectedResult.equals("Please enter a valid phoneno")) {
	    				String message=r.phone.getAttribute("validationMessage");
	    				
	    				Assert.assertTrue(message.contains("Please enter a valid phoneno'"));
	    				
	    			}
	    			
	    		
		
		
		
	}




}
