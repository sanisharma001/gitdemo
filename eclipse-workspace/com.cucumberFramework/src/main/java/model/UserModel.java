package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserModel extends BaseModel {

	public UserModel(WebDriver driver) {
		super(driver);
	}// set yourself active element xpath

	public WebElement setYourselfActiveElement() {

		WebElement syactiveElement = driver

				.findElement(By.xpath("//div[contains(@class,'c-menu_item__label') and text()='Set yourself as ']"));

		return syactiveElement;

	}



	// verify status indicator

	public WebElement StatusIndicatorElement() {

		wait.until(ExpectedConditions

				.visibilityOfElementLocated(By.xpath("//*[contains(@class,'p-ia__main_menu__user__presence')]")));

		WebElement statusIndicator = driver

				.findElement(By.xpath("//*[contains(@class,'p-ia__main_menu__user__presence')]"));

		return statusIndicator;

	}



	public WebElement generalElementButton() {// *[@class='p-ia__view_header__info']/div/div/button

		WebElement generalElement = driver.findElement(

				By.xpath("//button[contains(@class,'c-button-unstyled p-classic_nav__model__title__name__button')]"));

		return generalElement;

	}



	// click profile image to validate user name

	public WebElement profileImgElement() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(

				"//span[contains(@class,'p-ia__nav__user__avatar c-avatar')]/child::img[@class='c-avatar__image']")));



		WebElement piElement = driver.findElement(By.xpath(

				"//span[contains(@class,'p-ia__nav__user__avatar c-avatar')]/child::img[@class='c-avatar__image']"));

		return piElement;

	}



	// channels element xpath

	public WebElement ChannelsElement() {

		WebElement createChannle = driver.findElement(By.xpath(

				"//*[@class='p-channel_sidebar__section_heading p-channel_sidebar__drop_target_indicator']/child::span//following-sibling::button[@type='button']"));

		return createChannle;

	}



	// user name xpath

	public WebElement userNameElement() {

		WebElement userName = driver.findElement(By.xpath("//span[contains(@class,'p-ia__main_menu__user__name')]"));

		return userName;

	}



	public List<WebElement> allChannel() {



		List<WebElement> all = driver

				.findElements(By.xpath("//*[contains(@data-qa-channel-sidebar-channel-type,'channel')]"));

		return all;



	}



	// All channel list

	public List<WebElement> getAllChannelList() {

		allChannel().size();



		return allChannel();

	}



	// validate channel has been created or not

	public WebElement channelNameElement() {

		WebElement channelNamElement = driver.findElement(By.xpath("//*[text()='learningjavachannel']"));

		return channelNamElement;

	}



	public WebElement createAChannelElement() {

		WebElement createAchannel = driver.findElement(By.xpath("//div[@class='c-menu__items']/div[4]"));

		return createAchannel;

	}

	

	//post massage locators

	public WebElement generalTextBox() {

		WebElement gtElement = driver.findElement(By.xpath("//div[contains(@class,'ql-editor ql-blank')]"));

		return gtElement;

	}



	public WebElement testPostElement() {

		WebElement tpElement = driver

				.findElement(By.xpath("//i[contains(@class,'c-icon c-icon--paperplane-filled')]"));

		return tpElement;

	}

	

	public List<WebElement> validateMassageDisplayElement() {

		

		List<WebElement> allMassageElement=driver.findElements(By.xpath("//div[text()='We can automate the car']"));

		

        //System.out.println("Current date and time is"+currentDate);

	    return allMassageElement; 

	}

	

	public WebElement currentMassageTime() {

		WebElement massageTime=driver.findElement(By.xpath("//span[text()='11:39 PM']"));

		return massageTime;

	}

}
