package SeleniumCode;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
  
	   driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/section[1]/div[3]/div/div/div/a/img")).click();
		By country = By.id("Form_getForm_Country");
		 
//		WebElement wb = driver.findElement(country);
//		
//		Select s = new Select(wb);
//		//s.selectByIndex(5);
//		//s.selectByVisibleText("India");
//		s.selectByValue("India");
		doselectDrodownByIndex(country, 5);
		Thread.sleep(2000);
		doselectDrodownByValue(country, "India");
		Thread.sleep(2000);
		doselectDrodownByVisibleText(country, "Afghanistan");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doselectDrodownByIndex(By locator, int index) {
		Select s = new Select(getElement(locator));
		s.selectByIndex(index);
	}
	public static void doselectDrodownByValue(By locator, String Value) {
		Select s = new Select(getElement(locator));
		s.selectByValue(Value);
	}
	public static void doselectDrodownByVisibleText(By locator, String Value) {
		Select s = new Select(getElement(locator));
		s.selectByVisibleText(Value);
	}

}
