package Pages.Menus.ResponsibleGambling.ResponsibleGamblingRules;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ResponsibleGamblingRules extends BasePage {
    final static String RESPONSIBLE_GAMBLING_SCREEN = "responsibleGamblingRulesScreen";
    final static String RESPONSIBLE_GAMBLING_TITLE = "responsibleGamblingTitle1";
    final static String RESPONSIBLE_GAMBLING_TITLE_COMMENT = "responsibleGamblingTitle2";
    final static String RESPONSIBLE_GAMBLING_TEXT_FIRST = "responsibleGamblingText1";
    final static String RESPONSIBLE_GAMBLING_TEXT_SECOND = "responsibleGamblingText2";
    final static String RESPONSIBLE_GAMBLING_TOPIC_NAME_FIRST = "responsibleGamblingName1";
    final static String RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FIRST = "responsibleGamblingDescription1";
    final static String RESPONSIBLE_GAMBLING_TOPIC_NAME_SECOND = "responsibleGamblingName2";
    final static String RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_SECOND = "responsibleGamblingDescription2";
    final static String RESPONSIBLE_GAMBLING_TOPIC_NAME_THIRD = "responsibleGamblingName3";
    final static String RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_THIRD = "responsibleGamblingDescription3";
    final static String RESPONSIBLE_GAMBLING_TOPIC_NAME_FOURTH = "responsibleGamblingName4";
    final static String RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FOURTH = "responsibleGamblingDescription4";
    final static String RESPONSIBLE_GAMBLING_TOPIC_NAME_FIFTH = "responsibleGamblingName5";
    final static String RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FIFTH = "responsibleGamblingDescription5";
    final static String RESPONSIBLE_GAMBLING_LEFT_ARROW = "ResponsibleGamblingRules";

    ///////////
    final static String DEPOSIT_LIMIT_TEXT = "responsibleGamblingDepositLimit";
    final static String DEPOSIT_LIMIT_INFO_ICON = "responsibleGamblingDepositLimitIcon";
    final static String DEPOSIT_NOTIFICATION_TEXT1 = "depositLimitTooltipText1";
    final static String DEPOSIT_NOTIFICATION_TEXT2 = "depositLimitTooltipText2";
    final static String ACTIVE_DEPOSIT_LIMIT = "responsibleGamblingDepositLimitActiveText";
    final static String PENDING_DEPOSIT_LIMIT = "responsibleGamblingDepositLimitPendingText";
    final static String DEPOSIT_LIMIT_CONFIRM_BUTTON = "confirmPendingLimitButton";
    final static String NO_LIMIT_SELECTOR = "noLimitselector";
    final static String DAILY_SELECTOR = "dailyselector";
    final static String WEEKLY_SELECTOR = "weeklyselector";
    final static String MONTHLY_SELECTOR = "monthlyselector";
    final static String DEPOSIT_AMOUNT_TEXT = "DepositLimitAmountInput";
    final static String DEPOSIT_AMOUNT_INPUT = "depositLimitAmountInput";
    final static String DEPOSIT_LIMIT_APPLY_BUTTON = "depositLimitApplyButton";
    final static String TIME_OUT_INFO_TEXT = "timeOutText";
    final static String TIME_OUT_INFO_ICON = "timeOutIcon";
    final static String NONE_SELECTOR = "noneselector";
    final static String TWENTY_FOUR_HOURS_SELECTOR = "24hselector";
    final static String SEVEN_DAYS_SELECTOR = "7Daysselector";
    final static String THIRTY_DAYS_SELECTOR = "30Daysselector";
    final static String SIX_WEEKS_SELECTOR = "6Weeksselector";
    final static String TIME_OUT_APPLY_BUTTON = "timeoutApplyButton";
    final static String SELF_EXCLUSION_PERIOD_TITLE = "selfExclusionTitle";
    final static String SELF_EXCLUSION_PERIOD_PART1 = "selfExclusionText1";
    final static String SELF_EXCLUSION_PERIOD_PART2 = "selfExclusionText2";
    final static String SELF_EXCLUSION_PERIOD_PART3 = "selfExclusionText3";
    final static String TIME_OUT_SETTING_TITLE = "timeoutConfirmTitle";
    final static String TIME_OUT_SETTING_PART_1 = "timeoutConfirmText1";
    final static String TIME_OUT_SETTING_PART_2 = "timeoutConfirmText2";
    final static String TIMEOUT_CONFIRMATION_VALUE = "timeoutConfirmTimeoutPeriodValue";
    final static String TIMEOUT_CONFIRMATION_DATE = "timeoutConfirmLoginAgainValue";
    final static String TIMEOUT_CONFIRM_INPUT = "timeout confirmation screenPasswordInput";
    final static String TIMEOUT_CONFIRM_BUTTON_DISABLED = "confirmTimeoutButtonDisabled";
    final static String TIMEOUT_CONFIRM_BUTTON_ACTIVE = "confirmTimeoutButtonActive";
    final static String TIMEOUT_CANCEL_BUTTON = "TimeoutConfirmCancelButton";
    final static String TIMEOUT_ERROR_MESSAGE_PASSWORD = "timeout confirmation screenErrorMessage";


    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_SCREEN)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_SCREEN)
    private WebElement responsibleGamblingScreen;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TITLE)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TITLE)
    private WebElement responsibleGamblingTitle;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TITLE_COMMENT)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TITLE_COMMENT)
    private WebElement responsibleGamblingTitleComment;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TEXT_FIRST)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TEXT_FIRST)
    private WebElement responsibleGamblingTextFirst;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TEXT_SECOND)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TEXT_SECOND)
    private WebElement responsibleGamblingTextSecond;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_FIRST)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_FIRST)
    private WebElement responsibleGamblingTopicNameFirst;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FIRST)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FIRST)
    private WebElement responsibleGamblingTopicDescriptionFirst;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_SECOND)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_SECOND)
    private WebElement responsibleGamblingTopicNameSecond;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_SECOND)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_SECOND)
    private WebElement responsibleGamblingTopicDescriptionSecond;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_THIRD)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_THIRD)
    private WebElement responsibleGamblingTopicNameThird;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_THIRD)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_THIRD)
    private WebElement responsibleGamblingTopicDescriptionThird;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_FOURTH)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_FOURTH)
    private WebElement responsibleGamblingTopicNameFourth;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FOURTH)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FOURTH)
    private WebElement responsibleGamblingTopicDescriptionFourth;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_FIFTH)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_NAME_FIFTH)
    private WebElement responsibleGamblingTopicNameFifth;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FIFTH)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_TOPIC_DESCRIPTION_FIFTH)
    private WebElement responsibleGamblingTopicDescriptionFifth;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_LEFT_ARROW)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_LEFT_ARROW)
    private WebElement responsibleGamblingLeftArrow;




    ///////////////
    @AndroidFindBy(accessibility = DEPOSIT_LIMIT_TEXT)
    @iOSXCUITFindBy(accessibility = DEPOSIT_LIMIT_TEXT)
    private WebElement depositLimitText;

    @AndroidFindBy(accessibility = DEPOSIT_LIMIT_INFO_ICON)
    @iOSXCUITFindBy(accessibility = DEPOSIT_LIMIT_INFO_ICON)
    private WebElement depositLimitInfoIcon;

    @AndroidFindBy(accessibility = DEPOSIT_NOTIFICATION_TEXT1)
    @iOSXCUITFindBy(accessibility = DEPOSIT_NOTIFICATION_TEXT1)
    private WebElement depositNotificationText1;

    @AndroidFindBy(accessibility = DEPOSIT_NOTIFICATION_TEXT2)
    @iOSXCUITFindBy(accessibility = DEPOSIT_NOTIFICATION_TEXT2)
    private WebElement depositNotificationText2;

    @AndroidFindBy(accessibility = ACTIVE_DEPOSIT_LIMIT)
    @iOSXCUITFindBy(accessibility = ACTIVE_DEPOSIT_LIMIT)
    private WebElement activeDepositLimit;

    @AndroidFindBy(accessibility = PENDING_DEPOSIT_LIMIT)
    @iOSXCUITFindBy(accessibility = PENDING_DEPOSIT_LIMIT)
    private WebElement pendingDepositLimit;

    @AndroidFindBy(accessibility = DEPOSIT_LIMIT_CONFIRM_BUTTON)
    @iOSXCUITFindBy(accessibility = DEPOSIT_LIMIT_CONFIRM_BUTTON)
    private WebElement depositLimitConfirmButton;

    @AndroidFindBy(accessibility = NO_LIMIT_SELECTOR)
    @iOSXCUITFindBy(accessibility = NO_LIMIT_SELECTOR)
    private WebElement noLimitSelector;

    @AndroidFindBy(accessibility = DAILY_SELECTOR)
    @iOSXCUITFindBy(accessibility = DAILY_SELECTOR)
    private WebElement dailySelector;

    @AndroidFindBy(accessibility = WEEKLY_SELECTOR)
    @iOSXCUITFindBy(accessibility = WEEKLY_SELECTOR)
    private WebElement weeklySelector;

    @AndroidFindBy(accessibility = MONTHLY_SELECTOR)
    @iOSXCUITFindBy(accessibility = MONTHLY_SELECTOR)
    private WebElement monthlySelector;

    @AndroidFindBy(accessibility = DEPOSIT_AMOUNT_TEXT)
    @iOSXCUITFindBy(accessibility = DEPOSIT_AMOUNT_TEXT)
    private WebElement amountText;

    @AndroidFindBy(accessibility = DEPOSIT_AMOUNT_INPUT)
    @iOSXCUITFindBy(accessibility = DEPOSIT_AMOUNT_INPUT)
    private WebElement depositAmountInput;

    @AndroidFindBy(accessibility = DEPOSIT_LIMIT_APPLY_BUTTON)
    @iOSXCUITFindBy(accessibility = DEPOSIT_LIMIT_APPLY_BUTTON)
    private WebElement depositApplyButton;

    @AndroidFindBy(accessibility = TIME_OUT_INFO_TEXT)
    @iOSXCUITFindBy(accessibility = TIME_OUT_INFO_TEXT)
    private WebElement timeOutText;

    @AndroidFindBy(accessibility = TIME_OUT_INFO_ICON)
    @iOSXCUITFindBy(accessibility = TIME_OUT_INFO_ICON)
    private WebElement timeOutInfoIcon;

    @AndroidFindBy(accessibility = NONE_SELECTOR)
    @iOSXCUITFindBy(accessibility = NONE_SELECTOR)
    private WebElement noneSelector;

    @AndroidFindBy(accessibility = TWENTY_FOUR_HOURS_SELECTOR)
    @iOSXCUITFindBy(accessibility = TWENTY_FOUR_HOURS_SELECTOR)
    private WebElement twentyFourHoursSelector;

    @AndroidFindBy(accessibility = SEVEN_DAYS_SELECTOR)
    @iOSXCUITFindBy(accessibility = SEVEN_DAYS_SELECTOR)
    private WebElement sevenDaysSelector;

    @AndroidFindBy(accessibility = THIRTY_DAYS_SELECTOR)
    @iOSXCUITFindBy(accessibility = THIRTY_DAYS_SELECTOR)
    private WebElement thirtyDaysSelector;

    @AndroidFindBy(accessibility = SIX_WEEKS_SELECTOR)
    @iOSXCUITFindBy(accessibility = SIX_WEEKS_SELECTOR)
    private WebElement sixWeeksSelector;

    @AndroidFindBy(accessibility = TIME_OUT_APPLY_BUTTON)
    @iOSXCUITFindBy(accessibility = TIME_OUT_APPLY_BUTTON)
    private WebElement timeOutApplyButton;

    @AndroidFindBy(accessibility = SELF_EXCLUSION_PERIOD_TITLE)
    @iOSXCUITFindBy(accessibility = SELF_EXCLUSION_PERIOD_TITLE)
    private WebElement selfExclusionPeriodTitle;

    @AndroidFindBy(accessibility = SELF_EXCLUSION_PERIOD_PART1)
    @iOSXCUITFindBy(accessibility = SELF_EXCLUSION_PERIOD_PART1)
    private WebElement selfExclusionPeriodPart1;

    @AndroidFindBy(accessibility = SELF_EXCLUSION_PERIOD_PART2)
    @iOSXCUITFindBy(accessibility = SELF_EXCLUSION_PERIOD_PART2)
    private WebElement selfExclusionPeriodPart2;

    @AndroidFindBy(accessibility = SELF_EXCLUSION_PERIOD_PART3)
    @iOSXCUITFindBy(accessibility = SELF_EXCLUSION_PERIOD_PART3)
    private WebElement selfExclusionPeriodPart3;

    @AndroidFindBy(accessibility = TIME_OUT_SETTING_TITLE)
    @iOSXCUITFindBy(accessibility = TIME_OUT_SETTING_TITLE)
    private WebElement timeOutSettingTitle;

    @AndroidFindBy(accessibility = TIME_OUT_SETTING_PART_1)
    @iOSXCUITFindBy(accessibility = TIME_OUT_SETTING_PART_1)
    private WebElement timeOutSettingPart1;

    @AndroidFindBy(accessibility = TIME_OUT_SETTING_PART_2)
    @iOSXCUITFindBy(accessibility = TIME_OUT_SETTING_PART_2)
    private WebElement timeOutSettingPart2;

    @AndroidFindBy(accessibility = TIMEOUT_CONFIRMATION_VALUE)
    @iOSXCUITFindBy(accessibility = TIMEOUT_CONFIRMATION_VALUE)
    private WebElement timeOutConfirmationValue;

    @AndroidFindBy(accessibility = TIMEOUT_CONFIRMATION_DATE)
    @iOSXCUITFindBy(accessibility = TIMEOUT_CONFIRMATION_DATE)
    private WebElement timeOutConfirmationDate;

    @AndroidFindBy(accessibility = TIMEOUT_CONFIRM_INPUT)
    @iOSXCUITFindBy(accessibility = TIMEOUT_CONFIRM_INPUT)
    private WebElement timeOutConfirmationInput;

    @AndroidFindBy(accessibility = TIMEOUT_CONFIRM_BUTTON_DISABLED)
    @iOSXCUITFindBy(accessibility = TIMEOUT_CONFIRM_BUTTON_DISABLED)
    private WebElement confirmTimeoutButtonDisabled;

    @AndroidFindBy(accessibility = TIMEOUT_CONFIRM_BUTTON_ACTIVE)
    @iOSXCUITFindBy(accessibility = TIMEOUT_CONFIRM_BUTTON_ACTIVE)
    private WebElement confirmTimeoutButtonActive;

    @AndroidFindBy(accessibility = TIMEOUT_CANCEL_BUTTON)
    @iOSXCUITFindBy(accessibility = TIMEOUT_CANCEL_BUTTON)
    private WebElement timeoutConfirmCancelButton;

    @AndroidFindBy(accessibility = TIMEOUT_ERROR_MESSAGE_PASSWORD)
    @iOSXCUITFindBy(accessibility = TIMEOUT_ERROR_MESSAGE_PASSWORD)
    private WebElement timeoutConfirmationScreenErrorMessage;


    public ResponsibleGamblingRules(WebDriver driver) {
        super(driver);
    }

    public boolean isResponsibleGamblingScreenVisible() {
        return responsibleGamblingScreen.isDisplayed();
    }

    public String getResponsibleGamblingTitle() {
        return responsibleGamblingTitle.getText();
    }

    public String getResponsibleGamblingTitleComment() {
        return responsibleGamblingTitleComment.getText();
    }

    public String getResponsibleGamblingFirstText() {
        return responsibleGamblingTextFirst.getText();
    }

    public String getResponsibleGamblingSecondText() {
        return responsibleGamblingTextSecond.getText();
    }

    public String getResponsibleGamblingFirstTopicName() {
        return responsibleGamblingTopicNameFirst.getText();
    }

    public void clickOnResponsibleGamblingFirstTopic() {
        responsibleGamblingTopicNameFirst.click();
    }

    public String getResponsibleGamblingFirstTopicDescription() {
        return responsibleGamblingTopicDescriptionFirst.getText();
    }

    public String getResponsibleGamblingSecondTopicName() {
        return responsibleGamblingTopicNameSecond.getText();
    }

    public void clickOnResponsibleGamblingSecondTopic() {
        responsibleGamblingTopicNameSecond.click();
    }

    public String getResponsibleGamblingSecondTopicDescription() {
        return responsibleGamblingTopicDescriptionSecond.getText();
    }

    public String getResponsibleGamblingThirdTopicName() {
        return responsibleGamblingTopicNameThird.getText();
    }

    public void clickOnResponsibleGamblingThirdTopic() {
        responsibleGamblingTopicNameThird.click();
    }

    public String getResponsibleGamblingThirdTopicDescription() {
        return responsibleGamblingTopicDescriptionThird.getText();
    }

    public String getResponsibleGamblingFourthTopicName() {
        return responsibleGamblingTopicNameFourth.getText();
    }

    public void clickOnResponsibleGamblingFourthTopic() {
        responsibleGamblingTopicNameFourth.click();
    }

    public String getResponsibleGamblingFourthTopicDescription() {
        return responsibleGamblingTopicDescriptionFourth.getText();
    }

    public String getResponsibleGamblingFifthTopicName() {
        return responsibleGamblingTopicNameFifth.getText();
    }

    public void clickOnResponsibleGamblingFifthTopic() {
        responsibleGamblingTopicNameFifth.click();
    }

    public String getResponsibleGamblingFifthTopicDescription() {
        return responsibleGamblingTopicDescriptionFifth.getText();
    }


    public boolean isResponsibleGamblingBackButtonDisplayed() {
        return responsibleGamblingLeftArrow.isDisplayed();
    }


    ///////

    public boolean isDepositLimitTextVisible() {
        return depositLimitText.isDisplayed();
    }

    public void clickOnDepositLimitInfoIcon() {
        depositLimitInfoIcon.click();
    }

    public String getDepositNotificationText1() {
        return depositNotificationText1.getText();
    }

    public String getDepositNotificationText2() {
        return depositNotificationText2.getText();
    }

    public boolean isPendingDepositTextVisible() {
        return pendingDepositLimit.isDisplayed();
    }

    public String getPendingDepositText() {
        return pendingDepositLimit.getText();
    }

    public boolean isConfirmButtonVisible() {
        return depositLimitConfirmButton.isDisplayed();
    }

    public boolean isNoLimitSelectorVisible() {
        return noLimitSelector.isDisplayed();
    }

    public boolean isDailySelectorVisible() {
        return dailySelector.isDisplayed();
    }

    public boolean isWeeklySelectorVisible() {
        return weeklySelector.isDisplayed();
    }

    public boolean isMonthlySelectorVisible() {
        return monthlySelector.isDisplayed();
    }

    public boolean isAmountInputFieldVisible() {
        return depositAmountInput.isDisplayed();
    }

    public void clickOnDailySelector() {
        dailySelector.click();
    }

    public void setDepositLimitAmount(String value) {
        depositAmountInput.sendKeys(value);
    }

    public void clickOnApplyDepositLimitButton() {
        depositApplyButton.click();
    }

    public boolean isDepositApplyButtonVisible() {
        return depositApplyButton.isDisplayed();
    }

    public boolean isTimeOutTextVisible() {
        return timeOutText.isDisplayed();
    }

    public void clickOnTimeOutIcon() {
        timeOutInfoIcon.click();
    }

    public boolean isNoneSelectorVisible() {
        return noneSelector.isDisplayed();
    }

    public boolean is24SelectorVisible() {
        return twentyFourHoursSelector.isDisplayed();
    }

    public boolean is7DaysSelectorVisible() {
        return sevenDaysSelector.isDisplayed();
    }

    public boolean is30DaysSelectorVisible() {
        return thirtyDaysSelector.isDisplayed();
    }

    public boolean is6WeeksSelectorVisible() {
        return sixWeeksSelector.isDisplayed();
    }

    public boolean isTimeOutApplyButtonVisible() {
        return timeOutApplyButton.isDisplayed();
    }

    public boolean isSelfExclusionTitleVisible() {
        return selfExclusionPeriodTitle.isDisplayed();
    }

    public boolean isSelfExclusionTextPart1Visible() {
        return selfExclusionPeriodPart1.isDisplayed();
    }

    public boolean isSelfExclusionTextPart2Visible() {
        return selfExclusionPeriodPart2.isDisplayed();
    }

    public boolean isSelfExclusionTextPar31Visible() {
        return selfExclusionPeriodPart3.isDisplayed();
    }

    public void clickOn24HSelector() {
        twentyFourHoursSelector.click();
    }

    public void clickOnTimeOutApplyButton() {
        timeOutApplyButton.click();
    }

    public String getTimeOutSettingTitle() {
        return timeOutSettingTitle.getText();
    }

    public String getTimeOutSettingText1() {
        return timeOutSettingPart1.getText();
    }

    public String getTimeOutSettingText2() {
        return timeOutSettingPart2.getText();
    }

    public String getTimeOutConfirmationValue() {
        return timeOutConfirmationValue.getText();
    }

    public String getTimeoutConfirmationDate() {
        return timeOutConfirmationDate.getText();
    }

    public boolean isTimeOutConfirmButtonVisible() {
        return confirmTimeoutButtonDisabled.isDisplayed();
    }

    public void clickOnCancelButton() {
        timeoutConfirmCancelButton.click();
    }

    public void typeAccountPassword(String value) {
        timeOutConfirmationInput.sendKeys(value);
    }

    public void clearPasswordTimeoutInput() {
        timeOutConfirmationInput.clear();
    }

    public void clickConfirmTimeoutButton() {
        confirmTimeoutButtonActive.click();
    }

    public boolean isTimeOutErrorVisible() {
        return timeoutConfirmationScreenErrorMessage.isDisplayed();
    }
}