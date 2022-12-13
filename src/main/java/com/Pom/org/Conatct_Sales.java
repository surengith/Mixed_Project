package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conatct_Sales {
	
	public static WebDriver driver;
	
	public Conatct_Sales(WebDriver conatctsalesdriver) {
		this.driver = conatctsalesdriver;
		PageFactory.initElements(conatctsalesdriver, this);
	}
	
	public WebElement getContactsales() {
		return contactsales;
	}

	public WebElement getCfullname() {
		return cfullname;
	}

	public WebElement getCphnumber() {
		return cphnumber;
	}

	public WebElement getCemail() {
		return cemail;
	}

	public WebElement getCcountry() {
		return ccountry;
	}

	public WebElement getCemployees() {
		return cemployees;
	}

	public WebElement getCjobtitle() {
		return cjobtitle;
	}

	public WebElement getCtextarea() {
		return ctextarea;
	}

	public WebElement getCsubmitbtn() {
		return csubmitbtn;
	}
	
	@FindBy(xpath = "(//button[text()='Contact Sales'])[2]")
	private WebElement contactsales;

	@FindBy(id = "Form_getForm_FullName")
	private WebElement cfullname;

	@FindBy(id = "Form_getForm_Contact")
	private WebElement cphnumber;

	@FindBy(name = "Email")
	private WebElement cemail;

	@FindBy(xpath = "//select[@id='Form_getForm_Country']")
	private WebElement ccountry;

	@FindBy(xpath = "//select[@id='Form_getForm_NoOfEmployees']")
	private WebElement cemployees;

	@FindBy(id = "Form_getForm_JobTitle")
	private WebElement cjobtitle;

	@FindBy(name = "Comment")
	private WebElement ctextarea;

	@FindBy(id = "Form_getForm_action_submitForm")
	private WebElement csubmitbtn;

}
