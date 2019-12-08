package week3.day6.classroom;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class LearnSetList2 {
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
			
		 List<WebElement> alltrainname = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
			System.out.println("All train names "+alltrainname.size());
			Set<String> uniqetrainnames = new HashSet<String>();
			for (WebElement eachtrainElement : alltrainname) {
				
				String eachTrainname = eachtrainElement.getText();
				uniqetrainnames.add(eachTrainname);
			}
		
	int size = uniqetrainnames.size();
	System.out.println("Unique trian name count"+size);
}
	}