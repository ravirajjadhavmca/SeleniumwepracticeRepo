package handleWindows;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandles {
	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ak.staticimgfarm.com/images/vicinio/chrome/spent/images/favicon/CNL.ico");
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id:- "+parent);
		
     //  driver.findElement(By.xpath("//img[@title='Amazon']"))
        
		
	}

}
