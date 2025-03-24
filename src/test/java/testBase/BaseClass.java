package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


//baseclass contains Reusable stuff Like SetUp ,Tear down method ,Random String and number generator method,Screenshot,
public class BaseClass {
	
	public  static WebDriver driver;
	@BeforeClass(groups={"Regression","Master","Sanity"})
	@Parameters("browser")
	public void setup(String br)
	{
		switch(br) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge" : driver=new EdgeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default: System.out.println("Invalid browser ");return;
		
		}
		
		//driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}

	@AfterClass(groups={"Regression","Master","Sanity"})
	public void tearDown()
	{
		driver.quit();
	}
	
	//generating random String for Email address
	
			public String randomString()
			{
				String generatedString=RandomStringUtils.randomAlphabetic(5);
				return generatedString;
			}
			
			public String randomNumber()
			{
				String generatedNum=RandomStringUtils.randomNumeric(10);
				return generatedNum;
			}
			
			public String randomAlphNum()
			{
				String gNum=RandomStringUtils.randomNumeric(3);
				String gAplhaNum=RandomStringUtils.randomNumeric(3);
				return (gNum+"@"+gAplhaNum);
			}
	
			
			public String captureScreen(String tname) throws IOException {

				String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
						
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
				
				String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
				File targetFile=new File(targetFilePath);
				
				sourceFile.renameTo(targetFile);
					
				return targetFilePath;

			}

}
