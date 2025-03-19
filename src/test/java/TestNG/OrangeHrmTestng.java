package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTestng {
	
	WebDriver driver;
	
	@Test(priority=1)
	void logo()
	{
		 driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		 System.out.println("logo is on page: " +status);
	}
	
	@Test(priority=2)
	void login() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}

	@Test(priority=3)
	void logout()
	{
		driver.quit();
	}
}
