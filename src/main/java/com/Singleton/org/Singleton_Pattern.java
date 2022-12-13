package com.Singleton.org;

import org.openqa.selenium.WebDriver;
import com.Pom.org.Book_A_Demo_Page;
import com.Pom.org.Conatct_Sales;
import com.Pom.org.FaceBook_Page;

public class Singleton_Pattern {

	public static WebDriver driver;

	public Singleton_Pattern(WebDriver singletondriver) {
		this.driver = singletondriver;
	}

	public Book_A_Demo_Page getDemopage() {
		demopage = new Book_A_Demo_Page(driver);
		return demopage;
	}

	public Conatct_Sales getContact() {
		contact = new Conatct_Sales(driver);
		return contact;
	}

	public FaceBook_Page getFb() {
		fb = new FaceBook_Page(driver);
		return fb;
	}

	private Book_A_Demo_Page demopage;

	private Conatct_Sales contact;

	private FaceBook_Page fb;
}
