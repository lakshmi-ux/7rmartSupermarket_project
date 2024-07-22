package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    
   /* @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page']//child::i[@class='fas fa-arrow-circle-right']") WebElement managePages;
    @FindBy(xpath="//a[@onclick='click_button(2)']") WebElement manageSearchButton;
    @FindBy(xpath="//input[@placeholder='Title']") WebElement enterTitle;
    @FindBy(xpath="//button[@name='Search']") WebElement submitManageSearchButton;*/
    
    @FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetUser;
    
    @FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButton;
    @FindBy(xpath="//input[@id='username']") WebElement usernameField;
    @FindBy(xpath="//input[@id='password']") WebElement passwordField;
    @FindBy(xpath="//button[@name='Create']") WebElement saveButton;
    
    
  
    public void verifyAdminUsersNavigated() {
    	adminUsers.click();
    }
    public void clickOnSearchButton() {
    	searchButton.click();
    }
    public void enterAdminUsernameOnUsernameField(String adminUsername) {
    	verifyAdminUsername.sendKeys(adminUsername);
    }
    public void clickOnSubmitSearchButton() {
    	submitSearchButton.click();
    	String searchedValue= submitSearchButton.getText();
   }
    public boolean verifySearchedAdminUser() {
    	boolean isSearchedUserFound= verifyAdminUsername.isDisplayed();
		return isSearchedUserFound;
   }
    
    //new TC
   /* public void verifyManagePagesNavigated() {
    	managePages.click();
    }
    public void clickOnManageSearchButton() {
    	manageSearchButton.click();
    }
    public void enterTitleOnTitleField(String titleField ) {
    	enterTitle.sendKeys(titleField);
    }
    public void clickOnManageSubmitSearchButton() {
    	submitManageSearchButton.click();
    	String manageSearchedValue= submitManageSearchButton.getText();
    }
    public boolean verifySearchedTitle() {
    	boolean isSearchedTitleFound= enterTitle.isDisplayed();
		return isSearchedTitleFound;
   }*/
    //new TC 2
    public void clickOnResetButton() {
    	resetUser.click();
    }
    public boolean verifyUserGotReset() {
    	boolean isUserGotReset= verifyAdminUsername.isEnabled();
		return isUserGotReset;
   }
    //add button TC
    public void clcikOnNewButton() {
    	newButton.click();
    }
    public void enterNewAdminUsername(String username) {
    	usernameField.sendKeys(username);
    }
    public void enterNewAdminPassword(String password) {
    	passwordField.sendKeys(password);
    }
    public void clcikOnSaveButton() {
    	saveButton.click();
    }
    public boolean verifyNewUserGotAdded() {
    	boolean isUserGotAdded = usernameField.isDisplayed();
    	return isUserGotAdded;
    }
    public boolean verifyNewUserGotAddedThroughPassword() {
    	boolean isUserGotAddedPassword = passwordField.isDisplayed();
    	return isUserGotAddedPassword;
    }
 	
}
