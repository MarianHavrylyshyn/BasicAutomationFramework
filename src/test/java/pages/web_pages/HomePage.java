package pages.web_pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Arrays;
import java.util.List;

import static apps.WebApp.getDriver;

public class HomePage  extends AbstractWebPage {

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartIcon;

    @FindBy(className = "add-to-cart-button")
    public WebElement addToCartBtn;

    @FindBy(id = "inventory_container")
    private List<WebElement> productsList;

    @FindBy(className = "add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(id = "item_4_title_link")
    private WebElement product;

    @Step
    public boolean isHomePageOpened (){
        return shoppingCartIcon.isDisplayed();
    }
    @Step
    public HomePage addProductToCart(String productName){
    getDriver().findElement(By.xpath("//div[contains(text(),'"+productName+"')]/" +
            "ancestor::div[@class='inventory_item']//button")).click();
    return this;
    }
    @Step
    public HomePage addProductsToCart(String... productsList){
    for(String productName: Arrays.asList(productsList) ) {
        addProductToCart(productName); }
    return this;
    }
    @Step
    public ProductPage openProductPage(){
        product.click();
        return new ProductPage();
    }
    @Step
    public ShoppingCartPage openShoppingCartPage(){
        shoppingCartIcon.click();
        return new ShoppingCartPage();
    }

}
