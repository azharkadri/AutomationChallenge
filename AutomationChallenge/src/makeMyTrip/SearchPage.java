package makeMyTrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	@FindBy(xpath="//label[@for='fromCity']")
	private WebElement fromCity;
	
	@FindBy(xpath="//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	private WebElement fromCityTextbox;
	
	@FindBy(xpath="//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']//ul//li//div//div//p[1]")
	private List<WebElement> fromList;
	
	SearchPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void EnterDetails(WebDriver driver,String from, String to, String date) {
		WebElement hiddenDivision=driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(hiddenDivision));
		
		hiddenDivision.click();
		fromCity.click();
		fromCityTextbox.sendKeys(from);
		int len=fromList.size();
		System.out.println("total from :"+len);
		for(int i=0; i<len; i++) {
			String fromText=fromList.get(i).getText();
			System.out.println(fromText);
			if(fromText.equalsIgnoreCase("bangalore, india"))
				fromList.get(i).click();
		}
	}
	
	public void clickOnSearch(WebDriver driver) {
		driver.findElement(By.xpath("//a[(@class='primaryBtn font24 latoBlack widgetSearchBtn ')]")).click();				
	}
}
