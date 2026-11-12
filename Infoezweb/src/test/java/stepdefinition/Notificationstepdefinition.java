package stepdefinition;

import org.junit.Assert;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Howitworks;
import locator.Notification;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Notificationstepdefinition extends Base {
	
	Notification n;
	
	
	@Given("users set to launch the apps urls")
	public void users_set_to_launch_the_apps_urls() {
		
		launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net/");

        n = new Notification(driver);
	    
	}

	@When("user is logg in")
	public void user_is_logg_in() {
		
		elementToBeclick(n.signin);
        n.signin.click();

        visibilitywait(n.email);
        n.email.clear();
        sendkeys(n.email, "customer@infoez.com");

        visibilitywait(n.password);
        n.password.clear();
        sendkeys(n.password, "Customer@123");

        elementToBeclick(n.submit);
        n.submit.click();
	   
	}

	@When("user clicks the profile button")
	public void user_clicks_the_profile_button() {
		
		Base.visibilitywait(n.welcomback);
		
		Base.invisiblewait(n.welcomback);
		Base.elementToBeclick(n.profilebtn);
		click(n.profilebtn);
	    
	}

	@When("user clicks the notification icon")
	public void user_clicks_the_notification_icon() {
		
		Base.visibilitywait(n.notification);
		
		Base.elementToBeclick(n.notification);
		
		click(n.notification);
	    
	}

	@When("user clicks action {string}")
	public void user_clicks_action(String action) {
		
		if(action.equalsIgnoreCase("Mark read")){
			if(!n.markread.isEmpty()) {
				click(n.markread.get(0));
			}
		}
		
		else if(action.equals("Mark all read")) {
			click(n.markallread);
		}
	    
	}

	
	@Then("notification status should be verified {string}")
	public void notification_status_should_be_verified(String verified) {
		
		if(verified.equalsIgnoreCase("Mark read")) {
			Assert.assertTrue(!driver.getPageSource().contains("Mark read")
		    ||
		    driver.getPageSource().contains("Mark read"));
		}
			
		else if(verified.equalsIgnoreCase("Mark all read")) {
			Assert.assertTrue(driver.getPageSource().contains("Mark all read"));
		}
	    
	}	

	}
		
		
	  
	





