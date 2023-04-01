package SeleniumCode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
		By gLangLinks = By.xpath("//div[@id='SIvCob']/a");
//		List<WebElement> list = driver.findElements(gLangLinks);		
//		System.out.println(list.size());
//		
//		for (WebElement e : list) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("తెలుగు")) {
//				e.click();
//				break;
//			}
//		}
		
		getAllLanguageLinks(gLangLinks, "English");
		System.out.println(gLangLinks.equals("తెలుగు"));
		
	}
	
	public static List<WebElement> getElement(By locator) {
		return driver.findElements(locator);
	}
	
	public int getElementListCount(By locator) {
		int count = getElement(locator).size();
		System.out.println(count);
		return count;
	}
	
	public static List<String> getAllLanguageLinks(By locator, String value) {
		List<String> listValues = new ArrayList<>();
		List<WebElement> list= getElement(locator);
		for (WebElement e : list) {
			String text=e.getText();
			listValues.add(text);
			}
		return listValues;
	}
}

