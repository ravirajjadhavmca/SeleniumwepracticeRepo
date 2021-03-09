package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeDirectory {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
//		driver.findElement(By.xpath("//input[@id='searchDirectory_emp_name_empName']")).sendKeys("David Morris");
//		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

	//	driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
	//	driver.findElement(By.xpath("//select[@id='searchDirectory_job_title']")).click();
	//	driver.findElement(By.xpath("//option[@value='22']")).click();
	//	driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		driver.findElement(By.xpath("//input[@id='MP_link']")).click();
		driver.findElement(By.xpath("//input[@id='buyBtn1']")).click();
		//driver.findElement(By.xpath(""))
	
	}

}
