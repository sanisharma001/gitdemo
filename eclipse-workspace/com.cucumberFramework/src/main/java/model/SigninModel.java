package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninModel extends BaseModel {

	public SigninModel(WebDriver driver) {
		super(driver);
	}
	// email box xpath

	public WebElement emailAddress() {// *[@id='email']

		WebElement emailElement = driver.findElement(By.xpath("//*[contains(@id,'email')]"));

		return emailElement;

	}

	// password box xpath

	public WebElement password() {// *[@id='password']

		WebElement passwordElement = driver.findElement(By.xpath("//*[contains(@id,'password')]"));

		return passwordElement;

	}

	// signin button xpath

	public WebElement signin() {// *[@id='signin_btn']

		WebElement signinElement = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));

		return signinElement;

	}

}
