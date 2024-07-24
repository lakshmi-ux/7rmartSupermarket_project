package testscripts;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends Base {
	@Test
	public void verifyUserAbleToUploadFile() throws AWTException {
		String username = "admin";
        String password = "admin";
        String categoryField="Nolta";
        String filePathText="C:\\Users\\Emvigo\\Downloads\\Document18.pdf";
        LoginPage loginpage= new LoginPage(driver);
        loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
        loginpage.verifyHomePageNavigated();
        SubCategoryPage subcategorypage= new SubCategoryPage(driver);
        subcategorypage.verifySubCategoryNavigated().clickNewButton().clickDropdownField().clickCategoryField(categoryField).fileUpload(filePathText).clickSaveButton();
        boolean isFileDisplayed = subcategorypage.verifyFileUploading();
        assertTrue(isFileDisplayed, "User not able to upload file");
	}

}
