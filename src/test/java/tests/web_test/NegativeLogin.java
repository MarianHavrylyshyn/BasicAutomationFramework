package tests.web_test;
import data.Constant;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.web_pages.LoginPage;

@Epic("Main Epic")
@Feature("Customer")
@Story("Login")
@Issue("CRM-002")
@Link("Jira link to user story")
@Test
public class NegativeLogin extends GenericWebTest {
    @Description("Test negative Login for 'Saucedemo' website")
    public void testNegativeLogin(){
        LoginPage negativeLogin = openWebApp(Constant.URL).fillLoginFormWithInvalidData(Constant.USERNAMEINVALID,Constant.PASSWORDINVALID);
       Assert.assertTrue(negativeLogin.isLoginErrorDisplayed(),"Negative Login test has failed, error message is not displayed");
   }

}

