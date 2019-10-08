package appium_core.utilities;

import appium_core.pages.LandingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StartAppiumServer
{
    private Logger log = MyLogger.getLogger(StartAppiumServer.class);
    AppiumDriverLocalService service;
    AppiumDriver<WebElement> driver;
    URL url;

    //@BeforeClass
    public void setUp() throws MalformedURLException
    {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        log.info("Appium server is started..");
        DesiredCapabilities cap = new DesiredCapabilities();
        log.info("Desired capabilities is created");
        //===============================================================//
        try
        {
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.1");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            cap.setCapability("noReset", true );
            cap.setCapability(MobileCapabilityType.APP, "/Users/Stan/Library/Developer/Xcode/DerivedData/UIKitCatalog-gfmviwrvamqulbdunxnemilyojaw/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
            //==========================================================================//Driver
            url = new URL("http://127.0.0.1:4723/wd/hub");
            log.info("Url is set");
            driver = new IOSDriver<WebElement>(service.getUrl(), cap);
            log.info("Ios instance driver is created");
            //driver = new AndroidDriver(url, cap);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        catch (Exception e)
        {
            System.out.println("Cause is: " + e.getCause());
            System.out.println("Massage is: " + e.getMessage());
            e.printStackTrace();
        }
    }
    //-------------------------------------------------------------------------//
    //@AfterClass
    public void tearDown()
    {
        driver.quit();
        service.stop();
    }

    @Test
    public void alertTest() throws InterruptedException
    {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickAlertViewsButton();

        landingPage.clickOkayOrCancelButton();
        Thread.sleep(5000);
        landingPage.clickOkButton();

        Thread.sleep(5000);

        landingPage.clickOkayOrCancelButton();
        Thread.sleep(5000);
        landingPage.clickCancelButton();
    }
}