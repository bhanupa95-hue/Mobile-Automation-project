package steps;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void setUp() throws Exception {
        setup("AndroidDevice", "c606eb5bbbfa", "8203", "4723");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
