

package stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Filterexplore;

public class Filterstepdefinition extends Base {

    Filterexplore f;

    WebDriverWait wait;

    @Given("user launches the application url for infoez")
    public void user_launches_the_application_url_for_infoez() {

        launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net/search");

        f = new Filterexplore(driver);

       
    }

    @When("user navigates to the explore page")
    public void user_navigates_to_the_explore_page() {

    }

    @When("user selects the filter type {string}")
    public void user_selects_the_filter_type(String filtertype) {

        if (filtertype.equalsIgnoreCase("category")) {
            click(f.category);
        }
        else if (filtertype.equalsIgnoreCase("sort by")) {
            click(f.sortby);
        }
        else if (filtertype.equalsIgnoreCase("minimum rating")) {
            click(f.minrating);
        }
        else if (filtertype.equalsIgnoreCase("verified only")) {
            click(f.verifiedonly);
        }
    }

    @When("user selects the filter value {string}")
    public void user_selects_the_filter_value(String filtervalue) {

        if (filtervalue.equalsIgnoreCase("fitness&wellness")) {

           Base.elementToBeclick(f.fitness);
            click(f.fitness);

        }
        else if (filtervalue.equalsIgnoreCase("Toprated")) {

            Base.elementToBeclick(f.toprated);
            click(f.toprated);

        }
        else if (filtervalue.equalsIgnoreCase("4.0")) {

            Base.elementToBeclick(f.rating40);
            click(f.rating40);

        }
        else if (filtervalue.equalsIgnoreCase("yes")) {

            if (!f.verifiedonly.isSelected()) {
                click(f.verifiedonly);
            }
            
            
            }
        }
    @Then("user should see the filtered business results {string}")
    public void user_should_see_the_filtered_business_results(String businessresults) {
    	
    	if(f.fitnesswellness.size()>0) {
    		Assert.assertTrue(f.fitnesswellness.get(0).isDisplayed());
    	}
    	
    	else if (businessresults.equalsIgnoreCase("Highest rated first")) {
    	    Base.wait.until(ExpectedConditions.visibilityOfAllElements(f.toprated1));
    	    Assert.assertTrue(f.toprated1.get(0).getText().equals("5.0"));
    	}
    	else if (businessresults.equalsIgnoreCase("Ratings above 4.0")) {
    	    Assert.assertTrue(
    	        driver.getPageSource().contains("5.0") ||
    	        driver.getPageSource().contains("4.0")
    	    );
    	}
    	else if (f.verified.size()>0) {
    		Assert.assertTrue(f.verified.get(0).isDisplayed());
    		
    	}

    	
    }
    @When("user clicks on the clear filter options")
    public void user_clicks_on_the_clear_filter_options() {
        click(f.Clearfilter);
    }

    

    
}
