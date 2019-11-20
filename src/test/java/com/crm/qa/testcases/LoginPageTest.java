package com.crm.qa.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class LoginPageTest extends Testbase {
	Loginpage loginPage;
	Homepage homepage;
	
	public LoginPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new Loginpage();
	}
	
	@Test(priority=1)
	public void loginTest() {
		String title= loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "JavaByKiran | Log in");
		
	} 
	@Test(priority=2)
	public void logoTest() {
		boolean flag=loginPage.validatelogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void coursetype() {
		boolean flag= loginPage.validatecoursetype();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void login() {
		homepage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=5)
	public void Registertext() {
		loginPage.validateRegistertext();
	}
	
	@Test(priority=6)
	public void java_by_kiran() {
		String flag= loginPage.validate_java_by_kiran();
		String flag2= "Java By Kiran";
		Assert.assertEquals(flag, flag2);
	}
	
	@Test(priority=7)
	public void sign_in_to_start_your_session() {
		String flag= loginPage.validate_sign_in_to_start_your_session();
		String flag2= "Sign in to start your session";
		Assert.assertEquals(flag, flag2);
	}
	
	@Test(priority= 8)
	public void Check_placeholder_username() {
		String flag= loginPage.validate_Check_placeholder_username();
		String flag2= "Email";
		Assert.assertEquals(flag, flag2);
	}
	
	@Test(priority= 9)
	public void Check_placeholder_password() {
		String flag= loginPage.validate_Check_placeholder_password();
		String flag2= "Password";
		Assert.assertEquals(flag, flag2);
	}
	
	@Test(priority= 10)
	public void Check_Sign_in_button_color() {
		loginPage.validate_Sign_in_button_color();
	}

	@AfterMethod
	public void teerdown() {
		driver.quit();
	}
	
	

}
