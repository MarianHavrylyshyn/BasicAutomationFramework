package pages.mobile_pages;

import data.Constant;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class LoginScreen extends AbstractMobilePage {
    @AndroidFindBy(accessibility = "Username Input Field")
    private AndroidElement userNameField;

    @AndroidFindBy(accessibility = "Password Input Field")
    private AndroidElement passwordField;

    @AndroidFindBy(accessibility = "Login Button")
    private AndroidElement loginButton;

    @AndroidFindBy(accessibility = "Alt Message")
    private AndroidElement errorMessage;

    @Step
    public void fillLoginFormWithInvalidData(){
        userNameField.sendKeys(Constant.USERNAMEINVALID);
        passwordField.sendKeys(Constant.PASSWORDINVALID);
    }
    @Step
    public LoginScreen login(){
        fillLoginFormWithInvalidData();
        loginButton.click();
        return this;
    }
    @Step
    public boolean isErrorMessageDisplayed (){
        return errorMessage.isDisplayed();
    }
}
