package tests.web_test;
import apps.WebApp;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;
import pages.web_pages.LoginPage;

public class GenericWebTest extends WebApp {
    private String defaultBrowser = "chrome";

    @Step
    @AfterClass(alwaysRun = true)
    public void afterClass(){
        closeWebApp();
    }

    @Step
    public LoginPage openWebApp(String url){
        getDriver().get(url);
        return  new LoginPage();
    }
}
