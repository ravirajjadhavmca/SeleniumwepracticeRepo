package buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckboxButtons {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://learn.letskodeit.com/p/practice");
	    
	    List<WebElement> ch=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total no. of checkbox:- "+ch.size());
        for(WebElement e2:ch)
        {
        	e2.click();
        	boolean b2=e2.isSelected();
        	System.out.println(b2);
        }
        Thread.sleep(5000);
        driver.quit();
        
	}

}
