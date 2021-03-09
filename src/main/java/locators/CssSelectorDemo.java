package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#login-username")).sendKeys("rvj@yahoo.com");
		driver.findElement(By.cssSelector("#login-signin")).click();
		driver.close();
		

	}

}
