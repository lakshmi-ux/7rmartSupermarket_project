package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
 @FindBy(xpath="//input[@class='form-control']") WebElement categoryField ;
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
public boolean selectAnOption() {
	boolean optionSelected= selectedOption.isSelected();
	return optionSelected;
}
public void clickCategoryField() {
	categoryField.click();
}
public void chooseFile() {
	chooseFileField.sendKeys("C:\\Users\\Emvigo\\Downloads\\Document18.pdf");
}
public void clickSaveButton() {
	saveButton.click();
}


}
