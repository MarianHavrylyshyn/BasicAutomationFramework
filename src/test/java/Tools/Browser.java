package Tools;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Browser {
    private String defaultBrowser = "chrome";
    @Step
    public WebDriver getWebDriver(){
        String browserName;
        if(System.getProperty("browser")== null){
            browserName = defaultBrowser;
        }
        else {
            browserName = System.getProperty("browser");
        }

        WebDriver driver = getDriverByType(browserName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    private String pathToDriverFolder = System.getProperty("user.dir")+ File.separator + "drivers"+
                                        File.separator+getOSFileFolder()+File.separator;
    private String getCurrentOSName (){
        return System.getProperty("os.name");
    }
    private String getOSFileFolder(){
        String oSName = getCurrentOSName();
        switch (oSName){
            case "Windows 10": return "Windows";
            case "Windows 8.1": return "Windows";
            case "Mac OS X": return "MacOS";
            default:throw new IllegalStateException("Unknown OS name");
        }
    }
   /* public static void main(String[] args) {
        System.out.println(new Browser ().getCurrentOSName());
    }*/
    public WebDriver getDriverByType(String browserName){
        switch (browserName){
            case "chrome":System.setProperty("webdriver.chrome.driver",
                    pathToDriverFolder+
                            "chromedriver.exe");
                                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        pathToDriverFolder+
                                "geckodriver.exe");
                                    return new FirefoxDriver();
                                    default:
                                         throw new IllegalStateException("Please provide existed browser"+
                                                                        "name due to current is unknown" + browserName);
        }
    }

}
