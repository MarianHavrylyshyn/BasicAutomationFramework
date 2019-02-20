package pages.web_pages;


import Tools.ElementUtils;
import apps.WebApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class MembershipApplicationPage extends AbstractWebPage {

    //Check membership by email address

    @FindBy(id="member-email")
    private WebElement companyEmailField;
    @FindBy(id="btn-member-check-user")
    private WebElement checkMembershipStatusBtn;
    @FindBy(id="select-member-app-dropdown")
    private WebElement applicationMembershipType;

    //Select type of Membership organization

    public MembershipApplicationPage selectMembershipApplicationType(String applicationTypeName){
        WebApp.getDriver().findElement(By.xpath("//option[contains(text(),'"+applicationTypeName+"')]")).click();
        //option[contains(text(),'Primary Membership Application')] - original xpath
        return this;
    }
    // ExpandCollapse section form header

    public MembershipApplicationPage expandCollapseFormSection(String formSectionName){
        WebApp.getDriver().findElement(By.xpath("//*[@class='col-xs-12']//*[contains(text(),'"+formSectionName+"')]/following-sibling::button")).click();
        // Original xpath= //*[@class='col-xs-12']//*[contains(text(),'Company Email')]//*[@class='form-step-number']
        // modified = //*[@class='col-xs-12']//*[contains(text(),'Company Email')]/following-sibling::button
        return this;
    }

    //Company Email form

    public MembershipApplicationPage checkMembershipStatus(String emailAddress){
        companyEmailField.sendKeys(emailAddress);
        checkMembershipStatusBtn.click();
        return this;
    }

    //Name and Address of applicant organization form

    @FindBy(id="organization-name")
    private WebElement organizationNameField;
    @FindBy(id="organization-website")
    private WebElement organizationWebSiteField;
    @FindBy(id="organization-phone")
    private WebElement organizationTelephoneField;
    @FindBy(id="organization-fax")
    private WebElement organizationFaxField;
    @FindBy(id="organization-address")
    private WebElement organizationAddressField;
    @FindBy(id="organization-city")
    private WebElement organizationCityField;
    @FindBy(id="organization-state")
    private WebElement organizationStateField;
    @FindBy(id="organization-zip")
    private WebElement organizationPostalCodeField;
    @FindBy(id = "organization-country")
    private WebElement organizationCountryDropdown;

    //Click Next button for section form

    public MembershipApplicationPage clickNextButtonForSectionName(String membershipFormId){
        WebApp.getDriver().findElement(By.xpath("//*[@id='"+membershipFormId+"']//*[@class ='btn-member-app-next']")).click();
        //original Xpath = //*[@id='membership-form-2']//*[@class ='btn-member-app-next']
        return this;
    }

    //Fill Name and Address of applicant organization form section

    public MembershipApplicationPage fillNameAndAddressOfApplicantOrganization(String organizationName,
                                                                               String webSite,
                                                                               String telephone,
                                                                               String fax,
                                                                               String address,
                                                                               String city,
                                                                               String organizationCountry,
                                                                               String stateProvince,
                                                                               String postalCode)   {
        //collapseFormSection("form-step step-0 open");
        organizationNameField.sendKeys(organizationName);
        organizationWebSiteField.sendKeys(webSite);
        organizationTelephoneField.sendKeys(telephone);
        organizationFaxField.sendKeys(fax);
        organizationAddressField.sendKeys(address);
        organizationCityField.sendKeys(city);
        Select countryDropDown = new Select(organizationCountryDropdown);
        countryDropDown.selectByVisibleText(organizationCountry);
        organizationStateField.sendKeys(stateProvince);
        organizationPostalCodeField.sendKeys(postalCode);
        clickNextButtonForSectionName("membership-form-2");
        return this;
    }

}
