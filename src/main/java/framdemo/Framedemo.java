package framdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo {

	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/testingpage/");
		int sizeofframe= driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of frames:- "+sizeofframe);	
		driver.switchTo().frame("do-it-iframe");
		driver.findElement(By.xpath("//input[@class='search-field']")).sendKeys("welcome to goa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String y=driver.getTitle();
		System.out.println(y);
driver.switchTo().defaultContent();

        driver.switchTo().frame("queries-iframe");
        driver.findElement(By.xpath("//input[@class='form-control' and @type='email']")).sendKeys("ravirajjadhavmca@gmail.com");
        driver.findElement(By.xpath("//input[@class='form-control' and @type='text']")).sendKeys("Raviraj Jadhav");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);
        driver.switchTo().defaultContent();
        
        
        
		driver.close();
	

	}

}
