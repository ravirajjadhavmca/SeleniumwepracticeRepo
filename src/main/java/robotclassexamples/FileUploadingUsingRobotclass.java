package robotclassexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class FileUploadingUsingRobotclass {
     
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();    //launch chrome
	    
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='file']")).click();
		Thread.sleep(3000);
	
	Robot robot=new Robot();
	
	StringSelection selection=new StringSelection("E:\\priyanka(automation 4 ndew.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
		
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.close();
	}

}
