package webTableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1] 
		
		
		driver.findElement(By.xpath("//table[@id='customers']"));  //only table xpath
		
		
		
		
		List<WebElement> rows= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowCount= rows.size();
		System.out.println("Total rows in webtable:- " +rowCount);
		
		                                              //First column print.
		
		String beforeXpath ="//*[@id='customers']/tbody/tr[";
		String afterXpath ="]/td[1]";
		
		for(int i=2; i<=7; i++)
		{
			String actualXpath = beforeXpath+i+afterXpath;
			WebElement element= driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Island Trading"))
			{
				System.out.println("Company name:-" +element.getText()+ "   Element is found   " + "At Position:-" +(i-1) );
				break;
				
			}
		}
		
		System.out.println("******************");

		
		//*[@id="customers"]/tbody/tr[1]/th[2]    //second column print.
		
		String afterXpathContact ="]/td[2]";
		for(int i=2; i<=7; i++)
		{
			String actualXpath = beforeXpath+i+afterXpathContact;
			WebElement element= driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
			
		}
		
		System.out.println("********************");
		
		//*[@id="customers"]/tbody/tr[1]/th[3]      //Third column print
		
		String afterXpathCountry ="]/td[3]";
		for(int i=2; i<=7; i++)
		{
			String actualXpath = beforeXpath+i+afterXpathCountry;
			WebElement element= driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
			
		}
		
		
		//handle webtable columns:-
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		String columnBeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
		String columnAfterXpath= "]";
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int colcount= cols.size();
		System.out.println("Total number of column Count:- " +colcount);
		//driver.close();
		
	}
	
	

}
