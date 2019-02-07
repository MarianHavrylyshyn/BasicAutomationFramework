package tests.web_test;
import apps.WebApp;

import data.Constant;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import pages.web_pages.*;

public class GenericWebTest extends WebApp {

    @Step
    @AfterClass(alwaysRun = true)
    public void afterClass(){
        closeWebApp();
    }

    @Step
    public HomePage openWebApp(String url){
        getDriver().get(Constant.URL);
        getDriver().findElement(By.id("accept-btn")).click();
        return  new HomePage();
    }

}
