package SeleniumCode;

import org.openqa.selenium.By;

public class FacebookTest {

	public static void main(String[] args) {

		String browserName="Chrome";
		BrowserUtility brUtil= new BrowserUtility();

		brUtil.initDriver(browserName);
		
		brUtil.launchUrl("https://Facebook.com");
		
		By uname = By.xpath("");
		
		String actTitle=brUtil.getPageTitle();
		if(actTitle.contains("Facebook – log in or sign up")) {
			System.out.println("Title name is correct");	
		}
		else {
			System.out.println("Title name is wrong");
		}
		
		String actUrl=brUtil.getPageUrl();
		if(actUrl.contains("facebook")) {
			System.out.println("Url ---- Pass");
		}
		else {
			System.out.println("Url --- Fail");
		}
				
		brUtil.quitBrowser();
	}

}
