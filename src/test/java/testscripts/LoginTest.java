package testscripts;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import data_provider.DataProviders;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
@Test
	
	public void verifyWhetherUserAbleToLoginUsingValidUsernameAndPassword() {
		String usernameValue=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String passwordValue=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		boolean isNavigatedToHomePage= loginpage.isHomePageNavigated();
		assertTrue(isNavigatedToHomePage, Messages.LOGIN_FAIL);
}
@Test(dataProvider="InvalidUserCredentials", dataProviderClass=DataProviders.class)
   public void verifyWhetherUserLoginWithInvalidCredentials(String username, String password) {
	    LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean isNavigatedToSignInPage= loginpage.isHomePageNotNavigated();
		assertTrue(isNavigatedToSignInPage, Messages.LOGIN_SUCESS);
   }
}
