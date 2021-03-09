package buttons;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe" );
	    driver=new ChromeDriver();    //launch chrome
	    driver.manage().window().maximize(); //maximize windows
	    driver.manage().deleteAllCookies(); //delete all cokies
	    
	            //dynamic wait
	    	//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");    //enter url
	    
//	    WebElement button=driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"));
//	    button.click();
//	    
//	  WebElement b=driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label//input[@value='jQuery']"));
//	   b.click();
//	   boolean b1=b.isDisplayed();
//	   System.out.println(b1);
//	   WebElement bb=driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label//input[@value='Bootstrap']"));
//	   bb.click();
//	   Thread.sleep(2000);
//	   boolean b2=b.isDisplayed();
//	   System.out.println(b2);
//	 
	   Thread.sleep(2000);
	   
	  
			   
	    WebElement button=driver.findElement(By.xpath("//button[contains(@class,'multiselect') and @type='button']"));
	    button.click();
	   List<WebElement> list=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
	    System.out.println(list.size());
	  
//	   for(int i=0; i<list.size();i++)  //  //select all the checkbox options
//	    {
//	    	System.out.println(list.get(i).getText());
//	      list.get(i).click();   
//	    }
//	   
	   for(WebElement e:list){
		  e.click();
		 String t= e.getText();
		 System.out.println(t);
		 boolean b= e.isSelected();
		  System.out.println(b);
		   
	   }
	   
Thread.sleep(3000);
	}
}
//	    
//	    for(int i=0; i<list.size(); i++)
//	    {
//	    	System.out.println(list.get(i).getText());
//	    	if(list.get(i).getText().contains("Angular"))
//	    	list.get(i).click();
//	    	break;
	    	

	    //driver.quit();
	    
	


//}

