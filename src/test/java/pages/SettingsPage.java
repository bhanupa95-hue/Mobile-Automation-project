package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.DriverManager;
import utils.DriverFactory;

public class SettingsPage {

    AndroidDriver driver;

    public SettingsPage() {
        this.driver = DriverManager.getDriver();
    }

    By aboutPhone = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"About phone\"]");
    By systemAppUpdater = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"System apps updater\"]");
    By securityStatus = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Security status\"]");

    public void setAboutPhone() {
        String expected = driver.findElement(aboutPhone).getText();
       String actual = "About phone";
        Assert.assertEquals(expected,actual);
        }
    public void setSystemAppUpdater() {
        String expected = driver.findElement(systemAppUpdater).getText();
        String actual = "System apps updater";
        Assert.assertEquals(expected,actual);
    }
    public void setSecurityStatus() {
        String expected = driver.findElement(securityStatus).getText();
        String actual = "Security status";
        Assert.assertEquals(expected,actual);
    }
    public void clickAboutPhone() {
        DriverFactory.getDriver().findElement(aboutPhone).click();
    }
}
