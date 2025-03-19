package TestNG;


import org.testng.annotations.Test;

public class FirstTestng {
	
	
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Opening application....");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("Login into application....");
	}
	
	@Test(priority=-1)
	void logout()
	{
		System.out.println("Logout into application....");
	}

}
