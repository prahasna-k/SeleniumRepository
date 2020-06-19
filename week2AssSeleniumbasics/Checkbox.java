package week2AssSeleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leafground.com/pages/checkbox.html");
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	    //Select the languages that you know
	     driver.findElementByXPath("//label[contains(text(), 'Select the languages')]/following::input[1]").click();
	     driver.findElementByXPath("//label[contains(text(), 'Select the languages')]/following::input[2]").click();
	     driver.findElementByXPath("//label[contains(text(), 'Select the languages')]/following::input[3]").click();
	     driver.findElementByXPath("//label[contains(text(), 'Select the languages')]/following::input[4]").click();
		
	     //check Selenium Selected

	     if(driver.findElementByXPath("//label[contains(text(), 'Confirm Selenium')]/following::input[1]").isSelected())
	     {
	    	 System.out.println("True selenium is selected");
	     }
	     else 
	     {
	    	 System.out.println("Not selected");
	     }
	     
	     //DeSelect only checked
	     
	     
	     
	     if(driver.findElementByXPath("//label[contains(text(), 'DeSelect')]/following::input[1]").isSelected())
	     {
	    		driver.findElementByXPath("//label[contains(text(), 'DeSelect')]/following::input[1]").click();
	    		System.out.println("not selected checkbox is checked now");
	     }
	     else 
	    	 driver.findElementByXPath("//label[contains(text(), 'DeSelect')]/following::input[2]").click();
	 		System.out.println("i am selected checkbox is unchecked now"); 
	     
	     
	     //Select all below checkboxes
	     
	     driver.findElementByXPath("//label[contains(text(), 'Select all')]/following::input[2]").click();
	     driver.findElementByXPath("//label[contains(text(), 'Select all')]/following::input[3]").click();
	     driver.findElementByXPath("//label[contains(text(), 'Select all')]/following::input[4]").click();
	     driver.findElementByXPath("//label[contains(text(), 'Select all')]/following::input[5]").click();
	     driver.findElementByXPath("//label[contains(text(), 'Select all')]/following::input[1]").click();
	     
	}	

}
