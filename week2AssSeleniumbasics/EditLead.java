package week2AssSeleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launch Chrome
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	   //Login
	     driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
	     driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
	     driver.findElementByXPath("//input[@value='Login']").click();
	     driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	   
	     //GOTO LEADS
	     driver.findElementByXPath("//a[text()='Leads']").click(); 
	     driver.findElementByXPath("(//a[contains(text(),'Leads')])[3]").click();
	     
	    //Give company name and search
	     driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("leaftest");
	    driver.findElementByXPath("//button[contains(text(),'Leads')]").click();
	    
	    //Click on first Leadid
	    WebDriverWait wait = new WebDriverWait(driver,30);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='linktext'])[4]")));
	     WebElement eleLead = driver.findElementByXPath("(//a[@class='linktext'])[4]");
	     eleLead.click();
	     
	     //click on edit button
	     driver.findElementByXPath("//a[text()='Edit']").click(); 
	     
	     //get company name
	     WebElement eleCompany = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
	     String company =eleCompany.getText();
	     System.out.println(company);
	     eleCompany.clear();
	     
	     //enter new company name
	   WebElement newcompany = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
	   newcompany.sendKeys("newCompany");
	   
	   //click update
	   
	    driver.findElementByXPath("//input[@value='Update']").click();
	    
	    //Get updated company name
	    
	    String text2=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();

		System.out.println("Updated Company Name:" + text2);

		
	   

}
	}


