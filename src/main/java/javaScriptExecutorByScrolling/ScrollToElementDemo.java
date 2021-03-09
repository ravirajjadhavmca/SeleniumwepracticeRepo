package javaScriptExecutorByScrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementDemo {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
//			driver.get("http://www.software-testing-tutorials-automation.com/2015/02/scroll-down-up-web-page-using.html");
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	
		WebElement element=driver.findElement(By.linkText("VBScript"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
	    je.executeScript("arguments[0].scrollIntoView();",element);     //scroll down by visibility of element.
	    
	

	}

}
