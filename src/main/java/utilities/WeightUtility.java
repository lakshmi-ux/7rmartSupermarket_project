package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeightUtility {
	public static final long EXPLICITWAIT=10;
	public static final long IMPLICITWAIT=10;
    public void clickableWait(WebDriver driver, WebElement element ) {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
