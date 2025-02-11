package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgottonPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;




public class TC004_LoginForgotPassTest extends BaseClass{
	
		@Test
       public void Verify_ForgotPass() {
		
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clicklogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.clickForgottonPassword();
			
			ForgottonPasswordPage fp=new ForgottonPasswordPage(driver);
			fp.setEmail("abc@gmail.com");
			fp.clickContinue();
			
			boolean msg=fp.isButtonDisplay();
			Assert.assertEquals(true, msg);
	}

}
