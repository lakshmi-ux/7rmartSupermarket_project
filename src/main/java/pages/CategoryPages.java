package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPages {
	public WebDriver driver;
	public CategoryPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@style='background-color:teal !important;']//child::a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']") WebElement navigateCategory;
	@FindBy(xpath="//tbody//tr[1]") WebElement rowSelect;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/status?id=312&st=inactive&page_ad=1']") WebElement activeButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//input[@placeholder='Category']") WebElement categoryField;
	@FindBy(xpath="//button[@type='submit']") WebElement submitButton;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/status?id=311&st=inactive&page_ad=1']//child::span[@class='badge bg-success']") WebElement successButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/status?id=311&st=active&page_ad=1']//child::span[@class='badge bg-warning']") WebElement inactiveButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/status?id=311&st=active&page_ad=1']//child::span[text()='Inactive']") WebElement inactiveText;
	
	public void verifyPageNavigation() {
		navigateCategory.click();
	}
	public void verifyRowSelected() {
		rowSelect.isSelected();
	}
	public void verifyClickActiveButton() {
		activeButton.click();
	}
	public void verifyClickSearchButton() {
		searchButton.click();
	}
	public void verifyCategoryField(String categoryHolder) {
		categoryField.sendKeys(categoryHolder);
	}
	public void verifyGetCategoryField() {
		categoryField.getText();
	}
	public void verifyClickSubmitButton() {
		submitButton.click();
	}
	public boolean isRowDisplayed() {
		boolean isRowFound= rowSelect.isDisplayed();
		return isRowFound;
	}
	
	
	public void verifyClickSucessButton() {
		successButton.click();
	}
	public void verifyClickInactiveButton() {
		inactiveButton.click();
	}
	public boolean isButtonDisplayed() {
		boolean isButtonFound= inactiveText.isDisplayed();
		return isButtonFound;
	}
	

}
