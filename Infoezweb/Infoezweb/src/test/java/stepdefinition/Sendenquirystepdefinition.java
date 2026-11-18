package stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Sendenquiry;

public class Sendenquirystepdefinition extends Base {
	
	Sendenquiry s;
	
	
	
	@Given("user launches the application url infoez")
	public void user_launches_the_application_url_infoez() {
		
		launchbrowser();
	    maximizebrowser();
	    openurl("https://d2mojgetgp5xie.cloudfront.net/business/petal-loom-bakery-11");
	    s=new Sendenquiry(driver);
	}
		
    @When("user navigates to the business details page")
	public void user_navigates_to_the_business_details_page() {
	    
	}

	@When("user clicks the send enquiry button")
	public void user_clicks_the_send_enquiry_button() throws InterruptedException {
		Base.elementToBeclick(s.sendenquiry);
		
		//Base.wait.until(ExpectedConditions.elementToBeClickable(s.sendenquiry));	
		click(s.sendenquiry);
	   
	}

	@When("user enters the names {string}")
	public void user_enters_the_names(String names) {
		sendkeys(s.name,names);
	   
	}

	@When("user enters the emails {string}")
	public void user_enters_the_emails(String emails) {
		sendkeys(s.email,emails);
	    
	}

	@When("user enters the phones {string}")
	public void user_enters_the_phones(String phones) {
		sendkeys(s.phone,phones);
	    
	}

	@When("user enters the send enquiry messages {string}")
	public void user_enters_the_send_enquiry_messages(String messages) {
		sendkeys(s.message,messages);
		
	   
	}

	@When("user clicks the submiting button")
	public void user_clicks_the_submiting_button() {
		click(s.submit);
	    
	}

	@Then("{string}should be displayed")
	public void enquiry_sent_message_should_be_displayed(String messages) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		if(messages.equals("enquiry sent message")) {
			boolean result = wait.until(driver ->
			driver.getPageSource().contains("Enquiry sent"));
			Assert.assertTrue(result);
			
		}
		
		else if(messages.equals("validation message")) {
			Assert.assertTrue(driver.getPageSource().contains("Email or phone is missing"));
		}
		
		else if(messages.equals("user should be redirected to loginpage")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		}
		
		
		
	   
	}

	



}
