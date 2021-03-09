package WB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriverlaunch {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","F:\\Selenium setup\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	   String title= driver.getTitle();
	    System.out.println("The page title is : "+title);
        if(title.equalsIgnoreCase("google"))
        {
        	System.out.println("Title is matched");
        }
        else
        {
        	System.out.println("Title is not matched");
        }
driver.close();        
	}

}
 