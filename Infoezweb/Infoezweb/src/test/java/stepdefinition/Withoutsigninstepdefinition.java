package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Validloginpage;
import locator.Withoutsignin;

public class Withoutsigninstepdefinition extends Base {
	
	Withoutsignin w;
	
	
	@Given("user going to launch the app url")
	public void user_going_to_launch_the_app_url() {
		
		launchbrowser();
	    maximizebrowser();
	    openurl("https://d2mojgetgp5xie.cloudfront.net");
	   
	    w=new Withoutsignin(driver);
	   
	}

	@When("user navigating to the particular business details page")
	public void user_navigating_to_the_particular_business_details_page() {
		
		Base.visibilitywait(w.businessname);
		click(w.businessname);
	   
	}

	@When("user clicks the {string} button in a business")
	public void user_clicks_the_option_button_in_a_business(String option) {
		
		
			
			Base.staleElementWait(w.favorite);

	        ((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView({block:'center'});",
	            w.favorite
	        );

	        elementToBeclick(w.favorite);

	        if (option.equalsIgnoreCase("save")) {
	            click(w.favorite);
			
		}
		
		else if(option.equalsIgnoreCase("claim")) {
			
			Base.visibilitywait(w.claimbutton);
			click(w.claimbutton);
		    sendkeys(w.claimreason,"owner");
		    click(w.claimsubmitbutton);
		    
		}
		
		else if(option.equalsIgnoreCase("review")) {
			
			Base.visibilitywait(w.reviewbutton);
			click(w.reviewbutton);
			sendkeys(w.reviewcomment,"excellent service");
			click(w.reviewsubmitbutton);
		}
	   
	}

	@Then("user should be {string} to the sign in page")
	public void user_should_be_redirected_to_the_sign_in_page(String redirected) {
		
		if(redirected.equalsIgnoreCase("validationmsg")){
			Assert.assertTrue(driver.getPageSource().contains("Sign in to save favorites")
					||
		driver.getPageSource().contains("Please sign in to save favorites"));
			
		}
		
		else if(redirected.equalsIgnoreCase("sign in")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("/login")
					||
			driver.getPageSource().contains("Please sign in first"));
		}
		
		
	  
	}





}
