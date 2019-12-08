package day3.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		// Click on Create Lead (Submit) button
driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name

	}

}


