package WB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorerdriver {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","F:\\Selenium Software\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
    
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		  
		 String title= driver.getTitle();
		 
		 System.out.println("title is + title");
		 
		 if(title.equalsIgnoreCase("google")){
			 System.out.println("title is matched");
		 }
		 else {
			 System.out.println("title is mitchmatched");
		 }
			  
		 driver.close();
		}

	}

