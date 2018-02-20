import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
//2.53 - 40 or less

public class Drivers_Selenium {

	public static void main(String[] args) {
		//3.x

	//System.setProperty("webdriver.gecko.driver", "F:\\drivers\\geckodriver.exe");
	//FirefoxDriver fd = new FirefoxDriver();
	//fd.get("http://yahoo.com");
	
	//System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
	//ChromeDriver cd = new ChromeDriver(); 
	//cd.get("http://yahoo.com");
			
	//System.setProperty("webdriver.ie.driver", "F:\\drivers\\IEDriverServer.exe");
	System.setProperty("webdriver.firefox.marionette","./geckodriver.exe");

	//InternetExplorerDriver ie =  new InternetExplorerDriver();
	FirefoxDriver fd = new FirefoxDriver();
	fd.get("http://yahoo.com");
	
	
	//WebDriver d = new FirefoxDriver();
	//WebDriver d1 = new ChromeDriver();
	// chrome
	//d1 = new  FirefoxDriver();
	// firefox
	//d1 = new  InternetExplorerDriver();
	// IE
	}

}
