package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleRadioButton {

	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://learn.letskodeit.com/p/practice");
	    
	    WebElement e2=driver.findElement(By.xpath("//input[@id='benzradio']"));
	    e2.click();
    boolean b2= e2.isSelected();	
    System.out.println(b2);
    driver.close();
	    }
	
	
	}


