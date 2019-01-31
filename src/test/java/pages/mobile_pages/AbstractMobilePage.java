package pages.mobile_pages;

import apps.MobileApp;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AbstractMobilePage {
 public AbstractMobilePage(){
     PageFactory.initElements(new AppiumFieldDecorator(MobileApp.getMobileDriver()), this);
 }
}
