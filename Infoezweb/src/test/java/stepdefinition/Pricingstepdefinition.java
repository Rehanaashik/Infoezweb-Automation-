
package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Pricing;

public class Pricingstepdefinition extends Base {

    Pricing p;

    @Given("user launched the applications urls")
    public void user_launched_the_applications_urls() {

        launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net");

        p = new Pricing(driver);
    }

    @When("user is logged in {string}")
    public void user_is_logged_in_(String loginstatus) {

        if (loginstatus.trim().equalsIgnoreCase("logged in")) {

            visibilitywait(p.signin);
            click(p.signin);

            visibilitywait(p.email);
            p.email.clear();
            sendkeys(p.email, "customer@infoez.com");

            visibilitywait(p.password);
            p.password.clear();
            sendkeys(p.password, "Customer@123");

            visibilitywait(p.submit);
            click(p.submit);
            
            
        }
    }

    @When("user clicks the pricing button")
    public void user_clicks_the_pricing_button() {
    	
    Base.visibilitywait(p.homebutton);
    click(p.homebutton);

    	
    Base.visibilitywait(p.pricingbutton);
    click(p.pricingbutton);
      
    }

    @When("user clicks the choose plan {string}")
    public void user_clicks_the_choose_plan(String plan) {

        if (plan.trim().equalsIgnoreCase("Free")) {

            visibilitywait(p.freebutton);

            if (p.freebutton.getText().equalsIgnoreCase("Active plan")) {

                System.out.println("Free plan is already active");

            } else {

                click(p.freebutton);
            }

        } else if (plan.trim().equalsIgnoreCase("Enterprise")) {

            visibilitywait(p.enterprisebutton);
            click(p.enterprisebutton);
        }
    }
    
    @Then("validationsss should be displays {string}")
    public void validationsss_should_be_displays(String validationsss) {

        if (validationsss.equals("Subscription updated")) {

            Assert.assertTrue(
                driver.getPageSource().contains("Current") ||
                driver.getPageSource().contains("Subscription updated")
            );

        } else if (validationsss.equals("Please sign in to subscribe")) {

            Assert.assertTrue(
                driver.getPageSource().contains("Please sign in to subscribe")
            );
        }
    }
}
