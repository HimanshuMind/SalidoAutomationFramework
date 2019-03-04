package mind.salido.pos.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import mind.salido.pos.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static DesiredCapabilities dc;
	public static AppiumDriver Adr;
	public static IOSDriver IoD;
	
	
	
	public void TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/itisg/Desktop/CICD/SalidoPOSTest/src/main/java/mind/salido/pos/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void BrowserInitalization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.out.println("test");
			System.setProperty("webdriver.chrome.driver", "/Users/itisg/Desktop/CICD/chromedriver");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		//e_driver = new EventFiringWebDriver(driver);
		//Now create object of EventListerHandler to register it with EventFiringWebDriver
		//eventListener = new WebEventListener();
		//e_driver.register(eventListener);
		//driver = e_driver;
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_TimeOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}


	public static void AppiumInitalization()
	{
		dc = new DesiredCapabilities();
		dc.setCapability("platformName","iOS");
	    dc.setCapability("platformversion","10.1");
		dc.setCapability("deviceName","iPad Pro (9.7-inch)");
		//cap.setCapability("deviceName","iPad Air (Model A1475)");
        dc.setCapability("noReset","true");
		dc.setCapability("app","/Users/itisg/Desktop/PointOfSale.app");
	    dc.setCapability("automationName","Xcuitest");
		dc.setCapability("udid", "C30889B1-9EE3-4F61-9B85-811796E99AE1");
		//cap.setCapability("udid", "051bc7e77775ceb4ad62b881d5fa68817ab36cdf"); // ipad 4
	
			try {
				Adr = new IOSDriver<MobileElement>(new URL ("http://0.0.0.0:4723/wd/hub"),dc);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		
		WebElement banner = Adr.findElement(By.name("Swipe Left to Begin Setup"));
	    org.openqa.selenium.Point bannerPoint = banner.getLocation();
	  
	    Dimension screenSize = Adr.manage().window().getSize();

	    int startX = Math.toIntExact(Math.round(screenSize.getWidth() * 0.8));
	    int endX = 0;

	    TouchAction action = new TouchAction(Adr);
	    action
	            .press(PointOption.point(startX, bannerPoint.getY()))
		            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX, bannerPoint.getY()))
	            .release();
	    Adr.performTouchAction(action);


	System.out.println("Swipe Successfully");
	
	
	
		
		
	}
	
}
