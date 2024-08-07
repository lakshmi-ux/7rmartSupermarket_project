package testscripts;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class SubCategoryTest extends Base {
	@Test
	public void verifyUserAbleToUploadFile() throws AWTException {
		String username=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
        String filePathText= Constants.HOME_DIRECTORY_FILEUPLOADING + Constants.TESTDATA_EXCELPATH_FILEUPLOADING;
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.isHomePageNavigated();
        SubCategoryPage subcategorypage= new SubCategoryPage(driver);
        subcategorypage.verifySubCategoryNavigated().clickNewButton().clickDropdownField().fileUpload(filePathText).clickSaveButton();
        boolean isFileDisplayed = subcategorypage.isFileUploading();
        assertTrue(isFileDisplayed, Messages.UPLOADING_FAIL);
	}

}

