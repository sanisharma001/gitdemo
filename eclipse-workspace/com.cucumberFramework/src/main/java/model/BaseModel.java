package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel {
	public WebDriver driver;

	public static Actions actions;

	static WebDriverWait wait;

	public DateFormat dateFormat ;

	public Date date;

	public BaseModel(WebDriver driver) {



	this.driver=driver;

	actions=new Actions(driver);

	wait=new WebDriverWait(driver, 10);

	dateFormat = new SimpleDateFormat("HH:mm:ss");

	

	//date = new Date();



}
}
