package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManagePagesPage {
	public WebDriver driver;
	public ManagePagesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page']//child::i[@class='fas fa-arrow-circle-right']") WebElement navigateManagePages;
	@FindBy(xpath="//tbody//tr[8]") WebElement tableRow;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/delete?del=1527&page_ad=1']//child::i[@class='fas fa-trash-alt']") WebElement deleteRow;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchRow;
	@FindBy(xpath="//input[@placeholder='Title']") WebElement inputField ;
	@FindBy(xpath="//button[@type='submit']") WebElement submitButton;
	@FindBy(xpath="//td[text()='rose']") WebElement searchedRow;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/add']//child::i[@class='fas fa-edit']") WebElement addRow;
	@FindBy(xpath="//input[@placeholder='Enter the Title']") WebElement enterTitle;
	@FindBy(xpath="//input[@placeholder='Enter Page Name']") WebElement pageTitle;
	@FindBy(xpath="//button[@type='submit']") WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertBox;
	
	//@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']")WebElement resultFound;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/edit?edit=1515&page_ad=1'//child::i[@class='fas fa-edit]") WebElement editButton;
	@FindBy(xpath="//input[@placeholder='Enter the Title']") WebElement titleEdit;
	@FindBy(xpath="//input[@placeholder='Enter Page Name']") WebElement pageEdit;
	@FindBy(xpath="//button[text()='Update']") WebElement updateButton;
	@FindBy(xpath="//tbody//tr[3]") WebElement editedRow;
	
	public void verifyPageNavigation() {
		navigateManagePages.click();
	}
	public void verifyRowSelected() {
		tableRow.isSelected();
	}
	public boolean isRowDisplayed() {
		boolean isRowFound=  tableRow.isDisplayed();
		return isRowFound;
	}
	
	
	public void verifyNewButton() {
		addRow.click();
	}
	public void verifyTitle(String enterTitleField) {
		enterTitle.sendKeys(enterTitleField);
	}
	public void verifyGetEnterTitle() {
		enterTitle.getText();
	}
	
	public void verifyPageTitle(String pageTitleField) {
		pageTitle.sendKeys(pageTitleField);
	}
	public void verifyGetPageTitle() {
		pageTitle.getText();
	}
	
	public void verifySaveButton() {
		saveButton.click();
	}
	 /* public void verifyAlertBoxMessage() {
	    	PageUtility pageutility= new PageUtility();
	    	pageutility.getAlert(driver);
	    }*/
	  public String getAlert(WebDriver driver) {
			String getAlertText=driver.switchTo().alert().getText();
			return getAlertText;
		}
	public boolean isAlertDisplayed() {
		boolean isAlertFound=  alertBox.isDisplayed();
		return isAlertFound;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void verifyDeleteButton() {
		deleteRow.click();
	}
	public void verifyGetAlert() {
		PageUtility pageutility= new PageUtility();
    	pageutility.getAlert(driver);
	}
	public void verifyDismissAlert() {
		PageUtility pageutility= new PageUtility();
    	pageutility.toDismissAlert(driver);;
	}
	public void verifySearchRow() {
		searchRow.click();
	}
	public void verifyRowField(String titleField) {
		inputField.sendKeys(titleField);
	}
	public void verifyTitleField() {
		inputField.getText();
	}
	public void verifySearchSubmit() {
		submitButton.click();
	}
	
	public boolean isSearchedRowDisplayed() {
		boolean isSearchedRowFound=  searchedRow.isDisplayed();
		return isSearchedRowFound;
	}
	
	
	
	
	public void verifyEditRowSelected() {
		editedRow.isSelected();
	}
	public void verifyEditButton() {
		editButton.click();
	}
	public void verifyEditedTitleField(String editField) {
		titleEdit.sendKeys(editField);
	}
	public void verifyGetTitleField() {
		titleEdit.getText();
	}
	public void verifyPageField(String pageField) {
		pageEdit.sendKeys(pageField);
	}
	public void verifyGetPageField() {
		pageEdit.getText();
	}
	public void verifyUpdateButton() {
		updateButton.click();
	}
	public void verifyEditTitleField(String editField) {
		inputField.sendKeys(editField);
	}
	public void verifyGetEditedTitleField() {
		inputField.getText();
	}
	
	public boolean isEditedRowDisplayed() {
		boolean isEditedRowFound=  editedRow.isDisplayed();
		return isEditedRowFound;
	}
	
}
