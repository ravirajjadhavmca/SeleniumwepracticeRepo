package buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();    //launch chrome
	    driver.manage().window().maximize(); //maximize windows
	    driver.manage().deleteAllCookies(); //delete all cokies
	    driver.get("");

	}

}
