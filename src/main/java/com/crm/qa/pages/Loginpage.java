package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase {

	/* PageFactory = OR */
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement username;

	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"form\"]/div[3]/div/button")
	WebElement signin;

	@FindBy(xpath = "/html/body/div/center/img")
	WebElement logo;

	@FindBy(xpath = "/html/body/div/div[1]/a/h4")
	WebElement coursetype;

	@FindBy(xpath = "/html/body/div/div[2]/a")
	WebElement Registertext;

	@FindBy(xpath = "/html/body/div/div[1]/a/b")
	WebElement java_by_kiran;

	@FindBy(xpath = "/html/body/div/div[2]/p")
	WebElement sign_in_to_start_your_session;

	@FindBy(id = "email")
	WebElement Check_placeholder_username;

	@FindBy(id = "password")
	WebElement Check_placeholder_password;
	
	@FindBy(xpath ="//*[@id=\"form\"]/div[3]/div/button")
	WebElement Sign_in_button_color;


		/* Initialization page objects */
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	/* Actions */
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean validatelogo() {
		return logo.isDisplayed();
	}

	public boolean validatecoursetype() {
		return coursetype.isDisplayed();

	}

	public Homepage login(String UN, String PW) {
		username.sendKeys(UN);
		password.sendKeys(PW);
		signin.click();
		return new Homepage();

	}

	public boolean validateRegistertext() {
		return Registertext.isDisplayed();

	}

	public String validate_java_by_kiran() {
		return java_by_kiran.getText();
	}

	public String validate_sign_in_to_start_your_session() {
		return sign_in_to_start_your_session.getText();
	}

	public String validate_Check_placeholder_username() {
		return Check_placeholder_username.getAttribute("placeholder");
	}
	
	public String validate_Check_placeholder_password() {
		return Check_placeholder_password.getAttribute("placeholder");
	}
	
	public void validate_Sign_in_button_color() {
		System.out.println("before mouse over button color is"+ Sign_in_button_color.getCssValue("background color"));
		Actions action = new Actions(driver);
		action.moveToElement(Sign_in_button_color).build().perform();
		System.out.println("after mouse over button color is"+ Sign_in_button_color.getCssValue("color"));
	}
}

