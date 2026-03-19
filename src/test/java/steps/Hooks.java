package steps;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks extends BaseTest {

    @Before
    public void setUp() throws Exception {
        // Call BaseTest setup manually with default values
        setup("AndroidDevice", "c606eb5bbbfa", "8202", "4723");
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }

}
