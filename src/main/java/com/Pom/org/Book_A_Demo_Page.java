package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Demo_Page {

	public static WebDriver driver;

	public Book_A_Demo_Page(WebDriver demopagedriver) {
		this.driver = demopagedriver;
		PageFactory.initElements(demopagedriver, this);
	}

	public WebElement getBookademo() {
		return bookademo;
	}

	public WebElement getBfullname() {
		return bfullname;
	}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhnumber() {
		return phnumber;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	@FindBy(xpath = "(//button[text()='Book a Free Demo'])[2]")
	private WebElement bookademo;

	@FindBy(xpath = "//input[@name='FullName']")
	private WebElement bfullname;

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement email;

	@FindBy(xpath = "//select[@id='Form_getForm_Country']")
	private WebElement country;

	@FindBy(xpath = "//input[@placeholder='Phone Number*']")
	private WebElement phnumber;

	@FindBy(xpath = "//input[@name='action_submitForm']")
	private WebElement submitbtn;

}
