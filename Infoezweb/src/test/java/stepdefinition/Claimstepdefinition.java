
package stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import locator.Claim;

public class Claimstepdefinition extends Base {

    Claim c;

    @Given("user launches the application using Infoez URL")
    public void user_launches_the_application_using_infoez_url() {

        launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net");

        c = new Claim(driver);
    }

    @When("user logs in to the application")
    public void user_logs_in_to_the_application() {

    	elementToBeclick(c.signin);
        c.signin.click();

        visibilitywait(c.email);
        c.email.clear();
        sendkeys(c.email, "customer@infoez.com");

        visibilitywait(c.password);
        c.password.clear();
        sendkeys(c.password, "Customer@123");

        elementToBeclick(c.submit);
        c.submit.click();

    }



@When("user navigates to the Business Details page")
public void user_navigates_to_the_Business_Details_page() {

	
    visibilitywait(c.businessname);

    ((JavascriptExecutor) driver).executeScript(
        "arguments[0].scrollIntoView({block:'center'});",
        c.businessname
    );

    c.businessname.click();

    
    visibilitywait(c.claimbutton);

    System.out.println("Business Details Page Opened");
}

    @When("user clicks on the Claim button")
    public void user_clicks_on_the_claim_button() {

        visibilitywait(c.claimbutton);

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            c.claimbutton
        );

        elementToBeclick(c.claimbutton);
        c.claimbutton.click();

        System.out.println("Claim Button Clicked");
    }

    @When("user enters reason {string}")
    public void user_enters_reason(String reason) {

        visibilitywait(c.claimreason);
        c.claimreason.sendKeys(reason);
    }

    @When("user enters proof URL {string}")
    public void user_enters_proof_url(String proof) {

        
            visibilitywait(c.claimproof);
            c.claimproof.sendKeys(proof);
        }
    

    @When("user clicks on the Submit Claim button")
    public void user_clicks_on_the_submit_claim_button() {

        elementToBeclick(c.claimsubmitbutton);
        c.claimsubmitbutton.click();

        System.out.println("Submit Claim Clicked");
    }

    @Then("{string} should be displaying")
    public void claim_message_should_be_displaying(String messages) {

        Base.visibilitywait(c.pendingmsg);

        if (messages.equals("Claim already pending")) {

            boolean result = wait.until(driver ->
                driver.getPageSource().contains("Claim already pending")
            );

            Assert.assertTrue(result);

        }

        else if (messages.equals("proof should be submitted")) {

            boolean result = driver.getPageSource()
                .contains("proof should be submitted");

            Assert.assertTrue(result);
        }
    }
}
