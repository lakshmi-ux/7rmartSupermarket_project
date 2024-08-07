package testscripts;

import org.testng.annotations.Test;
import automation_core.Base;
import constants.Constants;
import pages.HomeScrollPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeScrollTest extends Base {
	@Test
	public void verifyUserAbleToScrollHomePage()  {
		String usernameValue=ExcelUtility.readStringData(0, 0, Constants.LOGINPAGE);
		String passwordValue=ExcelUtility.readStringData(0, 1, Constants.LOGINPAGE) ;
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue).clickOnSignInButton();
		loginpage.isHomePageNavigated();
		HomeScrollPage homescrollpage= new HomeScrollPage(driver);
		homescrollpage.verifyPageGettingScrolledUp();
		homescrollpage.verifyPageGettingScrolledDown();
	}

}
