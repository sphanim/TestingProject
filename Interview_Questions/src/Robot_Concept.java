

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_Concept {

	public static void main(String[] args) throws AWTException {
		System.out.println("main Class");
		// TODO Auto-generated method stub
		Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_E);
	}

}
