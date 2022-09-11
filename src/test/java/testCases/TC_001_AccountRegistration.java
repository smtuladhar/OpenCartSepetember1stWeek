package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {

	

	
	@Test(groups= {"regression","master"})
	public void test_account_registration() throws IOException {
		try
		{
		driver.get(rb.getString("appURL"));
		
		logger.info("Home page Displayed");
		driver.manage().window().fullscreen();
		
		HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		logger.info(" Clicked on my account");
		hp.ClickRegister();
		logger.info(" Clicked on register");
		AccountRegistrationPage reg= new AccountRegistrationPage(driver);
		reg.SetFirstName("John");
		logger.info(" Provided FirstName");
		reg.SetLastName("Adams");
		logger.info(" Provided LastName");
		reg.Setemail(randomString()+"gmail.com");
		logger.info(" Provided Email");
		reg.SetPassword("Ap#le902!");
		logger.info(" Provided Password");
		reg.SetNewsletter();
		logger.info(" Provided Newsletter decision");
		reg.SetPolicy();
		logger.info(" Provided Set Policy");
		reg.SetContinue();
		logger.info(" Provided Continue");
		
		
	
		}
		catch( Exception e) {
			logger.info(" Account Registration failed");
			captureScreen(driver,"TC_001_AccountRegistration");
			Assert.fail();
			
		}
		logger.info(" Account Registration Success");
		
	}
	

}
