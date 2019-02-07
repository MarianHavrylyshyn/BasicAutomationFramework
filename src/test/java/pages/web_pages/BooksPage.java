package pages.web_pages;

import Tools.ElementUtils;
import apps.WebApp;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Arrays;

public class BooksPage extends AbstractWebPage{
    ElementUtils waiter = new ElementUtils();
    @FindBy(name = "add ebook to cart")
    private WebElement buyEBookBtn;
    @Step
    public void addItemToCart(String itemName){
        WebApp.getDriver().findElement(By.xpath
              ("//a[contains(text(), '"+itemName+"')]//ancestor::div/*[@class='bookstore-info']/*[@class='bookstore-ctas']/*[@name='add ebook to cart']")).click();
    }
    @Step
    public BooksPage addItemsToCart(String... itemsList)   {
        for(String itemName: Arrays.asList(itemsList)){
            addItemToCart(itemName);
        }
        return new BooksPage();
    }
}