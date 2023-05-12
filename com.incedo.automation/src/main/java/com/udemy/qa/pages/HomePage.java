package com.udemy.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.udemy.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory - OR:
		
	@FindBy(xpath="//input[@id='mh-search-input']")
	WebElement search_box;
	
	@FindBy(xpath="//button[@aria-label='Search Dell']")
	WebElement searchBtn;
	
	@FindBy(xpath="//a[@aria-label='Dell Technologies Home']")
	WebElement dellLogo;
	
	@FindBy(xpath="//a[@aria-label='Nikunj']//span[@class='flyoutIconWrapper ']")
	WebElement userLogo;
	
	@FindBy(xpath="//*[@id=\"ooc-destination-country\"]")
	WebElement indiabtn;
	
	//Initializing the Page Objects:
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateDellImage(){
		return dellLogo.isDisplayed();
	}
	//Input:
	public ProductPage SearchLaptop() throws InterruptedException{
		indiabtn.click();
		search_box.sendKeys("xps 13");
		searchBtn.click();
		
		return new ProductPage();
		
		    	
	
	}
	
	

}
