package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Howitworks {
	
	WebDriver driver;

    public Howitworks(WebDriver driver) {
    	this.driver = driver;
    	
        PageFactory.initElements(driver, this);
    }
    
    
 
    @FindBy(xpath = "//a[normalize-space()='Start exploring']")
    public WebElement startexploring;

    @FindBy(xpath = "//a[normalize-space()='List your business']")
    public WebElement listyourbusiness;


}
