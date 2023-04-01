package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParagraphAss {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		
		List<WebElement> paraList = driver.findElements(By.tagName("p"));
		System.out.println(paraList.size());
		
		for (WebElement e : paraList) {
		String text = e.getText();
		System.out.println(text);
		}
		
		
		
		
		
		
	}

}
