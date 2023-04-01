package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {
		
	private WebDriver  driver;
	
	/**
	 * 
	 * @param browserName
	 * @return it returns the specific browser name
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is "+ browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
			
		case "Safari":
			driver = new SafariDriver();
			break;
			
		default: 
			System.out.println("pass correct browsername"+ browserName);
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver;
		
			}
	/**
	 * To launch the url
	 * @param to pass the application url
	 */
	public void launchUrl(String url) {
		if(url==null) {
			System.out.println("Url can not be null");
		}
		
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
		else {
			System.out.println("pass proper url");
		}
	}
	
	/**
	 * To get the title of the page
	 * @return its return the Current page Title
	 */
	public String getPageTitle() {
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		return pageTitle;
		
	}
	
	/**
	 * To get the Current url of the page
	 * @return its return the current url of the page
	 */
	public String getPageUrl() {
		String pageUrl= driver.getCurrentUrl();
		System.out.println(pageUrl);
		return pageUrl;
		
	}
	
	/**
	 * To close the browser
	 */
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	
	/**
	 * To quit the browser
	 */
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
	}
	
	
	
	
	
	
	

	
	
	
	
	
	

