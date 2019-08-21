package pom;

import generic_libraries.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage extends Base_Page 
{
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement comp;
	
	@FindBy(name="to")
	private WebElement toaddress;
	
	@FindBy(name="subjectbox")
	private WebElement sub;
	
	@FindBy(xpath="//div[@class='Am Al editable LW-avf']")
	private WebElement b;
	
	@FindBy(xpath="(//div[.='Send'])[3]")
	private WebElement sendbutton;
	
	@FindBy(xpath="//span[@class='gb_Ba gbii']")
	private WebElement logo;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signoutbutton;
	
	public GmailHomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void composeMail()
	{
		comp.click();
	}
	
	public void inputToAddress(String to)
	{
		toaddress.sendKeys(to);
		
		
	}
	
	public void inputSubject(String s)
	{
		sub.sendKeys(s);
	}
	
	public void inputBody(String body)
	{
		b.sendKeys(body);
		
	}
	
	public void sendButton()
	{
		sendbutton.click();
	}
	
	public void signOut()
	{
		logo.click();
		signoutbutton.click();
		
	}
	

}
