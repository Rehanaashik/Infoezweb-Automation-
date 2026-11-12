package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pricing {
	
	WebDriver driver;

    public Pricing(WebDriver driver) {
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
    
    @FindBy(xpath = "//a[@data-testid='nav-pricing']")
    public WebElement pricingbutton;
    
    @FindBy(xpath = "//button[@data-testid='subscribe-free']")
    public WebElement freebutton;

    @FindBy(xpath = "//button[@data-testid='subscribe-enterprise']")
    public WebElement enterprisebutton;

    
    @FindBy(xpath = "//*[contains(.,'Subscription updated')]")
    public WebElement updated;
    
    @FindBy(xpath = "//div[text()='Infoez']")
    public WebElement homebutton;
    
    
    
    
    

}