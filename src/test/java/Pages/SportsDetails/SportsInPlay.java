package Pages.SportsDetails;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;

public class SportsInPlay extends BasePage {

    final static String SPORT_IN_PLAY_FIRST_MATCH = "1InplayTabSportsLabelText";
    final static String SPORT_IN_PLAY_FIRST_MEETING_NAME = "1InplayTabMeetingName1";
    final static String SPORT_IN_PLAY_FIRST_MEETING = "1InplayTabMeeting1";
    final static String SPORT_IN_PLAY_FIRST_MARKET_NAME = "1InplayTabMarketName1";
    final static String SPORT_IN_PLAY_FIRST_MARKET_RESULTS = "1InplayTabMarketResults1";
    final static String SPORT_IN_PLAY_FIRST_MARKET_SELL_BUTTON = "1InplayTabMarketSellButton1";
    final static String SPORT_IN_PLAY_FIRST_MARKET_BUY_BUTTON = "1InplayTabMarketBuyButton1";
    final static String SPORT_IN_PLAY_FIRST_MARKET_SUSPEND = "1Undefined1";
    final static String SPORT_IN_PLAY_NO_MATCHES = "inPlayTabNoCurrentMatchesText";


    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MATCH)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MATCH)
    private WebElement sportInPlayFirstMatch;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MEETING_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MEETING_NAME)
    private WebElement sportInPlayFirstMeetingName;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MEETING)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MEETING)
    private WebElement sportInPlayFirstMeeting;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_NAME)
    private WebElement sportInPlayFirstMarketName;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_RESULTS)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_RESULTS)
    private WebElement sportInPlayFirstMarketResults;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_SELL_BUTTON)
    private WebElement sportInPlayFirstMarketSellButton;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_BUY_BUTTON)
    private WebElement sportInPlayFirstMarketBuyButton;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_SUSPEND)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_FIRST_MARKET_SUSPEND)
    private WebElement sportInPlayFirstMarketSuspend;

    @AndroidFindBy(accessibility = SPORT_IN_PLAY_NO_MATCHES)
    @iOSXCUITFindBy(accessibility = SPORT_IN_PLAY_NO_MATCHES)
    private WebElement sportInPlayNoCurrentMatches;


    public SportsInPlay(WebDriver driver) {
        super(driver);
    }

    public void clickOnSportInPlayFirstMatch() {
        sportInPlayFirstMatch.click();
    }

    public boolean isSportInPlayFirstMeetingNameDisplayed() {
        return sportInPlayFirstMeetingName.isDisplayed();
    }

    public boolean isSportInPlayFirstMeetingNameNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_IN_PLAY_FIRST_MEETING_NAME);
    }

    public boolean isSportInPlayFirstMeetingDisplayed() {
        return sportInPlayFirstMeeting.isDisplayed();
    }

    public boolean isSportInPlayFirstMeetingNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_IN_PLAY_FIRST_MEETING);
    }

    public boolean isSportInPlayFirstMarketNameDisplayed() {
        return sportInPlayFirstMarketName.isDisplayed();
    }

    public boolean isSportInPlayFirstMarketNameNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_IN_PLAY_FIRST_MARKET_NAME);
    }

    public boolean isSportInPlayFirstMarketResultsDisplayed() {
        return sportInPlayFirstMarketResults.isDisplayed();
    }

    public boolean isSportInPlayFirstMarketResultsNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_IN_PLAY_FIRST_MARKET_RESULTS);
    }

    public boolean isSportInPlayFirstMarketSellButtonDisplayed() {
        return sportInPlayFirstMarketSellButton.isDisplayed();
    }

    public boolean isSportInPlayFirstMarketSellButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_IN_PLAY_FIRST_MARKET_SELL_BUTTON);
    }

    public boolean isSportInPlayFirstMarketBuyButtonDisplayed() {
        return sportInPlayFirstMarketBuyButton.isDisplayed();
    }

    public boolean isSportInPlayFirstMarketBuyButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_IN_PLAY_FIRST_MARKET_BUY_BUTTON);
    }

    public boolean isSportInPlayNoCurrentMatchesDisplayed() {
        return sportInPlayNoCurrentMatches.isDisplayed();
    }

    public String getSportInPlayNoCurrentMatchesText() {
        return sportInPlayNoCurrentMatches.getText();
    }

    public void waitUntilNoCurrentMatchesMessageDisplayed() {
        waitVisibilityOfElement(sportInPlayNoCurrentMatches);
    }

    public void waitFirstMatchOnSportInPlayTab() {
        waitVisibilityOfElement(sportInPlayFirstMatch);
    }

    public boolean isSportInPlayFirstMarketSuspendedNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_IN_PLAY_FIRST_MARKET_SUSPEND);
    }
}