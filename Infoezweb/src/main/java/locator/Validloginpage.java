package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validloginpage {
	
WebDriver driver;
	
	public Validloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//button[@data-testid='header-signin-btn']")
	public WebElement signin;
	
	@FindBy(xpath="//*[contains(text(),'Invalid credentials')]")
	public WebElement Invalidcredentials;
	
	@FindBy(xpath="//*[contains(text(),'value is not a valid email address')]")
	public WebElement Invalidemail;


}
