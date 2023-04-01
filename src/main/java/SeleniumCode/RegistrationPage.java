package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		By createAcc= By.id("createAccountSubmit");
		By sign = By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span");
		By save = By.id("continue");
		By val1 = By.xpath("//*[@id=\"auth-customerName-missing-alert\"]/div/div");
		By val2 = By.xpath("//*[@id=\"auth-phoneNumber-missing-alert\"]/div/div");
		By val3 = By.xpath("//*[@id=\"auth-password-missing-alert\"]/div/div");

		ElementUtil ele=new ElementUtil(driver);
		
		ele.doClick(sign);
		ele.doClick(createAcc);

		
		
//		driver.findElement(sign).click();
//		driver.findElement(createAcc).click();
		
		
		WebElement sv= driver.findElement(save);
		sv.click();
		
		
		String validation1= driver.findElement(val1).getText();
		System.out.println(validation1);
//		if(validation1.equals("Enter your name")) {
//			System.out.println("Pass");		
//		}
//		else {
//			System.out.println("Fail");
//		}
		
		if(validation1.contains("setwet")) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		String validation2 = driver.findElement(val2).getText();
		
		if(validation2.contains("number")) {
			System.out.println("Pass");		
			}
			else {
				System.out.println("Fail");
			}
		
		String validation3 = driver.findElement(val3).getText();
	
		if(validation3.contains("password")) {
			System.out.println("Pass");		
			}
			else {
				System.out.println("Fail");
			}
		
		
		
		
		
		
		
		
	}

}
