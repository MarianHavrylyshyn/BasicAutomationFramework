package tests.mobile_test;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.mobile_pages.InputControlsCheckBoxTabScreen;
import pages.mobile_pages.InputControlsScreen;


@Test
public class TestCheckBox extends GenericMobileTest {
    @Description("Test checkbox is active on the Input Controls screen")
    public void testCheckBox(){
        openMobileApp().openInputControlsScreen().swipe();
    }
}


