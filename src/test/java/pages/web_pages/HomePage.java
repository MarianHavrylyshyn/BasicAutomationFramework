package pages.web_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends AbstractWebPage{

    @FindBy(id = "menu-item-31")
    private WebElement booksBtn;

    @FindBy(className = "bookstore-featured")
    private List<WebElement> featuredItemsList;
}
