package Social.CosialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwitterTest {
	
	
		
		@Test
		public void TwitterLogin() {
			
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://twitter.com");
		driver.manage().window().maximize();
		System.out.println("Twitter Login Successfully");
		}
	
	
	
@Test
public void mayspaeLogin() {
	
WebDriverManager.firefoxdriver().setup();

WebDriver driver = new FirefoxDriver();

driver.get("https://google.com");
driver.manage().window().maximize();
System.out.println("google Login Successfully");
}
}





