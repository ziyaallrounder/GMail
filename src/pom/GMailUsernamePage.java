package pom;

import generic_libraries.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMailUsernamePage extends Base_Page
{
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement usrname;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement nextbutton;
	
	public GMailUsernamePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void putUsrName(String un)
	{
		usrname.sendKeys(un);
	}
	public void UsrNameButton()
	{
		nextbutton.click();
	}

}
