package testscripts;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends Base {
	@Test
	public void verifyUserAbleToSaveASubCategory() {
		String username = "admin";
        String password = "admin";
        String dropdownValue= "Electronics";
        String categoryField="Nolta";
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username);
        loginpage.enterPasswordOnPasswordField(password);
        loginpage.clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        SubCategoryPage subcategorypage= new SubCategoryPage(driver);
        subcategorypage.verifySubCategoryNavigated();
        subcategorypage.clickNewButton();
        subcategorypage.clickDropdownField();
        subcategorypage.selectAnOption(dropdownValue);
        subcategorypage.clickCategoryField(categoryField);
        subcategorypage.clickSaveButton();
        boolean isOptionSelected = subcategorypage.verifySelectedOptionSelected();
        assertTrue(isOptionSelected, "Option not selected");
	}

}
