package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest01 {

	public static void main(String[] args) {
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://in-pnq-coe31:5180/pc/PolicyCenter.do");
	    
	    driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys("su");
	    
	    driver.findElement(By.name("Login-LoginScreen-LoginDV-password")).sendKeys("gw");
	    
	    driver.findElement(By.xpath("//div[@class='gw-action--inner gw-hasDivider']")).click();
	    
	    
	    WebElement pagelogo = driver.findElement(By.xpath("//div[@id='gw-customer--logo']"));
	    
	    boolean status = pagelogo.isDisplayed();
	    
	    
	    System.out.println("Logo of the page is visible" +status);
	    
	    
	    
	    

	}

}
