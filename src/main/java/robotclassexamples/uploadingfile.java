package robotclassexamples;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadingfile {

	static WebDriver driver;
	
    public static void main(String args[]) throws Exception
    {
    	System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
//		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        WebElement button=driver.findElement(By.xpath("//input[@id='imagesrc'and @type='file']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",button);
        
        Robot robot = new Robot();
        robot.setAutoDelay(2000);

        StringSelection selection = new StringSelection("E:\\RVJ.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}

	