package com.StepDefinition.org;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Base_Class.org.Base_Class;
import com.Properties.org.File_Reader_Manager;
import com.Singleton.org.Singleton_Pattern;
import com.TestRunner.org.Test_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;
	public static Singleton_Pattern sdp = new Singleton_Pattern(driver);

	@Given("user Must Launch The URL")
	public void user_must_launch_the_url() throws IOException, AWTException {
		String orangeUrl = File_Reader_Manager.getInstanceFRM().getInstanceCR().getOrangeUrl();
		launchUrl(orangeUrl);
		robotClass();
	}

	@When("user Must Click The Book A Free Demo Button")
	public void user_must_click_the_book_a_free_demo_button() {
		clickOnElement(sdp.getDemopage().getBookademo());
	}

	@When("user Enter The Name In The Full Name Field")
	public void user_enter_the_name_in_the_full_name_field() throws IOException {
		String bfullname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBfullname();
		passInput(sdp.getDemopage().getBfullname(), bfullname);
	}

	@When("user Enter The Email In The Business Email Field")
	public void user_enter_the_email_in_the_business_email_field() throws IOException {
		String bemail = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBemail();
		passInput(sdp.getDemopage().getEmail(), bemail);
	}

	@When("user Select The Country In The Country Field")
	public void user_select_the_country_in_the_country_field() throws IOException {
		String bCountry = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBCountry();
		selectDropDown(sdp.getDemopage().getCountry(), bCountry);
	}

	@When("user Enter The Phone Number In The Phone Number Field")
	public void user_enter_the_phone_number_in_the_phone_number_field() throws IOException, InterruptedException {
		String bPhNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getBPhNumber();
		passInput(sdp.getDemopage().getPhnumber(), bPhNumber);
		wait(15000);
	}

	@Then("user Click The Submit Button To Book A Free Demo")
	public void user_click_the_submit_button_to_book_a_free_demo() {
		clickOnElement(sdp.getDemopage().getSubmitbtn());
	}

	@When("user Click The Contact Sales Button To Register Their Details")
	public void user_click_the_contact_sales_button_to_register_their_details() {
		clickOnElement(sdp.getContact().getContactsales());
	}

	@When("user Enter The Name In The Your Full Name Field")
	public void user_enter_the_name_in_the_your_full_name_field() throws IOException {
		String cFullnamel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCFullnamel();
		passInput(sdp.getContact().getCfullname(), cFullnamel);
	}

	@When("user Enter The Phone Number In The Contact Page Phone Number Field")
	public void user_enter_the_phone_number_in_the_contact_page_phone_number_field() throws IOException {
		String cPhNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCPhNumber();
		passInput(sdp.getContact().getCphnumber(), cPhNumber);
	}

	@When("user Enter The Email {string} In The Contact Page Business Email Field")
	public void user_enter_the_email_in_the_contact_page_business_email_field(String cEmail) {
		passInput(sdp.getContact().getCemail(), cEmail);
	}

	@When("user Select The Country In The Contact Page Country Field")
	public void user_select_the_country_in_the_contact_page_country_field() throws IOException {
		String cCountry = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCCountry();
		selectDropDown(sdp.getContact().getCcountry(), cCountry);
	}

	@When("user Select The Employees In The Number Of Employees Field")
	public void user_select_the_employees_in_the_number_of_employees_field() throws IOException {
		String cEmployees = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCEmployees();
		selectDropDown(sdp.getContact().getCemployees(), cEmployees);
	}

	@When("user Enter The Job Title In The Job Title Field")
	public void user_enter_the_job_title_in_the_job_title_field() throws IOException {
		String cJobtitle = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCJobtitle();
		passInput(sdp.getContact().getCjobtitle(), cJobtitle);
	}

	@When("user Enter The Message In The Your Message Box Field")
	public void user_enter_the_message_in_the_your_message_box_field() throws IOException, InterruptedException {
		String cTextarea = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCTextarea();
		passInput(sdp.getContact().getCtextarea(), cTextarea);
		wait(15000);
	}

	@Then("user Click The Submit Button To Register Their Details")
	public void user_click_the_submit_button_to_register_their_details() {
		clickOnElement(sdp.getContact().getCsubmitbtn());
	}

	@When("user Nagivate To FaceBook Page")
	public void user_nagivate_to_face_book_page() throws IOException {
		String fbUrl = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbUrl();
		navigateTo(fbUrl);
	}

	@When("user Click The Create New Account Button")
	public void user_click_the_create_new_account_button() {
		clickOnElement(sdp.getFb().getCsignupfb());
	}

	@When("user Enter The First Name In The First Name Field")
	public void user_enter_the_first_name_in_the_first_name_field() throws IOException, InterruptedException {
		wait(2000);
		String fbFirstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbFirstname();
		passInput(sdp.getFb().getFirstname(), fbFirstname);
	}

	@When("user Enter The Last Name In The Sur Name Field")
	public void user_enter_the_last_name_in_the_sur_name_field() throws IOException {
		String fbLastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbLastname();
		passInput(sdp.getFb().getLastname(), fbLastname);

	}

	@When("user Enter The Mobile Number In The Mobile Number Or Email Address Field")
	public void user_enter_the_mobile_number_in_the_mobile_number_or_email_address_field() throws IOException {
		String fbPhNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbPhNumber();
		passInput(sdp.getFb().getFbphnumber(), fbPhNumber);
	}

	@When("User Enter The Password In The New Password Field")
	public void user_enter_the_password_in_the_new_password_field() throws IOException {
		String fbNewpass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbNewpass();
		passInput(sdp.getFb().getNewpass(), fbNewpass);
	}

	@When("user Select The Date {string} In The Date Of Birth DropDown Box")
	public void user_select_the_date_in_the_date_of_birth_drop_down_box(String fbDay) {
		selectDropDown(sdp.getFb().getFbday(), fbDay);
	}

	@When("user Select The Month {string} In The Date Of Birth DropDown Box")
	public void user_select_the_month_in_the_date_of_birth_drop_down_box(String fbmonth) {
		selectDropDown(sdp.getFb().getFbmonth(), fbmonth);
	}

	@When("user Select The Year In The Date Of Birth DropDown Box")
	public void user_select_the_year_in_the_date_of_birth_drop_down_box() throws IOException {
		String fbYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFbYear();
		selectDropDown(sdp.getFb().getFbyear(), fbYear);
	}

	@When("user Click The Male In The Gender Radio Button")
	public void user_click_the_male_in_the_gender_radio_button() {
		clickOnElement(sdp.getFb().getFbgender());
	}

	@Then("user Click The Sign Up Button And Immediately To Take Whole Page Screenshot")
	public void user_click_the_sign_up_button_and_immediately_to_take_whole_page_screenshot()
			throws InterruptedException, IOException {
		clickOnElement(sdp.getFb().getFbsubmitbtn());
		wait(2000);
		screenshot("fbpage");
	}
}
