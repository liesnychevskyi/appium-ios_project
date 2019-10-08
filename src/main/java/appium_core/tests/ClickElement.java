package appium_core.tests;

import appium_core.base.BaseTest;
import appium_core.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickElement extends BaseTest
{
    @Test
    public void clickTest()
    {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickAlertViewsButton();
        landingPage.verifyResult(landingPage.alertViewsBackArrowTitle, "Alert Views");
        Assert.assertTrue(true);
    }


}
