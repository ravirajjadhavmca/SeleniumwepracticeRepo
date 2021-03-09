package buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MonthDropDownButton {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB");
	    
	    WebElement month_dropdown=driver.findElement(By.id("month"));
	    
	    Select month_dd=new Select(month_dropdown);
	    List<WebElement>month_list=month_dd.getOptions();
	    
	    int total_month=month_list.size();
        Assert.assertEquals(total_month, 12);
	    
	    System.out.println("Total no. of months:- "+total_month);
        
        for(WebElement ele:month_list)
        {
        	String month_name=ele.getText();
        	System.out.println("Months name:- "+month_name);
        }
	driver.quit();
	}
	

}
