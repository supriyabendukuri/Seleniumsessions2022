package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		
		FirefoxOptions fo = new FirefoxOptions();
	//	fo.setHeadless(true);
		//fo.addArguments("--private browsing");
		//co.addArguments("--incognito");
		co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://amazon.com");
		
		String s =driver.getCurrentUrl();
		System.out.println(s);
		
		String s1 = driver.getTitle();
		System.out.println(s1);
		
				
		
	}

}
