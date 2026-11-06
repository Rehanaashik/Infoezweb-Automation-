

package locator;

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
}
