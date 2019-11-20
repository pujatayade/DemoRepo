package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Downloadlinkpage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.Operatorspage;
import com.crm.qa.pages.Usefullinkpage;
import com.crm.qa.pages.Userpage;

public class Homepagetest extends Testbase {
	Loginpage loginpage;
	Homepage homepage;
	Userpage userpage;
	Operatorspage operatorpage;
	Usefullinkpage usefullinkpage;
	Downloadlinkpage downloadlinkpage;

	public Homepagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void titlepage() {
		String title = homepage.validatetitlepage();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}
	
	@Test(priority = 2)
	public void ValidateUsers() {
		userpage = homepage.clickUsers();
		
	}
	
	@Test(priority = 3)
	public void ValidateOperators() {
		operatorpage = homepage.clickoperators();
	}
	
	@Test(priority = 4)
	public void Validateusefullinks() {
		usefullinkpage = homepage.clickusefullinks();
	}
	
	@Test(priority = 5)
	public void Validatedownloads() {
		downloadlinkpage = homepage.clickdownloads();
	}
	
	@AfterMethod
	public void teerdown() {
		driver.quit();

}
}
