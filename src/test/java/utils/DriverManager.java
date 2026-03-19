package utils;

 import io.appium.java_client.android.AndroidDriver;

    public class DriverManager {

        private static ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();

        public static void setDriver(AndroidDriver driverInstance) {
            driver.set(driverInstance);
        }

        public static AndroidDriver getDriver() {
            return driver.get();
        }

        public static void quitDriver() {
            if (driver.get() != null) {
                driver.get().quit();
                driver.remove();
            }
        }
    }

