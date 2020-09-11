package seleniuminterviewprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Differentwaystosearchngoogle {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		//searchbox.sendKeys(Keys.SHIFT+ "shirdi" +Keys.ENTER);
		//2. \n
		//searchbox.sendKeys("shirdi \n");
		//3. submit 
		
		searchbox.sendKeys("shirdi");
		//searchbox.submit();

		//4. robot class
		
		Robot robot =new Robot();
		robot .keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
