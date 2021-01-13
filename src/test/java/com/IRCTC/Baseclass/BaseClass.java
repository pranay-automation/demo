package com.IRCTC.Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.IRCTC.utilities.*;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	
	public String Baseurl = readconfig.getbaseURL();
	public String Fullname =readconfig.FullName();
	public String DOB=readconfig.DOB();
	public String Phonenumber= readconfig.PhoneNumber();
	public String Emailid = readconfig.Emailid();
	public String Sanswer = readconfig.Sanswer();
	public String pincode = readconfig.Pincode();
	public String State= readconfig.State();
	public String Locality = readconfig.Locality();
	public String Address = readconfig.Address();
	public String altPhonenumber = readconfig.altPhonenumber();
	public String newirctcuserid = readconfig.getuserid();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		logger = Logger.getLogger("IRCTC Registration");
		PropertyConfigurator.configure("log4j.properties");
		driver.get(Baseurl);	
	}
	
	
	//@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
}
