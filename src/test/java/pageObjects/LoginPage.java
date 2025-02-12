package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//1. Constructor
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//2.Locator
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="(//a[text()=\"Forgotten Password\"])[1]")
	WebElement lnkForgotpass;
	
	
	
	
	
	//3.Action Methods:
	
		public void setEmail(String email)
		{
			txtEmail.sendKeys(email);
		}
		
		
		public void setPassword(String pass)
		{
			txtPassword.sendKeys(pass);
		}
		
		
		public void clickLogin()
		{
			btnLogin.click();
		}
		
		public void clickForgottonPassword()
		{
			lnkForgotpass.click();
		}
		
		
		
		
}
