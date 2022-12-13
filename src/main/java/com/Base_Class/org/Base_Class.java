package com.Base_Class.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import net.bytebuddy.asm.Advice.Return;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-notifications");
			driver = new ChromeDriver(op);
			driver.manage().window().maximize();
		}

		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\edgedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		return driver;

	}

	public static void launchUrl(String Url) {
		driver.get(Url);

	}

	public static void passInput(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void robotClass() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void selectDropDown(WebElement element, String value) {
		Select dropdown = new Select(element);
		List<WebElement> alloptions = dropdown.getOptions();
		for (WebElement option : alloptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}

	public static void wait(int value) throws InterruptedException {
		Thread.sleep(value);

	}

	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}

	public static void screenshot(String location) throws IOException {
		TakesScreenshot facebook = (TakesScreenshot) driver;
		File source = facebook.getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshot" + "\\" + location + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void closeBrowser() {
		driver.close();
	}

}
