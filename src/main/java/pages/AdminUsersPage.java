package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.PageUtility;
import utilities.RandomDataUtility;

   public class AdminUsersPage {
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']//child::i[@class='fas fa-arrow-circle-right']") WebElement adminUsers;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
    @FindBy(xpath="//label[text()='Username']//following-sibling::input[@class='form-control']") WebElement verifyAdminUsername;
    @FindBy(xpath="//button[@value='sr']") WebElement submitSearchButton;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetUser;
    @FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButton;
    @FindBy(xpath="//input[@id='username']") WebElement usernameField;
    @FindBy(xpath="//input[@id='password']") WebElement passwordField;
    @FindBy(xpath="//button[@name='Create']") WebElement saveButton;
    @FindBy(xpath="//select[@id='user_type']") WebElement dropDown;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible'//child::h5[text()=' Alert!]") WebElement alertBox;
    @FindBy(xpath="//tbody//tr[1]") WebElement tableValue;
    
   public AdminUsersPage verifyAdminUsersNavigated() {
    	adminUsers.click();
    	return this;
    }
    public AdminUsersPage clickOnSearchButton() {
    	searchButton.click();
    	return this;
    }
    public AdminUsersPage enterAdminUsernameOnUsernameField(String adminUsername) {
    	verifyAdminUsername.sendKeys(adminUsername);
    	return this;
    }
    public AdminUsersPage clickOnSubmitSearchButton() {
    	submitSearchButton.click();
    	String searchedValue= submitSearchButton.getText();
    	return this;
   }
    public boolean isSearchedAdminUser() {
    	boolean isSearchedUserFound= verifyAdminUsername.isDisplayed();
		return isSearchedUserFound;
   }
    public AdminUsersPage clickOnResetButton() {
    	resetUser.click();
    	return this;
    }
    public boolean isUserGotReset() {
    	boolean isUserGotReset= verifyAdminUsername.isEnabled();
		return isUserGotReset;
   }
   
    public AdminUsersPage clcikOnNewButton() {
    	newButton.click();
    	return this;
    }
    public AdminUsersPage enterNewAdminUsername(String username) {
    	usernameField.sendKeys(username);
    	return this;
    }
    public AdminUsersPage enterNewAdminPassword(String password) {
    	passwordField.sendKeys(password);
    	return this;
    }
    public AdminUsersPage selectAnOption() {
    	PageUtility pageutility= new PageUtility();
    	pageutility.selectValueUsingSelectByVisibleText(dropDown, Constants.ROLE);
    	return this;
    }
    public AdminUsersPage clcikOnSaveButton() {
    	saveButton.click();
    	return this;
    }
    public void verifyAlertBoxMessage() {
    	PageUtility pageutility= new PageUtility();
    	pageutility.getAlert(driver);
    	//alertBox.getText();
    }
    public boolean isAlertMessageDisplayed() {
  //  String getAlertText=driver.switchTo().alert().getText();
    boolean isAlertDisplayed= alertBox.isDisplayed();
    return isAlertDisplayed;
    }
    public void getTableValue() {
    	tableValue.getText();
    }
    public boolean isValueDisplayed() {
    	boolean isTableValueDisplayed= tableValue.isDisplayed();
		return isTableValueDisplayed;
    	
    }
    
    
   /* public boolean isNewUserGotAdded() {
    	boolean isUserGotAdded = usernameField.isDisplayed();
    	return isUserGotAdded;
    }
    public boolean isNewUserGotAddedThroughPassword() {
    	boolean isUserGotAddedPassword = passwordField.isDisplayed();
    	return isUserGotAddedPassword;
    }*/
 	
}
