package com.it.bd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



import com.it.bd.drivers.PageDriver;
import com.it.bd.utilities.commonMethods;

import bsh.This;

public class DashboardPage extends commonMethods {

 public void DashboardPage() {
	 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	 
 }
	  @FindBys ({
		 @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]")
     })
	WebElement adminOption;
	
	 
	 public void clickAdmin ()  { 
		 try {
			 if (adminOption.isDisplayed()) {
				adminOption.click();
				timeout();
			 }
				
		 } catch (Exception e) {
			 System.out.println();
			
		}	
			
		 
		 
		 
	
		 }
	 }
