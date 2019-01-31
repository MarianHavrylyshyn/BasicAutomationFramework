package pages.web_pages;
import apps.WebApp;
import org.openqa.selenium.support.PageFactory;

public class AbstractWebPage  {
    public AbstractWebPage(){
        PageFactory.initElements(WebApp.getDriver(), this); }
}

