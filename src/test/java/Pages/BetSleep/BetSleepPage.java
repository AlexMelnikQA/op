package Pages.BetSleep;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BetSleepPage extends BasePage {

    final static String BET_SLEEP_SPORT_FIRST = "1BetSlipPageSportName";
    final static String BET_SLEEP_FIRST_MEETING_FIRST_SPORT_NAME = "1BetSlipPageBetName1";
    final static String BET_SLEEP_FIRST_MEETING_FIRST_SPORT_DETAILS = "1BetSlipPageBetNameDetails1";
    final static String BET_SLEEP_FIRST_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON = "1BetSlipPageInactivePlaceBetButton1";
    final static String BET_SLEEP_FIRST_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON = "1BetSlipPageActivePlaceBetButton1";
    final static String BET_SLEEP_FIRST_MEETING_FIRST_SPORT_LABEL = "1BetSlipPageBetLabel1";
    final static String BET_SLEEP_FIRST_MEETING_FIRST_SPORT_COMMENT = "1BetSlipPageBetComment1";
    final static String BET_SLEEP_FIRST_MEETING_FIRST_SPORT_AMOUNT_INPUT = "1BetSlipPageAmountInput1";

    final static String BET_SLEEP_SECOND_MEETING_FIRST_SPORT_NAME = "1BetSlipPageBetName2";
    final static String BET_SLEEP_SECOND_MEETING_FIRST_SPORT_DETAILS = "1BetSlipPageBetNameDetails2";
    final static String BET_SLEEP_SECOND_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON = "1BetSlipPageInactivePlaceBetButton2";
    final static String BET_SLEEP_SECOND_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON = "1BetSlipPageActivePlaceBetButton2";
    final static String BET_SLEEP_SECOND_MEETING_FIRST_SPORT_LABEL = "1BetSlipPageBetLabel2";
    final static String BET_SLEEP_SECOND_MEETING_FIRST_SPORT_COMMENT = "1BetSlipPageBetComment2";
    final static String BET_SLEEP_SECOND_MEETING_FIRST_SPORT_AMOUNT_INPUT = "1BetSlipPageAmountInput2";

    final static String BET_SLEEP_THIRD_MEETING_FIRST_SPORT_NAME = "1BetSlipPageBetName3";
    final static String BET_SLEEP_THIRD_MEETING_FIRST_SPORT_DETAILS = "1BetSlipPageBetNameDetails3";
    final static String BET_SLEEP_THIRD_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON = "1BetSlipPageInactivePlaceBetButton3";
    final static String BET_SLEEP_THIRD_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON = "1BetSlipPageActivePlaceBetButton3";
    final static String BET_SLEEP_THIRD_MEETING_FIRST_SPORT_LABEL = "1BetSlipPageBetLabel3";
    final static String BET_SLEEP_THIRD_MEETING_FIRST_SPORT_COMMENT = "1BetSlipPageBetComment3";
    final static String BET_SLEEP_THIRD_MEETING_FIRST_SPORT_AMOUNT_INPUT = "1BetSlipPageAmountInput3";


    final static String BET_SLEEP_SPORT_SECOND = "2BetSlipPageSportName";
    final static String BET_SLEEP_FIRST_MEETING_SECOND_SPORT_NAME = "2BetSlipPageBetName1";
    final static String BET_SLEEP_FIRST_MEETING_SECOND_SPORT_DETAILS = "2BetSlipPageBetNameDetails1";
    final static String BET_SLEEP_FIRST_MEETING_SECOND_SPORT_INACTIVE_PLACE_BUTTON = "2BetSlipPageInactivePlaceBetButton1";
    final static String BET_SLEEP_FIRST_MEETING_SECOND_SPORT_ACTIVE_PLACE_BUTTON = "2BetSlipPageActivePlaceBetButton1";
    final static String BET_SLEEP_FIRST_MEETING_SECOND_SPORT_LABEL = "2BetSlipPageBetLabel1";
    final static String BET_SLEEP_FIRST_MEETING_SECOND_SPORT_COMMENT = "2BetSlipPageBetComment1";
    final static String BET_SLEEP_FIRST_MEETING_SECOND_SPORT_AMOUNT_INPUT = "2BetSlipPageAmountInput1";

    final static String BET_SLEEP_SECOND_MEETING_SECOND_SPORT_NAME = "2BetSlipPageBetName2";
    final static String BET_SLEEP_SECOND_MEETING_SECOND_SPORT_DETAILS = "2BetSlipPageBetNameDetails2";
    final static String BET_SLEEP_SECOND_MEETING_SECOND_SPORT_INACTIVE_PLACE_BUTTON = "2BetSlipPageInactivePlaceBetButton2";
    final static String BET_SLEEP_SECOND_MEETING_SECOND_SPORT_ACTIVE_PLACE_BUTTON = "2BetSlipPageActivePlaceBetButton2";
    final static String BET_SLEEP_SECOND_MEETING_SECOND_SPORT_LABEL = "2BetSlipPageBetLabel2";
    final static String BET_SLEEP_SECOND_MEETING_SECOND_SPORT_COMMENT = "2BetSlipPageBetComment2";
    final static String BET_SLEEP_SECOND_MEETING_SECOND_SPORT_AMOUNT_INPUT = "2BetSlipPageAmountInput2";


    final static String BET_SLEEP_SPORT_THIRD = "3BetSlipPageSportName";
    final static String BET_SLEEP_FIRST_MEETING_THIRD_SPORT_NAME = "3BetSlipPageBetName1";
    final static String BET_SLEEP_FIRST_MEETING_THIRD_SPORT_DETAILS = "3BetSlipPageBetNameDetails1";
    final static String BET_SLEEP_FIRST_MEETING_THIRD_SPORT_INACTIVE_PLACE_BUTTON = "3BetSlipPageInactivePlaceBetButton1";
    final static String BET_SLEEP_FIRST_MEETING_THIRD_SPORT_ACTIVE_PLACE_BUTTON = "3BetSlipPageActivePlaceBetButton1";
    final static String BET_SLEEP_FIRST_MEETING_THIRD_SPORT_LABEL = "3BetSlipPageBetLabel1";
    final static String BET_SLEEP_FIRST_MEETING_THIRD_SPORT_COMMENT = "3BetSlipPageBetComment1";
    final static String BET_SLEEP_FIRST_MEETING_THIRD_SPORT_AMOUNT_INPUT = "3BetSlipPageAmountInput1";

    final static String BET_SLEEP_REMOVE_FIRST_ITEM_BUTTON = "betSlipRemoveButton1";


    @AndroidFindBy(accessibility = BET_SLEEP_SPORT_FIRST)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SPORT_FIRST)
    private WebElement betSleepSportFirst;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_NAME)
    private WebElement betSleepFirstMeetingFirstSportName;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_DETAILS)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_DETAILS)
    private WebElement betSleepFirstMeetingFirstSportDetails;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON)
    public WebElement betSleepFirstMeetingFirstSportInactivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON)
    private WebElement betSleepFirstMeetingFirstSportActivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_LABEL)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_LABEL)
    private WebElement betSleepFirstMeetingFirstSportLabel;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_COMMENT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_COMMENT)
    public WebElement betSleepFirstMeetingFirstSportComment;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_AMOUNT_INPUT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_FIRST_SPORT_AMOUNT_INPUT)
    public WebElement betSleepFirstMeetingFirstSportAmountInput;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_NAME)
    private WebElement betSleepSecondMeetingFirstSportName;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_DETAILS)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_DETAILS)
    private WebElement betSleepSecondMeetingFirstSportDetails;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON)
    private WebElement betSleepSecondMeetingFirstSportInactivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON)
    private WebElement betSleepSecondMeetingFirstSportActivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_LABEL)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_LABEL)
    private WebElement betSleepSecondMeetingFirstSportLabel;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_COMMENT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_COMMENT)
    private WebElement betSleepSecondMeetingFirstSportComment;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_AMOUNT_INPUT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_FIRST_SPORT_AMOUNT_INPUT)
    private WebElement betSleepSecondMeetingFirstSportAmountInput;

    @AndroidFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_NAME)
    private WebElement betSleepThirdMeetingFirstSportName;

    @AndroidFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_DETAILS)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_DETAILS)
    private WebElement betSleepThirdMeetingFirstSportDetails;

    @AndroidFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_INACTIVE_PLACE_BUTTON)
    private WebElement betSleepThirdMeetingFirstSportInactivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_ACTIVE_PLACE_BUTTON)
    private WebElement betSleepThirdMeetingFirstSportActivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_LABEL)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_LABEL)
    private WebElement betSleepThirdMeetingFirstSportLabel;

    @AndroidFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_COMMENT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_COMMENT)
    private WebElement betSleepThirdMeetingFirstSportComment;

    @AndroidFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_AMOUNT_INPUT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_THIRD_MEETING_FIRST_SPORT_AMOUNT_INPUT)
    private WebElement betSleepThirdMeetingFirstSportAmountInput;

    @AndroidFindBy(accessibility = BET_SLEEP_SPORT_SECOND)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SPORT_SECOND)
    private WebElement betSleepSportSecond;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_NAME)
    private WebElement betSleepFirstMeetingSecondSportName;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_DETAILS)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_DETAILS)
    private WebElement betSleepFirstMeetingSecondSportDetails;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_INACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_INACTIVE_PLACE_BUTTON)
    private WebElement betSleepFirstMeetingSecondSportInactivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_ACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_ACTIVE_PLACE_BUTTON)
    private WebElement betSleepFirstMeetingSecondSportActivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_LABEL)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_LABEL)
    private WebElement betSleepFirstMeetingSecondSportLabel;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_COMMENT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_COMMENT)
    private WebElement betSleepFirstMeetingSecondSportComment;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_AMOUNT_INPUT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_SECOND_SPORT_AMOUNT_INPUT)
    private WebElement betSleepFirstMeetingSecondSportAmountInput;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_NAME)
    private WebElement betSleepSecondMeetingSecondSportName;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_DETAILS)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_DETAILS)
    private WebElement betSleepSecondMeetingSecondSportDetails;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_INACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_INACTIVE_PLACE_BUTTON)
    private WebElement betSleepSecondMeetingSecondSportInactivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_ACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_ACTIVE_PLACE_BUTTON)
    private WebElement betSleepSecondMeetingSecondSportActivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_LABEL)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_LABEL)
    private WebElement betSleepSecondMeetingSecondSportLabel;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_COMMENT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_COMMENT)
    private WebElement betSleepSecondMeetingSecondSportComment;

    @AndroidFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_AMOUNT_INPUT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SECOND_MEETING_SECOND_SPORT_AMOUNT_INPUT)
    private WebElement betSleepSecondMeetingSecondSportAmountInput;

    @AndroidFindBy(accessibility = BET_SLEEP_SPORT_THIRD)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_SPORT_THIRD)
    private WebElement betSleepSportThird;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_NAME)
    private WebElement betSleepFirstMeetingThirdSportName;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_DETAILS)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_DETAILS)
    private WebElement betSleepFirstMeetingThirdSportDetails;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_INACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_INACTIVE_PLACE_BUTTON)
    private WebElement betSleepFirstMeetingThirdSportInactivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_ACTIVE_PLACE_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_ACTIVE_PLACE_BUTTON)
    private WebElement betSleepFirstMeetingThirdSportActivePlaceButton;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_LABEL)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_LABEL)
    private WebElement betSleepFirstMeetingThirdSportLabel;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_COMMENT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_COMMENT)
    private WebElement betSleepFirstMeetingThirdSportComment;

    @AndroidFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_AMOUNT_INPUT)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_FIRST_MEETING_THIRD_SPORT_AMOUNT_INPUT)
    private WebElement betSleepFirstMeetingThirdSportAmountInput;

    @AndroidFindBy(accessibility = BET_SLEEP_REMOVE_FIRST_ITEM_BUTTON)
    @iOSXCUITFindBy(accessibility = BET_SLEEP_REMOVE_FIRST_ITEM_BUTTON)
    private WebElement betSlipRemoveFirstItemButton;


    public BetSleepPage(WebDriver driver) {
        super(driver);
    }

    public String getBetSleepSportFirstText() {
        return betSleepSportFirst.getText();
    }

    public String getBetSleepFirstMeetingFirstSportName() {
        return betSleepFirstMeetingFirstSportName.getText();
    }

    public boolean isBetSleepFirstMeetingFirstSportNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BET_SLEEP_FIRST_MEETING_FIRST_SPORT_NAME);
    }

    public boolean isBetSleepSecondMeetingFirstSportNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BET_SLEEP_SECOND_MEETING_FIRST_SPORT_NAME);
    }

    public boolean isBetSleepThirdMeetingFirstSportNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BET_SLEEP_THIRD_MEETING_FIRST_SPORT_NAME);
    }

    public boolean isBetSleepFirstMeetingSecondSportNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BET_SLEEP_FIRST_MEETING_SECOND_SPORT_NAME);
    }

    public boolean isBetSleepSecondMeetingSecondSportNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BET_SLEEP_SECOND_MEETING_SECOND_SPORT_NAME);
    }

    public boolean isBetSleepFirstMeetingThirdSportNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BET_SLEEP_FIRST_MEETING_THIRD_SPORT_NAME);
    }

    public String getBetSleepFirstMeetingFirstSportDetails() {
        return betSleepFirstMeetingFirstSportDetails.getText();
    }

    public String getBetSleepFirstMeetingFirstSportInactivePlaceButtonText() {
        return betSleepFirstMeetingFirstSportInactivePlaceButton.getText();
    }

    public String getBetSleepFirstMeetingFirstSportActivePlaceButtonText() {
        return betSleepFirstMeetingFirstSportActivePlaceButton.getText();
    }

    public void clickOnBetSleepFirstMeetingFirstSportActivePlaceButton() {
        betSleepFirstMeetingFirstSportActivePlaceButton.click();
    }

    public String getBetSleepFirstMeetingFirstSportLabelText() {
        return betSleepFirstMeetingFirstSportLabel.getText();
    }

    public String getBetSleepFirstMeetingFirstSportCommentText() {
        return betSleepFirstMeetingFirstSportComment.getText();
    }

    public String getBetSleepFirstMeetingFirstSportAmountInputText() {
        return betSleepFirstMeetingFirstSportAmountInput.getText();
    }

    public void setBetSleepFirstMeetingFirstSportAmount(String value) {
        betSleepFirstMeetingFirstSportAmountInput.sendKeys(value);
    }

    public void getBetSleepFirstMeetingFirstSportAmountInputText(String amount) {
        betSleepFirstMeetingFirstSportAmountInput.sendKeys(amount);
    }

    public String getBetSleepSecondMeetingFirstSportName() {
        return betSleepSecondMeetingFirstSportName.getText();
    }

    public String getBetSleepSecondMeetingFirstSportDetails() {
        return betSleepSecondMeetingFirstSportDetails.getText();
    }

    public String getBetSleepSecondMeetingFirstSportInactivePlaceButtonText() {
        return betSleepSecondMeetingFirstSportInactivePlaceButton.getText();
    }

    public String getBetSleepSecondMeetingFirstSportActivePlaceButtonText() {
        return betSleepSecondMeetingFirstSportActivePlaceButton.getText();
    }

    public void clickOnBetSleepSecondMeetingFirstSportActivePlaceButton() {
        betSleepSecondMeetingFirstSportActivePlaceButton.click();
    }

    public String getBetSleepSecondMeetingFirstSportLabelText() {
        return betSleepSecondMeetingFirstSportLabel.getText();
    }

    public String getBetSleepSecondMeetingFirstSportCommentText() {
        return betSleepSecondMeetingFirstSportComment.getText();
    }

    public String getBetSleepSecondMeetingFirstSportAmountInputText() {
        return betSleepSecondMeetingFirstSportAmountInput.getText();
    }

    public void getBetSleepSecondMeetingFirstSportAmountInputText(String amount) {
        betSleepSecondMeetingFirstSportAmountInput.sendKeys(amount);
    }

    public String getBetSleepThirdMeetingFirstSportName() {
        return betSleepThirdMeetingFirstSportName.getText();
    }

    public String getBetSleepThirdMeetingFirstSportDetails() {
        return betSleepThirdMeetingFirstSportDetails.getText();
    }

    public String getBetSleepThirdMeetingFirstSportInactivePlaceButtonText() {
        return betSleepThirdMeetingFirstSportInactivePlaceButton.getText();
    }

    public String getBetSleepThirdMeetingFirstSportActivePlaceButtonText() {
        return betSleepThirdMeetingFirstSportActivePlaceButton.getText();
    }

    public void clickOnBetSleepThirdMeetingFirstSportActivePlaceButton() {
        betSleepThirdMeetingFirstSportActivePlaceButton.click();
    }

    public String getBetSleepThirdMeetingFirstSportLabelText() {
        return betSleepThirdMeetingFirstSportLabel.getText();
    }

    public String getBetSleepThirdMeetingFirstSportCommentText() {
        return betSleepThirdMeetingFirstSportComment.getText();
    }

    public String getBetSleepThirdMeetingFirstSportAmountInputText() {
        return betSleepThirdMeetingFirstSportAmountInput.getText();
    }

    public void getBetSleepThirdMeetingFirstSportAmountInputText(String amount) {
        betSleepThirdMeetingFirstSportAmountInput.sendKeys(amount);
    }

    public String getBetSleepSportSecondText() {
        return betSleepSportSecond.getText();
    }

    public String getBetSleepFirstMeetingSecondSportName() {
        return betSleepFirstMeetingSecondSportName.getText();
    }

    public String getBetSleepFirstMeetingSecondSportDetails() {
        return betSleepFirstMeetingSecondSportDetails.getText();
    }

    public String getBetSleepFirstMeetingSecondSportInactivePlaceButtonText() {
        return betSleepFirstMeetingSecondSportInactivePlaceButton.getText();
    }

    public String getBetSleepFirstMeetingSecondSportActivePlaceButtonText() {
        return betSleepFirstMeetingSecondSportActivePlaceButton.getText();
    }

    public void clickOnBetSleepFirstMeetingSecondSportActivePlaceButton() {
        betSleepFirstMeetingSecondSportActivePlaceButton.click();
    }

    public String getBetSleepFirstMeetingSecondSportLabelText() {
        return betSleepFirstMeetingSecondSportLabel.getText();
    }

    public String getBetSleepFirstMeetingSecondSportCommentText() {
        return betSleepFirstMeetingSecondSportComment.getText();
    }

    public String getBetSleepFirstMeetingSecondSportAmountInputText() {
        return betSleepFirstMeetingSecondSportAmountInput.getText();
    }

    public void getBetSleepFirstMeetingSecondSportAmountInputText(String amount) {
        betSleepFirstMeetingSecondSportAmountInput.sendKeys(amount);
    }

    public String getBetSleepSecondMeetingSecondSportName() {
        return betSleepSecondMeetingSecondSportName.getText();
    }

    public String getBetSleepSecondMeetingSecondSportDetails() {
        return betSleepSecondMeetingSecondSportDetails.getText();
    }

    public String getBetSleepSecondMeetingSecondSportInactivePlaceButtonText() {
        return betSleepSecondMeetingSecondSportInactivePlaceButton.getText();
    }

    public String getBetSleepSecondMeetingSecondSportActivePlaceButtonText() {
        return betSleepSecondMeetingSecondSportActivePlaceButton.getText();
    }

    public void clickOnBetSleepSecondMeetingSecondSportActivePlaceButton() {
        betSleepSecondMeetingSecondSportActivePlaceButton.click();
    }

    public String getBetSleepSecondMeetingSecondSportLabelText() {
        return betSleepSecondMeetingSecondSportLabel.getText();
    }

    public String getBetSleepSecondMeetingSecondSportCommentText() {
        return betSleepSecondMeetingSecondSportComment.getText();
    }

    public String getBetSleepSecondMeetingSecondSportAmountInputText() {
        return betSleepSecondMeetingSecondSportAmountInput.getText();
    }

    public void getBetSleepSecondMeetingSecondSportAmountInputText(String amount) {
        betSleepSecondMeetingSecondSportAmountInput.sendKeys(amount);
    }

    public String getBetSleepSportThirdText() {
        return betSleepSportThird.getText();
    }

    public String getBetSleepFirstMeetingThirdSportName() {
        return betSleepFirstMeetingThirdSportName.getText();
    }

    public String getBetSleepFirstMeetingThirdSportDetails() {
        return betSleepFirstMeetingThirdSportDetails.getText();
    }

    public String getBetSleepFirstMeetingThirdSportInactivePlaceButtonText() {
        return betSleepFirstMeetingThirdSportInactivePlaceButton.getText();
    }

    public String getBetSleepFirstMeetingThirdSportActivePlaceButtonText() {
        return betSleepFirstMeetingThirdSportActivePlaceButton.getText();
    }

    public void clickOnBetSleepFirstMeetingThirdSportActivePlaceButton() {
        betSleepFirstMeetingThirdSportActivePlaceButton.click();
    }

    public String getBetSleepFirstMeetingThirdSportLabelText() {
        return betSleepFirstMeetingThirdSportLabel.getText();
    }

    public String getBetSleepFirstMeetingThirdSportCommentText() {
        return betSleepFirstMeetingThirdSportComment.getText();
    }

    public String getBetSleepFirstMeetingThirdSportAmountInputText() {
        return betSleepFirstMeetingThirdSportAmountInput.getText();
    }

    public void getBetSleepFirstMeetingThirdSportAmountInputText(String amount) {
        betSleepFirstMeetingThirdSportAmountInput.sendKeys(amount);
    }


    public void clickOnRemoveFirstItemButton() {
        betSlipRemoveFirstItemButton.click();
    }
}