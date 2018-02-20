import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//firefox.exe -p profilemanager
public class LaunchBrowsers {
	
	String browser="Mozilla";// xls, prop,xml


	@Test(dataProvider="getData")
	public void launch(String browser, String username){
		

		System.setProperty("webdriver.gecko.driver", "/Users/ramanaranga/Documents/Ramana/Jars/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/ramanaranga/Documents/Ramana/Jars/chromedriver");

		WebDriver driver = null;

		if(browser.equals("Mozilla")){
			//ProfilesIni allProf = new ProfilesIni();
			//FirefoxProfile  prof =allProf.getProfile("Selenium_Mod11");
			
			driver = new FirefoxDriver();// own profile prog and launches
			
		}else if(browser.equals("Chrome")){
			driver =  new ChromeDriver();
			
		}else if(browser.equals("IE")){
			driver =   new InternetExplorerDriver();
			
		}
		
		// single script
		driver.get("http://rediff.com");
		// commands
		driver.quit(); // end selenium session + close all browsers in the current session
		//driver.close();// close browser - current focus
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		// 1st row
		data[0][0]="Mozilla";
		data[0][1]="User1";
		
		// 2nd row
		data[1][0]="Chrome";
		data[1][1]="User2";
		
		// 3rd row
		data[2][0]="Mozilla";
		data[2][1]="User3";
		
		return data;
		
	}
	
	
}
