package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@type='text']") WebElement verifyUsername;
	@FindBy(xpath="//input[@type='password']") WebElement verifyPassword;
    @FindBy(xpath="//button[@type='submit']") WebElement signInButton;
    @FindBy(linkText="Home") WebElement homePage;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement errorMessage;
    @FindBy(linkText="7rmart supermarket") WebElement homePageReturnLogin;
    
    
    public LoginPage enterUsernameOnUsernameField(String username) {
    	verifyUsername.sendKeys(username);
    	return this;
    }
    public LoginPage enterPasswordOnPasswordField(String password) {
    	verifyPassword.sendKeys(password);
    	return this;
    }
    public LoginPage clickOnSignInButton() {
    	signInButton.click();
    	return this;
    }
    public boolean verifyHomePageNavigated() {
    	boolean isHomepageNavigated=homePage.isDisplayed();
    	return isHomepageNavigated;
    }
    public boolean verifyHomePageNotNavigated() {
    	boolean isHomepageNotNavigated=homePageReturnLogin.isDisplayed();
    	return isHomepageNotNavigated;
    }

}
