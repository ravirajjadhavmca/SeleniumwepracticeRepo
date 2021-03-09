package buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadiobutton {

  public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://learn.letskodeit.com/p/practice");
	    
	    List<WebElement> liElement=driver.findElements(By.xpath("//input[@type='radio']"));  //select the multiple radio buttons 
	    int radiocount=	liElement.size();
	    System.out.println("Total no. of radio buttons:- "+radiocount);
	    
	    for(int i=0;i<radiocount;i++)
	    {
	    	WebElement e1=liElement.get(i);
	    	e1.click();
	    	boolean b2=e1.isSelected();
	    	System.out.println(b2);
	    }
	    
	    //System.out.println("Total no. of buttons:- "+liElement.size());
 //	    for(WebElement e1:liElement)     //foreach loop
//       {
//    	   e1.click();
//    	  boolean b1= e1.isSelected();
//    	  System.out.println(b1);
//    	 
//       }
       Thread.sleep(5000);
       driver.quit();
	}

}
