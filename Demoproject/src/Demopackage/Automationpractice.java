package Demopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automationpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\New\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	System.out.println("Currently browser is in : " + url);
	String title=driver.getTitle();
	System.out.println("Title is : " + title);
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	PageFactory.initElements(driver, automationpracticeobjects.class);
	
	automationpracticeobjects.login.click();
	automationpracticeobjects.email.sendKeys("izsekar@gmail.com");
	automationpracticeobjects.submit.click();
	
	automationpracticeobjects.radio.click();
	automationpracticeobjects.firstname.sendKeys("shoppinguser");
    automationpracticeobjects.lastname.sendKeys("freak");
    automationpracticeobjects.password.sendKeys("demouser");
    //automationpracticeobjects.
  
	
	/*WebElement password=driver.findElement(By.name("passwd"));
	password.sendKeys("demouser");
	
	WebElement daysdrop=driver.findElement(By.id("days"));
	Select selectd=new Select(daysdrop);
	selectd.selectByValue("3");
	
	Thread.sleep(2000);
	
	WebElement month=driver.findElement(By.id("months"));
	Select selectm=new Select(month);
	selectm.selectByIndex(5);
	
	WebElement year=driver.findElement(By.id("years"));
	Select selecty=new Select(year);
	selecty.selectByValue("2010");
	
	webelement address1=driver.find
	*/
	
	
	
	
	
	
	
	
	
	
	

	
	

	}

}
