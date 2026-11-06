package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baseclass.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
		@CucumberOptions(
		features = "src/test/java/featurefile/Claim.feature",
		glue = "stepdefinition",
		 
		dryRun = false,
		 
		
		 
		plugin = {
		 
		"pretty",
		
		 
		"html:target/CucumberReport.html",
		 
		"json:target/Cucumber.json",
		
		 
		},
		 
		monochrome = true
		 
		)
		 
		public class Testrunner extends Base {

		    @BeforeClass
		    public static void Startup() {
		        launchbrowser();
		        maximizebrowser();
		    }

		    @AfterClass
		    public static void quit() {
		        quitbrowser();
		    }
		}



