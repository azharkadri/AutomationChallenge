package com.qa.dms.base_toCheckCompatibility;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base implements IAutoConstant{
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	}
	
	protected static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name :");
		String strBrowser=sc.nextLine();
		if(strBrowser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(PLTO, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(URL);
		}
		else if(strBrowser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(PLTO, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(URL);
		}
		sc.close();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
