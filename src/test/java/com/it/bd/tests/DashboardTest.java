package com.it.bd.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.it.bd.drivers.BaseDriver;
import com.it.bd.drivers.PageDriver;
import com.it.bd.pages.DashboardPage;
import com.it.bd.pages.LoginPage;

public class DashboardTest extends BaseDriver {
	
	@BeforeClass
	public void openUrl () {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(null);
		} 
		
		@Test (priority = 0)
		public void dashBoardTest() throws InterruptedException {
			DashboardPage dashboardPage = new DashboardPage();
			
			dashboardPage.clickAdmin();
		}
		
		@AfterClass
		public void afterClass() {
		}

}
