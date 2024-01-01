package com.it.bd.tests;


	
	import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
	import java.io.IOException;
    import java.net.URL;
    import java.security.PublicKey;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.it.bd.drivers.BaseDriver;
	import com.it.bd.drivers.PageDriver;
	import com.it.bd.pages.LoginPage;

	public class LoginTest {
		
		@BeforeClass
		public void openUrl () {
			PageDriver.getCurrentDriver().manage().window().maximize();
			PageDriver.getCurrentDriver().get(null);
			} 
			
			@Test (priority = 0)
			public void LoginTest() throws InterruptedException, IOException{
			LoginPage loginPage = new LoginPage(null);
			loginPage.login();
			}
			
			@AfterClass
			public void afterClass() {
			}
			

}
