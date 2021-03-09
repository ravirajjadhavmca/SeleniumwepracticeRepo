package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartiallinktextDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://login.yahoo.com/");
		  driver.manage().window().maximize();
		  
		driver.findElement(By.partialLinkText("Forgot")).click();  //you can pass the only partial the begining part.
		

	}

}
