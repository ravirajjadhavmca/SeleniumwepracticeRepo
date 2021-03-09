package webTableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandling1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
		    Thread.sleep(1000);
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Admin")).click();
		   driver.findElement(By.id("menu_admin_UserManagement")).click();
		   driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		   
		   
		  List<WebElement>li= driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th")); //get columns heading
		  System.out.println("Total number of columns names"+li.size());
		  for(WebElement colname:li ){
			  String CN=colname.getText();
			  System.out.println(CN);
		  }
		   
		   WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));    //GET ONLY all table data

			   List<WebElement> listOfRows = table.findElements(By.tagName("tr"));  //get all rows data

			   System.out.println("Total number of rows" +listOfRows.size());
			   
                   for(WebElement Rows:listOfRows){
                	 String R= Rows.getText();
                	 System.out.println(R);
                   }
			   
			   List<WebElement> listOfCol = table.findElements(By.tagName("td")); //get all cols data
			   System.out.println("Total number of columns"+listOfCol.size());
			   for(WebElement cols:listOfCol){
              	 String C= cols.getText();
              	 System.out.println(C);
                 }
			   
			   driver.findElement(By.xpath("//a[text()='Alice.Duval']//parent::td[@class='left']//preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_31']")).click();
			   Thread.sleep(1000);
			   
			   driver.close();
	}
		   

}
