package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginPage {

    AndroidDriver driver;

    public LoginPage( AndroidDriver driver) {
        this.driver = driver;
    }

    By searchIcon = By.id("android:id/input");
    By cancelSearch = By.id("com.android.settings:id/search_text_cancel");
    By settings = By.xpath("//android.widget.TextView[@content-desc=\"Settings\"]");

    public void clickSettings() {
        driver.findElement(settings).click();
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


}
