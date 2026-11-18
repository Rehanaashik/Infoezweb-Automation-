package locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notification {
	
	
	WebDriver driver;

    public Notification(WebDriver driver) {
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
    
    @FindBy(xpath = "//div[@data-testid='menu-notifications']")
    public WebElement notification;


     @FindBy(xpath = "//button[@data-testid='mark-all-read']")
    public WebElement markallread;
    
    @FindBy(xpath = "//button[text()='Mark read']")
    public List<WebElement> markread;



    

}
