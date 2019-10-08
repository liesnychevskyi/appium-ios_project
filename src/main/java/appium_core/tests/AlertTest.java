package appium_core.tests;

import appium_core.base.BaseTest;
import appium_core.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest
{

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
