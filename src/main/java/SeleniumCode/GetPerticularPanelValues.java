package SeleniumCode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPerticularPanelValues {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		//Need to write the customized xpath
		By panelLinks =By.xpath("//aside[@id='column-right']//a");
		
	List<String> eleList=	getAllLinks(panelLinks);
	System.out.println(eleList);
	System.out.println(eleList.contains("Login"));
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getAllLinks(By locator) {
		List<String> listValues = new ArrayList<String>();
		List<WebElement>  linksList =getElements(locator);
		for(WebElement e: linksList) {
		 String text=	e.getText();
		 listValues.add(text);
		}
		 return listValues;

	}

}
