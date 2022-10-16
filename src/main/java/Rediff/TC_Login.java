package Rediff;

import org.testng.annotations.Test;

public class TC_Login {

	@Test(priority=1)
	public void openBrowser()
	{
		System.out.println("open Chrome Browser");
	}
	@Test(priority=3)
	public void closeBrowser()
	{
		System.out.println("close Chrome Browser");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("Login to Rediff...");
	}
}
