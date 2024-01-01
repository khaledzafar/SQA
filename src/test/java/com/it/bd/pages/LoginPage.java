package com.it.bd.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.it.bd.drivers.PageDriver;
import com.it.bd.utilities.commonMethods;


import junit.framework.Assert;

public class LoginPage extends commonMethods{
	
	/*
	 * 1. PageFactory init
	 * 2. Locators
	 * 3. Function
	 */
	ExtentTest test;
	public LoginPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBys({
		@FindBy(xpath = "//input[@name='username']"),
		@FindBy(xpath = "//input[@placeholder='Username']"),
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	})
	WebElement userName;
	
	@FindBys({
		@FindBy(xpath = "//input[@name='password']")
	})
	WebElement password;
	
	@FindBys({
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button")
	})
	
	WebElement loginButton;
	
	public void login() {
		try {
			if (userName.isDisplayed()) {
				userName.sendKeys("Admin");
				timeout();
			}
			} catch (Exception e) {
				System.out.println(e);
				
		try {
			if (password.isDisplayed()) {
				password.sendKeys("Admin123");
				timeout();
				}
			
				} catch (Exception e2) {
				System.out.println(e);
					
		try {
			if (loginButton.isDisplayed()) {
			    loginButton.click();
			    timeout(5000);
				}
				} catch (Exception e3) {
				System.out.println(e);
									
					}		
				
			
				}
			}
	}
}

