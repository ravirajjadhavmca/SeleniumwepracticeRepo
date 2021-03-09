package handleWindows;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowsHandleDemo {
	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.findElement(By.xpath("//a[text()=' Click this link to start new Tab '][2]")).click();
		Set<String> handler=driver.getWindowHandles(); //get windows id.
		Iterator<String>itr=handler.iterator();
		String parentwindowid=itr.next();
		System.out.println(parentwindowid);
		String childwindowid=itr.next();
		System.out.println(childwindowid);
		
	driver.switchTo().window(childwindowid);
	Thread.sleep(2000);
	String actualtitle="Facebook – log in or sign up";
	Assert.assertEquals("Facebook – log in or sign up", actualtitle);
   System.out.println(actualtitle);
   Thread.sleep(2000);
   driver.close();
	driver.switchTo().window(parentwindowid);
	System.out.println("parent window title "+driver.getTitle());
	Thread.sleep(4000);
	driver.quit();
	}

}
