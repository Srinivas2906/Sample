import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Multiplebrowser {
	public static void testbrowser(WebDriver driver)
	{
		driver.get("google.com");
		driver.close();
	}
public static void main(String args[])
{
	System.setProperty("webdriver.gecko.driver","D:\\Personal\\Selenium files\\geckodriver.exe");
	Multiplebrowser.testbrowser(new FirefoxDriver());
	
	Multiplebrowser.testbrowser(new ChromeDriver());
	System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium files\\geckodriver.exe");
	
}
}
