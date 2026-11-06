package locator;


    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Sendenquiry {
		
	WebDriver driver;
		
		public Sendenquiry(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//button[@data-testid='open-enquiry-btn']")
		public WebElement sendenquiry;
		
		@FindBy(xpath="//input[@data-testid='enquiry-name']")
		public WebElement name;
		
		@FindBy(xpath="//input[@data-testid='enquiry-email']")
		public WebElement email;
		
		@FindBy(xpath="//input[@data-testid='enquiry-phone']")
		public WebElement phone;
		
		@FindBy(xpath="//textarea[@data-testid='enquiry-message']")
		public WebElement message;
		
		@FindBy(xpath="//button[@data-testid='enquiry-submit-btn']")
		public WebElement submit;
		
		
		
		
	}
		
		


