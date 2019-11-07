import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		/*
		 System.setProperty("webdriver.gecko.driver","D:\\Personal\\Selenium files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");*/
		
			
			
			System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium files\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.get("https://www.facebook.com/");
			driver1.findElement(By.id("rc.u_0_1c\"]/div[1]/span/span/a/span/span[1]")).click();
			
	}

}
