package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.SigninModel;

public class SigninPage extends SigninModel {
	public SigninPage(WebDriver driver) {

		super(driver);

	}

	// step.1

	// type email in the user name box

	public void typeEmail(String email) {

		WebElement e = emailAddress();

		e.sendKeys(email);

	}

	// step.2

	// type password in the password input box

	public void typePassword(String password) {

		WebElement p = password();

		p.sendKeys(password);

	}

	// step.3

	// click sighin button to sign in user page

	public void clickSignin() {

		WebElement s = signin();

		s.click();

	}

}
