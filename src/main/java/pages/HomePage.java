package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	WebElement emailField;
	
	@FindBy(id="Password")
	WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Log in']")
WebElement loginButton;
	
	//page actions
	
	public void enterEmail(String Email) {
		emailField.sendKeys(Email);
	}

	public void enterPassword(String Password)
	{
       passwordField.sendKeys(Password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
}
