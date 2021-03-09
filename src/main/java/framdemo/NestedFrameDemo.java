package framdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Nested frame means frame within a frame.
public class NestedFrameDemo {


	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		int sizeofframe= driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of frames:- "+sizeofframe);	
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Goa best places");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		Select sel =new Select(driver.findElement(By.id("animals")));
		sel.selectByVisibleText("Avatar");
		List<WebElement>li=sel.getOptions();
   for(WebElement ele:li){
	System.out.println("all dropdownoptions"+ele);
}
		driver.switchTo().defaultContent();
		  String main_text=driver.findElement(By.xpath("(//span)[3]")).getAttribute("innerHTML");
		  System.out.println(main_text);
		
	Thread.sleep(5000);
	driver.close();
		
//		  driver.switchTo().frame("frame2");
//		  System.out.println("Switched to frame2");
//		  Select animals =new Select(driver.findElement(By.id("animals")));
//		  animals.selectByIndex(2);
//		  
//		  driver.switchTo().defaultContent();
//		  System.out.println("Switched to default content7");
//		  String main_text=driver.findElement(By.xpath("(//span)[3]")).getAttribute("innerHTML");
//		  System.out.println(main_text);
//		  


	}

}
