package pages.web_pages;

import Tools.ElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MembershipPage extends AbstractWebPage{
    ElementUtils waiter = new ElementUtils();
    @FindBy(xpath = "//*[@class='btn btn-lg btn-default']")
    private WebElement joinISDABtn;


    public MembershipApplicationPage openMembershipApplicationPage (){
        waiter.waitForElement(joinISDABtn);
        joinISDABtn.click();
        return new MembershipApplicationPage();
    }

}
