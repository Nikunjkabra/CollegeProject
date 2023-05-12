package com.udemy.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.udemy.qa.base.TestBase;

public class CoursePage extends TestBase{
	
	

	//Page Factory - OR:
	
		@FindBy(xpath="//div[@class='mb-1']//span[@class='h3 font-weight-bold mb-1 text-nowrap sale-price'][contains(text(),'₹ 1,29,989.98')]")
		WebElement productPrice;
		
		@FindBy(xpath="//h1[@class='mb-md-0 mr-4 d-inline']//span[@class='page-title'][normalize-space()='XPS 13 Laptop']")
		WebElement productHeading;
		
		@FindBy(xpath="//a[@aria-label='Dell Technologies Home']//div//*[name()='svg']")
		WebElement dellLogo;
		
		@FindBy(xpath ="//div[@class='d-none d-md-flex upd-ctas']//a[@class='btn btn-success'][normalize-space()='Buy Now']")
		WebElement buyBtn;
		
		//Initializing the Page Objects:
		public CoursePage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateCoursePageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateDellImage(){
			return dellLogo.isDisplayed();
		}
		//Input:
		public CartPage ClickBuyBtn(){
			buyBtn.click();
			
			
			Set<String> wnd = driver.getWindowHandles();
			// window handles iterate
		 Iterator<String> i = wnd.iterator();
		String popwnd = i.next();
			String prntw = i.next();
		// switching pop up tab
		 driver.switchTo().window(prntw);
		 System.out.println(driver.getTitle() + " title");
			
			
			return new CartPage();
	
		}

}
