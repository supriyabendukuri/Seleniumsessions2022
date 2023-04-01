package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsUsecases {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		int linksCount = links.size();
//		System.out.println(linksCount);
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		getElementListCount(links);
		getElementListCount(images);

		
		
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementListCount(By locator) {
		int count =getElements(locator).size();
		System.out.println(count);
		return count;
	}
}
