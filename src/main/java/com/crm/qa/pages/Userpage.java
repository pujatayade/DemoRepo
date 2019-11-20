package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Userpage extends Testbase {
	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/div")
	WebElement User_list;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")
	WebElement Add_User;
	
	
	
	/*Initialization page objects */
	public Userpage() {
		PageFactory.initElements(driver, this);
	}
	
	/* Actions */
	public boolean validateuserlist() {
		return User_list.isDisplayed();
	}
	
	public Adduserpage validateadduser() {
		Add_User.click();
		return new Adduserpage();
		
	}

		
		
}
