package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001 extends BaseClass{
	
	
	@Test(groups= {"Sanity","Master"})
	public void verify_reg()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		
		RegistrationPage rPage=new RegistrationPage(driver);
		rPage.setFirstname("Akshay");
		rPage.setLastname("Takale");
		rPage.setEmail(randomString()+"@gmail.com");//Randomly generated Email
		rPage.setTelephone(randomNumber()); //Random number
		
		String password=randomAlphNum();//Random Password
		rPage.setPassword(password);
		rPage.confirmPassword(password);
		rPage.clickCheckBox();
		rPage.clickContinue();
		
		String confmsg=rPage.getConfirmationMsg();
		
		
		System.out.println(confmsg);
		Assert.assertEquals(confmsg,"Continue");
		
		System.out.println("TC001.........");
		
	}
}
