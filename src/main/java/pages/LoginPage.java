package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public WebElement driver;
	public LoginPage(WebElement driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//input[@type='text']") WebElement verifyUsername;
	@FindBy(xpath="//input[@type='password']") WebElement verifyPassword;
    @FindBy(xpath="//button[@type='submit']") WebElement signInButton;
   // @FindBy(By.linkText("Home")) WebElement homePage;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement errorMessage;
    //@FindBy(By.linkText("7rmart supermarket")) WebElement homePageReturnLogin;

}
