package day3.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment1 {

	public static void main(String[] args) {	
		

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedrivers.exe");
		
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		
		//Button Page
		driver.get("http://leafground.com/pages/Button.html");
		// Maximize the browser
        driver.manage().window().maximize();
        
        driver.findElementById("home").click();
        
        driver.navigate().back();
        
        driver.close();
      
        
        //Link Page  
		// Initiate the ChromeBroswer
		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.get("http://leafground.com/pages/Link.html");
		// Maximize the browser
		driver1.manage().window().maximize();
        
		driver1.findElementByLinkText("Go to Home Page").click();
        
		 driver1.navigate().back();
		 
		 
		driver1.findElementByLinkText("Find where am supposed to go without clicking me?").click();   
	        
		 driver1.navigate().back();
			
		driver1.findElementByLinkText("Verify am I broken?").click(); 
		        
		 driver1.navigate().back();
			
			        
	    driver1.findElementByLinkText("Go to Home Page").click();
			        
	    driver1.navigate().back();
					
		
		driver1.findElementByLinkText("How many links are available in this page?").click();
				        
    	 driver1.close();
	
        //dropdown
 		// Initiate the ChromeBroswer
 		ChromeDriver driver3 = new ChromeDriver();
 		driver3.get("http://leafground.com/pages/Dropdown.html");
 		driver3.manage().window().maximize();
 		
 		WebElement dropdown = driver3.findElementById("dropdown1");
 		
 		Select a = new Select(dropdown);
 		
 	    a.selectByValue("2");
         
	
 	    WebElement drop1 = driver3.findElementByName("dropdown2");
 		
 		Select a1 = new Select(drop1);
 		
 	    a1.selectByVisibleText("Loadrunner");
        
    	
 	    WebElement drop2 = driver3.findElementById("dropdown3");
 		
 		Select a2 = new Select(drop2);
 		
 	    a2.selectByIndex(4);
 	   
 	    WebElement drop3 = driver3.findElementByClassName("dropdown");
		
		Select a3 = new Select(drop3);
		
	    a3.selectByValue("3");
		
}
}
