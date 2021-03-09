package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementDemo {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();    //launch chrome
	    driver.manage().window().maximize(); //maximize windows
	    driver.get("https://www.spicejet.com/");
	    
	    Actions act=new Actions(driver);
	 //   driver.switchTo().frame(driver.findElement(By.xpath("destination_publishing_iframe_spicejet_0")));
	    act.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
	    driver.findElement(By.xpath("//a[@href='https://book.spicejet.com/RetrieveBooking.aspx?AddSeat=true']")).click();
	    
	    Thread.sleep(5000);
	    driver.close();
	    
	}

}
