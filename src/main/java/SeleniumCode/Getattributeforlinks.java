package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributeforlinks {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		By links= By.tagName("a");
		By imges= By.tagName("img");

		
//		List<WebElement> linksList = getElements(links);
//		for(WebElement e : linksList) {
//			String attval =e.getAttribute("href");
//			String textVal= e.getText();
//			
//			System.out.println(attval + ">>" + textVal);
//		}
		
//		List<WebElement> imgList= getElements(imges);
//		System.out.println(imgList.size());
//		for (WebElement e : imgList) {
//			String text = e.getAttribute("src");
//			System.out.println(text);
//			
//		}
		
		getElementAttributes(links, "href");
		getElementAttributes(imges, "src");
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
		
	public static void getElementAttributes(By locator, String eleVal) {
		List<WebElement> ele=getElements(locator);
			int count = ele.size();
			System.out.println(count);
		for (WebElement e : ele) {
			String text= e.getAttribute(eleVal);
			System.out.println(text);
		}
	}
	}


	


