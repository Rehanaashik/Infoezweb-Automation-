package locator;


	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Review {
		
		WebDriver driver;

	    public Review (WebDriver driver) {
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

	    // Explore page
	    @FindBy(xpath = "//a[@data-testid='nav-explore']")
	    public WebElement explore;

	    
	    @FindBy(xpath = "//h3[contains(text(),'Bloom Beauty Studio')]")
	    public WebElement businessname;
	    
	    
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
	    
	    @FindBy(xpath = "//*[contains(.,'Review posted')]")
	    public WebElement posted;
	    
	    

	}




