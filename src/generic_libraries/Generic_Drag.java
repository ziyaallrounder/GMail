package generic_libraries;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Generic_Drag 
{
	public void browserDrag(int x,int y, WebDriver driver)
	{
		Point p=new Point(x,y);
		driver.manage().window().setPosition(p);
	}
			
}
