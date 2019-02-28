package mind.salido.pos.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mind.salido.pos.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy( name ="session[email]")
	WebElement username;
	
	@FindBy( id ="session_password")
	WebElement Password;
	
	
	@FindBy(xpath   = "//button[contains(text(),'sign in')]")
	WebElement signin;
	
	public LoginPage()
	{
	PageFactory.initElements(driver, this); /// For Initializing all the Elements (page Objects) in Home Page ( this is use for using current class)
	
	}
	
	public void login( String user, String pwd) 
	{
		username.sendKeys(user);
		Password.sendKeys(pwd);
		signin.click();
		
	}
	
	
	
}
