package TestNgConcepts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	@BeforeTest
	public void initBroswe() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	
	@Test
	public void getUrlTest() {
		String actualTitle = driver.getCurrentUrl();
		System.out.println(actualTitle);
	}
	
	@Test
	public void getTtitle() {
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
	}
	
	@AfterTest
	public void Logout() {
		driver.quit();
	}

}
