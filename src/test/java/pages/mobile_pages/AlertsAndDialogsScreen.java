package pages.mobile_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class AlertsAndDialogsScreen extends AbstractMobilePage {
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button")
    private AndroidElement alertBtn;

    @AndroidFindBy(id = "android:id/message")
    private AndroidElement errorMessageText;

    @Step
    public AlertsAndDialogsScreen clickAlertBtn(){
        alertBtn.click();
        return this;
    }
    @Step
    public String errorMessageText (){
      // return MobileApp.getMobileDriver().switchTo().alert().getText();
        return errorMessageText.getText();
    }
}
