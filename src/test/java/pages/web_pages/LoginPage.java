package pages.web_pages;
import apps.WebApp;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends  AbstractWebPage{

    @FindBy(id = "user-name")
    private WebElement usernameElement;

    @FindBy(id = "password")
    private WebElement passwordElement;

    @FindBy(className = "login-button")
    private WebElement loginButton;

    @FindBy(className = "error-button")
    private WebElement errorMessage;
    @Step
    public String getLoginPageTitle(){
        return WebApp.getDriver().getTitle();
    }

    @Step
    private void fillLoginForm(String username, String password){
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
    }
    @Step
    public LoginPage fillLoginFormWithInvalidData(String usernameinvalid, String passwordinvalid){
        fillLoginForm(usernameinvalid, passwordinvalid);
        loginButton.click();
        return this;
    }

    @Step
    public HomePage loginAs(String username, String password){
        fillLoginForm(username, password);
        loginButton.click();
        return new HomePage();
    }

    @Step
    public boolean isLoginErrorDisplayed (){
        return errorMessage.isDisplayed();
    }
}
