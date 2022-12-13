package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Page {

	public static WebDriver driver;
	
	public FaceBook_Page(WebDriver facebookdriver) {
		this.driver = facebookdriver;
		PageFactory.initElements(facebookdriver, this);
	}

	public WebElement getCsignupfb() {
		return csignupfb;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getFbphnumber() {
		return fbphnumber;
	}

	public WebElement getNewpass() {
		return newpass;
	}

	public WebElement getFbday() {
		return fbday;
	}

	public WebElement getFbmonth() {
		return fbmonth;
	}

	public WebElement getFbyear() {
		return fbyear;
	}

	public WebElement getFbgender() {
		return fbgender;
	}

	public WebElement getFbsubmitbtn() {
		return fbsubmitbtn;
	}

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement csignupfb;

	@FindBy(name = "firstname")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement lastname;

	@FindBy(name = "reg_email__")
	private WebElement fbphnumber;

	@FindBy(id = "password_step_input")
	private WebElement newpass;

	@FindBy(id = "day")
	private WebElement fbday;

	@FindBy(id = "month")
	private WebElement fbmonth;

	@FindBy(id = "year")
	private WebElement fbyear;

	@FindBy(xpath = "//input[@value='2']")
	private WebElement fbgender;

	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement fbsubmitbtn;

}
