package pages.web_pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends AbstractWebPage{

    @FindBy(id = "cart_contents_container")
    private List<WebElement> shopingCartProductList;

    @FindBy(className = "cart_checkout_link")
    private WebElement checkOutBtn;

    @Step
    public CheckOutYourInformationPage openCheckOutYourInformationPage(){
        checkOutBtn.click();
        return new CheckOutYourInformationPage();
    }



}
