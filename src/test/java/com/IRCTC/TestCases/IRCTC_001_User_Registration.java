package com.IRCTC.TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.IRCTC.Baseclass.BaseClass;
import com.IRCTC.PageObject.IRCTC_Registration;

public class IRCTC_001_User_Registration extends BaseClass {

	@Test
	public void userregistration() throws InterruptedException, AWTException
	{
		logger.info("Entering the valid data in IRCTC Username");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver,50);
		Robot robot = new Robot();
		IRCTC_Registration irctc = new IRCTC_Registration(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"registered_id\"]")));
		logger.info("Entering the user id for registration");
		irctc.setUserid(newirctcuserid);
		logger.info("Click on the check button to verify the user id");
		irctc.setValiduserid();
		logger.info("Comparing the User id status");
		String useridstatus= driver.findElement(By.xpath("//span[@class='fl green ico11 padL5']")).getText();
		System.out.println(useridstatus);
		if (useridstatus.equals("Available"))
		{
			System.out.println("IRCTC User id is availabel");
		}
		else
		{
			System.out.println("IRCTC User id is not availabel");
		}
		logger.info("Entering the Full Name");
		irctc.setFullName(Fullname);
		logger.info("Entering the date");
		irctc.setdob(DOB);
		logger.info("Entering the Phone number");
		irctc.setmobile(Phonenumber);	
		logger.info("Entering the email id");
		irctc.setemail(Emailid);
		logger.info("Entering the professional");
		irctc.setprofession();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		irctc.setselectprofession("Private");
		logger.info("Entering the Pincode");
		irctc.setPinCode(pincode);
		logger.info("Entering the State");
		irctc.setState(State);
		logger.info("Entering the City");
		irctc.setcity(Locality);
		logger.info("Entering the Locality");
		irctc.setlocality(Locality);
		logger.info("Entering the Address");
		irctc.setAddress(Address);
		logger.info("Entering the Alt Phone Number");
		irctc.setaltphonenumber(altPhonenumber);
		irctc.setregister();
		Thread.sleep(10000);
	}
	
}
