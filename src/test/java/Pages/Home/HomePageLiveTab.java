package Pages.Home;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class HomePageLiveTab extends BasePage {

    final static String LIVE_TAB = "liveTab";

    final static String SPORT_FIRST_LINE = "1LiveTabSportsName";
    final static String FIRST_MEETING_FIRST_SPORT = "1LiveTabMeeting1";
    final static String FIRST_MEETING_FIRST_SPORT_NAME = "1LiveTabMeetingName1";
    final static String FIRST_MARKET_FIRST_SPORT_NAME = "1LiveTabMarketName1";
    final static String FIRST_MARKET_FIRST_SPORT_RESULT = "1LiveTabMarketResults1";
    final static String FIRST_MARKET_FIRST_SPORT_BUY_BUTTON = "1LiveTabMarketBuyButton1";
    final static String FIRST_MARKET_FIRST_SPORT_SELL_BUTTON = "1LiveTabMarketSellButton1";
    final static String FIRST_MARKET_FIRST_SPORT_SUSPENDED = "1LiveTabMeetingSuspended1";

    final static String SECOND_MEETING_FIRST_SPORT = "1LiveTabMeeting2";
    final static String SECOND_MEETING_FIRST_SPORT_NAME = "1LiveTabMeetingName2";
    final static String SECOND_MARKET_FIRST_SPORT_NAME = "1LiveTabMarketName2";
    final static String SECOND_MARKET_FIRST_SPORT_RESULT = "1LiveTabMarketResults2";
    final static String SECOND_MARKET_FIRST_SPORT_BUY_BUTTON = "1LiveTabMarketBuyButton2";
    final static String SECOND_MARKET_FIRST_SPORT_SELL_BUTTON = "1LiveTabMarketSellButton2";
    final static String SECOND_MARKET_FIRST_SPORT_SUSPENDED = "1LiveTabMeetingSuspended2";

    final static String THIRD_MEETING_FIRST_SPORT = "1LiveTabMeeting3";
    final static String THIRD_MEETING_FIRST_SPORT_NAME = "1LiveTabMeetingName3";
    final static String THIRD_MARKET_FIRST_SPORT_NAME = "1LiveTabMarketName3";
    final static String THIRD_MARKET_FIRST_SPORT_RESULT = "1LiveTabMarketResults3";
    final static String THIRD_MARKET_FIRST_SPORT_BUY_BUTTON = "1LiveTabMarketBuyButton3";
    final static String THIRD_MARKET_FIRST_SPORT_SELL_BUTTON = "1LiveTabMarketSellButton3";
    final static String THIRD_MARKET_FIRST_SPORT_SUSPENDED = "1LiveTabMeetingSuspended3";

    final static String SPORT_SECOND_LINE = "2LiveTabSportsName";
    final static String FIRST_MEETING_SECOND_SPORT = "2LiveTabMeeting1";
    final static String FIRST_MEETING_SECOND_SPORT_NAME = "2LiveTabMeetingName1";
    final static String FIRST_MARKET_SECOND_SPORT_NAME = "2LiveTabMarketName1";
    final static String FIRST_MARKET_SECOND_SPORT_RESULT = "2LiveTabMarketResults1";
    final static String FIRST_MARKET_SECOND_SPORT_BUY_BUTTON = "2LiveTabMarketBuyButton1";
    final static String FIRST_MARKET_SECOND_SPORT_SELL_BUTTON = "2LiveTabMarketSellButton1";
    final static String FIRST_MARKET_SECOND_SPORT_SUSPENDED = "2LiveTabMeetingSuspended1";

    final static String SECOND_MEETING_SECOND_SPORT = "2LiveTabMeeting2";
    final static String SECOND_MEETING_SECOND_SPORT_NAME = "2LiveTabMeetingName2";
    final static String SECOND_MARKET_SECOND_SPORT_NAME = "2LiveTabMarketName2";
    final static String SECOND_MARKET_SECOND_SPORT_RESULT = "2LiveTabMarketResults2";
    final static String SECOND_MARKET_SECOND_SPORT_BUY_BUTTON = "2LiveTabMarketBuyButton2";
    final static String SECOND_MARKET_SECOND_SPORT_SELL_BUTTON = "2LiveTabMarketSellButton2";
    final static String SECOND_MARKET_SECOND_SPORT_SUSPENDED = "2LiveTabMeetingSuspended2";

    final static String SPORT_THIRD_LINE = "3LiveTabSportsName";
    final static String FIRST_MEETING_THIRD_SPORT = "3LiveTabMeeting1";
    final static String FIRST_MEETING_THIRD_SPORT_NAME = "3LiveTabMeetingName1";
    final static String FIRST_MARKET_THIRD_SPORT_NAME = "3LiveTabMarketName1";
    final static String FIRST_MARKET_THIRD_SPORT_RESULT = "3LiveTabMarketResults1";
    final static String FIRST_MARKET_THIRD_SPORT_BUY_BUTTON = "3LiveTabMarketBuyButton1";
    final static String FIRST_MARKET_THIRD_SPORT_SELL_BUTTON = "3LiveTabMarketSellButton1";
    final static String FIRST_MARKET_THIRD_SPORT_SUSPENDED = "3LiveTabMeetingSuspended1";

    final static String LIVE_TAB_NO_LIVE_MATCH = "liveTabNoLiveMatches";
    final static String LIVE_TAB_NO_LIVE_MATCH_TEXT = "liveTabNoLiveMatchesText";


    @AndroidFindBy(accessibility = SPORT_FIRST_LINE)
    @iOSXCUITFindBy(accessibility = SPORT_FIRST_LINE)
    private WebElement sportFirst;

    @AndroidFindBy(accessibility = FIRST_MEETING_FIRST_SPORT)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_FIRST_SPORT)
    private WebElement meetingFirstSportFirst;

    @AndroidFindBy(accessibility = FIRST_MEETING_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_FIRST_SPORT_NAME)
    private WebElement meetingFirstSportFirstName;

    @AndroidFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_NAME)
    private WebElement marketFirstSportFirstDescription;

    @AndroidFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_RESULT)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_RESULT)
    private WebElement marketFirstSportFirstResult;

    @AndroidFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_BUY_BUTTON)
    private WebElement marketFirstSportFirstBuy;

    @AndroidFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_SELL_BUTTON)
    private WebElement marketFirstSportFirstSell;

    @AndroidFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_SUSPENDED)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_FIRST_SPORT_SUSPENDED)
    private WebElement marketFirstSportFirstSuspended;

    @AndroidFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_NAME)
    private WebElement marketSecondSportFirstDescription;

    @AndroidFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_NAME)
    private WebElement meetingSecondSportFirstName;

    @AndroidFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_BUY_BUTTON)
    private WebElement marketSecondSportFirstBuy;

    @AndroidFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = SECOND_MARKET_FIRST_SPORT_SELL_BUTTON)
    private WebElement marketSecondSportFirstSell;

    @AndroidFindBy(accessibility = THIRD_MARKET_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = THIRD_MARKET_FIRST_SPORT_NAME)
    private WebElement meetingThirdSportFirstName;

    @AndroidFindBy(accessibility = THIRD_MEETING_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = THIRD_MEETING_FIRST_SPORT_NAME)
    private WebElement marketThirdSportFirstDescription;

    @AndroidFindBy(accessibility = THIRD_MARKET_FIRST_SPORT_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = THIRD_MARKET_FIRST_SPORT_BUY_BUTTON)
    private WebElement marketThirdSportFirstBuy;

    @AndroidFindBy(accessibility = THIRD_MARKET_FIRST_SPORT_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = THIRD_MARKET_FIRST_SPORT_SELL_BUTTON)
    private WebElement marketThirdSportFirstSell;

    @AndroidFindBy(accessibility = SPORT_SECOND_LINE)
    @iOSXCUITFindBy(accessibility = SPORT_SECOND_LINE)
    private WebElement sportSecond;

    @AndroidFindBy(accessibility = FIRST_MARKET_SECOND_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_SECOND_SPORT_NAME)
    private WebElement meetingFirstSportSecondName;

    @AndroidFindBy(accessibility = FIRST_MEETING_SECOND_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_SECOND_SPORT_NAME)
    private WebElement marketFirstSportSecondDescription;

    @AndroidFindBy(accessibility = FIRST_MARKET_SECOND_SPORT_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_SECOND_SPORT_BUY_BUTTON)
    private WebElement marketFirstSportSecondBuy;

    @AndroidFindBy(accessibility = FIRST_MARKET_SECOND_SPORT_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_SECOND_SPORT_SELL_BUTTON)
    private WebElement marketFirstSportSecondSell;

    @AndroidFindBy(accessibility = SECOND_MARKET_SECOND_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = SECOND_MARKET_SECOND_SPORT_NAME)
    private WebElement meetingSecondSportSecondName;

    @AndroidFindBy(accessibility = SECOND_MEETING_SECOND_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = SECOND_MEETING_SECOND_SPORT_NAME)
    private WebElement marketSecondSportSecondDescription;

    @AndroidFindBy(accessibility = SECOND_MARKET_SECOND_SPORT_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = SECOND_MARKET_SECOND_SPORT_BUY_BUTTON)
    private WebElement marketSecondSportSecondBuy;

    @AndroidFindBy(accessibility = SECOND_MARKET_SECOND_SPORT_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = SECOND_MARKET_SECOND_SPORT_SELL_BUTTON)
    private WebElement marketSecondSportSecondSell;

    @AndroidFindBy(accessibility = SPORT_THIRD_LINE)
    @iOSXCUITFindBy(accessibility = SPORT_THIRD_LINE)
    private WebElement sportThird;

    @AndroidFindBy(accessibility = FIRST_MARKET_THIRD_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_THIRD_SPORT_NAME)
    private WebElement meetingFirstSportThirdName;

    @AndroidFindBy(accessibility = FIRST_MEETING_THIRD_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_THIRD_SPORT_NAME)
    private WebElement marketFirstSportThirdDescription;

    @AndroidFindBy(accessibility = FIRST_MARKET_THIRD_SPORT_BUY_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_THIRD_SPORT_BUY_BUTTON)
    private WebElement marketFirstSportThirdBuy;

    @AndroidFindBy(accessibility = FIRST_MARKET_THIRD_SPORT_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_MARKET_THIRD_SPORT_SELL_BUTTON)
    private WebElement marketFirstSportThirdSell;

    @AndroidFindBy(accessibility = LIVE_TAB_NO_LIVE_MATCH)
    @iOSXCUITFindBy(accessibility = LIVE_TAB_NO_LIVE_MATCH)
    private WebElement liveTabNotHaveLiveMatches;

    @AndroidFindBy(accessibility = LIVE_TAB_NO_LIVE_MATCH_TEXT)
    @iOSXCUITFindBy(accessibility = LIVE_TAB_NO_LIVE_MATCH_TEXT)
    private WebElement liveTabNotHaveLiveMatchesText;


    public HomePageLiveTab(WebDriver driver) {
        super(driver);
    }

    public void waitFistSportBecomesVisible() {
        waitVisibilityOfElement(sportFirst);
    }

    public void waitFirstSellButtonForFirstSportIsVisible() {
        waitVisibilityOfElement(marketFirstSportFirstSell);
    }

    public boolean isLiveTabNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(LIVE_TAB);
    }

    public void clickOnFirstSportLine() {
        sportFirst.click();
    }

    public String getFirstSportLineText() {
        return sportFirst.getText();
    }

    public boolean isFirstMeetingSportFirstDisplayed() {
        return meetingFirstSportFirst.isDisplayed();
    }

    public boolean isFirstMeetingSportFirstNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MEETING_FIRST_SPORT_NAME);
    }

    public boolean isFirstMarketSportFirstDescriptionDisplayed() {
        return marketFirstSportFirstDescription.isDisplayed();
    }

    public String getFirstMarketSportFirstDescriptionText() {
        return marketFirstSportFirstDescription.getText();
    }

    public void clickOnFirstMarketSportFirstItem() {
        marketFirstSportFirstDescription.click();
    }

    public String getFirstMeetingFirstSportNameText() {
        return meetingFirstSportFirstName.getText();
    }

    public String getSecondMeetingFirstSportNameText() {
        return meetingSecondSportFirstName.getText();
    }

    public String getThirdMeetingFirstSportNameText() {
        return meetingThirdSportFirstName.getText();
    }

    public String getFirstMeetingSecondSportNameText() {
        return meetingFirstSportSecondName.getText();
    }

    public String getSecondMeetingSecondSportNameText() {
        return meetingSecondSportSecondName.getText();
    }

    public String getFirstMeetingThirdSportNameText() {
        return meetingFirstSportThirdName.getText();
    }

    public boolean isFirstMarketSportFirstDescriptionNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_FIRST_SPORT_NAME);
    }

    public boolean isFirstMarketSportFirstResultDisplayed() {
        return marketFirstSportFirstResult.isDisplayed();
    }

    public boolean isFirstMarketSportFirstResultNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_FIRST_SPORT_RESULT);
    }

    public boolean isFirstMarketSportFirstBuyDisplayed() {
        return marketFirstSportFirstBuy.isDisplayed();
    }

    public void clickOnFirstMarketSportFirstBuyButton() {
        marketFirstSportFirstBuy.click();
    }

    public String getFirstMarketSportFirstBuyButtonText() {
        return marketFirstSportFirstBuy.getText();
    }

    public String getSecondMarketSportFirstSellButtonText() {
        return marketSecondSportFirstSell.getText();
    }

    public String getThirdMarketSportFirstBuyButtonText() {
        return marketThirdSportFirstBuy.getText();
    }

    public String getFirstMarketSportSecondSellButtonText() {
        return marketFirstSportSecondSell.getText();
    }

    public String getFirstMarketSportSecondBuyButtonText() {
        return marketFirstSportSecondBuy.getText();
    }

    public String getSecondMarketSportSecondSellButtonText() {
        return marketSecondSportSecondSell.getText();
    }

    public String getFirstMarketSportThirdBuyButtonText() {
        return marketFirstSportThirdBuy.getText();
    }

    public boolean isFirstMarketSportFirstBuyNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_FIRST_SPORT_BUY_BUTTON);
    }

    public boolean isFirstMarketSportFirstSellDisplayed() {
        return marketFirstSportFirstSell.isDisplayed();
    }

    public void clickOnFirstMarketSportFirstSellButton() {
        marketFirstSportFirstSell.click();
    }

    public String getFirstMarketSportFirstSellButtonText() {
        return marketFirstSportFirstSell.getText();
    }

    public boolean isFirstMarketSportFirstSellNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_FIRST_SPORT_SELL_BUTTON);
    }

    public boolean isFirstMarketSportFirstNotSuspendedDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_FIRST_SPORT_SUSPENDED);
    }

    public boolean isLiveTabNotHaveLiveMatchesDisplayed() {
        return liveTabNotHaveLiveMatches.isDisplayed();
    }

    public String getLiveTabNoHaveLiveMatchesText() {
        return liveTabNotHaveLiveMatchesText.getText();
    }

    public boolean isSecondMarketSportFirstNotSuspendedDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SECOND_MARKET_FIRST_SPORT_SUSPENDED);
    }

    public boolean isSecondMarketSportFirstNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SECOND_MEETING_FIRST_SPORT);
    }

    public String getSecondMarketSportFirstDescriptionText() {
        return marketSecondSportFirstDescription.getText();
    }

    public void clickOnSecondMarketSportFirstBuyButton() {
        marketSecondSportFirstBuy.click();
    }

    public void clickOnSecondMarketSportFirstSellButton() {
        marketSecondSportFirstSell.click();
    }

    public boolean isThirdMarketSportFirstNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(THIRD_MEETING_FIRST_SPORT);
    }

    public boolean isThirdMarketSportFirstNotSuspendedDisplayed() {
        return isElementsByAccessibilityIdNotPresent(THIRD_MARKET_FIRST_SPORT_SUSPENDED);
    }

    public String getSecondSportLineText() {
        return sportSecond.getText();
    }

    public boolean isFirstMarketSportSecondNotSuspendedDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_SECOND_SPORT_SUSPENDED);
    }

    public void clickOnThirdMarketSportFirstBuyButton() {
        marketThirdSportFirstBuy.click();
    }

    public void clickOnThirdMarketSportFirstSellButton() {
        marketThirdSportFirstSell.click();
    }

    public String getThirdMarketSportFirstDescriptionText() {
        return marketThirdSportFirstDescription.getText();
    }

    public String getFirstMarketSportSecondDescriptionText() {
        return marketFirstSportSecondDescription.getText();
    }

    public void clickOnFirstMarketSportSecondBuyButton() {
        marketFirstSportSecondBuy.click();
    }

    public void clickOnFirstMarketSportSecondSellButton() {
        marketFirstSportSecondSell.click();
    }

    public boolean isSecondMarketSportSecondNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SECOND_MEETING_SECOND_SPORT);
    }

    public boolean isSecondMarketSportSecondNotSuspendedDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SECOND_MARKET_SECOND_SPORT_SUSPENDED);
    }

    public void clickOnSecondMarketSportSecondBuyButton() {
        marketSecondSportSecondBuy.click();
    }

    public void clickOnSecondMarketSportSecondSellButton() {
        marketSecondSportSecondSell.click();
    }

    public String getThirdSportLineText() {
        return sportThird.getText();
    }

    public boolean isFirstMarketSportThirdNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MEETING_THIRD_SPORT);
    }

    public boolean isFirstMarketSportThirdNotSuspendedDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MARKET_THIRD_SPORT_SUSPENDED);
    }

    public void clickOnFirstMarketSportThirdBuyButton() {
        marketFirstSportThirdBuy.click();
    }

    public void clickOnFirstMarketSportThirdSellButton() {
        marketFirstSportThirdSell.click();
    }

    public boolean isFirstMarketSportSecondNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MEETING_SECOND_SPORT);
    }

    public String getSecondMarketSportSecondDescriptionText() {
        return marketSecondSportSecondDescription.getText();
    }

    public String getFirstMarketSportThirdDescriptionText() {
        return marketFirstSportThirdDescription.getText();
    }

}
