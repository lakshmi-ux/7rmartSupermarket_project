package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	public void selectValueUsingSelectByValue(WebElement dropdown, String Value) {
		Select select = new Select(dropdown);
		select.selectByValue(Value);
	}
	public void scrollUpPage(JavascriptExecutor driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	}
	public void scrollDownPage(JavascriptExecutor driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}
	public void actionsMouseHover(WebDriver driver, WebElement object ) {
		Actions actions= new Actions(driver);
		actions.moveToElement(object).build().perform();
	}
	public void actionsDoubleClick(WebDriver driver, WebElement object ) {
		Actions actions= new Actions(driver);
		actions.doubleClick(object).build().perform();
	}
	public void actionsRightClick(WebDriver driver, WebElement object ) {
		Actions actions= new Actions(driver);
		actions.contextClick(object).build().perform();
	}
	public void actionsToDragAndDrop(WebDriver driver, WebElement dragObject, WebElement dropObject ) {
		Actions actions= new Actions(driver);
		actions.dragAndDrop(dragObject, dropObject).build().perform();
	}
	
	public void alertActions(WebDriver driver) {
		String alertValue=driver.switchTo().alert().getText();
	}
	

}
