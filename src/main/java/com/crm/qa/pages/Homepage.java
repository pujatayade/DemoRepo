package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Homepage extends Testbase{
	/* PageFactory = OR */
	@FindBy(xpath = "/html/body/div/div[1]/section[1]/h1")
	WebElement Dashboard;
	
	@FindBy(xpath = "/html/body/div/aside/section/ul/li[3]/a/span")
	WebElement Users;
	
	@FindBy(xpath = "//a[@href='operators.html']")
	WebElement Operators;
	
	@FindBy(xpath = "/html/body/div/aside/section/ul/li[5]/a/span")
	WebElement Usefulinks;
	
	@FindBy(xpath = "/html/body/div/aside[1]/section/ul/li[6]/a/span")
	WebElement Downloads;

	
	/** Initialization page objects */
	public Homepage() {
		PageFactory.initElements(driver, this);

	}
    /* Actions */
   public String validatetitlepage() {
	   return driver.getTitle();
   }
	
   public boolean validatedashboard() {
	return Dashboard.isDisplayed();
	
}
   public Userpage clickUsers() {
	    Users.click();
	    return new Userpage();
   }
   
   public Operatorspage clickoperators() {
	   Operators.click();
	   return new Operatorspage();
   }
   
   public Usefullinkpage clickusefullinks() {
	   Usefulinks.click();
	   return new Usefullinkpage();
	   
   }
   
   public Downloadlinkpage clickdownloads() {
	   Downloads.click();
	   return new Downloadlinkpage();
   }
}
