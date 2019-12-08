package day3.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
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

	}
}
