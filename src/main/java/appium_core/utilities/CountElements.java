package appium_core.utilities;

import appium_core.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class CountElements extends BaseTest
{
    @Test
    public void counter() throws MalformedURLException, InterruptedException
    {
        List<WebElement> list_items = driver.findElementsByXPath("//XCUIElementTypeStaticText");
        Thread.sleep(5000);
        System.out.println("On this screen " + "<< " + list_items.size() + " >>" + " elements");
        System.out.println("-------------------------------------------------------------------");

        for(WebElement li : list_items)
        {
            System.out.println(li.getText());
            System.out.println("=========================================");
        }
    }
}
