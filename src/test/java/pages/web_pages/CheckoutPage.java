package pages.web_pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends AbstractWebPage{
    @FindBy(xpath = "//*[@id='bookstore-checkout']//h3[contains(text(),'Card Detail')]")
    private WebElement cardDetail;
    @FindBy(className = "checkout-title")
    private WebElement loginMessage;
    @Step
    public boolean isCardDetaildisplayed(){
        return cardDetail.isDisplayed();
    }
    @Step
    public String loginMessageText(){
         return loginMessage.getText();
    }
}
