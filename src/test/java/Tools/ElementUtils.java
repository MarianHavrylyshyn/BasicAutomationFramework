package Tools;

import apps.MobileApp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
    public void waitForElement(WebElement el) {
        WebDriverWait waiter = new WebDriverWait(MobileApp.getMobileDriver(), 2);
        waiter.until(ExpectedConditions.elementToBeClickable(el));
    }
}
