package appium_core.utilities.config;

import org.openqa.selenium.remote.BrowserType;

public interface ConfigReader
{
    public int getImplicitWait();
    public int getExplicitWait();
    public int getPageLoadTime();
    public BrowserType getBrowserType();
    public String getApplicationUrl();
    public String getUserName();
    public String getPassword();

}
