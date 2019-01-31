package tests.mobile_test;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Main Epic")
@Feature("Mobile User")
@Story("Mobile Alerts")
@Issue("CRM-002")
@Link("Jira link to user story")
@Test
public class TestAlertMessage extends GenericMobileTest{
   @Description("Test alert message is: This is the alert message")
    public void testAlertMessage()  {
       String errorMessageText = openMobileApp().openAlertsAndDialogsScreen().clickAlertBtn().errorMessageText();
        Assert.assertEquals(errorMessageText,"This is the alert message","Test Alert Message has failed");
    }
}