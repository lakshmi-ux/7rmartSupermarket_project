package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUtilityFile;

public class SubCategoryPage {
	public WebDriver driver;
	public SubCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']//child::i[@class='fas fa-arrow-circle-right']") WebElement navigateSubCategory;
 @FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButton ;
 @FindBy(xpath="//select[@class='form-control selectpicker']//child::option[text()='Electronics']") WebElement dropdownField ;
 //@FindBy(xpath="//select[@id='cat_id']//child::option[4]") WebElement selectedOption ;
 @FindBy(xpath="//input[@class='form-control']") WebElement enterCategoryField ;
 @FindBy(xpath="//input[@name='main_img']") WebElement chooseFileField ;
 @FindBy(xpath="//button[@name='create']") WebElement saveButton;
 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertBox;


public SubCategoryPage verifySubCategoryNavigated() {
	navigateSubCategory.click();
	return this;
}
public SubCategoryPage clickNewButton() {
	newButton.click();
	return this;
}
public SubCategoryPage clickDropdownField() {
	dropdownField.click();
	return this;
}

public SubCategoryPage clickCategoryField(String categoryField) {
	enterCategoryField.sendKeys(categoryField);
	return this;
}
public SubCategoryPage fileUpload(String filePath) throws AWTException {
	FileUtilityFile fileutilityfile = new FileUtilityFile() ;
	fileutilityfile.fileUploadUsingRobotClass(filePath);
	return this;
}
public SubCategoryPage clickSaveButton() {
	saveButton.click();
	return this;
}
public boolean verifyFileUploading() {
	boolean isFileSelected= chooseFileField.isDisplayed();
	return isFileSelected;
}

/*public void scrollTest(JavascriptExecutor JavascriptExecutor) {
	PageUtility pageutility=new PageUtility();
	pageutility.scrollSamples(JavascriptExecutor);
}*/


}
