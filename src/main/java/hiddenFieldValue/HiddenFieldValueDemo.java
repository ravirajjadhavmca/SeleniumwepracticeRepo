package hiddenFieldValue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HiddenFieldValueDemo 
{
	 
	@Test
	public void setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	      driver.get("http://www.uitestpractice.com/Students/Index");
	      driver.manage().window().maximize();
	      
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      driver.findElement(By.xpath("//tbody//tr[2]//td[4]//button[1]")).click();
	    String s= js.executeScript("return document.getElementById('Id').value").toString();
	    System.out.println(s);
	    Thread.sleep(5000);
        driver.quit();
     

	      
}
}