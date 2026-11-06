package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Claim {
	
	WebDriver driver;

	    public Claim(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath="//button[@data-testid='header-signin-btn']")
		public WebElement signin;
	    
	    @FindBy(xpath="//button[@type='submit']")
		public WebElement submit;
	    
        @FindBy(id = "email")
		public WebElement email;
		
		@FindBy(id = "password")
		public WebElement password;
		
        @FindBy(xpath="//*[contains(normalize-space(),'Petal & Loom Bakery')]")
		public WebElement businessname;
		
		@FindBy(xpath="//a[@data-testid='nav-explore']")
		public WebElement explore;
		
		@FindBy(xpath="//*[contains(normalize-space(.),'Aroma Cafe')]")
	    public WebElement Aromacafe;
		
		@FindBy(xpath="//button[@data-testid='claim-business-btn']")
		public WebElement claimbutton;
		
		@FindBy(xpath="//textarea[@data-testid='claim-reason']")
		public WebElement claimreason;
		
		@FindBy(xpath="//input[@data-testid='claim-proof']")
		public WebElement claimproof;
		
		@FindBy(xpath="//button[@data-testid='claim-submit-btn']")
		public WebElement claimsubmitbutton;
		
		
		
		
		
		
		
		
		
		

		
	    
	    
}
