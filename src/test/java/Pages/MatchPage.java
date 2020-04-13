package Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MatchPage extends BasePage {

    final static String SPORT_TITLE = "sportDetailsTitleText";
    final static String MARKET_CONTAINER_NAME = "sportTitleContainerName";
    final static String FIRST_MARKET_NAME = "marketName1";
    final static String FIRST_MARKET_SELL_BUTTON = "marketSellButton1";
    final static String FIRST_MARKET_BUY_BUTTON = "marketBuyButton1";
    final static String FIRST_MARKET_SUSPENDED = "marketSuspended1";

    @AndroidFindBy(accessibility = SPORT_TITLE)
    @iOSXCUITFindBy(accessibility = SPORT_TITLE)
    private WebElement sportTitle;

    @AndroidFindBy(accessibility = MARKET_CONTAINER_NAME)
    @iOSXCUITFindBy(accessibility = MARKET_CONTAINER_NAME)
    private WebElement marketContainerName;

    @AndroidFindBy(accessibility = FIRST_MARKET_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_NAME)
    private WebElement firstMarketName;

    @AndroidFindBy(accessibility = FIRST_MARKET_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_SELL_BUTTON)
    private WebElement firstMarketSellButton;

    @AndroidFindBy(accessibility = FIRST_MARKET_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_BUY_BUTTON)
    private WebElement firstMarketBuyButton;

    @AndroidFindBy(accessibility = FIRST_MARKET_SUSPENDED)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_SUSPENDED)
    private WebElement firstMarketSuspended;


    public MatchPage(WebDriver driver) {
        super(driver);
    }

    public String getSportTitleText() {
        return sportTitle.getText();
    }

    public String getMarketContainerName() {
        return marketContainerName.getText();
    }

    public boolean isFirstMarketNameDisplayed() {
        return firstMarketName.isDisplayed();
    }

    public boolean isFirstMarketNameNotPresent() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_NAME);
    }

    public boolean isFirstMarketSellButtonDisplayed() {
        return firstMarketSellButton.isDisplayed();
    }

    public boolean isFirstMarketBuyButtonDisplayed() {
        return firstMarketBuyButton.isDisplayed();
    }

    public boolean isFirstMarketSuspendedNotPresent() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_SUSPENDED);
    }
}