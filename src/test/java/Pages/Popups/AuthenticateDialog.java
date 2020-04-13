package Pages.Popups;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Tests.AbstractBaseTests.TestBase.appiumDriver;


public class AuthenticateDialog extends BasePage {

    final static String OK_BUTTON = "okAuthenticateDialogButton";

    @AndroidFindBy(accessibility = OK_BUTTON)
    @iOSXCUITFindBy(accessibility = OK_BUTTON)
    private WebElement authenticateOkButton;


    public AuthenticateDialog(WebDriver driver) {
        super(driver);
    }

    public void clickOkButton() {
        if (!appiumDriver.findElementsByAccessibilityId(OK_BUTTON).isEmpty())
            authenticateOkButton.click();
    }
}