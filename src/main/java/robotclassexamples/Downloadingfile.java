package robotclassexamples;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.sun.glass.events.KeyEvent;

public class Downloadingfile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:\\Selenium setup\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//	
//		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();

			
		    driver.get("http://demo.automationtesting.in/FileDownload.html");
		    driver.findElement(By.id("textbox")).sendKeys("downloading file");
		    driver.findElement(By.id("createTxt")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("link-to-download")).click();
		    Thread.sleep(5000);
		    Robot robot=new Robot();
		    robot.keyPress(KeyEvent.VK_DOWN);
		    Thread.sleep(2000);
		    robot.keyPress(KeyEvent.VK_TAB);
		    Thread.sleep(2000);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    System.out.println("download successfully");
		    
		    Thread.sleep(4000);
   
		    
		    
	}

}
