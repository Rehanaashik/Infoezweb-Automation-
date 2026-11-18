
package stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Validloginpage;

public class validoginstepdefinition extends Base {
		Validloginpage l;
	
	
@Given("user launch the application url")
public void user_launch_the_application_url() {
	launchbrowser();
    maximizebrowser();
    openurl("https://d2mojgetgp5xie.cloudfront.net/login");
   
    l=new Validloginpage(driver);
}

@When("user enters email {string}")
public void user_enters_email(String String) {
	
	sendkeys(l.email,String);
    
}

@When("user enters a password {string}")
public void user_enters_a_password(String String) {
	
	
	sendkeys(l.password,String);
    
}

@When("user clicks the submit button")
public void user_clicks_the_submit_button() {
	
	click(l.submit);
    
}

@Then("{string} should be displayed")
public void should_be_displayed(String expectedMessage) throws InterruptedException {
	
	if(expectedMessage.equals("Welcome back!")) {
		Assert.assertTrue(driver.getPageSource().contains("Welcome back"));
	}
	
	else
		if(expectedMessage.equals("Invalid email")) {
			Assert.assertTrue(l.Invalidemail.isDisplayed());
		}
		
		else
		if(expectedMessage.equals("Invalid credentials")) {
			Assert.assertTrue(l.Invalidcredentials.isDisplayed());
		}
	
	else
	if(expectedMessage.equals("Please fill out this field")) {
		Assert.assertTrue(l.email.getAttribute("validationMessage").equals("Please fill out this field.")
				||
		l.password.getAttribute("validationMessage").equals("Please fill out this field."));
	}
	
	
	else
		if(expectedMessage.equals("URL redirected")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("https://d2mojgetgp5xie.cloudfront.net/"));
		}
	
	
	
	
	
	
	
		
    
}
	}


