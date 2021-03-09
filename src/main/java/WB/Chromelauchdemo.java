package WB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Chromelauchdemo {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");	
		 driver=new ChromeDriver();
	
		 driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  // driver.findElement(By.id("loginbutton")).click();
	        String actual="Log in to Facebook";
			Assert.assertEquals("Log in to Facebook", actual);
			System.out.println(actual);
			driver.quit();
	    
	}

}

//static String path = System.getProperty("user.dir");
//System.setProperty("webdriver.chrome.driver", path + "//Seleniumwepractice//Browser//chromedriver_win32//chromedriver.exe");