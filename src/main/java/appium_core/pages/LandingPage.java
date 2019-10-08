package appium_core.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LandingPage
{
    private AppiumDriver driver;

//===========================================================================|| Constructor
    public LandingPage(AppiumDriver<WebElement> driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//===========================================================================|| Elements
    @iOSXCUITFindBy(accessibility = "Alert Views")
    public WebElement alertViews;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Views']")
    public WebElement alertViewsBackArrowTitle;

    @iOSXCUITFindBy(accessibility = "Okay / Cancel")
    public WebElement okay_or_cancel_button;

    @iOSXCUITFindBy(accessibility = "OK")
    public WebElement ok_button;

    @iOSXCUITFindBy(accessibility = "Cancel")
    public WebElement cancel_button;

    @iOSXCUITFindBy(accessibility = "Activity Indicators")
    public WebElement activityIndicators;

    @iOSXCUITFindBy(accessibility = "Web View")
    public WebElement webView;


//===========================================================================|| Methods
    public void clickAlertViewsButton()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(alertViews.getText().equals("Alert Views"))
        {
            alertViews.click();
        }
    }

    public void clickOkayOrCancelButton()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(okay_or_cancel_button.isDisplayed())
        {
            okay_or_cancel_button.click();
        }
        else
        {
            Assert.assertFalse(false, "okay_or_cancel_button is not present");
        }
    }

    public void clickOkButton()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(ok_button.isDisplayed())
        {
            ok_button.click();
        }
        else
        {
            Assert.assertFalse(false, "okay_or_cancel_button is not present");
        }
    }

    public void clickCancelButton()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(cancel_button.isDisplayed())
        {
            cancel_button.click();
        }
        else
        {
            Assert.assertFalse(false, "okay_or_cancel_button is not present");
        }
    }

    public boolean verifyResult(WebElement element, String result)
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        boolean res = element.getText().equals(result);
        if(res == true)
        {
            System.out.println("Test passed : " + res);
        }
        else
        {
            System.out.println("Test failed : " + res);
        }
        return res;
    }

}
