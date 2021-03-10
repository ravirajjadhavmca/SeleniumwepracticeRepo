 package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();    //launch chrome
	    driver.manage().window().maximize(); //maximize windows
	    
	    driver.get("https://api.jquery.com/dblclick/");
	    System.out.println("Launch the url ");
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	    Actions act=new Actions(driver);
	    WebElement element=driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"));
	    act.doubleClick(element).perform();
	    
	    Thread.sleep(5000);
	    driver.close();

	}

}
