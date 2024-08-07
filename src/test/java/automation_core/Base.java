package automation_core;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {
	
		public static WebDriver driver;
		public void initializeBrowser(String browser) {
			if(browser.equals("chrome")) {
				driver=new ChromeDriver();
			}
			else if(browser.equals("firefox")){
				driver=new FirefoxDriver();
			}
			else if(browser.equals("edge")){
				driver=new EdgeDriver();
			}
			else{
				throw new RuntimeException("Invalid browser");
			}
			driver.get("https://groceryapp.uniqassosiates.com/admin/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize()	;	
		}
		@BeforeMethod(alwaysRun=true)
		@Parameters("browser")
		public void settup(String browserName) {
			initializeBrowser(browserName);
		}
		@AfterMethod(alwaysRun=true) //eppum test run cheythalum run akan vendi---- alwaysrun=true koduthathe
		public void closeBrowser(ITestResult result) throws IOException {
			if(result.getStatus()==ITestResult.FAILURE) {
				takeScreenshot(result);
			}
			driver.quit();
		}
		public void takeScreenshot(ITestResult result) throws IOException {
			TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			File screenshot= takescreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("./Screenshot/"+result.getName()+".png"));
		}

}

//file:///C:/Users/Dell/git/7rmart_project/TestReport/Extent.html
