package SeleniumCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectdropdownAllelements {
		static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/section[1]/div[3]/div/div/div/a/img")).click();
		By country = By.id("Form_getForm_Country");
		
//		WebElement wb = driver.findElement(country);
//		Select s= new Select(wb);
//		List<WebElement> listOfValues = s.getOptions();
//		System.out.println(listOfValues.size()-1);
//		
//		for (WebElement e : listOfValues) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		
			
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> dropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();	
	}
	
	public static List<String> getDropdonText(By locator) {
		List<WebElement> allText= dropDownOptionsList(locator);
		List<String> list = new ArrayList<String>();

		for (WebElement e : allText) {
			String text =e.getText();
			list.add(text);
			
		}
		return list;

	}

	public static int getTotalDropdownElements(By locator) {
		return dropDownOptionsList(locator).size();
	}
}
	
	
	
	


