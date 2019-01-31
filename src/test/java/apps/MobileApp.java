package apps;
import Tools.Driver;
import io.appium.java_client.android.AndroidDriver;

public class MobileApp {
    private static ThreadLocal<Driver> browser = null;
    private static ThreadLocal<Driver> getMobile(){
        if(browser == null) {
            browser = new ThreadLocal<Driver>() {
                @Override
                protected Driver initialValue() {
                    return new Driver();
                }
            };
            return browser;
        } else {
            return browser;
        }
    }
    public static AndroidDriver getMobileDriver (){
        return getMobile().get().getAndroidDriver();
    }

    public static void closeMobileApp (){
        getMobile().get().closeAndroidDriver();
    }
}
