package com.IRCTC.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public  ReadConfig()
	{
		File src = new File("./configuration/IRCTC.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		}
		}
	
	//Getting ChromePath
	public String getChromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	//Getting URL
	public String getbaseURL() {
		String url = pro.getProperty("Baseurl");
		return url;
	}
	
	//Getting Full Name
	public String FullName()
	{
	String fullname = pro.getProperty("Fullname");	
	return fullname;
	
	}
	
	//Getting DOB
	public String DOB()
	{
		String dob = pro.getProperty("DOB");
		return dob;
	}
	
	//Getting Phonenumber
	public String PhoneNumber()
	{
		String pnumber =  pro.getProperty("Phonenumber");
		return pnumber;
	}
	
	//Getting Email id
	public String Emailid()
	{
		String emailid = pro.getProperty("Emailid");
		return emailid;
	}
	
	//Getting Security Answer
	public String Sanswer()
	{
		String sanswer = pro.getProperty("Sanswer");
		return sanswer;
	}
	
	//Getting PinCode
	public String Pincode()
	{
		String pincode = pro.getProperty("pincode");
		return pincode;
	}
	
	//Getting State
	public String State()
	{
		String state = pro.getProperty("State");
		return state;
	}
	
	//Getting Locality
	public String Locality()
	{
		String locality = pro.getProperty("Locality");
		return locality;
	}
	
	//Getting Flatno/Door no/Address
	public String Address()
	{
		String address = pro.getProperty("Address");
		return address;
	}
	
	//Getting altPhonenumber
	public String altPhonenumber()
	{
		String altpnumber = pro.getProperty("altPhonenumber");
		return altpnumber;
	}
	
	//Getting Irctc Userid
		public String getuserid()
		{
			String userid = pro.getProperty("newirctcuserid");
			return userid;
		}
	
	}
	
	

