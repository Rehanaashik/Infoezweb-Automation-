package stepdefinition;

import org.junit.Assert;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Notification;
import locator.Profile;

public class Profilestepdefinition extends Base {
	
	
	
	Profile p;
	
	@Given("user sets to launching the application urls")
	public void user_sets_to_launching_the_application_urls() {
		
		launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net/");

        p = new Profile(driver);
	   
	}

	@When("user logged in the app")
	public void user_logged_in_the_app() {
		
		elementToBeclick(p.signin);
       click(p.signin);
       
        visibilitywait(p.email);
        clear(p.email);
        sendkeys(p.email, "customer@infoez.com");

        visibilitywait(p.password);
        clear(p.password);
        sendkeys(p.password, "Customer@123");

        elementToBeclick(p.submit);
       click(p.submit);
	   
	    
	}

	@When("user clicks the profile menu")
	public void user_clicks_the_profile_menu() {
		
Base.visibilitywait(p.welcomback);
		
		Base.invisiblewait(p.welcomback);
		Base.elementToBeclick(p.profilebtn);
		click(p.profilebtn);
	    
	    
	}

	@When("user clicks the profile page button")
	public void user_clicks_the_profile_page_button() {
		
		Base.visibilitywait(p.profilemenu);
		Base.elementToBeclick(p.profilemenu);
		click(p.profilemenu);
		
	    
	}

	@When("user enters the the name {string}")
	public void user_enters_the_the_name(String name) {
		
		Base.visibilitywait(p.name);
		
		Base.elementToBeclick(p.name);
		
		
		clear(p.name);
	   sendkeys(p.name,name);
	   
	}

	@When("user enters the phone nos {string}")
	public void user_enters_the_phone_nos(String phonenos) {
		
		Base.visibilitywait(p.phone);
		Base.elementToBeclick(p.phone);
		clear(p.phone);
		sendkeys(p.phone,phonenos);
	    
	}

	@When("user enters the avatar url {string}")
	public void user_enters_the_avatar_url(String avatarurl) {
		
		Base.visibilitywait(p.avatarurl);
		Base.elementToBeclick(p.avatarurl);
		
		clear(p.avatarurl);
		sendkeys(p.avatarurl,avatarurl);
	    
	}

	@When("click the save changes button")
	public void click_the_save_changes_button() {
		click(p.savechanges);
	    
	}

	@Then("expected notification should display {string}")
	public void expected_notification_should_display(String display) {
		
		Base.visibilitywait(p.profilenotification);
		if(display.equals("Profile updated")) {
			Assert.assertEquals(p.profilenotification.getText().trim(),display);
		}
		else
		
		Assert.assertFalse(p.profilenotification.isDisplayed());
	}

}
    
    


