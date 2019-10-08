package appium_core.testNg_core;

import org.testng.annotations.*;

public class test_0
{
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite");
    }
}
