package gmail;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");	
	}
	
	@Test
	public void createGMailAccount() throws InterruptedException {
		driver.findElement(By.partialLinkText("Create an account")).click();
		
		String firstWindow=driver.getWindowHandle();
		Set<String> secondWindow = driver.getWindowHandles();
		
		for(String w: secondWindow) {
				if(!(w.equals(firstWindow)))
				driver.switchTo().window(w);
		}
		
		SignUpPage signUpPage=new SignUpPage(driver);
		signUpPage.setUpWithData();
		
		signUpPage.setUpPhoneNumber(driver);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter generated OTP :");
		String otp=sc.nextLine();
		
		signUpPage.enterOTP(driver, otp);
		
		signUpPage.setUpDOBAndGender(driver);
		
		sc.close();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
