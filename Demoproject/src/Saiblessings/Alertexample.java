package Saiblessings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");


		WebElement Alertboxicon=driver.findElement(By.xpath("(//img[@class=\"wp-categories-icon svg-image\"])[9]"));
		Alertboxicon.click();

		WebElement alertbox=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertbox.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();


		WebElement confirmalert=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirmalert.click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();


		WebElement promptbox=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptbox.click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("GOD, My mind is wavering and depressed... Please help me to get a job");
		alert3.accept();
		
		
		WebElement linebreaks=driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		linebreaks.click();
		Alert alert4=driver.switchTo().alert();
		alert4.accept();
		
		WebElement sweetalert=driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
		sweetalert.click();
		
		
		

	}

}
