package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Withoutsignin {
	
WebDriver driver;
		
		public Withoutsignin(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//h3[contains(text(),'Bloom Beauty Studio')]")
	    public WebElement businessname;
		
		@FindBy(xpath="//button[contains(@data-testid,'favorite-toggle-btn')]")
		public WebElement favorite;
		
		// Claim button
	    @FindBy(xpath = "//button[@data-testid='claim-business-btn']")
	    public WebElement claimbutton;

	    // Claim form
	    @FindBy(xpath = "//textarea[@data-testid='claim-reason']")
	    public WebElement claimreason;

	    @FindBy(xpath = "//input[@data-testid='claim-proof']")
	    public WebElement claimproof;

	    @FindBy(xpath = "//button[@data-testid='claim-submit-btn']")
	    public WebElement claimsubmitbutton;
	    
	  //reviewbutton
	    @FindBy(xpath = "//button[@data-testid='write-review-btn']")
	    public WebElement reviewbutton;
	    
	    //
	    
	    @FindBy(xpath = "//button[@data-testid='review-star-4']")
	    public WebElement reviewstar;
	    
	    //
	    
	    @FindBy(xpath = "//textarea[@data-testid='review-comment']")
	    public WebElement reviewcomment;
	    
	    @FindBy(xpath = "//button[@data-testid='review-submit-btn']")
	    public WebElement reviewsubmitbutton;
	    
		
		

	}



