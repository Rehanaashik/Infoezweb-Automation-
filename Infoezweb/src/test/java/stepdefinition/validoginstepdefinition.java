
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
public void user_enters_email(String email) {
	l.email.sendKeys(email);
    
}

@When("user enters a password {string}")
public void user_enters_a_password(String password) {
	l.password.sendKeys(password);
    
}

@When("user clicks the submit button")
public void user_clicks_the_submit_button() {
	l=new Validloginpage(driver);
	l.submit.click();
    
}

@Then("{string} should be displayed")
public void should_be_displayed(String expectedMessage) throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	if(expectedMessage.equals("Invalid email")) {
		Assert.assertTrue(l.Invalidemail.isDisplayed());
	}
	
	else
	if(expectedMessage.equals("Invalid credentials")) {
		Assert.assertTrue(l.Invalidcredentials.isDisplayed());
	}
	
	else
	if(expectedMessage.equals("Welcome back!")) {
		Assert.assertTrue(driver.getPageSource().contains("Welcome back"));
	}
	
	System.out.println("Welcome back!");
	
	
	
	
		
    
}
	}


