package tests.mobile_test;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Main Epic")
@Feature("Mobile User")
@Story("Mobile Login")
@Issue("CRM-001")
@Link("Jira link to user story")
@Test
public class MobileNegativeLogin extends GenericMobileTest  {
    @Description("Test negative login for mobile apps")
    public void testMobileNegativeLogin()  {
        boolean negativeLogin = openMobileApp().openLoginScreen().login().isErrorMessageDisplayed();
        Assert.assertTrue(negativeLogin,"Negative Login test has failed, error message is not displayed");
    }
}
