package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.Userpage;

public class Userpagetest extends Testbase {
	
	Loginpage loginPage;
	Homepage homepage;
	Userpage userpage;
	
	public Userpagetest() {
		super();
		}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new Loginpage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        userpage =  homepage.clickUsers();
		
	}
	@Test(priority=1)
	public void User_list() {
		Assert.assertTrue(userpage.validateuserlist());
		
	}
	
	@Test(priority=2)
	public void ValidateAdduser() throws InterruptedException {
		userpage.validateadduser();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void teerdown() {
		driver.quit();

}
	
	
}
