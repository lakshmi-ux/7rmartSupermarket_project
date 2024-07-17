package testscripts;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base {
@Test
	
	public void verifyWhetherUserAbleToLoginUsingValidUsernameAndPassword() {
		String usernameValue= "admin";
		String passwordValue= "admin";
		WebElement verifyUsername= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername.sendKeys(usernameValue);
		String Username= verifyUsername.getText();
		WebElement verifyPassword= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword.sendKeys(passwordValue);
		String password= verifyPassword.getText();
		
		WebElement signInButton= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement homePage= driver.findElement(By.linkText("Home"));
		boolean actualPage = homePage.isDisplayed();
		assertTrue(actualPage, "User unable to login using valid username and password");
		}
	
	@Test
	public void verifyWhetherUserAbleToLoginWithInvalidUsernameAndValidPassword() {
		String usernameValue= "admin";
		String passwordValue= "adminology";
		WebElement verifyUsername= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername.sendKeys(usernameValue);
		String Username= verifyUsername.getText();
		WebElement verifyPassword= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword.sendKeys(passwordValue);
		String password= verifyPassword.getText();
		
		WebElement signInButton1= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton1.click();
		
		WebElement errorMessage= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean invalidErrorMessage = errorMessage.isDisplayed();
		WebElement homePage= driver.findElement(By.linkText("7rmart supermarket"));
		boolean actualPage = homePage.isDisplayed();
		assertTrue(invalidErrorMessage==true&&actualPage==false, "User is able to login even username is invalid and no alert message shown");
		}
	
	@Test
	public void verifyWhetherUserAbleToLoginWithValidUsernameAndInvalidPassword() {
		String usernameValue= "dance";
		String passwordValue= "admin";
		WebElement verifyUsername= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername.sendKeys(usernameValue);
		String Username= verifyUsername.getText();
		WebElement verifyPassword= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword.sendKeys(passwordValue);
		String password= verifyPassword.getText();
		
		WebElement signInButton= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		
		WebElement errorMessage= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean invalidErrorMessage = errorMessage.isDisplayed();
		assertTrue(invalidErrorMessage, "Alert message is not displayed and user able to login using valid username and invalid password");
		
		WebElement homePage= driver.findElement(By.linkText("7rmart supermarket"));
		boolean actualPage = homePage.isDisplayed();
		assertTrue(actualPage, "User able to login using invalid password and valid username");
		
		}
	
	@Test
	public void verifyWhetherUserAbleToLoginWithBothInvalidUsernameAndPassword(){
		String usernameValue= "abc";
		String passwordValue= "adminology";
		WebElement verifyUsername= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername.sendKeys(usernameValue);
		String Username= verifyUsername.getText();
		WebElement verifyPassword= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword.sendKeys(passwordValue);
		String password= verifyPassword.getText();
		
		WebElement signInButton= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		
		WebElement errorMessage= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean invalidErrorMessage = errorMessage.isDisplayed();
		assertTrue(invalidErrorMessage, "Alert message is not displayed and user able to login using invalid username and invalid password");
		
		WebElement homePage= driver.findElement(By.linkText("7rmart supermarket"));
		boolean actualPage = homePage.isDisplayed();
		assertTrue(actualPage, "User able to login using invalid password and username");
		
		}

}

