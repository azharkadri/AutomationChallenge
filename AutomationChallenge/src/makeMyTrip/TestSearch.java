package makeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	
	static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");		
	}
	
	@Test
	public void search() {
		SearchPage sp=new SearchPage(driver);
		sp.EnterDetails(driver, "bangalore", "patna", "15-january-2020");
		//sp.clickOnSearch(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
