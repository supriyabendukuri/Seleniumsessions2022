package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		//1st method
//		driver.findElement(By.id("email")).sendKeys("Supriya@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Suppu2323");
		
		//2nd method
		/*WebElement eid= driver.findElement(By.id("email"));
		WebElement pwd =driver.findElement(By.id("pass"));
		
		eid.sendKeys("supriya@gmail.com");
		pwd.sendKeys("suppu2232");*/
		
		//3rd method
		/*By emailId=By.id("email");
		By password =By.id("pass");
		
		WebElement eid=driver.findElement(emailId);
		WebElement pwd= driver.findElement(password);
		
		eid.sendKeys("supriya@gmail.com");
		pwd.sendKeys("suppu2232");*/
		
		//4th method
		
//		By emailId=By.id("email");
//		By password =By.id("pass");
//		
//
//		getElement(emailId).sendKeys("supriya@gmail.com");
//		getElement(password).sendKeys("suppu3232");
		
		
		//5th method
//		
//		By emailId=By.id("email");
//		By password =By.id("pass");
//		
//		doSendkeys(emailId, "Supriya@gmail.com");
//		doSendkeys(password, "suppu223");
		
		//6th approach
		//for this approach we need to create element utility class
		By emailId=By.id("email");
		By password =By.id("pass");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendkeys(emailId, "Supriya@gmail.com");
		eleUtil.doSendkeys(password, "suppu3232");
		
		
		
		
		driver.close();
		
		
	
		
	}
	
	
	//creating generic method for 4th/5th approach
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	
	
	
	
	
}
