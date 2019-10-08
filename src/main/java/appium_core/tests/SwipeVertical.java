package appium_core.tests;

import appium_core.pages.LandingPage;
import appium_core.utilities.MyLogger;
import appium_core.utilities.StartAppiumServer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class SwipeVertical
{
    private Logger log = MyLogger.getLogger(SwipeVertical.class);
    AppiumDriverLocalService service;
    AppiumDriver<WebElement> driver;
    URL url;

    @BeforeClass
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
            //driver = new AppiumDriver<WebElement>(service.getUrl(), cap);
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
    @AfterClass
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(10000);
        driver.quit();
        service.stop();
    }

    @Test
    public void verticalSwipe() throws InterruptedException
    {
//        LandingPage lp = new LandingPage(driver);
//        TouchAction action = new TouchAction(driver);
//        action.longPress(lp.activityIndicators).moveTo(lp.webView).release().perform();

//        SwipeVertical sv = new SwipeVertical();
//        sv.swipeFromBottomToUp();
//==========================================================================//
        Dimension size = driver.manage().window().getSize();
        int height = size.getHeight();
        System.out.println("Height is: " + height);
        int width = size.getWidth();
        System.out.println("Width is: " + width);
        int x = width/2;
        int start_y = (int) (height * 0.80);
        int end_y = (int) (height * 0.50);

        TouchAction touchAction = new TouchAction(driver).press(PointOption.point(x, start_y)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).
                moveTo(PointOption.point(x, end_y)).perform();
    }
//--------------------------------------------------------------------------//
//    public enum DIRECTION
//    {
//        DOWN, UP, LEFT, RIGHT;
//    }
//
//
//    public static void swipe(IOSDriver driver, DIRECTION direction, long duration)
//    {
//        Dimension size = driver.manage().window().getSize();
//
//        int startX = 0;
//        int endX = 0;
//        int startY = 0;
//        int endY = 0;
//
//        switch (direction) {
//            case RIGHT:
//                startY = (int) (size.height / 2);
//                startX = (int) (size.width * 0.90);
//                endX = (int) (size.width * 0.05);
//                new TouchAction(driver)
//                        .press(startX, startY)
//                        .waitAction(Duration.ofMillis(duration))
//                        .moveTo(endX, startY)
//                        .release()
//                        .perform();
//                break;
//
//            case LEFT:
//                startY = (int) (size.height / 2);
//                startX = (int) (size.width * 0.05);
//                endX = (int) (size.width * 0.90);
//                new TouchAction(driver)
//                        .press(startX, startY)
//                        .waitAction(Duration.ofMillis(duration))
//                        .moveTo(endX, startY)
//                        .release()
//                        .perform();
//                break;
//
//            case UP:
//                endY = (int) (size.height * 0.70);
//                startY = (int) (size.height * 0.30);
//                startX = (size.width / 2);
//                new TouchAction(driver)
//                        .press(startX, startY)
//                        .waitAction(Duration.ofMillis(duration))
//                        .moveTo(endX, startY)
//                        .release()
//                        .perform();
//                break;
//
//            case DOWN:
//                startY = (int) (size.height * 0.70);
//                endY = (int) (size.height * 0.30);
//                startX = (size.width / 2);
//                new TouchAction(driver)
//                        .press(startX, startY)
//                        .waitAction(Duration.ofMillis(duration))
//                        .moveTo(startX, endY)
//                        .release()
//                        .perform();
//                break;
//        }
//
//    }
    //===================================================================================================//
//    private void scroll(int fromX, int fromY, int toX, int toY)
//    {
//    TouchAction touchAction = new TouchAction(driver);
//    touchAction.tap(fromX, fromY).waitAction(1000).moveTo(toX,
//            toY).release().perform();
//    }
    //===================================================================================================//
public boolean swipeFromUpToBottom()
{

    try
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "up");
        js.executeScript("mobile: scroll", scrollObject);
        System.out.println("Swipe up was Successfully done.");
    }
    catch (Exception e)
    {
        System.out.println("swipe up was not successful");
    }
    return false;
}
    //===================================================================================================//
    public boolean swipeFromBottomToUp()
    {
        try
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> scrollObject = new HashMap<String,String>();
            scrollObject.put("direction", "down");
            js.executeScript("mobile: scroll", scrollObject);
            System.out.println("Swipe down was Successfully done");
        }
        catch (Exception e)
        {
            System.out.println("swipe down was not successful");
        }
        return false;
    }
    //===================================================================================================//
    public boolean swipeImages()
    {
        try
        {
            WebElement pageIndicator = driver.findElement(By.xpath(""));
            String pageString= pageIndicator.getAttribute("value");
            int length = pageString.length();
            String count_string= pageString.substring(length-2, length).trim();
            int count = Integer.parseInt(count_string);
            System.out.println("Number of Image available to Swipe: "+count);
            for (int i=0; i<=count; i++){
                JavascriptExecutor js = (JavascriptExecutor) driver;
                HashMap<String, String> scrollObject = new HashMap<String, String>();
                scrollObject.put("direction", "right");
                js.executeScript("mobile: scroll", scrollObject);
            }
            System.out.println("Swipe Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Image swipe was not successful");
        }
        return false;
    }
    //===================================================================================================//
    //===================================================================================================//
}
