package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsLinks {

	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = links.size();
		System.out.println(linksCount);
		
		// foreach loop
//			int count=0;
//		for (WebElement e : links) {
//			String text = e.getText();
//			if(text.length()>0) {
//				System.out.println(count + " "+text);
//			}
//			count ++;
//		}
		
		//For loop
		for(int i =0; i< links.size(); i++) {
			String text = links.get(i).getText();
			if(text.length()>0) {
			System.out.println(i + ". "+text);
			}
		}
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("Img count" + imgList.size());
		
	}
}
