package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	 static WebDriver driver;
	 
	public static WebDriver inint() {
	System.setProperty("webdriver.chrome.driver",
			"drivers\\chromedriver_102.exe");
	driver = new ChromeDriver();

	driver.manage().deleteAllCookies();

	driver.get("https://techfios.com/test/102/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.manage().window().maximize();
	return driver;
	}
	public static  void tearDown() {
		driver.close();
	}
}
