package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectValueUsingSelectByVisibleText(WebElement dropdown, String VisibleText) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(VisibleText);
	}
	public void selectValueUsingSelectByIndexValue(WebElement dropdown, int index) {
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	public void selectValueUsingSelectByVisibleValue(WebElement dropdown, String VisibleValue) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(VisibleValue);
	}
	
	

}
