package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LocatorName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		WebElement dname=driver.findElement(By.name("username"));
		dname.sendKeys("ravi6465@yahoo.com");
		
		WebElement signinbutton=driver.findElement(By.name("signin"));    //name is a unique locator.
        signinbutton.click();
        Thread.sleep(2000);
       // String title=driver.getTitle();
        //System.out.println(title);
        String actualtitle="Yahoo";
        Assert.assertEquals("Yahoo",actualtitle);
        System.out.println(actualtitle);
        driver.close();
     
	}

}
