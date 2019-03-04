package mind.salido.pos.pages;



import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
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
	
	
	public void AppiumCheckScenario() throws InterruptedException, MalformedURLException
	{
		//AppiumDriver<MobileElement> Adr = new IOSDriver<MobileElement>(dc);
	System.out.println("Enter User Name");
	Adr.findElement(By.name("What's your e-mail address?")).sendKeys("Himanshu.agrawal@mind-infotech.com");
	Thread.sleep(2000);
	System.out.println("Enter Password");
	Adr.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField")).sendKeys("Mind@123");		
	Thread.sleep(2000);
	System.out.println("Login  Successfully");

	
}

	public void secondmethos() throws InterruptedException 	
	{
		System.out.println("second method");
		Adr.findElement(By.name("OrderEntryModalCheckmarkButton")).click();
		Thread.sleep(2000);	
		System.out.println("Select Big Food");
		Adr.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"BigFood\"]")).click();
		Adr.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Mind Organization\"]")).click();
		Thread.sleep(2000);
		System.out.println("Select Appium Terminal");
		Adr.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"APPIUM TERMINAL\"]")).click();
		
		Thread.sleep(2000);
		System.out.println("Enter Appium Terminal Password");
		Adr.findElement(By.name("6")).click();
		Thread.sleep(2000);

		Adr.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
		Adr.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
		Adr.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
		Adr.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
		Adr.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
		Thread.sleep(2000);
		System.out.println("Select Dashboard");
		Adr.findElement(By.name("DashboardButtonNormal")).click();
		Thread.sleep(2000);
		System.out.println("SELECT CHECKS");
		Adr.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Checks\"]")).click();
		Thread.sleep(2000);
		System.out.println("click on add  CHECKS");
		Adr.findElement(By.xpath("//XCUIElementTypeButton[@name=\"addCheckFAB\"]")).click();
		Thread.sleep(2000);

		
		System.out.println("click on LEBEL");
		Adr.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[1]")).click();				
		Thread.sleep(2000);
		System.out.println("Capturing CHECKS Value");
		String value= Adr.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeTextField[2]")).getText();
		Thread.sleep(2000);
		System.out.println("Check value is :-  " + value);
		Adr.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[1]")).click();
			Thread.sleep(2000);
			System.out.println("select lunch :- Chapati");
			Adr.findElement(By.name("Chapati Wheat Chapati")).click();
			Thread.sleep(2000);
			System.out.println("select DONE");
			Adr.findElement(By.name("DONE")).click();
		Thread.sleep(2000);

		Adr.findElement(By.xpath("/XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
		

		Thread.sleep(2000);
		System.out.println("click on PAY ");
		Adr.findElement(By.name("PAY")).click();
		Thread.sleep(2000);
		System.out.println("click Close ");
		Adr.findElement(By.xpath("//XCUIElementTypeButton[@name=\"CLOSE\"]")).click();
		Thread.sleep(2000);
		System.out.println("click on Open  ");
		Adr.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton")).click();
			Thread.sleep(2000);

			Adr.findElement(By.name("Closed")).click();
		Thread.sleep(2000);

		System.out.println("Checks  No. Successfully Created :- " + value);
		System.out.println("SALIDO POS Check Scenario is Excecuted Successfully ");
		Thread.sleep(2000);		
		
		
	}
	
	
		
	}
	

