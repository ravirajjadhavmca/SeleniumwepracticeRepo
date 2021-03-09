package alertExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Alert alert=driver.switchTo().alert();    //alert method return the alert class reference. to handle the alert pop-up we need
			String alertmsg=alert.getText();           // to switch the controll from background screen to alert pop-up screen. 
			System.out.println(alertmsg);
			if(alertmsg.equals("Please enter a valid user name"))
			{
				System.out.println("correct alert msg");
			}
			else
			{
				System.out.println("Wrong alert msg");
			}
	      alert.accept();      //click on ok button used by accept() method.
	      //alert.dismiss(); //click on cancel button used by dismiss()method
	      Thread.sleep(5000);
	      driver.close();
	}

}
