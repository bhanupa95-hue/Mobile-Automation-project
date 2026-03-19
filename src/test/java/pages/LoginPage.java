package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;
import utils.DriverFactory;

import java.time.Duration;
import java.util.Map;

public class LoginPage {

    AndroidDriver driver;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
    }





    By searchIcon = By.id("android:id/input");
    By cancelSearch = By.id("com.android.settings:id/search_text_cancel");
    By settings = By.xpath("//android.widget.TextView[@content-desc=\"Settings\"]");
    By aboutPhone = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"About phone\"]");

    public void clickSettings() {
        driver.findElement(settings).click();
        //driver.executeScript("mobile: swipeGesture", Map.of("left", 100, "top", 100, "width", 200, "height", 800, "direction", "up", "percent", 0.75));
    }
    public void clickSearch() {

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(searchIcon));
        driver.findElement(searchIcon).click();
    }
    public void enterText(String text) {
        driver.findElement(searchIcon).sendKeys(text);
    }
    public void clearSearch() {
        driver.findElement(searchIcon).clear();
    }
    public void cancleSearch() {
        driver.findElement(cancelSearch).click();
    }



//
//    By searchIcon = AppiumBy.id("android:id/input");
//    By cancelSearch = AppiumBy.id("com.android.settings:id/search_text_cancel");
//    By settings = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Settings\"]");
//
//
//    public void clickSettings() {
//        DriverFactory.getDriver().findElement(settings).click();
//    }
//    public void clickSearch() {
//        DriverFactory.getDriver().findElement(searchIcon).click();
//    }
//    public void enterText(String text) {
//        DriverFactory.getDriver().findElement(searchIcon).sendKeys(text);
//    }
//    public void clearSearch() {
//        DriverFactory.getDriver().findElement(searchIcon).clear();
//    }
//    public void cancleSearch() {
//        DriverFactory.getDriver().findElement(cancelSearch).click();
//    }


}
