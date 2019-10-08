package appium_core.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest
{
    private URL url;
    public AppiumDriver<WebElement> driver = null;

    //@BeforeClass
    public void setUp() throws MalformedURLException
    {
        try
        {
            //==========================================================================//Capabilities
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.1");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            cap.setCapability("noReset", true );
            //cap.setCapability(MobileCapabilityType.UDID, "11160b1df7590503");
            cap.setCapability(MobileCapabilityType.APP, "/Users/Stan/Library/Developer/Xcode/DerivedData/UIKitCatalog-gfmviwrvamqulbdunxnemilyojaw/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
            //==========================================================================//Driver
            url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new IOSDriver<WebElement>(url, cap);
            //driver = new AndroidDriver(url, cap);
        }
        catch (Exception e)
        {
            System.out.println("Cause is: " + e.getCause());
            System.out.println("Massage is: " + e.getMessage());
            e.printStackTrace();
        }
    }
    //==========================================================================//

    public static void verifyTrue(boolean status)
    {
        Assert.assertTrue(status);
    }

    public static void verifyFalse(boolean status)
    {
        Assert.assertFalse(status);
    }

    //@AfterClass
    public void tearDown() throws MalformedURLException
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
//========================================================================================================//
//----------------------------------------------------------------------------------------------------------------//
// Before testing check carefully chrome driver version for comparable with the browser version
//
//WebDriver driver;
//AppiumDriver<WebElement> driver;
//AndroidDriver<WebElement> driver = null;
    //appium --port 9090  - to change the port from terminal
    //----------------------------------------------------------------------------------------------------------------//
    //@BeforeTest
    public void setUp_1() throws MalformedURLException
    {
        try
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //capabilities.setCapability("platformName", "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.VERSION, "7.0");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S6");
            //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emu");
            //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MyOnePlus");
            capabilities.setCapability(MobileCapabilityType.UDID, "11160b1df7590503");
            //capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            //capabilities.setCapability(MobileCapabilityType.UDID, "44801993");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            //capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\stas\\IdeaProjects\\appium_start_and_work\\apps\\ApiDemos.apk");
            //capabilities.setCapability(MobileCapabilityType.APP, "/Users/Stan/IdeaProjects/appium_start_and_work/apps/belong.apk");
            //capabilities.setCapability(MobileCapabilityType.APP, "C:\Users\stas\IdeaProjects\appium_android\src\main\java\apps\belong.apk");
            capabilities.setCapability("chromedriverExecutable", "/Users/Stan/IdeaProjects/appium_workable/src/test/java/chrome_driver/chromedriver");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            capabilities.setCapability("noReset", true );

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<WebElement>(url, capabilities);
            //driver = new AppiumDriver<WebElement>(url, capabilities);
            //driver = new RemoteWebDriver(url, capabilities);
        }
        catch (Exception e)
        {
            System.out.println("Cause is: " + e.getCause());
            System.out.println("Massage is: " + e.getMessage());
            e.printStackTrace();
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
}
