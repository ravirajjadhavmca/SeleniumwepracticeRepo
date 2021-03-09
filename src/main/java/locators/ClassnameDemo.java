package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassnameDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://login.yahoo.com/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.className("phone-no")).sendKeys("ravi@yahoo.com");  //classname can be duplicate elements. means class is a not unique.
		  
		

	}

}
