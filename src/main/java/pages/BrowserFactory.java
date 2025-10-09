package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	public static WebDriver driver;
	public static WebDriver startDriver(String URl)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URl);
		return driver;
		
	}

}
