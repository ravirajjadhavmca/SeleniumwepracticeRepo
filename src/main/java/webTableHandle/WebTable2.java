package webTableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	   // driver.findElement(By.xpath("//a[text()='Aatmaram']")).click();
	    //Thread.sleep(10000);
	    
	   // List<WebElement> li=driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th"));   
	    
	}

}
