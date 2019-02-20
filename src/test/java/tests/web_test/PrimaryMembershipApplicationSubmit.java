package tests.web_test;

import data.Constant;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Main Epic")
@Feature("Submit Membership application ")
@Story("Membership application")
@Link("https://docs.google.com/spreadsheets/d/1F0uFRnRCLyQhrm_Voci-wO6tNqLIYbrm0JNldMrTiMM/edit#gid=0")
public class PrimaryMembershipApplicationSubmit extends GenericWebTest{
    @Test
    @Description("1.Open ISDA website"+
            " 2.Go to Membership Application Page" +
            " 3.Select Type of Membership application" +
            " 4.Pass Membership status" +

            " 4.Pass Membership status")
    public void fillMembershipApplicationForm() {
         openWebApp(Constant.URL).openMembershipPage().openMembershipApplicationPage().selectMembershipApplicationType("Primary").checkMembershipStatus(Constant.Email
         ).fillNameAndAddressOfApplicantOrganization("ISDA","www"+".dot"+".com"
                 , "+380632152030","+380632152030","This is a valid address","Lviv"
                 ,"Ukraine","California","90002");

        // Assert.assertEquals("","Please log in to continue.","Unregistered user was not able to buy items");
    }
}

