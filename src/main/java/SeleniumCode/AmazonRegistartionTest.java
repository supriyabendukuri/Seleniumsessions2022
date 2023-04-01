package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonRegistartionTest {

	public static void main(String[] args) {
		
		String browserName= "Chrome";
		BrowserUtility brUtil = new BrowserUtility();
		WebDriver driver=  brUtil.initDriver(browserName);
		
		brUtil.launchUrl("https://www.amazon.in/");
		
		String actTitle=brUtil.getPageTitle();
		if(actTitle.contains("Amazon")) {
			System.out.println("title --- pass");
		}
		else {
			System.out.println("title--- fail");
		}
		
		brUtil.getPageUrl();
		
		//By locators
		By signIn= By.linkText("Sign in");
		By createAcc= By.id("createAccountSubmit");
		By yourName= By.id("ap_customer_name");
		By mobile= By.id("ap_phone_number");
		By password= By.id("ap_password");
		By text=By.id("mobileClaimDisclosureMessageRelaxed");
		By links=By.tagName("a");
		By img = By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i[1]");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doClick(signIn);
		eleUtil.doClick(createAcc);
		eleUtil.doSendkeys(yourName, "Selenium");
		eleUtil.doSendkeys(mobile, "Testing");
		eleUtil.doSendkeys(password, "paass@1213");
		String textamazon = eleUtil.doGetText(text);
		System.out.println(textamazon);
		
		//To get the all links in a page
		List<WebElement> allLinks= driver.findElements(links);
		//System.out.println(allLinks.size());
		//another method
		int linksCount =allLinks.size();
		System.out.println(linksCount);

		//first way
//		for (WebElement e : allLinks) {
//			System.out.println(e.getText());
//		}
		
		// second way
//		for(int i=0; i<allLinks.size(); i++) {
//			System.out.println(i+"."+allLinks.get(i).getText());
//		}
		
		//third way
		for(int i=0; i<linksCount; i++) {
			String linksText = allLinks.get(i).getText();
			
			if(linksText.length()>0) {
			System.out.println(i+"."+linksText);
			
			}
		}
		
		if(eleUtil.doElemenIsDisplyed(img)){
			System.out.println("element is present");
		}
		
		//brUtil.quitBrowser();
		
		
		
		
		
	}

}
