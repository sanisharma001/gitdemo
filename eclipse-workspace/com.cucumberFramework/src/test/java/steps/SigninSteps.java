package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninSteps extends TestBase{
	
	
	@Given("^user is already in singin page$")
	public void user_is_already_in_singin_page()  {
		TestBase.initialization();
	}

	@When("^user wants to type \"([^\"]*)\" and \"([^\"]*)\" and click sign in button in order to sign in$")
	public void user_wants_to_type_and_and_click_sign_in_button_in_order_to_sign_in(String arg1, String arg2)  {
	 getSigninPage();
	 sip.typeEmail(arg1);
	 sip.typePassword(arg2);
	 sip.clickSignin();
	}

	@Then("^user wants to verify <userName> to validate correct sign in test$")
	public void user_wants_to_verify_userName_to_validate_correct_sign_in_test() {
	    getUserPage();
	    up.clickProfileImg();
	    String actual=up.verifyUserName();
	    Assert.assertEquals("sharmasani01", actual);
	    
	}



}
