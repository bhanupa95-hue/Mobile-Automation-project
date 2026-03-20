package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import utils.DriverManager;

import java.net.URL;
public class BaseTest {

    public static AndroidDriver driver;

    @Parameters({"deviceName", "udid", "systemPort", "port"})
    public void setup(String deviceName, String udid, String systemPort, String port) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("udid", udid);
        caps.setCapability("automationName", "UiAutomator2");

        // Using default app (Settings)
        caps.setCapability("appPackage", "com.android.settings");
        caps.setCapability("appActivity", "com.android.settings.MainSettings");
        caps.setCapability("systemPort", 8200 + (int)(Thread.currentThread().getId() % 1000));
        caps.setCapability("noReset", true);
        caps.setCapability("dontStopAppOnReset", true);
        caps.setCapability("fullReset", false);
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("uiautomator2ServerInstallTimeout", 60000);
        caps.setCapability("uiautomator2ServerLaunchTimeout", 120000);
        caps.setCapability("adbExecTimeout", 60000);

        driver = new AndroidDriver(new URL("http://127.0.0.1:" + port), caps);

        DriverManager.setDriver(driver);
    }

    public void tearDown() {
        driver.quit();
    }
}


