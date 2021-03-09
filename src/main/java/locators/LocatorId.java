package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");  //java.lang.IllegalStateException
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	driver.manage().window().maximize();
	
  // WebElement username=driver.findElement(By.id("login-username"));   //id is a unique locator.   //NoSuchElementException
 //  username.sendKeys("raviraj@yahoo.com");
	
	driver.findElement(By.cssSelector("#login-username"));    //css selector id locator
   
   WebElement lbutton=driver.findElement(By.id("login-signin"));
	lbutton.click();
	driver.close();
	
  

	}

}
