package utils;

import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

    private static ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();

    public static AndroidDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(AndroidDriver driverInstance) {
        driver.set(driverInstance);
    }
}
