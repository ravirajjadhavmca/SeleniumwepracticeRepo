package dynamicwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitywaitdemo {
    static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		// Create object of WebDriverWait class and it will wait max of 20 seconds.
		// By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);  //its class

		// Here we will wait until element is visible, if element is visible then it will return web element
		// or else it will throw exception
		boolean status=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))).isDisplayed();

		// if element found then we will use- In this example I just called isDisplayed method
		//boolean status = element.isDisplayed();
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}
 driver.close();
		
		

	}

}
