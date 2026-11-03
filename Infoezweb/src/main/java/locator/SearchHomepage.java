package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHomepage {
	
WebDriver driver;
	
	public SearchHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@data-testid='hero-search-query']")
	public WebElement businesssearch;
	
	@FindBy(xpath="//input[@data-testid='hero-search-location']")
	public WebElement citysearch;
	
	@FindBy(xpath="//button[@data-testid='hero-search-submit']")
	public WebElement searchbutton;
	
	@FindBy(xpath="//h3[contains(text(),'No businesses found')]")
	public WebElement notfound;
	
}
	
	