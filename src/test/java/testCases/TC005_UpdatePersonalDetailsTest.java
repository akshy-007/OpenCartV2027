package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.EditAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC005_UpdatePersonalDetailsTest extends BaseClass{

	@Test
	public void Update_Personal_Data(){
		{
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clicklogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail("akshaytakale@gmail.com");
			lp.setPassword("abc@123");
			lp.clickLogin();
			
			MyAccountPage ap=new MyAccountPage(driver);
			ap.clickEditAccount();
			
			EditAccountPage ep=new EditAccountPage(driver);
			ep.updateFirstName("Akshy");
			ep.updateFirstName("Jassi");
			ep.updateTel("12234555");
			ep.updateEmail("akshaytakale@gmail.com");
			ep.clkContinue();
			boolean Cmsg=ep.confirmationMsg();
			
			Assert.assertEquals(Cmsg, true);
			
			
		}
	}
}
