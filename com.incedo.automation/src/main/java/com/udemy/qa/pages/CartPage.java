package com.udemy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.udemy.qa.base.TestBase;

public class CartPage extends TestBase{
	
	//Page Factory - OR:
	
			@FindBy(xpath="//span[@id='from-2085']//span[@class='price'][contains(text(),'₹129,990.00')]")
			WebElement productPrice;
			
			@FindBy(xpath="//span[@class='base']")
			WebElement productHeading;
			
			@FindBy(xpath="//a[@aria-label='store logo']//img")
			WebElement dellLogo;
			
			@FindBy(xpath="//button[@id='bundle-slide']")
			WebElement buyBtn;
			
			//Initializing the Page Objects:
			public CartPage(){
				PageFactory.initElements(driver, this);
			}
			
			//Actions:
			public String validateCartPageTitle(){
				return driver.getTitle();
			}
			
			public boolean validateDellImage(){
				return dellLogo.isDisplayed();
			}
			//Input:
			public void ClickOnBuyBtn() {
				buyBtn.click();
				
				}

	
}
