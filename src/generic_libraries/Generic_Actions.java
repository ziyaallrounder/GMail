package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Actions 
{
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	public void dragdrop(WebDriver driver, WebElement src,WebElement tgt)
	{
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, tgt).perform();
	}
	
	public void rigthClick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	public void douClick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();		
		
	}

}
