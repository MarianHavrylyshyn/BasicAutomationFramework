package pages.web_pages;

import data.Constant;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckOutYourInformationPage extends AbstractWebPage {

    @FindBy(css = "input.checkout-input[data-test=firstName]")
    private WebElement firstNameField;

    @FindBy(css = "input.checkout-input[data-test=lastName]")
    private WebElement lastNameField;

    @FindBy(css = "input.checkout-input[data-test=postalCode]")
    private WebElement postalCodeField;

    @FindBy(css = "input.cart_checkout_link[type=submit]")
    private WebElement continueBtn;
    @Step
    public void fillYourInformationForm (String firstName, String lastName, String postalCode){
    firstNameField.sendKeys(firstName);
    lastNameField.sendKeys(lastName);
    postalCodeField.sendKeys(postalCode);
    }
    @Step
    public CheckoutOverviewPage fillShippingInformation(String firstName, String lastName, String postalCode){
        fillYourInformationForm(firstName,lastName,postalCode);
        continueBtn.click();
        return new CheckoutOverviewPage();
    }

}
