package SeleniumCode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	// need to create a constructor to pass the driver
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doElemenIsDisplyed(By locator) {
		return getElement(locator).isDisplayed();
	}

	// get attribute utility for single field
	public String getAttributeValue(By locator, String attVal) {
		return getElement(locator).getAttribute(attVal);
	}

	// get attribute utility for all links and images field
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void getElementAttributes(By locator, String eleVal) {
		List<WebElement> ele = getElements(locator);
		int count = ele.size();
		System.out.println(count);
		for (WebElement e : ele) {
			String text = e.getAttribute(eleVal);
			System.out.println(text);
		}
	}

	// to get the count of links in web page utility
	public int getElementListCount(By locator) {
		int count = getElements(locator).size();
		System.out.println(count);
		return count;
	}

	public List<String> getAllLinks(By locator) {
		List<String> listValues = new ArrayList<String>();
		List<WebElement>  linksList =getElements(locator);
		for(WebElement e: linksList) {
		 String text=	e.getText();
		 listValues.add(text);
		}
		 return listValues;
	
	}
	
	//select dropdown utiliy
	 public  void doselectDrodownByIndex(By locator, int index) {
			Select s = new Select(getElement(locator));
			s.selectByIndex(index);
		}
		public  void doselectDrodownByValue(By locator, String Value) {
			Select s = new Select(getElement(locator));
			s.selectByValue(Value);
		}
		public void doselectDrodownByVisibleText(By locator, String Value) {
			Select s = new Select(getElement(locator));
			s.selectByVisibleText(Value);
		}
}
