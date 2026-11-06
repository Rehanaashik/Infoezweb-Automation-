
package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Claim;

public class Claimstepdefinition extends Base {

    Claim c;
    WebDriverWait wait;

    @Given("user launches the application infoez url")
    public void user_launches_the_application_infoez_url() {

        launchbrowser();
        maximizebrowser();

        openurl("https://d2mojgetgp5xie.cloudfront.net/search");

        c = new Claim(driver);
    }

    // Login functionality
    @When("user login status is login {string}")
    public void user_login_status_is_login(String login) {

        if (login.equalsIgnoreCase("yes")) {

            elementToBeclick(c.signin);
            c.signin.click();

            visibilitywait(c.email);
            c.email.sendKeys("customer@infoez.com");

            visibilitywait(c.password);
            c.password.sendKeys("customer@123");

            elementToBeclick(c.submit);
            c.submit.click();

        } else if (login.equalsIgnoreCase("no")) {

            System.out.println("User continues without login");

        } else {

            Assert.fail("Invalid login status: " + login);
        }
    }

    
    @When("user navigates to the business details entered page")
    public void user_navigates_to_the_business_details_entered_page() {

        elementToBeclick(c.businessname);
        c.businessname.click();
    }

   
    @When("user clicks the claim button")
    public void user_clicks_the_claim_button() {

        elementToBeclick(c.claimbutton);
        c.claimbutton.click();
    }

    
    @When("user enters reason {string}")
    public void user_enters_reason(String reason) {

        visibilitywait(c.claimreason);

        c.claimreason.clear();

        if (!reason.isEmpty()) {
            c.claimreason.sendKeys(reason);
        }
    }

   
    @When("user enters the proof url {string}")
    public void user_enters_the_proof_url(String proof) {

        visibilitywait(c.claimproof);

        c.claimproof.clear();

        if (!proof.isEmpty()) {
            c.claimproof.sendKeys(proof);
        }
    }

    
    @When("user clicks on submit claim button")
    public void user_clicks_on_submit_claim_button() {

        elementToBeclick(c.claimsubmitbutton);
        c.claimsubmitbutton.click();
    }

   
    @Then("{string} should be displaying")
    public void should_be_displaying(String expectedconditions) {

        String pageSource = driver.getPageSource().toLowerCase();

        if (expectedconditions.equalsIgnoreCase("claim already pending")
                || expectedconditions.equalsIgnoreCase("claimalready pending")) {

            Assert.assertTrue(
                "Claim already pending message not displayed",
                pageSource.contains("claim already pending")
            );

        } else if (expectedconditions.equalsIgnoreCase("please signin first")
                || expectedconditions.equalsIgnoreCase("please sign in first")) {

            Assert.assertTrue(
                "Please sign in message not displayed",
                pageSource.contains("please sign in")
                || pageSource.contains("please signin")
            );

        } else {

            Assert.fail("Unexpected expected condition: " + expectedconditions);
        }
    }
}
