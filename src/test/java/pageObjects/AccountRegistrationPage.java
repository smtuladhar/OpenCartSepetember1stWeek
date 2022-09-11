package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {

	WebDriver driver;
	
	
	public AccountRegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	WebElement txtFirstName;
	
	
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-newsletter-no']")
	WebElement btnNewsletter;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement btnAgree;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public void SetFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	public void SetLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	public void Setemail(String email) {
		txtEmail.sendKeys(email);
	}
	public void SetPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void SetNewsletter() {
		btnNewsletter.click();
	}
	public void SetPolicy() {
		btnContinue.click();
	}
	
	public void SetContinue() {
		btnContinue.click();
	}
}
