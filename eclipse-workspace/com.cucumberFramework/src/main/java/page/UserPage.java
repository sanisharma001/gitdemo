package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.UserModel;

public class UserPage extends UserModel{
	public UserPage(WebDriver driver) {

		super(driver);

	}

	

	// click profile image

		public void clickProfileImg() {

			WebElement pImage = profileImgElement();

			pImage.click();

		}



		// step.6

		// validate correct user name

		public String verifyUserName() {

			String userName = userNameElement().getText();

			System.out.println("sign in page validation with correct user name ===>" + userName);

			return userName;

		}



		//

		public void clickSetActive() {

			WebElement st = setYourselfActiveElement();

			st.click();

		}



		public boolean verifyStatusIndicator() {

			String statusIndicator = StatusIndicatorElement().getText();



			if (statusIndicator.equalsIgnoreCase("Away")) {

				System.out.println(statusIndicator);

				clickSetActive();

			} else if (statusIndicator.equalsIgnoreCase("Active")) {

				System.out.println(statusIndicator);

				actions.moveToElement(generalElementButton()).click().build().perform();

			}

			return true;



		}



		public void channelHover() {

			WebElement cn = ChannelsElement();

			actions.moveToElement(cn).contextClick().build().perform();

		}



		public void addChannel(String channelName) {



			channelHover();

			createAChannelElement().click();



		}

		// before creating channel validate the desire channel is not their



			public boolean isChannelPresent(String channelName) {

				boolean result = false;

				for (int i = 0; i < getAllChannelList().size(); i++) {

					String channel = getAllChannelList().get(i).getText();

					if (channel.equalsIgnoreCase(channelName)) {

						result = true;

						break;

					}



				}

				return result;

			}



		public void channelCreate(String channelName) {

			if(!isChannelPresent(channelName)) {

				addChannel(channelName);

			}

		}

		

		public void deleteChannel() {

			WebElement channelElement=channelNameElement() ;

			actions.moveToElement(channelElement).contextClick().build().perform();

		}

		//post massage page methods

		

		

		

		

		public void typeGeneralTextbox(String text) {

			WebElement generalText = generalTextBox();

			generalText.sendKeys(text);

		}



		public void clickPost() {

			WebElement cpElement = testPostElement();

			cpElement.click();

		}



		public boolean verifyMassagePost() {

			int allMassage = validateMassageDisplayElement().size();

			for (int i = 0; i < allMassage; i++) {

				String massage = validateMassageDisplayElement().get(i).getText();

				if (massage.equalsIgnoreCase("We can automate the car")) {

					

					System.out.println("This my unique massage===>"+massage);



					break;

				}



			}



			return true;

		}



		/*public double takeCurrentTime() {

			Object dateFormat;
			Object date;
			String currentDate= dateFormat.format(date);

		int localTime=Integer.parseInt(currentDate);

		localTime=localTime*60*60;

		System.out.println(localTime);

	    return localTime;

		}

		public double getMassageTime() {

			String massageTime=currentMassageTime().getText();

			int statusTime=Integer.parseInt(massageTime);

			statusTime=statusTime*60*60;

			System.out.println(statusTime);

			return statusTime;

		}

		

		public boolean difference() {

			boolean result=false;

			if(!(takeCurrentTime()-getMassageTime()<=10)) {

				return true;

			}

			return result;

		}*/

		

		


}
