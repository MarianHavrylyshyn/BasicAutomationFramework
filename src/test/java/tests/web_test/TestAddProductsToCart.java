package tests.web_test;

import data.Constant;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.web_pages.CheckoutCompletePage;

@Epic("Main Epic")
@Feature("Customer")
@Story("Purchase Items")
@Issue("CRM-003")
@Link("Jira link to user story")
public class TestAddProductsToCart extends GenericWebTest {
    @Test
    @Description("Test of purchasing two items")
    public void testPurchaseTwoItems() {
       CheckoutCompletePage checkoutCompletePage = openWebApp(Constant.URL).loginAs(Constant.USERNAME,Constant.PASSWORD)
               .addProductsToCart("Sauce Labs Bolt T-Shirt","Sauce Labs Bike Light")
                       .openShoppingCartPage().openCheckOutYourInformationPage()
               .fillShippingInformation(Constant.FIRSTNAME,Constant.LASTNAME,Constant.POSTALCODE).placeOrder();
               Assert.assertTrue(checkoutCompletePage.isCompletePurchaseMessageDisplayed(),"Customer could not purchase Items");

    }
}
