package pages.web_pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends AbstractWebPage {

    @FindBy(className = "cart_checkout_link")
    private WebElement finishBtn;

    @Step
    public CheckoutCompletePage placeOrder(){
        finishBtn.click();
        return new CheckoutCompletePage();
    }
}
