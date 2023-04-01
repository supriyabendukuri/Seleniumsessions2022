package SeleniumCode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		
		  By links = By.xpath("//div[@id='nav-xshop']/a");
		//By links = By.tagName("a");
		
//		List<WebElement> allLinks = driver.findElements(links);
//		int count = allLinks.size();
//		System.out.println(count);
//		
//		for(WebElement e :allLinks) {
//			String text= e.getText();
//			System.out.println(text);
//		}
		
		ElementUtil ele = new ElementUtil(driver);
		List<String> allLinks = ele.getAllLinks(links);
		System.out.println(allLinks);
		System.out.println(allLinks.contains("Amazon miniTV"));
		System.out.println(allLinks.contains("best"));

		driver.quit();
	}

}
