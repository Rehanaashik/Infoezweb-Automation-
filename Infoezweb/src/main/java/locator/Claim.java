
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

    // Login locators
    @FindBy(xpath = "//button[@data-testid='header-signin-btn']")
    public WebElement signin;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    
    // Search locators
    @FindBy(xpath = "//input[@data-testid='search-query-input']")
    public WebElement searchbox;

    @FindBy(xpath = "//button[@data-testid='search-submit-btn']")
    public WebElement searchbutton;

    @FindBy(xpath = "//h3[contains(text(),'Bloom Beauty Studio')]")
    public WebElement businessname;
    
    
  
	@FindBy(xpath="//a[@data-testid='nav-explore']")
	public WebElement explore;

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

    // Messages
    @FindBy(xpath = "//*[contains(.,'Claim already pending')]")
    public WebElement pendingmsg;

    @FindBy(xpath = "//*[contains(.,'Please sign in')]")
    public WebElement signinmsg;
}
