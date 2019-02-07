package pages.web_pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends AbstractWebPage {

    @FindBy(xpath = "//a[@class='btn btn-default']")
    private WebElement proceedToCheckoutBtn;

    @Step
    public CheckoutPage openCheckoutPage()  {
        proceedToCheckoutBtn.click();
        return new CheckoutPage();
    }
}