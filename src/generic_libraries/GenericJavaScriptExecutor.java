package generic_libraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericJavaScriptExecutor 
{
	public void scrollByJavaScriptExecutor(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Point p=ele.getLocation();
		int x=p.getX();
		System.out.println(x);
		int y=p.getY();
		System.out.println(y);
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}

}
