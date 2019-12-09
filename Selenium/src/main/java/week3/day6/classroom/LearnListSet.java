package week3.day6.classroom;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LearnListSet {
		public static void main(String[] args) throws InterruptedException {

			// Set the property for ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedrivers.exe");

			// Initiate the ChromeBroswer
			ChromeDriver driver = new ChromeDriver();

			// Button Page
			driver.get("https://erail.in/");
			// Maximize the browser
			driver.manage().window().maximize();
			WebElement source = driver.findElementById("txtStationFrom");
			source.clear();
			source.sendKeys("MAS",Keys.TAB);
			WebElement destiny = driver.findElementById("txtStationTo");
			destiny.clear();
			destiny.sendKeys("SBC",Keys.TAB);
			Thread.sleep(5000);
			driver.findElementById("chkSelectDateOnly").click();;
			
			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
			
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			
			for (int i = 0; i < rows.size(); i++) {
				
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
			
			System.out.println(column.get(1).getText());
			
			}
			Set<String> column1 = new TreeSet<String>() ;
		for (String eachcolum1 : column1) {
			System.out.println(eachcolum1);
			
		}
		}
			//for (WebElement eachBrowser : rows) {
				//System.out.println(eachBrowser);
				
			//}
			
	}
	



