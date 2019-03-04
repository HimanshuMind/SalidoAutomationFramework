package mind.salido.pos.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mind.salido.pos.base.TestBase;
import mind.salido.pos.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	
       public LoginPageTest()
         {
	super();
        	}
	
	
	@BeforeMethod
	public void Launched() throws MalformedURLException, InterruptedException
	{
		//BrowserInitalization();
		
		AppiumInitalization();
	   login = new LoginPage();
	}
	
	
	
	@Test (enabled = false)
	public void FirstScenario() 
	{
		
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		
		System.out.println("test print");
		
	}
	
	
	@Test
	public void AppiumScenarios ()
	{
	
	try {
		login.AppiumCheckScenario();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		login.secondmethos();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
				 
	
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
	
}
