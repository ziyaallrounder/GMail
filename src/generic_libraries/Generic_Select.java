package generic_libraries;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Select 
{
	public void selectIndex(WebElement ele, int index)
	{
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	
	public void selectValue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
		
	}
	
	public void selectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void deselectIndex(WebElement ele,int index)
	{
		Select s=new Select(ele);
		s.deselectByIndex(index);
	}
	
	public void deselectValue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
		
	}
	public void deselectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	
	public void deselectall(WebElement ele)
	{
		Select s=new Select(ele);
		s.deselectAll();
	}
	
	public int count_options(WebElement ele)
	{
		Select s=new Select(ele);
		 List<WebElement> options = s.getOptions();
		 int count=options.size();
		 System.out.println(count);
		return count;
		
	}
	
	public int AllSelectedOptions (WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> options = s.getAllSelectedOptions();
		int count=options.size();
		
		return  count;
	}
}
