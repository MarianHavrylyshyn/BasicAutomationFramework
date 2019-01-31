package pages.mobile_pages;

import Tools.ElementUtils;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class HomeScreen extends AbstractMobilePage  {

    @AndroidFindBy(accessibility = "ReferenceApp")
    private AndroidElement menuButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login Page']")
    private AndroidElement loginPageMenuBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alerts']")
    private AndroidElement alertsAndDialogsMenuBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Input Controls']")
    private AndroidElement inputControlsMenuBtn;

    ElementUtils elementUtils = new ElementUtils();

    @Step
    public void expandMenu(){
        menuButton.click();
    }

    @Step
    public LoginScreen openLoginScreen(){
        expandMenu();
        elementUtils.waitForElement(loginPageMenuBtn);
        loginPageMenuBtn.click();
        return new LoginScreen();
    }
    @Step
    public AlertsAndDialogsScreen openAlertsAndDialogsScreen(){
        expandMenu();
        elementUtils.waitForElement(alertsAndDialogsMenuBtn);
        alertsAndDialogsMenuBtn.click();
        return new AlertsAndDialogsScreen();
    }
    @Step
    public InputControlsScreen openInputControlsScreen(){
        expandMenu();
        elementUtils.waitForElement(inputControlsMenuBtn);
        inputControlsMenuBtn.click();
        return new InputControlsScreen();
    }

}
