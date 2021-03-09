 package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabDemo {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();    //launch chrome
	    driver.manage().window().maximize(); //maximize windows
	    driver.get("https://www.facebook.com/");
	    
	    Actions act=new Actions(driver);
	    driver.findElement(By.id("email")).sendKeys("nvj6465@gmail.com");
	    
	    act.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("nvj1234").sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(5000);
	    driver.close();
	    
	}

}
