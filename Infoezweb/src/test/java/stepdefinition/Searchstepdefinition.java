package stepdefinition;

import org.junit.Assert;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Registration;
import locator.SearchHomepage;

public class Searchstepdefinition extends Base {
	

		SearchHomepage s;
		
   @Given("user launches the application Infoez")
	public void user_launches_the_application_infoez() {
		
		launchbrowser();
		maximizebrowser();
		openurl("https://d2mojgetgp5xie.cloudfront.net/");
		s=new SearchHomepage(driver);
	    
	}

	@When("user enters the business name {string}")
	public void user_enters_the_business_name(String business) {
		sendkeys(s.businesssearch, business);
	    
	}

	@When("user enters the city name {string}")
	public void user_enters_the_city_name(String city) {
		sendkeys(s.citysearch,city);
	    
	}

	@When("user clicks the submited button")
	public void user_clicks_the_submited_button() {
		click(s.searchbutton);
	    
	}

	@Then("{string} should be displayed in validation")
	public void should_be_displayed_in_validation(String ExpectedResults) throws InterruptedException {
		if(ExpectedResults.equalsIgnoreCase("Success")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("/search"));
		}
		
		else if (ExpectedResults.equalsIgnoreCase("Invalid search")) {
			Thread.sleep(3000);
			Assert.assertTrue(s.notfound.isDisplayed());
		}
		
		else if (ExpectedResults.equalsIgnoreCase("Empty search")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("/search"));
			
		}
	    
	}




}
