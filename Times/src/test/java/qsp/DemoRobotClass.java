package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DemoRobotClass {

	public static void main(String[] args) throws IOException, AWTException {
    Runtime.getRuntime().exec("notepad");//open the notepad
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_SHIFT);//press the shift key
	r.keyPress(KeyEvent.VK_Q);//typing the cap's--> Q in NOTEPAD
	r.keyRelease(KeyEvent.VK_SHIFT);//releasing the shift key
	r.keyPress(KeyEvent.VK_S);//typing small -->s
	r.keyPress(KeyEvent.VK_P);//typing small -->p
    
	}

}
