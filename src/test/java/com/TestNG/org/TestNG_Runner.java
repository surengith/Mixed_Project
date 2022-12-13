package com.TestNG.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base_Class.org.Base_Class;
import com.Properties.org.File_Reader_Manager;
import com.beust.jcommander.Parameter;

import junit.framework.Assert;

public class TestNG_Runner {

	public static WebDriver driver;
	public ChromeOptions op;

	@BeforeSuite
	public void setupDriver() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		op = new ChromeOptions();
		op.addArguments("--disable-notifications");
	}

	@BeforeTest
	public void launchBrowser() {

		driver = new ChromeDriver(op);
	}

	@BeforeClass
	public void browserMaximize() {
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void launchUrl() {
		driver.get("https://www.orangehrm.com/");
	}

	@Test(groups = "orangehrm", enabled = true)
	public void bookADemo() throws InterruptedException, AWTException {

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement bookademo = driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]"));
		bookademo.click();

		WebElement bfullname = driver.findElement(By.xpath("//input[@name='FullName']"));
		bfullname.sendKeys("Ramesh");

		WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
		email.sendKeys("ramesh@gmail.com");

		WebElement country = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		Select countryselect = new Select(country);
		countryselect.selectByVisibleText("Australia");

		WebElement phnumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number*']"));
		phnumber.sendKeys("36251453636");
		Thread.sleep(15000);

		WebElement submitbtn = driver.findElement(By.xpath("//input[@name='action_submitForm']"));
		submitbtn.click();
	}

	@Test(groups = "orangehrm", dataProvider = "input", enabled = false)
	@Parameters({ "email", "country", "phnumber" })
	public void contactSales(String email, String country, String phnumber) throws InterruptedException {
		WebElement contactsales = driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]"));
		contactsales.click();

		WebElement cfullname = driver.findElement(By.id("Form_getForm_FullName"));
		cfullname.sendKeys("Ramesh");

		WebElement cphnumber = driver.findElement(By.id("Form_getForm_Contact"));
		cphnumber.sendKeys(phnumber);

		WebElement cemail = driver.findElement(By.name("Email"));
		cemail.sendKeys(email);

		WebElement ccountry = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		Select ccountryselect = new Select(ccountry);
		ccountryselect.selectByVisibleText(country);

		WebElement cemployees = driver.findElement(By.xpath("//select[@id='Form_getForm_NoOfEmployees']"));
		Select cemployeesselect = new Select(cemployees);
		cemployeesselect.selectByVisibleText("101 - 150");

		WebElement cjobtitle = driver.findElement(By.id("Form_getForm_JobTitle"));
		cjobtitle.sendKeys("selenium");

		WebElement ctextarea = driver.findElement(By.name("Comment"));
		ctextarea.sendKeys("Hello");
		Thread.sleep(10000);

		WebElement csubmitbtn = driver.findElement(By.id("Form_getForm_action_submitForm"));
		csubmitbtn.click();
	}

	@DataProvider
	public Object[][] input() {

		return new Object[][] { { "jjjjj@gamil.com", "Australia", "662552253" },
				{ "kkkkk@gamil.com", "Russian Federation", "662552253" }, { "lllll@gamil.com", "China", "662552253" }

		};
	}

	@Test(groups = "social media", enabled = false)
	public void instagram() {

		System.out.println("Instagram");
	}

	@Test(groups = "social media", enabled = false)
	public void whatsApp() {

		System.out.println("WhatsApp");
	}

	@Test(groups = "media", enabled = false)
	public void linkedIn() {

		System.out.println("LinkedIn");
	}

	@Test(groups = "media", enabled = false)
	public void youtube() {

		System.out.println("Youtube");
	}

	@Test(groups = "orangehrm", enabled = false)
	public void facebook() throws InterruptedException {
		driver.navigate().to("https://www.facebook.com/");

		WebElement csignupfb = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		csignupfb.click();

		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("ramesh");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("S");

		WebElement fbphnumber = driver.findElement(By.name("reg_email__"));
		fbphnumber.sendKeys("1425326243625225");

		WebElement newpass = driver.findElement(By.id("password_step_input"));
		newpass.sendKeys("41522363@jsnj");

		WebElement fbday = driver.findElement(By.id("day"));
		Select fbdaysselect = new Select(fbday);
		fbdaysselect.selectByVisibleText("7");

		WebElement fbmonth = driver.findElement(By.id("month"));
		Select fbmonthsselect = new Select(fbmonth);
		fbmonthsselect.selectByVisibleText("Apr");

		WebElement fbyear = driver.findElement(By.id("year"));
		Select fbyearsselect = new Select(fbyear);
		fbyearsselect.selectByVisibleText("2002");

		WebElement fbgender = driver.findElement(By.xpath("//input[@value='2']"));
		fbgender.click();

		WebElement fbsubmitbtn = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		fbsubmitbtn.click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void screenshot() throws IOException {
		TakesScreenshot facebook = (TakesScreenshot) driver;
		File source = facebook.getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshot" + "\\createac.png");
		FileUtils.copyFile(source, destination);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
