package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgottonPasswordPage extends BasePage{
	
	
	//1.Constructor:
	public ForgottonPasswordPage(WebDriver driver)
	{
		super(driver);
	}
	
	//2.Locator:
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//*[text()=\"An email with a confirmation link has been sent your email address.\"]")
	WebElement msgConfirmation;
	
	//3.Action Methods:
public void setEmail(String email) {
		
		txtemail.sendKeys(email);
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	
	
	public boolean isButtonDisplay() {
		try {
		
		return msgConfirmation.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

}
