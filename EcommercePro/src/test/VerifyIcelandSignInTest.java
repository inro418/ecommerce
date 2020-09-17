	package test;
	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class VerifyIcelandSignInTest {
	
		@Test
		public void SigInTest() throws InterruptedException {
			// Invoke exe and Set System property
			System.setProperty("webdriver.chrome.driver","C:\\Users\\koree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
			// Create Object of ChromeDriver browser
			WebDriver driver = new ChromeDriver();
			
			// Delete Cookies
			driver.manage().deleteAllCookies();
	
			// Apply time
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			// Maximized the window 
			driver.manage().window().maximize();
	
			// Enter URL
			driver.get("https://www.iceland.co.uk/");
			
			// Click my account link
			Thread.sleep(2000);   
			driver.findElement(By.xpath("//*[@id='wrapper']/header/div[1]/div/ul/li[3]/a[2]/span")).click();
			
			// Enter user name 
			driver.findElement(By.id("dwfrm_login_username")).sendKeys("inro4ebony@gmail.com");   
			
			// Enter password
			driver.findElement(By.id("dwfrm_login_password")).sendKeys("@45adminD");   
			
			// Click signin button
			Thread.sleep(2000);  
			driver.findElement(By.name("dwfrm_login_login")).click(); 
			
			// Click Signout
			Thread.sleep(2000);   
			driver.findElement(By.xpath("//a[@class='user-account']")).click();
			driver.findElement(By.xpath("//a[@class='user-logout btn btn-primary']")).click();
			
			// Close the browser 
			driver.quit(); 
		}
	}
