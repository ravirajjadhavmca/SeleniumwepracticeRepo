package alertExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertsample3 {
@Test
public void alerthandling() throws InterruptedException {
	System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();	
 Thread.sleep(2000);
	Alert alert= driver.switchTo().alert();//ok button
	 
	String alertmsg= alert.getText();
	 System.out.println(alertmsg);
	// alert.accept(); //click on ok button
	 alert.dismiss();//click on cancle button
	 
	 if(alertmsg.equals("Press 'OK' or 'Cancel' button!"))
	 {
		 System.out.println("Ok button pressed");
		 } 
	 else
	 {
		 System.out.println("Cancle button pressed");
		  
	 }
	 Thread.sleep(3000);
	 driver.quit();
	 
	 
 
}
	
}
