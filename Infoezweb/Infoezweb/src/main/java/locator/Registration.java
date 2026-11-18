package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	
WebDriver driver;
	
	public Registration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id = "r-cust")
	public WebElement Customer;
	
	@FindBy(xpath="//input[@data-testid='register-name']")
	public WebElement name;
	
	@FindBy(xpath="//input[@data-testid='register-email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@data-testid='register-phone']")
	public WebElement phone;
	
	@FindBy(xpath="//input[@data-testid='register-password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@data-testid='register-submit-btn']")
	public WebElement submit;
	
}
