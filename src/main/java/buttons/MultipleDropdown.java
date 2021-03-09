package buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB");
	    WebElement monthdd=driver.findElement(By.id("month"));
	   Select mdd=new Select(monthdd);
	    
	   List<WebElement>monthlist= mdd.getOptions();
	  int totalmonth=monthlist.size();
	 System.out.println("Total month count is"+totalmonth);
   
	 for(WebElement ele:monthlist)	{
	  String monthname=ele.getText();
	  System.out.println("month name are "+ monthname);
  }

}
}