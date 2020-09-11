package seleniuminterviewprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVSNavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//get method
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");

		WebElement myaccount=driver.findElement(By.xpath("(//a[@id='dropdownCurrency'])[2]"));
		myaccount.click();
		WebElement signup=driver.findElement(By.xpath("(//a[@class='dropdown-item tr'])"));
		signup.click();
		
		Thread.sleep(5000);


		//navigate
		driver.navigate().to("https://phptravels.net/login");

		WebElement myaccount1=driver.findElement(By.xpath("(//a[@id='dropdownCurrency'])[2]"));
		myaccount1.click();
		WebElement signup1=driver.findElement(By.xpath("(//a[@class='dropdown-item tr'])"));
		signup1.click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
	    driver.navigate().forward();
		
		// driver.close();
		




	}

}
