package tests.web_test;
import data.Constant;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.web_pages.HomePage;

@Epic("Main Epic")
@Feature("Customer")
@Story("Login")
@Issue("CRM-001")
@Link("Jira link to user story")
public class TestLogin extends GenericWebTest {
    @Test
    @Description("Login test for 'Saucedemo' website")
    public void testLogin(){
       HomePage homePage = openWebApp(Constant.URL).loginAs(Constant.USERNAME,Constant.PASSWORD);
       Assert.assertTrue(homePage.isHomePageOpened(),"User is not logged into the app");
   }
}
