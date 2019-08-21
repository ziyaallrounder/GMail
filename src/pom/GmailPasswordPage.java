package pom;

import generic_libraries.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPasswordPage extends Base_Page
{
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement nextButton;
	
	public GmailPasswordPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void putPassword(String passwd)
	{
		pwd.sendKeys(passwd);
	}
	
	public void pwdButton()
	{
		nextButton.click();
		
	}

}
