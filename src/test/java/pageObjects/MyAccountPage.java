package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	//1.Constructor
	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	//2.Locator
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
	WebElement btnLogout;
	
	@FindBy(xpath="//button[@type='button'] [@class='btn btn-default btn-lg']")
	WebElement boxSearch;
	
	@FindBy(xpath="//a[text()='Edit Account']")
	WebElement lnkEditAccount;
	
	//3.Action Methods
	public boolean isHeadingDisplay()
	{
		
		try {
			return msgHeading.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public void clkLogout()
	{
		btnLogout.click();
	}
	
	public void clkSearchBox()
	{
		boxSearch.click();
	}
	
	public void clickEditAccount()
	{
		lnkEditAccount.click();
	}
}
