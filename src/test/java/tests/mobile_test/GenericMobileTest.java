package tests.mobile_test;

import apps.MobileApp;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import pages.mobile_pages.HomeScreen;
import pages.mobile_pages.LoginScreen;
import java.util.List;

public class GenericMobileTest extends MobileApp {
    @Step
    public HomeScreen openMobileApp() {
        getMobileDriver();
        return new HomeScreen();
    }
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Login Page']")
    private List<AndroidElement> menuItems;

    private void clickOnMenuItem(String menuItemName) {
        for (int i = 0; i < menuItems.size(); i++) {
            menuItems.get(i).click();
            break;
        }
    }

    @Step
    public LoginScreen openMobileLoginScreen() {
        clickOnMenuItem("Login Page");
        return new LoginScreen();
    }
}