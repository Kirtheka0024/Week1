package day3.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedrivers.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Button Page
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();
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
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Dinesh");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kumar");
	
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
	
		
		// Select 'Source' as 'Other' (Handling DropDown)

		WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Conference");
		dd.selectByIndex(2);
		dd.selectByValue("LEAD_OTHER");	
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Recruitment");
		
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("350000");
		
		//Select industry
		WebElement dropdown2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(dropdown2);
		dd2.selectByValue("IND_FINANCE");

		//Select ownership
		WebElement dropdown3 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd3 = new Select(dropdown3);
		dd3.selectByVisibleText("Public Corporation");

		
		driver.findElementById("createLeadForm_sicCode").sendKeys("909090");
		driver.findElementById("createLeadForm_description").sendKeys("CreateLead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("ImportantNote");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("09");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9080315609");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Biomedical");
		
		// Select 'Preferred Currency' as 'INR'
		WebElement dropdown4 = driver.findElementById("createLeadForm_currencyUomId");
		Select dd4 = new Select(dropdown4);
		dd4.selectByVisibleText("INR - Indian Rupee");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("101");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$$");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Babu");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.testleaf.com");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("kirthekasaran@gmail.com");

	
	//Personal Details
		
		driver.findElementById("createLeadForm_generalToName").sendKeys("Karthic");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Karthic");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Adyar");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		//Select State Province
		WebElement dropdown5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd5 = new Select(dropdown5);
		dd5.selectByVisibleText("Armed Forces Americas");

		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600021");
		
		//Select Country
		WebElement dropdown6 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd6 = new Select(dropdown6);
		dd6.selectByValue("DZA");

		// Click on Create Lead (Submit) button

		driver.findElementByClassName("smallSubmit").click();
	}
}
