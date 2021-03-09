package alertExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBrowsefileDemo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:\\Selenium setup\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://html.com/input-type-file/");
	//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\");
	Alert alertmsg=driver.switchTo().alert();
	System.out.println(alertmsg.getText());
	
	
	}

}
