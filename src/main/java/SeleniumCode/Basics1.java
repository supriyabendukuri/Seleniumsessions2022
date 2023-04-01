package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Basics1 {

	 static String browser = "Chrome";
	
	public static void main(String[] args) {
		
		// browser ="chrome";
		
		WebDriver driver =null;
		
		
		switch(browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
			
		case "FireFox":
			driver = new FirefoxDriver();
			break;
			
		case "Safari":
			driver = new SafariDriver();
			break;
			
		default: 
			System.out.println("pass correct driver"+ browser);
			driver = new FirefoxDriver();

		}

//		if(browser.equals("Chrome")) {
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("FF")) {
//			driver = new FirefoxDriver();
//		}
//		else if(browser.equals("Safari")) {
//			driver = new SafariDriver();
//		}
//		else if(browser.equals("Edge")) {
//			driver = new EdgeDriver();
//		}
//		else {
//			System.out.println("Pass Correct Browser Name");
//		}
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String actTitle=driver.getTitle();
		System.out.println("Page Title" + "  "+actTitle);
		
		if(actTitle.equals("Google")) {
			System.out.println(actTitle);
		}
		else {
			System.out.println("Title is no matched");
		}
		
		driver.quit();
	}

}
