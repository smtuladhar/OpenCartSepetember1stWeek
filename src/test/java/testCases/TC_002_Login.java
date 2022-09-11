package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_Login  extends BaseClass{

	
	@Test(groups= {"master","sanity"})
	public void test_Login() throws IOException {
		
	logger.info(" Starting Login test");
	try {
		
		
	driver.get(rb.getString("appURL"));
	driver.manage().window().fullscreen();
	logger.info(" Home Screen Launched");
	
	HomePage hm= new HomePage(driver);
	
	hm.ClickMyAccount();
	logger.info(" Clicked My account on Homepage");
	hm.ClickLogin();
	logger.info(" Clicked Login on home Page");
	
	LoginPage lg= new LoginPage(driver);
	lg.setEmail("kiss@gmail.com");
	
	logger.info(" Entered email on login screen on Login Page");
	lg.setPassword("mE2@lms+12");
	logger.info(" Entered Password on login screen on Login Page");
	lg.clickLogin();
	logger.info(" Clicked Login button on Login Page ");
	
	}
	catch( Exception e) {
		
		logger.info("Login test failed");
		captureScreen(driver, "LoginTest");
		Assert.fail();
	}
	
	logger.info(" Login successful");
	}
}
