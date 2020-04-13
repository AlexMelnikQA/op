package Pages.MyBets;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyBetsPage extends BasePage {

    final static String MY_BETS_SCREEN = "myBetsScreen";
    final static String MY_BETS_SCREEN_TEXT = "myBetsScreenText";
    final static String MY_BETS_REFRESH_BUTTON = "refreshBetsButton";

    final static String MY_BETS_FILTER_BUTTON = "filterBetsButton";
    final static String MY_BETS_FILTER_SHORT_TERM_BUTTON = "shortTermTermBetsFilter";
    final static String MY_BETS_FILTER_LONG_TERM_BUTTON = "longTermTermBetsFilter";
    final static String MY_BETS_HIDDEN_BY_FILTER = "betsHiddenByFilter";

    final static String MY_BETS_SORTING_BUTTON = "betSortingPageButton";
    final static String MY_BETS_UPDATE_TIME_TEXT = "updateBetPageTime";

    final static String MY_BETS_FIRST_ITEM = "1BetItem";
    final static String MY_BETS_FIRST_STAKE = "1BetItemBetStake";
    final static String MY_BETS_FIRST_SUBHEADING = "1BetItemBetSubheading";
    final static String MY_BETS_FIRST_MARKET_PRICE = "1BetItemBetMarketPrice";
    final static String MY_BETS_FIRST_CURRENTLY_TEXT = "1BetItemBetMarketCurrently";
    final static String MY_BETS_FIRST_CURRENTLY_VALUE = "1BetItemBetMarketBetScoreInfo";
    final static String MY_BETS_FIRST_BET_HEADING = "1BetItemBetHeading";
    final static String MY_BETS_FIRST_CASHOUT_BUTTON = "1CashOutButton";
    final static String MY_BETS_FIRST_CASHOUT_BUTTON_TEXT = "1CashOutButtonText";
    final static String MY_BETS_FIRST_CASHOUT_BUTTON_VALUE = "1CashOutButtonValue";
    final static String MY_BETS_FIRST_CURRENT_SPREAD = "1BetItemBetMarketBetCurrentSpread";
    final static String MY_BETS_FIRST_ITEM_BET_VALUE = "1BetItemBetMarketBetValue";
    final static String MY_BETS_FIRST_ITEM_BET_REFERENCE = "1BetItemBetMarketBetReference";
    final static String MY_BETS_FIRST_ITEM_BET_REFERENCE_DATE = "1BetItemBetMarketBetDate";
    final static String MY_BETS_FIRST_ITEM_CASHOUT_TEXT = "1BetItemBetMarketYourCashout";
    final static String MY_BETS_FIRST_ITEM_CASHOUT_VALUE = "1BetItemBetMarketYourCashoutValue";
    final static String MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER = "1BetItemBetMarketBetSliderRange";
    final static String MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER_MIN = "1BetItemBetMarketBetSliderRangeMin";
    final static String MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER_MAX = "1BetItemBetMarketBetSliderRangeMax";

    final static String NOT_LOGGED_USER_MESSAGE = "unableToSeePromotionsUntilLoggedIn";
    final static String LOGGED_USER_MESSAGE = "noOpenBets";

    @AndroidFindBy(accessibility = MY_BETS_SCREEN)
    @iOSXCUITFindBy(accessibility = MY_BETS_SCREEN)
    private WebElement myBetsScreen;

    @AndroidFindBy(accessibility = MY_BETS_SCREEN_TEXT)
    @iOSXCUITFindBy(accessibility = MY_BETS_SCREEN_TEXT)
    private WebElement myBetsScreenText;

    @AndroidFindBy(accessibility = MY_BETS_REFRESH_BUTTON)
    @iOSXCUITFindBy(accessibility = MY_BETS_REFRESH_BUTTON)
    private WebElement myBetsRefreshButton;

    @AndroidFindBy(accessibility = MY_BETS_FILTER_BUTTON)
    @iOSXCUITFindBy(accessibility = MY_BETS_FILTER_BUTTON)
    private WebElement myBetsFilterButton;

    @AndroidFindBy(accessibility = MY_BETS_FILTER_SHORT_TERM_BUTTON)
    @iOSXCUITFindBy(accessibility = MY_BETS_FILTER_SHORT_TERM_BUTTON)
    private WebElement myBetsShortTermFilterButton;

    @AndroidFindBy(accessibility = MY_BETS_FILTER_LONG_TERM_BUTTON)
    @iOSXCUITFindBy(accessibility = MY_BETS_FILTER_LONG_TERM_BUTTON)
    private WebElement myBetsLongTermFilterButton;

    @AndroidFindBy(accessibility = MY_BETS_HIDDEN_BY_FILTER)
    @iOSXCUITFindBy(accessibility = MY_BETS_HIDDEN_BY_FILTER)
    private WebElement myBetsHiddenByFilter;

    @AndroidFindBy(accessibility = MY_BETS_SORTING_BUTTON)
    @iOSXCUITFindBy(accessibility = MY_BETS_SORTING_BUTTON)
    private WebElement betSortingPageButton;

    @AndroidFindBy(accessibility = MY_BETS_UPDATE_TIME_TEXT)
    @iOSXCUITFindBy(accessibility = MY_BETS_UPDATE_TIME_TEXT)
    private WebElement updateBetPageTime;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM)
    private WebElement myBetsFirstItem;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_STAKE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_STAKE)
    private WebElement myBetsFirstStake;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_SUBHEADING)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_SUBHEADING)
    private WebElement myBetsFirstSubheading;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_MARKET_PRICE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_MARKET_PRICE)
    private WebElement myBetsFirstMarketPrice;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_CURRENTLY_TEXT)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_CURRENTLY_TEXT)
    private WebElement myBetsFirstCurrentlyText;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_BET_HEADING)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_BET_HEADING)
    private WebElement myBetsFirstHeading;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_CURRENTLY_VALUE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_CURRENTLY_VALUE)
    private WebElement myBetsFirstCurrentlyValue;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_CASHOUT_BUTTON)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_CASHOUT_BUTTON)
    private WebElement myBetsFirstCashOutButton;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_CASHOUT_BUTTON_TEXT)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_CASHOUT_BUTTON_TEXT)
    private WebElement myBetsFirstCashOutButtonText;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_CASHOUT_BUTTON_VALUE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_CASHOUT_BUTTON_VALUE)
    private WebElement myBetsFirstCashOutButtonValue;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_CURRENT_SPREAD)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_CURRENT_SPREAD)
    private WebElement myBetsFirstItemCurrentSpread;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_BET_VALUE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_BET_VALUE)
    private WebElement myBetsFirstItemBetValue;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_BET_REFERENCE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_BET_REFERENCE)
    private WebElement myBetsFirstItemBetReference;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_BET_REFERENCE_DATE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_BET_REFERENCE_DATE)
    private WebElement myBetsFirstItemBetReferenceDate;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_TEXT)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_TEXT)
    private WebElement myBetsFirstItemYourCashoutText;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_VALUE)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_VALUE)
    private WebElement myBetsFirstItemYourCashoutValue;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER)
    private WebElement myBetsFirstItemYourCashoutFormSlider;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER_MIN)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER_MIN)
    private WebElement myBetsFirstItemSliderRangeMin;

    @AndroidFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER_MAX)
    @iOSXCUITFindBy(accessibility = MY_BETS_FIRST_ITEM_CASHOUT_FORM_SLIDER_MAX)
    private WebElement myBetsFirstItemSliderRangeMax;

    @AndroidFindBy(accessibility = NOT_LOGGED_USER_MESSAGE)
    @iOSXCUITFindBy(accessibility = NOT_LOGGED_USER_MESSAGE)
    private WebElement messageForNotLoggedUser;

    @AndroidFindBy(accessibility = LOGGED_USER_MESSAGE)
    @iOSXCUITFindBy(accessibility = LOGGED_USER_MESSAGE)
    private WebElement messageForLoggedUser;


    public MyBetsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMyBetsScreenDisplayed() {
        return myBetsScreen.isDisplayed();
    }

    public String getMyBetsScreenText() {
        return myBetsScreenText.getText();
    }

    public boolean isMyBetsRefreshButtonDisplayed() {
        return myBetsRefreshButton.isDisplayed();
    }

    public void clickOnMyBetsRefreshButton() {
        myBetsRefreshButton.click();
    }

    public void clickOnMyBetsFilterButton() {
        myBetsFilterButton.click();
    }

    public String getMyBetsShortTermFilterButtonText() {
        return myBetsShortTermFilterButton.getText();
    }

    public void clickOnMyBetsShortTermFilterButton() {
        myBetsShortTermFilterButton.click();
    }

    public String getMyBetsLongTermFilterButtonText() {
        return myBetsLongTermFilterButton.getText();
    }

    public void clickOnMyBetsLongTermFilterButton() {
        myBetsLongTermFilterButton.click();
    }

    public String getMyBetsHiddenByFilterMessageText() {
        return myBetsHiddenByFilter.getText();
    }

    public void clickOnMyBetsSortingPageButton() {
        betSortingPageButton.click();
    }

    public String getMyBetUpdateInfoText() {
        return updateBetPageTime.getText();
    }

    public boolean isMyBetsFirstItemDisplayed() {
        return myBetsFirstItem.isDisplayed();
    }

    public boolean isMyBetsFirstItemNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(MY_BETS_FIRST_ITEM);
    }

    public void clickOnMyBetsFirstItem() {
        myBetsFirstItem.click();
    }

    public String getMyBetsFirstStakeText() {
        return myBetsFirstStake.getText();
    }

    public String getMyBetsFirstSubheadingText() {
        return myBetsFirstSubheading.getText();
    }

    public String getMyBetsFirstMarketPriceText() {
        return myBetsFirstMarketPrice.getText();
    }

    public String getMyBetsFirstCurrentlyText() {
        return myBetsFirstCurrentlyText.getText();
    }

    public String getMyBetsFirstHeadingText() {
        return myBetsFirstHeading.getText();
    }

    public String getMyBetsFirstCurrentlyValue() {
        return myBetsFirstCurrentlyValue.getText();
    }

    public boolean isMyBetsFirstCurrentlyValueDisplayed() {
        return myBetsFirstCurrentlyValue.isDisplayed();
    }

    public void clickOnMyBetsFirstCashOutButton() {
        myBetsFirstCashOutButton.click();
    }

    public boolean isMyBetsFirstCashOutButtonDisplayed() {
        return myBetsFirstCashOutButton.isDisplayed();
    }

    public String getMyBetsFirstCashOutButtonText() {
        return myBetsFirstCashOutButtonText.getText();
    }

    public String getMyBetsFirstCashOutButtonValue() {
        return myBetsFirstCashOutButtonValue.getText();
    }

    public String getMyBetsFirstItemCurrentSpreadText() {
        return myBetsFirstItemCurrentSpread.getText();
    }

    public String getMyBetsFirstItemBetValue() {
        return myBetsFirstItemBetValue.getText();
    }

    public String getMyBetsFirstItemBetReferenceText() {
        return myBetsFirstItemBetReference.getText();
    }

    public boolean isMyBetsFirstItemBetReferenceDisplayed() {
        return myBetsFirstItemBetReference.isDisplayed();
    }

    public String getMyBetsFirstItemBetReferenceDate() {
        return myBetsFirstItemBetReferenceDate.getText();
    }

    public boolean isMyBetsFirstItemBetReferenceDateDisplayed() {
        return myBetsFirstItemBetReferenceDate.isDisplayed();
    }

    public String getMyBetsFirstItemYourCashoutText() {
        return myBetsFirstItemYourCashoutText.getText();
    }

    public String getMyBetsFirstItemYourCashoutValue() {
        return myBetsFirstItemYourCashoutValue.getText();
    }

    public boolean isMyBetsFirstItemYourCashoutFormSliderDisplayed() {
        return myBetsFirstItemYourCashoutFormSlider.isDisplayed();
    }

    public String getMyBetsFirstItemSliderRangeMinValue() {
        return myBetsFirstItemSliderRangeMin.getText();
    }

    public String getMyBetsFirstItemSliderRangeMaxValue() {
        return myBetsFirstItemSliderRangeMax.getText();
    }

    public String getMessageForNotLoggedUser() {
        return messageForNotLoggedUser.getText();
    }

    public String getMessageForLoggedUser() {
        return messageForLoggedUser.getText();
    }

    public boolean noOpenBetsAreActive() {
        return isElementsByAccessibilityIdNotPresent(LOGGED_USER_MESSAGE);
    }
}