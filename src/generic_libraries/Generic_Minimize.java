package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Generic_Minimize 
{
	
		public void min() throws AWTException
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_N);
		}
}


