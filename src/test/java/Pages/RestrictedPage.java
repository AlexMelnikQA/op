package Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class RestrictedPage extends BasePage {

    final static String RESTRICTED_PAGE = "UndefinedLocationScreen";

    @AndroidFindBy(accessibility = RESTRICTED_PAGE)
    @iOSXCUITFindBy(accessibility = RESTRICTED_PAGE)
    public WebElement restrictedPage;

    public RestrictedPage(WebDriver driver) {
        super(driver);
    }

    public boolean isRestrictedPageDisplayed() {
        return restrictedPage.isDisplayed();
    }

    public void waitUntiollRestrictedPageDisplayed() {
        waitVisibilityOfElement(restrictedPage);
    }
}