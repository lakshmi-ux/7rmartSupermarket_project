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
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username);
        loginpage.enterPasswordOnPasswordField(password);
        loginpage.clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        SubCategoryPage subcategorypage= new SubCategoryPage(driver);
        subcategorypage.verifySubCategoryNavigated();
        subcategorypage.clickNewButton();
        subcategorypage.clickDropdownField();
        boolean isOptionFound= subcategorypage.selectAnOption();
        assertTrue(isOptionFound, "User not able to select the option");
        subcategorypage.clickCategoryField();
        subcategorypage.chooseFile();
        subcategorypage.clickSaveButton();
	}

}
