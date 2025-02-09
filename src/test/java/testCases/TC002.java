package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002 extends BaseClass{

	@Test(groups={"Regression","Master"})
	public void verify_Login()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("akshaytakale@gmail.com");
		lp.setPassword("abc@123");
		lp.clickLogin();
		
		MyAccountPage ap=new MyAccountPage(driver);
		boolean val=ap.isHeadingDisplay();
		
		Assert.assertEquals(true, val);
		System.out.println("TC002....");
	}
	
}
