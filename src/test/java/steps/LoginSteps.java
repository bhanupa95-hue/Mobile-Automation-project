package steps;


import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps extends BaseTest {

    LoginPage page;


    @Given("user launches the application")
    public void launchApp() throws Exception {
        page = new LoginPage();
        System.out.println("Application Launched");
    }

    @When("user clicks on setting icon")
    public void clickSettings() {
        page.clickSettings();
    }

    @And("user clicks on search bar")
    public void clickSearch() {
        page.clickSearch();
    }
    @And("user enters text {string}")
    public void enterText(String text) {
        page.enterText(text);
    }

    @Then("results should be displayed")
    public void verifyResults() {
        System.out.println("Results displayed");
    }
    @And("user clears search field")
    public void clearSearch() {
       page.clearSearch();
    }

    @And("user closes application")
    public void closeApp() {
        page.cancleSearch();
//        driver.navigate().back();
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
       // tearDown();
    }
}
