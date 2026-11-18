package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




	public class Profile {
		
		
		WebDriver driver;

	    public Profile(WebDriver driver) {
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
	    
	    @FindBy(xpath = "//li[@data-type='success']")
	    public WebElement welcomback;
	     
	    
	    @FindBy(xpath = "//button[@data-testid='user-menu-btn']")
	    public WebElement profilebtn;
	    
	    @FindBy(xpath = "//div[@data-testid='menu-profile']")
	    public WebElement profilemenu;
	    
	    @FindBy(xpath = "//input[@data-testid='profile-name']")
	    public WebElement name;
	    
	    @FindBy(xpath = "//input[@data-testid='profile-phone']")
	    public WebElement phone;
	    
	    @FindBy(xpath = "//input[@data-testid='profile-avatar']")
	    public WebElement avatarurl;
	    
	    @FindBy(xpath = "//button[@data-testid='profile-save-btn']")
	    public WebElement savechanges;
	    
	    @FindBy(xpath = "//li[contains(@class,'toast')]")
	    public WebElement profilenotification;
	    

	}