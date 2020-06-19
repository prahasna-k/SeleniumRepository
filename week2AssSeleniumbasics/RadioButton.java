package week2AssSeleniumbasics;

 import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leafground.com/pages/radio.html");
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	    //CLICK on buton
	     driver.findElementByXPath("//div[@id='first']//label[1]").click();
	     
	     
	     System.out.println("selected yes :" +driver.findElementByXPath("//div[@id='first']//label[1]").isSelected());
	     
	     //default selected button
	     
	     boolean button1 = driver.findElementByXPath("//label[@for='Unchecked']").isSelected();
	     if(button1==true)
	     {
	     System.out.println("Button1 is selected" );
	     }
	     else 
	    	 System.out.println("Button2 is selected"); 
	     
	     //select age (Only if choice wasn't selected)
	    // boolean Age = driver.findElementByXPath("(//input[@class='myradio'])[4]").isSelected();
	     
	     if(driver.findElementByXPath("(//input[@class='myradio'])[4]").isSelected()) {
	    	 
	    	 System.out.println(" selected age is : 20- 40yrs " );
	    	 
	     }
	     else {
	    	 driver.findElementByXPath("(//input[@class='myradio'])[4]").click();
	    	 System.out.println("selected using click");
	    	} 
	     /*String radio = "//label[contains(text(), 'Select your age group')]/following::input[2]";
	 
	  if(driver.findElementByXPath(radio).isSelected()) {
		  System.out.println("Checked");
		  System.out.println(driver.findElementByXPath(radio).getText());
	      }
	  else {
	    	 driver.findElementByXPath("(//input[@class='myradio'])[4]").click();
	    	 System.out.println("selected using click");*/
	}
	}

