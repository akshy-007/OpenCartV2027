package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage{
	
	//1.constructor:
	public EditAccountPage(WebDriver driver)
	{
		super(driver);
	}

	
	//2.Locator:
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//*[text()='Back']")
	WebElement btnBack;
	
	@FindBy(xpath="//*[text()='Success: Your account has been successfully updated.']")
	WebElement msg;
	
	
	//3.Action Methods:
	
	public void updateFirstName(String fname)
	{
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
	}
	
	public void updateLastName(String lname)
	{
		txtLastName.clear();
		txtLastName.sendKeys(lname);
	}
	

	public void updateEmail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void updateTel(String tel)
	{
		txtTelephone.clear();
		txtTelephone.sendKeys(tel);
	}
	
	
	public void clkContinue()
	{
		btnContinue.click();;
	}
	
	public void clkBack()
	{
		btnBack.click();;
	}
	
	public boolean confirmationMsg()
	{
		
		try {
			return msg.isDisplayed();
		}
		
		catch(Exception e)
		{
			return false;
		}
	}
	
}
