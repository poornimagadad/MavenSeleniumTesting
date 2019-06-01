package MavenProject.MavenSeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OldTest {
	 @Test
	  public void openBrowser() {
		  System.setProperty("webdriver.gecko.driver",
					"C:\\Selenium\\geckodriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com/");
			String title=driver.getTitle();
			System.out.println(title);

}
	 @Test
	 public void printHello(){
		 System.out.println("Hello World");
	 }
}