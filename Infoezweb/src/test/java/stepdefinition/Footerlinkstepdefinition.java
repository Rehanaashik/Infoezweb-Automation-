package stepdefinition;

import org.junit.Assert;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Footerlinks;
import locator.Howitworks;

public class Footerlinkstepdefinition extends Base {
	
	
	
Footerlinks f;

    @Given("user launched the app url")
	public void user_launched_the_app_url() {
		
		launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net/");

        f = new Footerlinks(driver);

	}
	    
	

	@When("user clicks on footer link {string}")
	public void user_clicks_on_footer_link(String link) {
		
		if(link.equalsIgnoreCase("All Businesses")) {
			click(f.allbusiness);
		}
		
		else if(link.equalsIgnoreCase("Featured")) {
			click(f.featured);
		}
		else if(link.equalsIgnoreCase("Top Rated")) {
			click(f.toprated);
		}
		
		else if(link.equalsIgnoreCase("Add your business")) {
			click(f.addyourbusiness);
		}
		
		else if(link.equalsIgnoreCase("Pricing plans")) {
			click(f.pricingplans);
		}
		
		else if(link.equalsIgnoreCase("How claims work")) {
			click(f.howclaimswork);
		}
		
		else if(link.equalsIgnoreCase("How it works")) {
			click(f.howitworks);
		}
		
		else if(link.equalsIgnoreCase("Pricing")) {
			click(f.pricing);
		}
		
		else if(link.equalsIgnoreCase("Contact")) {
			click(f.contact);
		}
	}

	@Then("user should navigate to the specific page {string}")
	public void user_should_navigate_to_the_specific_page(String page) {
		
		
		    if(page.equalsIgnoreCase("search")) {
		          Assert.assertTrue(driver.getCurrentUrl().contains("/search"));
		    }
		    else if(page.equalsIgnoreCase("featured")) {
		        Assert.assertTrue(driver.getCurrentUrl().contains("featured=true"));
		    }
		    else if(page.equalsIgnoreCase("sort")) {
		       Assert.assertTrue(driver.getCurrentUrl().contains("sort"));
		    }
		    else if(page.equalsIgnoreCase("register")) {
		         Assert.assertTrue(driver.getCurrentUrl().contains("/register"));
		    }
		    else if(page.equalsIgnoreCase("pricing")) {
		        Assert.assertTrue(driver.getCurrentUrl().contains("/pricing"));
		    }
		    
		    else if(page.equalsIgnoreCase("how-it-works")) {
		        Assert.assertTrue(driver.getCurrentUrl().contains("/how-it-works"));
		    }
		    
		    else if(page.equalsIgnoreCase("pricing")) {
		        Assert.assertTrue(driver.getCurrentUrl().contains("/pricing"));
		    }
		    
		    else if(page.equalsIgnoreCase("contact")) {
		        Assert.assertTrue(driver.getCurrentUrl().contains("/contact"));
		    }
		    
		    
		    else if(page.equalsIgnoreCase("false")) {
		        Assert.assertFalse(driver.getCurrentUrl().contains("how-it-works"));
		        		
		    }
		}

	    
	}





