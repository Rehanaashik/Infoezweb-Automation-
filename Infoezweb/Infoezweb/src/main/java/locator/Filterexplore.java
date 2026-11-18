

package locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filterexplore {

    WebDriver driver;

    public Filterexplore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Category dropdown
    @FindBy(xpath="//button[@data-testid='filter-category']")
    public WebElement category;

    // Category option
    @FindBy(xpath="//*[normalize-space()='Fitness & Wellness']")
    public WebElement fitness;

    // Sort dropdown
    @FindBy(xpath="//button[@data-testid='filter-sort']")
    public WebElement sortby;

    // Sort option
    @FindBy(xpath="//*[normalize-space()='Top rated']")
    public WebElement toprated;

    // Minimum rating dropdown
    @FindBy(xpath="//button[@data-testid='filter-min-rating']")
    public WebElement minrating;

    // Rating option
    @FindBy(xpath="//*[normalize-space()='4.0+']")
    public WebElement rating40;

    // Verified checkbox
    @FindBy(xpath="//input[@data-testid='filter-verified']")
    public WebElement verifiedonly;

    // Clear filter
    @FindBy(xpath="//button[normalize-space()='Clear']")
    public WebElement Clearfilter;

    // Business result
    @FindBy(xpath="//*[contains(normalize-space(.),'Iron Peak Gym')]")
    public WebElement ironpeakgym;

    // No business result
    @FindBy(xpath="//h3[contains(text(),'No businesses found')]")
    public WebElement nobusinessfound;

    // After clear filter
    @FindBy(xpath="//*[contains(normalize-space(.),'Aroma Cafe')]")
    public WebElement afterclear;
  
    
    @FindBy(xpath="//a[starts-with(@data-testid,'business-card-')]//div[normalize-space()='Fitness & Wellness']")
    public List<WebElement> fitnesswellness;

    @FindBy(xpath="//span[normalize-space()='5.0']")
    public List<WebElement> toprated1;

    @FindBy(xpath="//svg[contains(@class,'badge-check') and contains(@class,'text-emerald-600')]")
    public List<WebElement> verified;
    
    @FindBy(xpath="//a[starts-with(@data-testid,'business-card-')]")
    public List<WebElement> businesslist;

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
