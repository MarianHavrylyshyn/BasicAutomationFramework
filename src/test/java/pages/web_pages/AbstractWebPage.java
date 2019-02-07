package pages.web_pages;

import apps.WebApp;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AbstractWebPage  {
    public AbstractWebPage(){
        PageFactory.initElements(WebApp.getDriver(), this);
    }
    @Step
    public LoginPage openLoginPage(){
        WebApp.getDriver().findElement(By.className("link-login")).click();
        return new LoginPage();
    }
    @Step
    public BooksPage openBooksPage(){
        WebApp.getDriver().findElement(By.id("menu-item-31")).click();
        return new BooksPage();
    }
    @Step
    public CommitteesPage CommitteesPage(){
        WebApp.getDriver().findElement(By.id("menu-item-32")).click();
        return new CommitteesPage();
    }
    @Step
    public EventsPage openEventsPage(){
        WebApp.getDriver().findElement(By.id("menu-item-33")).click();
        return new EventsPage();
    }
    @Step
    public MembershipPage openMembershipPage(){
        WebApp.getDriver().findElement(By.id("menu-item-10307")).click();
        return new MembershipPage();
    }
    @Step
    public NewsPage openNewsPage(){
        WebApp.getDriver().findElement(By.id("menu-item-7041")).click();
        return new NewsPage();
    }
    @Step
    public OpinionsPage openOpinionsPage(){
        WebApp.getDriver().findElement(By.id("menu-item-7042")).click();
        return new OpinionsPage();
    }
    @Step
    public ProtocolsPage openProtocolsPage(){
        WebApp.getDriver().findElement(By.id("menu-item-35")).click();
        return new ProtocolsPage();
    }
    @Step
    public ShoppingCartPage openShoppingCartPage(){
        WebApp.getDriver().findElement(By.cssSelector("nav#tax-navigation>ul>li.hidden-xs>a")).click();
        return new ShoppingCartPage();
    }
}

