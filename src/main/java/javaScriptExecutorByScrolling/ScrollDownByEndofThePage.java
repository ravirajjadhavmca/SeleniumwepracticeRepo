package javaScriptExecutorByScrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByEndofThePage {

	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
//			driver.get("http://www.software-testing-tutorials-automation.com/2015/02/scroll-down-up-web-page-using.html");
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
	JavascriptExecutor je=(JavascriptExecutor)driver;
	
	//scroll down by end of the page.
	je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
Thread.sleep(6000);
driver.close();

	}

}
