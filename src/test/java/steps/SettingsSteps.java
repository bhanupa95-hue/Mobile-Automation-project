//package steps;
//
//
//import base.BaseTest;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.SettingsPage;
//
//
//
//public class SettingsSteps extends BaseTest {
//
//    SettingsPage page;
//
//
//    @Given("user is launching the application")
//    public void launchApp() throws Exception {
//        page = new SettingsPage();
//        System.out.println("ASettings Application Launched");
//    }
//
//    @When("user validates first option")
//    public void firstOption() {
//      page.setAboutPhone();
//    }
//
//    @And("user validates second option")
//    public void secondOption() {
//      page.setSystemAppUpdater();
//    }
//
//    @And("user validates third option")
//    public void thirdOption() {
//     page.setSecurityStatus();
//    }
//
//    @Then("user clicks on first option")
//    public void clicksOnFirstOption() {
//        page.clickAboutPhone();
//        System.out.println("User Clicked About phone");
//    }
//
//    @And("user closes the application")
//    public void closeApp() {
//        driver.navigate().back();
//
//    }
//}
