package week2AssSeleniumbasics;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leafground.com/pages/Button.html");
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	    //CLICK on buton
	     driver.findElementById("home").click();
	     
	   
	    //Get title and go back to home
	     System.out.println("Title is:" +driver.getTitle());
	     driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]").click();
	     
	     //get X.Y co-ordinates
	    System.out.println("X,Y co-ordinates :" +driver.findElementById("position").getLocation());
	   
	    //Color
	    System.out.println("Color is : " +driver.findElementById("color").getCssValue("background-color"));
	    
	    //Height and width
	    System.out.println("size is :" +driver.findElementById("size").getSize());
	     
	     
	     


		

	}



}