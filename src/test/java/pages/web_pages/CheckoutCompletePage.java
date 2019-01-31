package pages.web_pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutCompletePage extends AbstractWebPage {

    @FindBy(className = "complete-text")
    private WebElement completeMessage;

        @Step
    public boolean isCompletePurchaseMessageDisplayed() {
        return completeMessage.isDisplayed();

    }
}
