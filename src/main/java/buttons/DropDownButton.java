package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB");
	    
	    WebElement day=driver.findElement(By.id("day"));    
	    WebElement month=driver.findElement(By.id("month"));
	    WebElement year=driver.findElement(By.id("year"));
	    
	    Select select=new Select(day);
	    select.selectByVisibleText("11");
	    
	    Select select1=new Select(month);
	    select1.selectByVisibleText("Aug");
	    
	    Select select2=new Select(year);
	    select2.selectByVisibleText("1991");
	    
	//    selectValueFromDropDown(day,"11");
//	    selectValueFromDropDown(month,"Aug");
//	    selectValueFromDropDown(year,"1991");
	    
//	     String dob="11-Aug-1991";
//	    String dobArr[]= dob.split("-");
//	    
//	    selectValueFromDropDown(day,dobArr[0]);
//	    selectValueFromDropDown(month,dobArr[1]);
//	    selectValueFromDropDown(year,dobArr[2]);
Thread.sleep(6000);
//	}
//	public static void selectValueFromDropDown(WebElement element,String value){
//	Select select=new Select(element);
//	select.selectByVisibleText(value);
	
	driver.close();
	}
}
