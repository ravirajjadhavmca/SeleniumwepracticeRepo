package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://register.freecrm.com/register/");
	    
	    //isDisplayed() method is applicable for all the element.
	   boolean b1= driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	   System.out.println(b1);
	   
	   //isEnabled() method 
	   boolean b2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	   System.out.println(b2);
	   
	   //Select i agree checkbox
	   driver.findElement(By.id("terms")).click();
	   boolean b3=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	   System.out.println(b3);
	   
	   //isSelected() method 
	   boolean b4=driver.findElement(By.name("terms")).isSelected();
	   System.out.println(b4);
	   
	   
	   //de-select checkbox
	   driver.findElement(By.name("terms")).click();
	  boolean b5= driver.findElement(By.name("terms")).isSelected();
	   System.out.println(b5);
	   driver.quit();	
	}

}
