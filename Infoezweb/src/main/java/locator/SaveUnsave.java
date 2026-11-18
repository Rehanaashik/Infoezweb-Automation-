package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaveUnsave {
	
WebDriver driver;
	
	public SaveUnsave(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//button[@data-testid='header-signin-btn']")
	public WebElement signin;

	
	
	 @FindBy(xpath = "//h3[contains(text(),'Bloom Beauty Studio')]")
	    public WebElement businessname;
	 
	 
	@FindBy(xpath="//a[@data-testid='nav-explore']")
	public WebElement explore;

	
	
	@FindBy(xpath="//button[contains(@data-testid,'favorite-toggle-btn')]")
	public WebElement favorite;
	
	@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
    public WebElement profilebtn;
	
	@FindBy(xpath = "//div[@data-testid='menu-favorites']")
    public WebElement myfavorites;
	
	@FindBy(xpath = "//li[@data-sonner-toast]")
    public WebElement toastmsg;
	
	
	@FindBy(xpath = "//*[contains(text(),'Bloom Beauty Studio')]")
    public WebElement bloom;
	
	@FindBy(xpath = "//div[contains(text(),'Removed from favorites')]")
    public WebElement toastmsg1;
	
	
	
	
	
	
}
	
	