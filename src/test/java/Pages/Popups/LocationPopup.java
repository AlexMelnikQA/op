package Pages.Popups;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Tests.AbstractBaseTests.TestBase.appiumDriver;


public class LocationPopup extends BasePage {

    final static String ALLOW_BUTTON = "com.android.permissioncontroller:id/permission_allow_always_button";
    final static String DO_NOT_ASK_CHECKBOX = "com.android.packageinstaller:id/do_not_ask_checkbox";
    final static String ALLOW_BUTTON_INSTALL = "com.android.packageinstaller:id/permission_allow_button";

    @AndroidFindBy(id = ALLOW_BUTTON)
    @iOSXCUITFindBy(id = ALLOW_BUTTON)
    private WebElement allowButton;

    @AndroidFindBy(id = DO_NOT_ASK_CHECKBOX)
    @iOSXCUITFindBy(id = DO_NOT_ASK_CHECKBOX)
    private WebElement askCheckbox;

    @AndroidFindBy(id = ALLOW_BUTTON_INSTALL)
    @iOSXCUITFindBy(id = ALLOW_BUTTON_INSTALL)
    private WebElement allowButtonInstall;


    public LocationPopup(WebDriver driver) {
        super(driver);
    }

    public void clickAllowButton() {
        if (!appiumDriver.findElementsById(ALLOW_BUTTON).isEmpty())
            allowButton.click();
    }

    public void clickAskCheckbox() {
        if (!appiumDriver.findElementsById(DO_NOT_ASK_CHECKBOX).isEmpty())
            askCheckbox.click();
    }

    public void clickAllowButtonInstall() {
        if (!appiumDriver.findElementsById(ALLOW_BUTTON_INSTALL).isEmpty())
            allowButtonInstall.click();
    }

}
