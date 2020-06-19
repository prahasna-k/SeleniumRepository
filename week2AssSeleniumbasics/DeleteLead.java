package week2AssSeleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launch Chrome
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	     //login to application
	     driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
	     driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
	     driver.findElementByXPath("//input[@value='Login']").click();
	    
	     //click CRM/SFA
	     driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	     driver.findElementByXPath("//a[text()='Leads']").click(); 
	    
	     //goto find leads page
	     driver.findElementByXPath("(//a[contains(text(),'Leads')])[3]").click(); 
	    
	     //enter Email and search
	     driver.findElementByXPath("//span[text()='Email']").click(); 
	     driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("prahasna@gmail.com");
	     driver.findElementByXPath("//button[contains(text(),'Leads')]").click(); 
	    
	     //click on first lead Id
	     WebDriverWait wait = new WebDriverWait(driver,300);
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[4]")));
	     WebElement eleLead = driver.findElementByXPath("(//a[@class='linktext'])[4]");
	     String Leadid =eleLead.getText();
	     System.out.println(Leadid);
	     eleLead.click();
	     
	     //Delete the lead
	     driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click(); 
	     
	     //Goto find Leads and search for deleted Leadid
	     driver.findElementByXPath("(//a[contains(text(),'Leads')])[3]").click(); 
	     driver.findElementByXPath("//input[@type=\"text\"and @name=\"id\"]").sendKeys(Leadid);
	     driver.findElementByXPath("//button[contains(text(),'Leads')]").click(); 
	     
	   //Verify no records to display
	     WebDriverWait wait2 = new WebDriverWait(driver,300);
	     wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='x-paging-info']")));
	     String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
	    		 String text2=text;
	     System.out.println("success:" +text2);
	     
	}

}
