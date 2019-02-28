package mind.salido.pos.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mind.salido.pos.base.TestBase;
import mind.salido.pos.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	
	public LoginPageTest()       // constructor 
	{
		super();              //   to initialized  superclass (TestBase) constructor we user super keyword to initialized the property method.
	}

	
	@BeforeMethod
	public void Launched()
	{
		BrowserInitalization();
	   login = new LoginPage();
	}
	
	
	
	@Test
	public void FirstScenario() 
	{
		
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
	
}
