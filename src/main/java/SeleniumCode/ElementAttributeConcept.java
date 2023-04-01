package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
//		String ph = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(ph);
		
		By ph = By.name("firstname");
		String attVal= getElement(ph).getAttribute("placeholder");
		System.out.println(attVal);
	}
	
	//Utililty
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getAttributeValue(By locator, String attVal) {
		return getElement(locator).getAttribute(attVal);
	}
	

}
