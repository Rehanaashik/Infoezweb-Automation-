package stepdefinition;

import org.junit.Assert;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Howitworks;
import locator.Pricing;

public class Howitworksstepdefinition extends Base{
	
	
	Howitworks h;

    
	
	
	
	@Given("users launcing the app url")
	public void users_launcing_the_app_url() {
		 launchbrowser();
	        maximizebrowser();
	        openurl("https://d2mojgetgp5xie.cloudfront.net/how-it-works");

	        h = new Howitworks(driver);
	}

	@When("user clicks on button {string}")
	public void user_clicks_on_button(String button) {
		
		if(button.equalsIgnoreCase("Start exploring")) {
			click(h.startexploring);
		}
		else if(button.equalsIgnoreCase("List your business")) {
			click(h.listyourbusiness);
		}
		
	    
	}

	@Then("user should navigate to the page {string}")
	public void user_should_navigate_to_the_page(String Page) {
		
		if(Page.equalsIgnoreCase("search")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("/search"));
		}
		
		else if(Page.equalsIgnoreCase("register")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("/register"));
		}
	    
	}




}
