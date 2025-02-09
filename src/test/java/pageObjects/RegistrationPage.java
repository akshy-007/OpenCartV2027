package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	
	
	//1.Constructor
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	//2.Locators on page:
		@FindBy(xpath="//input[@id='input-firstname']")
		WebElement txtFirstName;
		
		@FindBy(xpath="//input[@id='input-lastname']")
		WebElement txtLastName;
		
		@FindBy(xpath="//input[@id='input-email']")
		WebElement txtEmail;
		
		@FindBy(xpath="//input[@id='input-telephone']")
		WebElement txtTelephone;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@id='input-confirm']")
		WebElement txtConfirmPassword;
		
		@FindBy(xpath="//input[@name='agree']")
		WebElement chkPolicy;
		
		@FindBy(xpath="//input[@value='Continue']")
		WebElement btnContinue;
		
		@FindBy(xpath="//a[text()='Continue']")
		WebElement msgConfirmation;
		
		//3.Action Methods
		public void setFirstname(String fname)
		{
			txtFirstName.sendKeys(fname);
		}
		
		public void setLastname(String lname)
		{
			txtLastName.sendKeys(lname);
		}
		
		public void setEmail(String email)
		{
			txtEmail.sendKeys(email);
		}
		
		public void setTelephone(String tel)
		{
			txtTelephone.sendKeys(tel);
		}
		
		public void setPassword(String pass)
		{
			txtPassword.sendKeys(pass);
		}
		
		public void confirmPassword(String cpass)
		{
			txtConfirmPassword.sendKeys(cpass);
		}
		
		
		public void clickCheckBox()
		{
			chkPolicy.click();
		}
		
		
		public void clickContinue()
		{
			btnContinue.click();
		}
		
		public String getConfirmationMsg()
		{
			try {
				return (msgConfirmation.getText());
			}
			
			catch(Exception e){
				return (e.getMessage());
			}
		}

}
