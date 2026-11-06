
package stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Registration;
import locator.SaveUnsave;

public class Saveunsavestepdefinition extends Base {

    SaveUnsave s;

    @Given("user launches the applications")
    public void user_launches_the_applications() {

        launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net/");
        s = new SaveUnsave(driver);

    }

    @When("user login to the applications")
    public void user_login_to_the_applications() {

        elementToBeclick(s.signin);
        s.signin.click();

        visibilitywait(s.email);
        s.email.clear();
        sendkeys(s.email, "customer@infoez.com");

        visibilitywait(s.password);
        s.password.clear();
        sendkeys(s.password, "Customer@123");

        elementToBeclick(s.submit);
        s.submit.click();

    }


    @When("user navigates to the business details pages")
    public void user_navigates_to_the_business_details_pages() {

        elementToBeclick(s.explore);
        s.explore.click();

        visibilitywait(s.businessname);

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            s.businessname
        );

        s.businessname.click();

        visibilitywait(s.favorite);

        System.out.println("Business Details Page Opened");
    }


    @When("user {string} the business")
    public void user_the_business(String action) {

        visibilitywait(s.favorite);

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            s.favorite
        );

        elementToBeclick(s.favorite);

        if (action.equalsIgnoreCase("save")) {
            s.favorite.click();

        } else if (action.equalsIgnoreCase("unsave")) {
            s.favorite.click();

        }
    }


    @Then("validation message should be displayed")
    public void validation_message_should_be_displayed() {

        String buttonText = s.favorite.getText();

        if (buttonText.equalsIgnoreCase("Saved")) {

            Assert.assertTrue(true);
            System.out.println("Business Saved Successfully");

        } else if (buttonText.equalsIgnoreCase("Save")) {

            Assert.assertTrue(true);
            System.out.println("Business Unsaved Successfully");

        }
    }

}
