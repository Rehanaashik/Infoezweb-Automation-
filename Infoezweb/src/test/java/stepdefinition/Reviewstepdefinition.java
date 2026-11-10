
package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Review;

public class Reviewstepdefinition extends Base {

    Review r;

    @Given("user launched the applications url")
    public void user_launched_the_applications_url() {

        launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net");

        r = new Review(driver);
    }

    @When("user logging into the application")
    public void user_logging_into_the_application() {

        visibilitywait(r.signin);
        click(r.signin);

        visibilitywait(r.email);
        r.email.clear();
        sendkeys(r.email, "customer@infoez.com");

        visibilitywait(r.password);
        r.password.clear();
        sendkeys(r.password, "Customer@123");

        visibilitywait(r.submit);
        click(r.submit);

    }

    @When("user navigates to the business content page")
    public void user_navigates_to_the_business_content_page() {

        visibilitywait(r.businessname);
        
        
        

        elementToBeclick(r.businessname);
        click(r.businessname);

        visibilitywait(r.reviewbutton);

        System.out.println("Business Details Page Opened");

    }

    @When("user clicks the review button")
    public void user_clicks_the_review_button() {

        visibilitywait(r.reviewbutton);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                r.reviewbutton
            );

            elementToBeclick(r.reviewbutton);
           r.reviewbutton.click();


        

        System.out.println("Review button clicked successfully");

    }

    @When("user selects the rating {string}")
    public void user_selects_the_rating(String rating) {

        visibilitywait(r.reviewstar);

        click(r.reviewstar);

        System.out.println("Selected Rating: " + rating);

    }

    @When("user enters the review comment {string}")
    public void user_enters_the_review_comment(String comment) {

        visibilitywait(r.reviewcomment);

        sendkeys(r.reviewcomment, comment);

    }

    @When("user clicks the post review button")
    public void user_clicks_the_post_review_button() {

        visibilitywait(r.reviewsubmitbutton);

        elementToBeclick(r.reviewsubmitbutton);

        click(r.reviewsubmitbutton);

        System.out.println("Post Review button clicked");

    }

    @Then("review submission status {string}")
    public void review_submission_status(String status) {

        visibilitywait(r.posted);

        if (status.equals("Review posted")) {

            Assert.assertTrue(
                "Review posted message not displayed",
                driver.getPageSource().contains("Review posted")
            );

        }

        else if (status.equals("Minimum character limit 3")) {

            Assert.assertTrue(
                "Minimum character limit message not displayed",
                driver.getPageSource().contains("Minimum character limit 3")
            );

        }

        
        }

    }


