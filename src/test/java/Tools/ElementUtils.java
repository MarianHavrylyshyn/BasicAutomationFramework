package Tools;

import apps.WebApp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
    public void waitForElement(WebElement el) {
        WebDriverWait waiter = new WebDriverWait(WebApp.getDriver(), 2);
        waiter.until(ExpectedConditions.elementToBeClickable(el));

    }
    public void waitForFormSectionToBePopulatedWithText(WebElement element,String text){
        WebDriverWait waiter = new WebDriverWait(WebApp.getDriver(),100);
        waiter.until(ExpectedConditions.textToBePresentInElement(element,text));
    }

}
