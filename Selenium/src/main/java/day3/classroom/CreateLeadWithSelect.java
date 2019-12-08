package day3.classroom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {


	public static void main(String[] args) {	
		

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedrivers.exe");
		
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser

		// Enter the UserName
driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
driver.findElementById("password").sendKeys("crmsfa");

		// Click on Login Button
driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
driver.findElementByLinkText("CRM/SFA").click();
        // Click on Leads
driver.findElementByLinkText("Leads").click();

		// Click on Create Lead button
driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
driver.findElementById("createLeadForm_companyName").sendKeys("FSS  COMPANY");
		// Enter First Name
driver.findElementById("createLeadForm_firstName").sendKeys("dhana");
		// Enter Last Name
driver.findElementById("createLeadForm_lastName").sendKeys("Lakshmi");

// Select 'Source' as 'Other' (Handling DropDown)

WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
Select dd = new Select(dropdown);
dd.selectByVisibleText("Conference");
dd.selectByIndex(2);
dd.selectByValue("LEAD_OTHER");

// Select 'Preferred Currency' as 'INR'
WebElement dropdown1 = driver.findElementById("createLeadForm_currencyUomId");
Select dd1 = new Select(dropdown1);
dd1.selectByVisibleText("INR - Indian Rupee");

//Select 'Marketing Campaign
WebElement dropdown2 = driver.findElementById("createLeadForm_marketingCampaignId");
Select dd2 = new Select(dropdown2);
dd2.selectByValue("CATRQ_AUTOMOBILE");

//Select industry
WebElement dropdown3 = driver.findElementById("createLeadForm_industryEnumId");
Select dd3 = new Select(dropdown3);
dd3.selectByValue("IND_FINANCE");

//Select ownership
WebElement dropdown4 = driver.findElementById("createLeadForm_ownershipEnumId");
Select dd4 = new Select(dropdown4);
dd4.selectByVisibleText("Public Corporation");

//Select State Province
WebElement dropdown5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
Select dd5 = new Select(dropdown5);
dd5.selectByVisibleText("Armed Forces Americas");

//Select Country
WebElement dropdown6 = driver.findElementById("createLeadForm_generalCountryGeoId");
Select dd6 = new Select(dropdown6);
dd6.selectByValue("DZA");


// Click on Create Lead (Submit) button

driver.findElementByClassName("smallSubmit").click();

// Verify the Lead is created by checking the Company or First Name

}



}




