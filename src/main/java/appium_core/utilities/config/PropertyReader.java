package appium_core.utilities.config;

import appium_core.utilities.ResourceHelper;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader implements ConfigReader
{
    private static FileInputStream file;
    private static Properties OR;

    public PropertyReader()  // Load the property file to the memory
    {
//============================================================================//
 //path for windows//String filePath = ResourceHelper.getRecoursePath("\\src\\main\\resources\\config.properties");
        String filePath = ResourceHelper.getRecoursePath("/src/main/resources/config.properties");
        try
        {
            file = new FileInputStream(new File(filePath));
            OR = new Properties();
            OR.load(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
//=============================================================================//
    @Override
    public int getImplicitWait()
    {
        return Integer.parseInt(OR.getProperty("implicitwait"));
    }

    @Override
    public int getExplicitWait()
    {
        return Integer.parseInt(OR.getProperty("explicitwait"));
    }

    @Override
    public int getPageLoadTime()
    {
        return Integer.parseInt(OR.getProperty("pageloadtime"));
    }

    @Override
    public BrowserType getBrowserType()
    {
        return null;
    }

    @Override
    public String getApplicationUrl()
    {
        System.out.println(OR.getProperty("applicationUrl"));
        return OR.getProperty("applicationUrl");
    }

//    @Override
//    public String getApplicationUrl()
//    {
//        if(System.getProperty("applicationUrl") != null)
//         System.out.println(OR.getProperty("applicationUrl"));
//        return System.getProperty("applicationUrl");
//    }

    @Override
    public String getUserName()
    {
        System.out.println(OR.getProperty("userName"));
        return OR.getProperty("userName");
    }

    @Override
    public String getPassword()
    {
        System.out.println(OR.getProperty("password"));
        return OR.getProperty("password");
    }


}
