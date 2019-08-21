package generic_libraries;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class Generic_Browser_Resize 
{
	public void browserResize(WebDriver driver, int x,int y)
	{
		Dimension d=new Dimension(x,y);
		driver.manage().window().setSize(d);
		
	}
}
