package Pages.Screens;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PromotionsScreen extends BasePage {

    final static String PROMO_ACTIVE_TAB = "Active";
    final static String PROMO_PAST_TAB = "Past";

    @AndroidFindBy(accessibility = PROMO_ACTIVE_TAB)
    @iOSXCUITFindBy(accessibility = PROMO_ACTIVE_TAB)
    private WebElement activeTab;

    @AndroidFindBy(accessibility = PROMO_PAST_TAB)
    @iOSXCUITFindBy(accessibility = PROMO_PAST_TAB)
    private WebElement pastTab;


    public PromotionsScreen(WebDriver driver) {
        super(driver);
    }

    public void clickOnActiveTab() {
        activeTab.click();
    }

    public void clickOnPastTab() {
        pastTab.click();
    }
}