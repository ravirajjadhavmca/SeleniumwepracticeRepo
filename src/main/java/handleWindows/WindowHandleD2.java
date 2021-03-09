package handleWindows;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowHandleD2 {
	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.findElement(By.xpath("//a[@name='link1'][3]")).click();
		Set<String>handle1=driver.getWindowHandles();
		ArrayList<String>arr=new ArrayList<String>(handle1);
		driver.switchTo().window(arr.get(1));
		System.out.println("title"+driver.getTitle());
		String actualtitle="Yahoo";
		Assert.assertEquals(actualtitle,"Yahoo");
		System.out.println(actualtitle);
		
		driver.findElement(By.xpath("//a[text()='News']")).click();
		driver.switchTo().window(arr.get(2));
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(arr.get(0));
		driver.quit();
	}

}
