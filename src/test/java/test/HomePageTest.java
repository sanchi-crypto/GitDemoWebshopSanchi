package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BrowserFactory;
import pages.HomePage;

public class HomePageTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=BrowserFactory.startDriver("https://demo.nopcommerce.com/login");
		}
	
	@Test
	public void loginToApp() {
		HomePage loginpage=new HomePage(driver);
		loginpage.enterEmail("testuser@test.com");
		loginpage.enterPassword("Test@123");
		loginpage.clickLogin();
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	private void Sysout() {
		// TODO Auto-generated method stub

		System.out.println("HI I am sanchi");
		System.out.println("HI I am sanchi punjani");
	}

}
