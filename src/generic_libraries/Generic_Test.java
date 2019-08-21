package generic_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Auto_Const
{
	public WebDriver driver;
	
	static 
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@BeforeMethod
	public void openAppln()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	}
	
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}
	

}
