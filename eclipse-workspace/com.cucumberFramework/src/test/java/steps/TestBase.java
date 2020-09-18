package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.SigninPage;
import page.UserPage;

public class TestBase {
	static WebDriver driver;
	static SigninPage sip;
	static UserPage up;
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://automationsteps.slack.com/?redir=%2Fgantry%2Fclient");
		driver.manage().window().maximize();
	}
	
	public SigninPage getSigninPage() {
		sip=new SigninPage(driver);
		return sip;
	}
	
	public UserPage getUserPage() {
		up=new UserPage(driver);
		return up;
	}
	
	
	
	
	

}
