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
        click(s.signin);

        visibilitywait(s.email);
        clear(s.email);
        sendkeys(s.email, "customer@infoez.com");

        visibilitywait(s.password);
        clear(s.password);
        sendkeys(s.password, "Customer@123");

        elementToBeclick(s.submit);
       click(s.submit);

    }


    @When("user navigates to the business details pages")
    public void user_navigates_to_the_business_details_pages() {

        

        visibilitywait(s.businessname);

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            s.businessname
        );

       click(s.businessname);

        Base.staleElementWait(s.favorite);

        System.out.println("Business Details Page Opened");
    }


    @When("user {string} the business")
    public void user_the_business(String action) {

        Base.staleElementWait(s.favorite);

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            s.favorite
        );

        elementToBeclick(s.favorite);

        if (action.equalsIgnoreCase("save")) {
            click(s.favorite);

        } else if (action.equalsIgnoreCase("unsave")) {
           click(s.favorite);

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
            
            Base.invisiblewait(s.toastmsg1);

        }
    }
    
    @When("user navigates to My favourites page")
    public void user_navigates_to_my_favourites_page() {
    	
    	((JavascriptExecutor) driver).executeScript(
    		    "arguments[0].scrollIntoView({block:'center'});",
    		    s.profilebtn
    		);
    	
    	Base.invisiblewait(s.toastmsg);
    	Base.elementToBeclick(s.profilebtn);
    	click(s.profilebtn);
    	
    	Base.elementToBeclick(s.myfavorites);
    	
    	click(s.myfavorites);
        
    }

    @Then("business should be {string} in My Favourites")
    public void business_should_be_in_my_favourites(String status) {
    	
    	if(status.equalsIgnoreCase("displayed")) {
    		
    		Base.visibilitywait(s.bloom);
    	
    	Assert.assertTrue(driver.getPageSource().contains("Bloom Beauty Studio"));
    	
    	}
    	
    	
    	else if(status.equalsIgnoreCase("not displayed")) {
    		
    	//	Base.visibilitywait(s.bloom);
    		
    		
    		Assert.assertFalse(driver.getPageSource().contains("Bloom Beauty Studio"));
    	}
       
    }



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}