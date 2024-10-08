package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

public class FileUtilityFile {
	
	public void fileUploadUsingRobotClass(String filePath) throws AWTException {
    	StringSelection ss = new StringSelection(filePath);
    		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    		Robot robot = new Robot();
    		robot.delay(250);
    		robot.keyPress(KeyEvent.VK_ENTER);
    		robot.keyRelease(KeyEvent.VK_ENTER);
    	    robot.keyPress(KeyEvent.VK_CONTROL);
    		robot.keyPress(KeyEvent.VK_V);
    		robot.keyRelease(KeyEvent.VK_V);
    		robot.keyRelease(KeyEvent.VK_CONTROL);
    		robot.keyPress(KeyEvent.VK_ENTER);
    		robot.delay(90);
    		robot.keyRelease(KeyEvent.VK_ENTER);
    	}
    
    public void fileUploadUsingSendKeys(WebElement chooseFile, String filePath) {
    	chooseFile.sendKeys(filePath);
	}
	}


