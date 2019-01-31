package pages.web_pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends AbstractWebPage  {

    @FindBy(className = "add-to-cart-button")
    private WebElement addToCartBtn;

    @FindBy(className = "inventory_details_back_button")
    private WebElement backToHomePageBtn;
    @Step
    public ProductPage addProductToCart(){
        addToCartBtn.click();
        return this;
    }
    @Step
    public HomePage backToHomePage(){
        backToHomePageBtn.click();
        return new HomePage();
    }
}
