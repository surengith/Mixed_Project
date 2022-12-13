package com.Properties.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Mixed_Project\\src\\main\\java\\com\\Properties\\org\\orange.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public static String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}

	public static String getOrangeUrl() {
		String orangeurl = p.getProperty("OrangeUrl");
		return orangeurl;
	}

	public static String getBfullname() {
		String bfullname = p.getProperty("BFullname");
		return bfullname;
	}

	public static String getBemail() {
		String bemail = p.getProperty("BEmail");
		return bemail;
	}

	public static String getBCountry() {
		String bcountry = p.getProperty("BCountry");
		return bcountry;
	}

	public static String getBPhNumber() {
		String BPhNumber = p.getProperty("BPhNumber");
		return BPhNumber;
	}

	public static String getCFullnamel() {
		String CFullname = p.getProperty("CFullname");
		return CFullname;
	}

	public static String getCPhNumber() {
		String CPhNumber = p.getProperty("CPhNumber");
		return CPhNumber;
	}

	public static String getCEmail() {
		String CEmail = p.getProperty("CEmail");
		return CEmail;
	}

	public static String getCCountry() {
		String CCountry = p.getProperty("CCountry");
		return CCountry;
	}

	public static String getCEmployees() {
		String CEmployees = p.getProperty("CEmployees");
		return CEmployees;
	}

	public static String getCJobtitle() {
		String CJobtitle = p.getProperty("CJobtitle");
		return CJobtitle;
	}

	public static String getCTextarea() {
		String CTextarea = p.getProperty("CTextarea");
		return CTextarea;
	}

	public static String getFbUrl() {
		String FbUrl = p.getProperty("FbUrl");
		return FbUrl;
	}

	public static String getFbFirstname() {
		String FbFirstname = p.getProperty("FbFirstname");
		return FbFirstname;
	}

	public static String getFbLastname() {
		String FbLastname = p.getProperty("FbLastname");
		return FbLastname;
	}

	public static String getFbPhNumber() {
		String FbPhNumber = p.getProperty("FbPhNumber");
		return FbPhNumber;
	}

	public static String getFbNewpass() {
		String FbNewpass = p.getProperty("FbNewpass");
		return FbNewpass;
	}

	public static String getFbDay() {
		String FbDay = p.getProperty("FbDay");
		return FbDay;
	}

	public static String getFbmonth() {
		String Fbmonth = p.getProperty("Fbmonth");
		return Fbmonth;
	}

	public static String getFbYear() {
		String FbYear = p.getProperty("FbYear");
		return FbYear;
	}
}
