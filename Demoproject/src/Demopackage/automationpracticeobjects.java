package Demopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class automationpracticeobjects {
	
	@FindBy(className="login")
	public static WebElement login;
	
	@FindBy(xpath="//input[@name='email_create']")	
	public static WebElement email;
			
	@FindBy(xpath="//*[@id='SubmitCreate']")
	public static WebElement submit;
	
	@FindBy(xpath="//div[@id='uniform-id_gender2']")
	public static WebElement radio;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	public static WebElement lastname;
	
	@FindBy(name="passwd")
	public static WebElement password;
	
	@FindBy(id="days") WebElement dayslist;
	public void dayslist(int index)
	{
		Select selectd=new Select(dayslist);
		selectd.selectByIndex(index);
	}
	
	
	
	
	@FindBy(id="months")
	public static WebElement month;
	
	@FindBy(id="years")
	public static WebElement year1;
	
	/*
	WebElement year=driver.findElement(By.id("years"));
	Select selecty=new Select(year1);
	selecty.selectByValue("2010");
}*/
	
}
