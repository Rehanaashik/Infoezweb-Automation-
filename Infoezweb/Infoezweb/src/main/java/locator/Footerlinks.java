package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footerlinks {
	
	WebDriver driver;

    public Footerlinks(WebDriver driver) {
    	this.driver = driver;
    	
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//a[normalize-space()='All Businesses']")
    public WebElement allbusiness;

    @FindBy(xpath = "//a[normalize-space()='Featured']")
    public WebElement featured;

     
    @FindBy(xpath = "//a[normalize-space()='Top Rated']")
    public WebElement toprated;

    @FindBy(xpath = "//a[normalize-space()='Add your business']")
    public WebElement addyourbusiness;
    
    @FindBy(xpath = "//a[normalize-space()='Pricing plans']")
    public WebElement pricingplans;

    @FindBy(xpath = "//a[normalize-space()='How claims work']")
    public WebElement howclaimswork;

    @FindBy(xpath = "//a[normalize-space()='How it works']")
    public WebElement howitworks;

    @FindBy(xpath = "//a[normalize-space()='Pricing']")
    public WebElement pricing;

    @FindBy(xpath = "//a[normalize-space()='Contact']")
    public WebElement contact;

   
	
	

}
