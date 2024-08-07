package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final long EXPLICITWAIT=10;
	public static final long IMPLICITWAIT=10;
	
    public void clickableWait(WebDriver driver, WebElement element ) {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
   public void visibleWait(WebDriver driver, WebElement element ) {
   	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
   	 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By) element));
   	}
    public void prescenceOfWait(WebDriver driver, WebElement element ) {
      	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
      	 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));
    }
    public void elementSelectionOfWait(WebDriver driver, WebElement element ) {
     	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
     	 wait.until(ExpectedConditions.elementSelectionStateToBe(element, false));
   }
    public void invisibilityOfWait(WebDriver driver, WebElement element ) {
     	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
     	 wait.until(ExpectedConditions.invisibilityOfAllElements(element));
   }
    public void visibilityOfFluentWait(WebDriver driver, WebElement element) {
    	 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
 	            .withTimeout(Duration.ofSeconds(30))
 	            .pollingEvery(Duration.ofSeconds(5))
 	            .ignoring(NoSuchElementException.class);
 	    fluentWait.until(ExpectedConditions.visibilityOf(element));
    }
    public void PresenceOfFluentWait(WebDriver driver, WebElement element) {
   	 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(30))
	            .pollingEvery(Duration.ofSeconds(5))
	            .ignoring(NoSuchElementException.class);
	    fluentWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));
   }
    
}
