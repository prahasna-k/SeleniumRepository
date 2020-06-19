package week2AssSeleniumbasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCreateLead {

	public static void main(String[] args) {
		
		//Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     
	     //Login 
	     WebElement eleUsername = driver.findElementById("username");
	     eleUsername.sendKeys("Demosalesmanager");
	     WebElement elePswd = driver.findElementById("password");
	     elePswd.sendKeys("crmsfa");
	     driver.findElementByClassName("decorativeSubmit").click();
	     
	     //Goto create leads
	     driver.findElementByLinkText("CRM/SFA").click();
	     driver.findElementByLinkText("Leads").click();
	     driver.findElementByLinkText("Create Lead").click();
	     
	     //Enter input details
	     WebElement eleCompany = driver.findElementByXPath("//input[@id='createLeadForm_companyName']");
	     eleCompany.sendKeys("leaftest");
	     WebElement eleFname = driver.findElementByXPath("//input[@id='createLeadForm_firstName']");
	     eleFname.sendKeys("prahasna");
	     WebElement eleLname = driver.findElementByXPath("//input[@id='createLeadForm_lastName']");
	     eleLname.sendKeys("kadi");
	     
	     //Select dropdown
	     WebElement eleDD1 = driver.findElementById("createLeadForm_dataSourceId");
	     Select source= new Select(eleDD1);
	     source.selectByValue("LEAD_EMPLOYEE");
	     WebElement eleAnnual = driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']");
	     eleAnnual.sendKeys("2000");
	     
	     WebElement eleDD2 = driver.findElementById("createLeadForm_industryEnumId");
	     Select Industry=new Select(eleDD2);
	     Industry.selectByIndex(3);
	     
	     WebElement eleDD3 = driver.findElementById("createLeadForm_ownershipEnumId");
	     Select Owner=new Select(eleDD3);
	     Owner.selectByVisibleText("Corporation");
	     
	     driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
	     WebElement eleDD4 = driver.findElementById("createLeadForm_marketingCampaignId");
	     Select Market=new Select(eleDD4);
	     Market.selectByIndex(6);
	     
	     WebElement eleDD5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	     Select State=new Select(eleDD5);
	     State.selectByVisibleText("Texas");
	     
	     //enter mail id
	     WebElement eleEmail = driver.findElementById("createLeadForm_primaryEmail");
	     eleEmail.sendKeys("prahasna@gmail.com");
	     
	     //enter phone no
	     WebElement elePhno = driver.findElementById("createLeadForm_primaryPhoneNumber");
	     elePhno.sendKeys("9177249249");
	      
	     //click create lead
	     driver.findElementByXPath("//input[@class='smallSubmit']").click();

	}

}
