package steps;


import base.BaseTest;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps extends BaseTest {

    LoginPage page;


    @Given("user launches the application")
    public void launchApp() throws Exception {
        page = new LoginPage(driver);
        System.out.println("Application Launched");
        driver.activateApp("com.android.settings");
    }

    @When("user clicks on search bar")
    public void clickSearch() {
        page.clickSearch();
    }
    @And("user enters {string}")
    public void enterText(String text) {
        page.enterText(text);
    }

    @Then("results should be displayed")
    public void verifyResults() {
        System.out.println("Results displayed");
    }

    @And("user closes the application")
    public void closeApp() {
        page.cancleSearch();
        tearDown();
        }
    }

