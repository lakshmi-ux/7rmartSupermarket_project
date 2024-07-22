package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;
	public SubCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']//child::i[@class='fas fa-arrow-circle-right']") WebElement navigateSubCategory;
 @FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButton ;
 @FindBy(xpath="//select[@class='form-control selectpicker']") WebElement dropdownField ;
 @FindBy(xpath="//select[@class='form-control selectpicker']//child::option[text()='Electronics']") WebElement selectedOption ;
 @FindBy(xpath="//input[@class='form-control']") WebElement enterCategoryField ;
 @FindBy(xpath="//input[@name='main_img']") WebElement chooseFileField ;
 @FindBy(xpath="//button[@name='create']") WebElement saveButton;


public void verifySubCategoryNavigated() {
	navigateSubCategory.click();
}
public void clickNewButton() {
	newButton.click();
}
public void clickDropdownField() {
	dropdownField.click();
}
public void selectAnOption(String dropdownValue) {
	PageUtility pageutility=new PageUtility();
	pageutility.selectValueUsingSelectByVisibleText(selectedOption,dropdownValue);
}
public void clickCategoryField(String categoryField) {
	enterCategoryField.sendKeys(categoryField);
}
public void clickSaveButton() {
	saveButton.click();
}
public boolean verifySelectedOptionSelected() {
	boolean optionSelected= selectedOption.isSelected();
	return optionSelected;
}
}
