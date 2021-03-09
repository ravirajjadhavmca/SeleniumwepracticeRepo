package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckboxButtun {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://learn.letskodeit.com/p/practice");
	    
	    WebElement e3=driver.findElement(By.xpath("//input[@id='bmwcheck']"));
	    e3.click();
	    
	    boolean b3=e3.isSelected();
	    System.out.println(b3);
	   Thread.sleep(2000);
	   driver.close();
	    

	}

}
