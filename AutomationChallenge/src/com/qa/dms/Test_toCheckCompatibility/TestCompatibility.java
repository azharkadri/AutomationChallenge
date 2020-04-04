package com.qa.dms.Test_toCheckCompatibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.dms.base_toCheckCompatibility.Base;

public class TestCompatibility extends Base{
	
	
	@Test
	public void test1() {
		WebElement searchTextbox=driver.findElement(By.name("q"));
		searchTextbox.sendKeys("azhar kadri");
		String searchTextboxValue=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println("textbox value after entering : "+searchTextboxValue);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		//String pageSource=driver.getPageSource();
		System.out.println("url : "+url);
		System.out.println("title : "+title);
		//System.out.println("page source code : "+pageSource);
	}

}
