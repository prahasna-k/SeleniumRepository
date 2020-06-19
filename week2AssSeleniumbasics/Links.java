package week2AssSeleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leafground.com/pages/Link.html");
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	    //CLICK on buton
	     driver.findElementByLinkText("Go to Home Page").click();
	     System.out.println(" clicked button 1 Title is:" +driver.getTitle());
	     driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[3]").click();
	     
	     //Find location without click
	     System.out.println("location is :" +driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
	     
	    //Interact with same link name	
	     driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
	     System.out.println(" button 2 and Title is:" +driver.getTitle());
	     driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[3]").click();
	     
	 //links
	     System.out.println("links are :" +driver.findElementByLinkText("How many links are available in this page?").getAttribute("href") );
	     
	    //links are available in this page?
	     List<WebElement> eleTag = driver.findElementsByTagName("a");
	     System.out.println("count of links is : " + eleTag.size() );
	     
	     String link = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
	     String errorlink = " http://leafground.com/pages/error.html";
	     if(errorlink.equals(link))
	     {
	    	 System.out.println("link is broken");
	     }
	     else System.out.println("link is not broken");
	     
	     
	     
	    
	     
	     
	     
	}

}
