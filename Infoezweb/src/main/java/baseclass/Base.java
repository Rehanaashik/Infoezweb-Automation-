package baseclass;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base{
	
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait wait;
	
	public static WebDriver launchbrowser() {
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> pref=new HashMap<>();
		pref.put("Credentials_enable_service",false);
		pref.put("profile.password_manager_enabled",false);
		pref.put("profile.password_manager_leak_detection",false);
		options.setExperimentalOption("prefs",pref);
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-features=passwordLeakDetection");
		 driver = new ChromeDriver(options);
		  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		   
		  driver.get("https://d2mojgetgp5xie.cloudfront.net/");
		  return driver;

		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		//action=new Actions(driver);
	   
		//return driver;
	}
	
	public static void openurl(String url) {
		driver.get(url);
	}
	
	public static void maximizebrowser() {
		driver.manage().window().maximize();
	}
	
	public static void minimizebrowser() {
		driver.manage().window().minimize();
	}
	
	public static void click(WebElement Element) {
		Element.click();
	}
	
	public static void sendkeys(WebElement Element,String text) {
		Element.sendKeys( text);
	}
	
	
	public static void elementToBeclick(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public static void visibilitywait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public static void staleElementWait(WebElement element) {

		    wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		    wait.ignoring(StaleElementReferenceException.class)
		        .until(ExpectedConditions.visibilityOf(element));
		}
	
	public static void acceptalert() {
		driver.switchTo().alert().accept();
	}
	
	public static void dismissalert() {
		
		driver.switchTo().alert().dismiss();
		
	}
	
	public static String getalerttext() {
		return driver.switchTo().alert().getText();
	}

    public static void enteralerttext(String text) {
    	driver.switchTo().alert().sendKeys(text);
    }
	
    
    
	public static void closebrowser() {
		driver.close();
	}
	
	public static void quitbrowser() {
		driver.quit();
	}
	

}
