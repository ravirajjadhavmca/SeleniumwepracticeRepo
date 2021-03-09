package toolTipDemo;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTipexamples {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoqa.com/tool-tips/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@id='toolTipButton']"))).perform();
		
		String showmsg=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println(showmsg);
		
		Assert.assertTrue(showmsg.contains("You hovered over the Button"));
		

	}

}
