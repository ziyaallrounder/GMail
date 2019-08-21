package scripts;

import generic_libraries.Excel;
import generic_libraries.GenericRead;
import generic_libraries.Generic_Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.GMailUsernamePage;
import pom.GmailHomePage;
import pom.GmailPasswordPage;


public class SendMail extends Generic_Test
{
	@Test
	public void composeMailOne() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
	GMailUsernamePage g1=new GMailUsernamePage(driver);
	Thread.sleep(3000);
	
    String un = Excel.getCellValue("Sheet1",1,0);
	
	g1.putUsrName(un);
	Thread.sleep(3000);
	g1.UsrNameButton();
	Thread.sleep(3000);
	
	GmailPasswordPage p1=new GmailPasswordPage(driver);
	String pwd = Excel.getCellValue("Sheet1",1,1); 
		p1.putPassword(pwd);
		Thread.sleep(3000);
		p1.pwdButton();
		Thread.sleep(3000);
		
	GmailHomePage h=new GmailHomePage(driver);
	h.composeMail();
	Thread.sleep(3000);
	String toaddress = Excel.getCellValue("Sheet1",1,2); 
	h.inputToAddress(toaddress);
	Thread.sleep(3000);
	String subject = Excel.getCellValue("Sheet1",1,3);
	h.inputSubject(subject);
	Thread.sleep(3000);
	String body = Excel.getCellValue("Sheet1",1,4); 
	h.inputBody(body);
	Thread.sleep(3000);
	h.sendButton();
	Thread.sleep(15000);
	h.signOut();
	Thread.sleep(15000);
	
	}

}
