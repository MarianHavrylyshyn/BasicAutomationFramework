package tests.web_test;

import data.Constant;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Main Epic")
@Feature("Books")
@Story("Buy Items")
@Link("https://docs.google.com/spreadsheets/d/1F0uFRnRCLyQhrm_Voci-wO6tNqLIYbrm0JNldMrTiMM/edit#gid=0")
public class BuyItems extends GenericWebTest {
    @Test
    @Description("1.Open ISDA website"+
            " 2.Add two items from Featured Section to cart" +
            " 3.Proceed to checkout" +
            " 4. Verify that user is redirected to Login Page")
    public void buyItemsFromFeaturedSection()  {
       String errorMessageText = openWebApp(Constant.URL).openBooksPage().addItemsToCart("2018 Credit Support Deed For Initial Margin (IM) ","2006 ISDA Definitions")
                .openShoppingCartPage().openCheckoutPage().loginMessageText();
        Assert.assertEquals(errorMessageText,"Please log in to continue.","Unregistered user was not able to buy items");
        }
    }

