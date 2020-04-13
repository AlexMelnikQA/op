package Pages.Home;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePagePopularTab extends BasePage {

    final static String FILTER_ALL = "1PopularTabFilter";
    final static String FILTER_FIRST = "2PopularTabFilter";
    final static String FILTER_SECOND = "3PopularTabFilter";
    final static String FIRST_SPORT_SECTION = "1PopularTabSportsSection";
    final static String FIRST_MEETING_NAME = "1PopularTabMeetingName1";
    final static String FIRST_MARKET_DESCRIPTION = "1PopularTabMarketDescription1";
    final static String FIRST_MARKET_RESULTS = "1PopularTabMarketResults1";
    final static String FIRST_MARKET_BUY_BUTTON = "1PopularTabMarketBuyButton1";
    final static String FIRST_MARKET_SELL_BUTTON = "1PopularTabMarketSellButton1";
    final static String FIRST_MARKET_SUSPENDED = "1PopularTabMeetingSuspended1";


    @AndroidFindBy(accessibility = FILTER_ALL)
    @iOSXCUITFindBy(accessibility = FILTER_ALL)
    private WebElement filterAll;

    @AndroidFindBy(accessibility = FILTER_FIRST)
    @iOSXCUITFindBy(accessibility = FILTER_FIRST)
    private WebElement filterFirst;

    @AndroidFindBy(accessibility = FILTER_SECOND)
    @iOSXCUITFindBy(accessibility = FILTER_SECOND)
    private WebElement filterSecond;

    @AndroidFindBy(accessibility = FIRST_SPORT_SECTION)
    @iOSXCUITFindBy(accessibility = FIRST_SPORT_SECTION)
    private WebElement firstSportSection;

    @AndroidFindBy(accessibility = FIRST_MEETING_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_NAME)
    private WebElement firstMeetingName;

    @AndroidFindBy(accessibility = FIRST_MARKET_DESCRIPTION)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_DESCRIPTION)
    private WebElement firstMarketDescription;

    @AndroidFindBy(accessibility = FIRST_MARKET_RESULTS)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_RESULTS)
    private WebElement firstMarketResults;

    @AndroidFindBy(accessibility = FIRST_MARKET_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_SELL_BUTTON)
    private WebElement firstMarketSellButton;

    @AndroidFindBy(accessibility = FIRST_MARKET_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_BUY_BUTTON)
    private WebElement firstMarketBuyButton;


    public HomePagePopularTab(WebDriver driver) {
        super(driver);
    }

    public boolean isFilterAllDisplayed() {
        return filterAll.isDisplayed();
    }

    public void clickOnFilterAll() {
        filterAll.click();
    }

    public boolean isFilterFirstDisplayed() {
        return filterFirst.isDisplayed();
    }

    public void clickOnFilterFirst() {
        filterFirst.click();
    }

    public String getFilterFirstText() {
        return filterFirst.getText();
    }

    public boolean isFilterSecondDisplayed() {
        return filterSecond.isDisplayed();
    }

    public void clickOnFilterSecond() {
        filterSecond.click();
    }

    public String getFilterSecondText() {
        return filterSecond.getText();
    }

    public boolean isFirstSportSectionDisplayed() {
        return firstSportSection.isDisplayed();
    }

    public void clickOnFirstSportSection() {
        firstSportSection.click();
    }

    public String getFirstSportSectionText() {
        return firstSportSection.getText();
    }

    public boolean isFirstMeetingNameDisplayed() {
        return firstMeetingName.isDisplayed();
    }

    public boolean isFirstMeetingNameNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MEETING_NAME);
    }

    public String getFirstMeetingNameText() {
        return firstMeetingName.getText();
    }

    public boolean isFirstMarketDescriptionDisplayed() {
        return firstMarketDescription.isDisplayed();
    }

    public boolean isFirstMarketDescriptionNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_DESCRIPTION);
    }

    public boolean isFirstMarketResultsDisplayed() {
        return firstMarketResults.isDisplayed();
    }

    public boolean isFirstMarketResultsNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_RESULTS);
    }

    public boolean isFirstMarketSellButtonDisplayed() {
        return firstMarketSellButton.isDisplayed();
    }

    public boolean isFirstMarketSellButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_SELL_BUTTON);
    }

    public boolean isFirstMarketBuyButtonDisplayed() {
        return firstMarketBuyButton.isDisplayed();
    }

    public boolean isFirstMarketBuyButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_BUY_BUTTON);
    }

    public boolean isFirstMarketSuspendedNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_SUSPENDED);
    }
}