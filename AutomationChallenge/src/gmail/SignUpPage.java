package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	@FindBy(id="firstName")
	private WebElement firstName;
	@FindBy(name="lastName")
	private WebElement lastName;
	@FindBy(name="Username")
	private WebElement Username;
	@FindBy(name="Passwd")
	private WebElement Passwd;
	@FindBy(name="ConfirmPasswd")
	private WebElement ConfirmPasswd;
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextButton;
	
	SignUpPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUpWithData() {
		firstName.sendKeys("test");
		lastName.sendKeys("automation");
		Username.sendKeys("testautomationdec20190102");
		Passwd.sendKeys("nAWADA@1992");
		ConfirmPasswd.sendKeys("nAWADA@1992");
		nextButton.click();		
	}
	
	public void setUpPhoneNumber(WebDriver driver) {
		driver.findElement(By.id("phoneNumberId")).sendKeys("8521163737");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
	
	public void enterOTP(WebDriver driver,String otp) {		
		driver.findElement(By.id("code")).sendKeys(otp);
		driver.findElement(By.xpath("//span[contains(text(),'Verify')]")).click();		
	}
	
	public void setUpDOBAndGender(WebDriver driver) {
		driver.findElement(By.id("day")).sendKeys("24");
		
		Select sel=new Select(driver.findElement(By.id("month")));
		sel.selectByValue("12");
		
		driver.findElement(By.id("year")).sendKeys("1992");
		
		Select sel2=new Select(driver.findElement(By.id("gender")));
		sel2.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}	
}