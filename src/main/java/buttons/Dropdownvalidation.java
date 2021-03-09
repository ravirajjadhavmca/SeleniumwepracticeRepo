package buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownvalidation {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB");
	  List<WebElement>monthlist=driver.findElements(By.xpath("//select[@id='month']//option"));
	  System.out.println(monthlist);
	  for(int i=0;i<monthlist.size();i++)
	  {
		System.out.println(monthlist.get(i).getText());
		if(monthlist.get(i).getText().equals("jun")){
		break;
		}
		
	  }}
	}

