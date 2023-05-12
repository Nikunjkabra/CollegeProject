package com.udemy.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.udemy.qa.base.TestBase;

public class ProductPage extends TestBase{
	
	
	//Page Factory - OR:
	

		@FindBy(xpath="//select[@id='sortDropdown4eff1bc2-bd54-484c-a6fd-613b8cbc35ce']")
		WebElement sortBtn;
		
		@FindBy(xpath="//a[@aria-label='Dell Technologies Home']")
		WebElement dellLogo;
		
		@FindBy(xpath="(//*[contains(text(),'XPS 13 Laptop')])[1]")
		WebElement productLink;
		
		
		//Initializing the Page Objects:
		public ProductPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateProductPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateDellImage(){
			return dellLogo.isDisplayed();
		}
		//Input:
		public CoursePage ClickProcuct(){
			productLink.click();
//			
//			Set<String> wnd = driver.getWindowHandles();
//			// window handles iterate
//		 Iterator<String> i = wnd.iterator();
//		String popwnd = i.next();
//			String prntw = i.next();
//		// switching pop up tab
//		 driver.switchTo().window(prntw);
//		 System.out.println(driver.getTitle() + " title");
//			
			return new CoursePage();
	
		}
}
