package com.Runner.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.org.Base_Class;
import com.Pom.org.Book_A_Demo_Page;
import com.Pom.org.Conatct_Sales;
import com.Pom.org.FaceBook_Page;
import com.Properties.org.File_Reader_Manager;
import com.Singleton.org.Singleton_Pattern;

public class Runner extends Base_Class {

	public static WebDriver driver = launchBrowser("chrome");
	public static Singleton_Pattern sdp = new Singleton_Pattern(driver);

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-notifications");
//		driver = new ChromeDriver(op);
//		driver.manage().window().maximize();

//		driver.get("https://www.orangehrm.com/");
		String orangeUrl = File_Reader_Manager.getInstanceFRM().getInstanceCR().getOrangeUrl();
		launchUrl(orangeUrl);

//		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
		robotClass();

		// Book_A_Demo_Page demopage = new Book_A_Demo_Page(driver);

		// WebElement bookademo = driver.findElement(By.xpath("(//button[text()='Book a
		// Free Demo'])[2]"));
		// bookademo.click();
		clickOnElement(sdp.getDemopage().getBookademo());

//		WebElement bfullname = driver.findElement(By.xpath("//input[@name='FullName']"));
//		bfullname.sendKeys("Ramesh");
		String bfullname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBfullname();
		passInput(sdp.getDemopage().getBfullname(), bfullname);

//		WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
//		email.sendKeys("ramesh@gmail.com");
		String bemail = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBemail();
		passInput(sdp.getDemopage().getEmail(), bemail);

//		WebElement country = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
//		Select countryselect = new Select(country);
//		countryselect.selectByVisibleText("Australia");
		String bCountry = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBCountry();
		selectDropDown(sdp.getDemopage().getCountry(), bCountry);

//		WebElement phnumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number*']"));
//		phnumber.sendKeys("36251453636");
//		Thread.sleep(15000);
		String bPhNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBPhNumber();
		passInput(sdp.getDemopage().getPhnumber(), bPhNumber);
		wait(15000);

//		WebElement submitbtn = driver.findElement(By.xpath("//input[@name='action_submitForm']"));
//		submitbtn.click();
		clickOnElement(sdp.getDemopage().getSubmitbtn());

		// Conatct_Sales contact = new Conatct_Sales(driver);

//		WebElement contactsales = driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]"));
//		contactsales.click();
		clickOnElement(sdp.getContact().getContactsales());

//		WebElement cfullname = driver.findElement(By.id("Form_getForm_FullName"));
//		cfullname.sendKeys("Ramesh");
		String cFullnamel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCFullnamel();
		passInput(sdp.getContact().getCfullname(), cFullnamel);

//		WebElement cphnumber = driver.findElement(By.id("Form_getForm_Contact"));
//		cphnumber.sendKeys("93255517555");
		String cPhNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCPhNumber();
		passInput(sdp.getContact().getCphnumber(), cPhNumber);

//		WebElement cemail = driver.findElement(By.name("Email"));
//		cemail.sendKeys("ramesh@gamil.com");
		String cEmail = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCEmail();
		passInput(sdp.getContact().getCemail(), cEmail);

//		WebElement ccountry = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
//		Select ccountryselect = new Select(ccountry);
//		ccountryselect.selectByVisibleText("Australia");
		String cCountry = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCCountry();
		selectDropDown(sdp.getContact().getCcountry(), cCountry);

//		WebElement cemployees = driver.findElement(By.xpath("//select[@id='Form_getForm_NoOfEmployees']"));
//		Select cemployeesselect = new Select(cemployees);
//		cemployeesselect.selectByVisibleText("101 - 150");
		String cEmployees = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCEmployees();
		selectDropDown(sdp.getContact().getCemployees(), cEmployees);

//		WebElement cjobtitle = driver.findElement(By.id("Form_getForm_JobTitle"));
//		cjobtitle.sendKeys("selenium");
		String cJobtitle = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCJobtitle();
		passInput(sdp.getContact().getCjobtitle(), cJobtitle);

//		WebElement ctextarea = driver.findElement(By.name("Comment"));
//		ctextarea.sendKeys("Hello");
//		Thread.sleep(10000);
		String cTextarea = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCTextarea();
		passInput(sdp.getContact().getCtextarea(), cTextarea);
		wait(15000);

//		WebElement csubmitbtn = driver.findElement(By.id("Form_getForm_action_submitForm"));
//		csubmitbtn.click();
		clickOnElement(sdp.getContact().getCsubmitbtn());

		// FaceBook_Page fb = new FaceBook_Page(driver);

//		driver.navigate().to("https://www.facebook.com/");
		String fbUrl = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbUrl();
		navigateTo(fbUrl);

//		WebElement csignupfb = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//		csignupfb.click();
		clickOnElement(sdp.getFb().getCsignupfb());

//		Thread.sleep(2000);
//		WebElement firstname = driver.findElement(By.name("firstname"));
//		firstname.sendKeys("ramesh");
		wait(2000);
		String fbFirstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbFirstname();
		passInput(sdp.getFb().getFirstname(), fbFirstname);

//		WebElement lastname = driver.findElement(By.name("lastname"));
//		lastname.sendKeys("S");
		String fbLastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbLastname();
		passInput(sdp.getFb().getLastname(), fbLastname);

//		WebElement fbphnumber = driver.findElement(By.name("reg_email__"));
//		fbphnumber.sendKeys("1425326243625225");
		String fbPhNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbPhNumber();
		passInput(sdp.getFb().getFbphnumber(), fbPhNumber);

//		WebElement newpass = driver.findElement(By.id("password_step_input"));
//		newpass.sendKeys("41522363@jsnj");
		String fbNewpass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbNewpass();
		passInput(sdp.getFb().getNewpass(), fbNewpass);

//		WebElement fbday = driver.findElement(By.id("day"));
//		Select fbdaysselect = new Select(fbday);
//		fbdaysselect.selectByVisibleText("7");
		String fbDay = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbDay();
		selectDropDown(sdp.getFb().getFbday(), fbDay);

//		WebElement fbmonth = driver.findElement(By.id("month"));
//		Select fbmonthsselect = new Select(fbmonth);
//		fbmonthsselect.selectByVisibleText("Apr");
		String fbmonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbmonth();
		selectDropDown(sdp.getFb().getFbmonth(), fbmonth);

//		WebElement fbyear = driver.findElement(By.id("year"));
//		Select fbyearsselect = new Select(fbyear);
//		fbyearsselect.selectByVisibleText("2002");
		String fbYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbYear();
		selectDropDown(sdp.getFb().getFbyear(), fbYear);

//		WebElement fbgender = driver.findElement(By.xpath("//input[@value='2']"));
//		fbgender.click();
		clickOnElement(sdp.getFb().getFbgender());

//		WebElement fbsubmitbtn = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
//		fbsubmitbtn.click();
//		Thread.sleep(2000);
		clickOnElement(sdp.getFb().getFbsubmitbtn());
		wait(2000);

//		TakesScreenshot facebook = (TakesScreenshot) driver;
//		File source = facebook.getScreenshotAs(OutputType.FILE);
//		File destination = new File("Screenshot" + "\\createac.png");
//		FileUtils.copyFile(source, destination);
		screenshot("fbpage");

//		driver.close();
		closeBrowser();

	}

}
