package scripts;

import generic_libraries.Generic_Test;

import org.testng.annotations.Test;

import pom.GMailUsernamePage;
import pom.GmailHomePage;
import pom.GmailPasswordPage;

public class SignInSignOut  extends Generic_Test
{
	@Test
	public void GMailSignInSignOut() throws InterruptedException
	{
		GMailUsernamePage g1=new GMailUsernamePage(driver);
		g1.putUsrName("ziya.allrounder");
		g1.UsrNameButton();
		
		Thread.sleep(3000);
		
		GmailPasswordPage p1=new GmailPasswordPage(driver);
		p1.putPassword("N00r_E_1lahi");
		p1.pwdButton();
		
		Thread.sleep(15000);
		GmailHomePage home=new GmailHomePage(driver);
		home.signOut();
		Thread.sleep(15000);
	}

}
