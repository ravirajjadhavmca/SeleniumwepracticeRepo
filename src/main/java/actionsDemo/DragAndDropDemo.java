package actionsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();    //launch chrome
	    driver.manage().window().maximize(); //maximize windows
	    driver.get("https://jqueryui.com/droppable/");
	    
	    //dynamic wait
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.switchTo().frame(0);
	    Actions act=new Actions(driver);
	    act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
	    Thread.sleep(5000);
	    driver.close();
	    
	}

}
