package javaScriptExecutorByScrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDownDemo {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
//			driver.get("http://www.software-testing-tutorials-automation.com/2015/02/scroll-down-up-web-page-using.html");
		driver.get("https://www.creativebloq.com/web-design/parallax-scrolling-1131762");
		
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("scrollBy(1000,500)");        //scroll up and down by pixel.
	//je.executeScript("scrollBy(0,-500)");
	
	
	
	//((JavascriptExecutor)driver).executeScript("scroll(0,400)");   //scroll down by pixel.
	
	
	
 Thread.sleep(6000);
 driver.close();
	}

}
