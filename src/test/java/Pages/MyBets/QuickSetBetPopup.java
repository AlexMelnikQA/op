package Pages.MyBets;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class QuickSetBetPopup extends BasePage {

    final static String QUICK_BET_NAME = "BetStakeName";
    final static String QUICK_BET_CLOSE_BUTTON = "QuickBetClosePopup";
    final static String QUICK_BET_TYPE = "BetStakeType";
    final static String QUICK_BET_CURRENT_PRICE = "BetStakeCurrentPrice";
    final static String QUICK_BET_PRICE = "BetStakePrice";
    final static String QUICK_BET_MINUS_BUTTON = "BetStakeMinus";
    final static String QUICK_BET_STAKE_VALUE_FIELD = "BetStakeValue1";
    final static String QUICK_BET_STAKE_FIELD = "BetStakeValue2";
    final static String QUICK_BET_PLUS_BUTTON = "BetStakePlus";
    final static String QUICK_BET_ADD_TO_BET_SLEEP_BUTTON = "addToBetSlip";
    final static String QUICK_BET_PLUS_10 = "10SetBetNumber";
    final static String QUICK_BET_PLUS_25 = "25SetBetNumber";
    final static String QUICK_BET_PLUS_50 = "50SetBetNumber";
    final static String QUICK_BET_PLUS_1 = "1SetBetNumber";
    final static String QUICK_BET_PLUS_2 = "2SetBetNumber";
    final static String QUICK_BET_PLUS_3 = "3SetBetNumber";
    final static String QUICK_BET_PLUS_4 = "4SetBetNumber";
    final static String QUICK_BET_PLUS_5 = "5SetBetNumber";
    final static String QUICK_BET_PLUS_6 = "6SetBetNumber";
    final static String QUICK_BET_PLUS_7 = "7SetBetNumber";
    final static String QUICK_BET_PLUS_8 = "8SetBetNumber";
    final static String QUICK_BET_PLUS_9 = "9SetBetNumber";
    final static String QUICK_BET_PLUS_0 = "(//android.widget.TextView[@content-desc=\"SetBetNumber\"])[1]";
    final static String QUICK_BET_PLUS_00 = "0SetBetNumber";
    final static String QUICK_BET_SET_DOT = "(//android.widget.TextView[@content-desc=\"SetBetNumber\"])[2]";
    final static String QUICK_BET_REMOVE_LAST_DIGIT_BUTTON = "BetStakeLess";
    final static String QUICK_BET_PLACE_BET_BUTTON = "BetStakePlaceBetButton";


    @AndroidFindBy(accessibility = QUICK_BET_NAME)
    @iOSXCUITFindBy(accessibility = QUICK_BET_NAME)
    public WebElement quickBetName;

    @AndroidFindBy(accessibility = QUICK_BET_CLOSE_BUTTON)
    @iOSXCUITFindBy(accessibility = QUICK_BET_CLOSE_BUTTON)
    public WebElement quickBetCloseButton;

    @AndroidFindBy(accessibility = QUICK_BET_TYPE)
    @iOSXCUITFindBy(accessibility = QUICK_BET_TYPE)
    public WebElement quickBetType;

    @AndroidFindBy(accessibility = QUICK_BET_CURRENT_PRICE)
    @iOSXCUITFindBy(accessibility = QUICK_BET_CURRENT_PRICE)
    public WebElement quickBetCurrentPrice;

    @AndroidFindBy(accessibility = QUICK_BET_PRICE)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PRICE)
    public WebElement quickBetPrice;

    @AndroidFindBy(accessibility = QUICK_BET_MINUS_BUTTON)
    @iOSXCUITFindBy(accessibility = QUICK_BET_MINUS_BUTTON)
    public WebElement minusButton;

    @AndroidFindBy(accessibility = QUICK_BET_STAKE_VALUE_FIELD)
    @iOSXCUITFindBy(accessibility = QUICK_BET_STAKE_VALUE_FIELD)
    public WebElement stakeBetValueField;

    @AndroidFindBy(accessibility = QUICK_BET_STAKE_FIELD)
    @iOSXCUITFindBy(accessibility = QUICK_BET_STAKE_FIELD)
    public WebElement stakeBetField;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_BUTTON)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_BUTTON)
    public WebElement plusButton;

    @AndroidFindBy(accessibility = QUICK_BET_ADD_TO_BET_SLEEP_BUTTON)
    @iOSXCUITFindBy(accessibility = QUICK_BET_ADD_TO_BET_SLEEP_BUTTON)
    public WebElement addToBetSlipButton;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_10)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_10)
    public WebElement quickBetAdd10ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_25)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_25)
    public WebElement quickBetAdd25ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_50)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_50)
    public WebElement quickBetAdd50ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_1)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_1)
    public WebElement quickBetAdd1ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_2)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_2)
    public WebElement quickBetAdd2ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_3)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_3)
    public WebElement quickBetAdd3ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_4)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_4)
    public WebElement quickBetAdd4ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_5)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_5)
    public WebElement quickBetAdd5ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_6)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_6)
    public WebElement quickBetAdd6ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_7)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_7)
    public WebElement quickBetAdd7ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_8)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_8)
    public WebElement quickBetAdd8ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_9)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_9)
    public WebElement quickBetAdd9ToStake;

    //TODO xpath
    @AndroidFindBy(xpath = QUICK_BET_PLUS_0)
    @iOSXCUITFindBy(xpath = QUICK_BET_PLUS_0)
    public WebElement quickBetAdd0ToStake;

    @AndroidFindBy(accessibility = QUICK_BET_PLUS_00)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLUS_00)
    public WebElement quickBetAdd00ToStake;

    //TODO xpath
    @AndroidFindBy(xpath = QUICK_BET_SET_DOT)
    @iOSXCUITFindBy(xpath = QUICK_BET_SET_DOT)
    public WebElement quickBetSetDotToStake;

    @AndroidFindBy(accessibility = QUICK_BET_REMOVE_LAST_DIGIT_BUTTON)
    @iOSXCUITFindBy(accessibility = QUICK_BET_REMOVE_LAST_DIGIT_BUTTON)
    public WebElement removeLastStakeDigitButton;

    @AndroidFindBy(accessibility = QUICK_BET_PLACE_BET_BUTTON)
    @iOSXCUITFindBy(accessibility = QUICK_BET_PLACE_BET_BUTTON)
    public WebElement placeBetButton;


    public QuickSetBetPopup(WebDriver driver) {
        super(driver);
    }

    public String getBetName() {
        return quickBetName.getText();
    }

    public void clickOnQuickBetPopupCloseButton() {
        quickBetCloseButton.click();
    }

    public String getQuickBetType() {
        return quickBetType.getText();
    }

    public String getQuickBetCurrentPrice() {
        return quickBetCurrentPrice.getText();
    }

    public String getQuickBetPrice() {
        return quickBetPrice.getText();
    }

    public void clickOnQuickBetMinusButton() {
        minusButton.click();
    }

    public boolean isQuickBetMinusButtonDisplayed() {
        return minusButton.isDisplayed();
    }

    public String getQuickBetStakeValue() {
        return stakeBetValueField.getText();
    }

    public String getQuickBetStakeText() {
        return stakeBetField.getText();
    }

    public boolean isQuickBetStakeFieldDisplayed() {
        return stakeBetField.isDisplayed();
    }

    public void clickOnQuickBetPlusButton() {
        plusButton.click();
    }

    public boolean isQuickBetPlusButtonDisplayed() {
        return plusButton.isDisplayed();
    }

    public void waitUntilQuickBetPlusButtonVisible() {
        waitVisibilityOfElement(plusButton);
    }

    public void clickOnAddToBetSlipButton() {
        addToBetSlipButton.click();
    }

    public boolean isAddToBetSlipButtonDisplayed() {
        return addToBetSlipButton.isDisplayed();
    }

    public boolean isAddToBetSlipButtonNotVisible() {
        return isElementsByAccessibilityIdNotPresent(QUICK_BET_ADD_TO_BET_SLEEP_BUTTON);
    }

    public void clickOnAdd10ToStakeButton() {
        quickBetAdd10ToStake.click();
    }

    public boolean isAdd10ToStakeButtonDisplayed() {
        return quickBetAdd10ToStake.isDisplayed();
    }

    public void clickOnAdd25ToStakeButton() {
        quickBetAdd25ToStake.click();
    }

    public boolean isAdd25ToStakeButtonDisplayed() {
        return quickBetAdd25ToStake.isDisplayed();
    }

    public void clickOnAdd50ToStakeButton() {
        quickBetAdd50ToStake.click();
    }

    public boolean isAdd50ToStakeButtonDisplayed() {
        return quickBetAdd50ToStake.isDisplayed();
    }

    public void clickOnAdd1ToStakeButton() {
        quickBetAdd1ToStake.click();
    }

    public boolean isAdd1ToStakeButtonDisplayed() {
        return quickBetAdd1ToStake.isDisplayed();
    }

    public void clickOnAdd2ToStakeButton() {
        quickBetAdd2ToStake.click();
    }

    public boolean isAdd2ToStakeButtonDisplayed() {
        return quickBetAdd2ToStake.isDisplayed();
    }

    public void clickOnAdd3ToStakeButton() {
        quickBetAdd3ToStake.click();
    }

    public boolean isAdd3ToStakeButtonDisplayed() {
        return quickBetAdd3ToStake.isDisplayed();
    }

    public void clickOnAdd4ToStakeButton() {
        quickBetAdd4ToStake.click();
    }

    public boolean isAdd4ToStakeButtonDisplayed() {
        return quickBetAdd4ToStake.isDisplayed();
    }

    public void clickOnAdd5ToStakeButton() {
        quickBetAdd5ToStake.click();
    }

    public boolean isAdd5ToStakeButtonDisplayed() {
        return quickBetAdd5ToStake.isDisplayed();
    }

    public void clickOnAdd6ToStakeButton() {
        quickBetAdd6ToStake.click();
    }

    public boolean isAdd6ToStakeButtonDisplayed() {
        return quickBetAdd6ToStake.isDisplayed();
    }

    public void clickOnAdd7ToStakeButton() {
        quickBetAdd7ToStake.click();
    }

    public boolean isAdd7ToStakeButtonDisplayed() {
        return quickBetAdd7ToStake.isDisplayed();
    }

    public void clickOnAdd8ToStakeButton() {
        quickBetAdd8ToStake.click();
    }

    public boolean isAdd8ToStakeButtonDisplayed() {
        return quickBetAdd8ToStake.isDisplayed();
    }

    public void clickOnAdd9ToStakeButton() {
        quickBetAdd9ToStake.click();
    }

    public boolean isAdd9ToStakeButtonDisplayed() {
        return quickBetAdd9ToStake.isDisplayed();
    }

    public void clickOnAdd0ToStakeButton() {
        quickBetAdd0ToStake.click();
    }

    public boolean isAdd0ToStakeButtonDisplayed() {
        return quickBetAdd0ToStake.isDisplayed();
    }

    public void clickOnAdd00ToStakeButton() {
        quickBetAdd00ToStake.click();
    }

    public boolean isAdd00ToStakeButtonDisplayed() {
        return quickBetAdd00ToStake.isDisplayed();
    }

    public void clickOnDotButton() {
        quickBetSetDotToStake.click();
    }

    public boolean isDotButtonDisplayed() {
        return quickBetSetDotToStake.isDisplayed();
    }

    public void clickOnRemoveLastStakeDigitButton() {
        removeLastStakeDigitButton.click();
    }

    public boolean isRemoveLastStakeDigitButtonDisplayed() {
        return placeBetButton.isDisplayed();
    }

    public void clickOnPlaceQuickBetButton() {
        placeBetButton.click();
    }

    public void scrollToPlaceQuickBetButton() {
        scrollToElement(QUICK_BET_PLACE_BET_BUTTON);
    }

    public boolean isPlaceQuickBetButtonDisplayed() {
        return placeBetButton.isDisplayed();
    }
}