package Tools;

import Tools.Browser;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private WebDriver driver;
    private AndroidDriver androidDriver;
    public WebDriver getDriver(){

        if (driver == null){
                this.driver = new Browser().getWebDriver();
                return driver;
        }
        else {
            return driver;
        }
    }
    public void closeDriver(){
        try {
            if(driver != null ){
                //driver.quit();
            }
        }finally{
            driver = null;
        }

    }


    public AndroidDriver getAndroidDriver()  {
        if (androidDriver == null ) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "apps" + File.separator + "");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28 x86");
            caps.setCapability(AndroidMobileCapabilityType.AVD, "Nexus_5X_API_28_x86");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "3000");
            try {
                androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
                System.out.println(androidDriver.getSessionDetails());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return androidDriver;
        }else{
            return androidDriver;
        }
        }
             public void closeAndroidDriver(){
        try {
            if(androidDriver != null ){
                //androidDriver.quit();
            }
        }finally{
            androidDriver = null;
        }
    }
}
