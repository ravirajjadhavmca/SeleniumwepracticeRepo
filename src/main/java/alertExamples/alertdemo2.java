package alertExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertdemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","F:\\Selenium setup\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
		 
		 driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		 driver.findElement(By.xpath("//button[text()='Show Me Prompt']")).click();
		 Alert alert= driver.switchTo().alert();
		 String textmsg=alert.getText();
		 System.out.println(textmsg);
		 if(textmsg.equals("Your Name Please")){
			System.out.println("msg is correct");
		 }
		 else{ 
			 System.out.println("msg is incorrect");
			 
		 }
		 alert.sendKeys("Ravi");   //chrome browser does not support sendkeys()method that why used firefox browser
		
		 Thread.sleep(4000);
		 alert.accept();
	   driver.close();
	}

}
