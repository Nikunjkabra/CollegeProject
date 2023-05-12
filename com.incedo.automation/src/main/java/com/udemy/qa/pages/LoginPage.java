package com.udemy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.udemy.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
			@FindBy(xpath = "//input[@id='SignInModel_EmailAddress']")
			WebElement username;
			
			@FindBy(xpath="//input[@id='userPwd_UserInputSecret']")
			WebElement password;
			
			@FindBy(xpath="//input[@id='btnSignIn']")
			WebElement loginBtn;
			
			@FindBy(xpath="//div[@class='icon-brand-dell text-white']")
			WebElement dellLogo;
			
			//Initializing the Page Objects:
			public LoginPage(){
				PageFactory.initElements(driver, this);
			}
			
			//Actions:
			public String validateLoginPageTitle(){
				return driver.getTitle();
			}
			
			public boolean validateDellImage(){
				return dellLogo.isDisplayed();
			}
			
			public HomePage login(String un, String pwd) throws InterruptedException{
				username.sendKeys(un);
				password.sendKeys(pwd);
				Thread.sleep(10000);
				loginBtn.click();
			
				    	
				return new HomePage();
			}
		
	

}
