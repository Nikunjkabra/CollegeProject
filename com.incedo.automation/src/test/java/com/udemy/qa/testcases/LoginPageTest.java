package com.udemy.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.udemy.qa.base.TestBase;
import com.udemy.qa.pages.CartPage;
import com.udemy.qa.pages.CoursePage;
import com.udemy.qa.pages.HomePage;
import com.udemy.qa.pages.LoginPage;
import com.udemy.qa.pages.ProductPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	CoursePage coursePage;
	CartPage cartPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
//	@Test(priority=1)
//	public void loginPageTitleTest(){
//		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals(title, "Sign In | Dell US");
//	}
//	
//	@Test()
//	public void DellLogoImageTest(){
//		boolean flag = loginPage.validateDellImage();
//		Assert.assertTrue(flag);
//	}
	
	@Test()
	 
	
	public void loginTest() throws InterruptedException{
		String titleLogin = loginPage.validateLoginPageTitle();
		Assert.assertEquals(titleLogin, "Sign In | Dell US");
	
	    boolean flag = loginPage.validateDellImage();
	    Assert.assertTrue(flag);
		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String titleHome = homePage.validateHomePageTitle();
		Assert.assertEquals(titleHome, "Sign In | Dell US");
		
		productPage = homePage.SearchLaptop();
		
		
		coursePage = productPage.ClickProcuct();
        cartPage = coursePage.ClickBuyBtn();
		cartPage.ClickOnBuyBtn();
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
