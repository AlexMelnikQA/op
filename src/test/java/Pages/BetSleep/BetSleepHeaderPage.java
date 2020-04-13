package Pages.BetSleep;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BetSleepHeaderPage extends BasePage {

    final static String BET_SLEEP_ARROW_UP_BUTTON = "betSlipArrowUpButton";
    final static String BET_SLEEP_TEXT = "betSlipInformText";
    final static String BET_SLEEP_MARKET_NAME = "betSlipMarketName";

    @AndroidFindBy(accessibility = BET_SLEEP_ARROW_UP_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_ARROW_UP_BUTTON)
    private WebElement betSlipArrowUpButton;

    @AndroidFindBy(accessibility = BET_SLEEP_TEXT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_TEXT)
    private WebElement betSlipInformText;

    @AndroidFindBy(accessibility = BET_SLEEP_MARKET_NAME)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_MARKET_NAME)
    private WebElement betSlipMarketName;


    public BetSleepHeaderPage(WebDriver driver) {
        super(driver);
    }

    public boolean isBetSlipArrowUpButtonDisplayed() {
        return betSlipArrowUpButton.isDisplayed();
    }

    public void clickOnBetSlipArrowUpButton() {
        betSlipArrowUpButton.click();
    }

    public boolean isBetSlipInformTextDisplayed() {
        return betSlipInformText.isDisplayed();
    }

    public boolean isBetSlipInformTextNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BET_SLEEP_TEXT);
    }

    public String getBetSlipInformText() {
        return betSlipInformText.getText();
    }

    public boolean isBetSlipMarketNameDisplayed() {
        return betSlipMarketName.isDisplayed();
    }

    public String getBetSlipMarketNameText() {
        return betSlipMarketName.getText();
    }
}