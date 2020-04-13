package Pages.Popups;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;

public class BottomPopupDialog extends BasePage {
    final static String BOTTOM_POPUP_CLOSE_BUTTON = "notificationPopupClosePopup";
    final static String BOTTOM_POPUP_ICON = "notificationPopupIcon";
    final static String BOTTOM_POPUP_TITLE = "notificationPopupTitleText";
    final static String BOTTOM_POPUP_NOTIFICATION_TEXT = "notificationPopupCommentText";
    final static String BOTTOM_POPUP_UNABLE_TO_LOGIN_TEXT = "loginFormUnableToLoginMessageText";
    final static String BOTTOM_POPUP_BUTTON1 = "notificationPopupButton1";
    final static String BOTTOM_POPUP_MAKE_BUTTON2 = "notificationPopupButton2";

    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG = "lowFundsDialog";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_SUB_POPUP = "lowDepositLimitButtonPopup";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_TEXT = "lowDepositLimitPopupText";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_LOGO = "spreadsMoneyLogo";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_TEXT = "spreadsMoneyText";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_VALUE = "spreadsMoneyValue";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_LOGO = "oddsMoneyLogo";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_TEXT = "oddsMoneyText";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_VALUE = "oddsMoneyValue";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_QUESTION = "lowDepositLimitQuestion";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_REMIND_CHECKBOX = "lowDepositLimitReminderCheckbox";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_REMIND = "lowDepositLimitReminderText";
    final static String BOTTOM_POPUP_LOW_FUNDS_DIALOG_DEPOSIT_BUTTON = "makeDepositLimitButton";

    final static String BOTTOM_POPUP_ADD_TO_FAVOURITES = "favouriteNameConfirmationDialog";
    final static String BOTTOM_POPUP_ADD_TO_FAVOURITES_INPUT_FIELD = "notificationCustomPopupInputField";


    @AndroidFindBy(accessibility = BOTTOM_POPUP_CLOSE_BUTTON)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_CLOSE_BUTTON)
    private WebElement closePopupButton;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_ICON)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_ICON)
    private WebElement bottomPopupIcon;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_TITLE)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_TITLE)
    private WebElement bottomPopupTitleText;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_NOTIFICATION_TEXT)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_NOTIFICATION_TEXT)
    private WebElement bottomPopupNotificationText;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_BUTTON1)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_BUTTON1)
    private WebElement bottomPopupButton1;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_MAKE_BUTTON2)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_MAKE_BUTTON2)
    private WebElement bottomPopupButton2;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_UNABLE_TO_LOGIN_TEXT)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_UNABLE_TO_LOGIN_TEXT)
    private WebElement bottomPopupLoginErrorMessage;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG)
    private WebElement bottomPopupLowFundsDialog;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SUB_POPUP)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SUB_POPUP)
    private WebElement bottomPopupLowFundsDialogSubPopup;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_TEXT)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_TEXT)
    private WebElement bottomPopupLowFundsDialogText;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_LOGO)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_LOGO)
    private WebElement bottomPopupLowFundsDialogSpreadsLogo;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_TEXT)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_TEXT)
    private WebElement bottomPopupLowFundsDialogSpreadsText;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_VALUE)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_SPREADS_VALUE)
    private WebElement bottomPopupLowFundsDialogSpreadsValue;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_LOGO)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_LOGO)
    private WebElement bottomPopupLowFundsDialogOddsLogo;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_TEXT)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_TEXT)
    private WebElement bottomPopupLowFundsDialogOddsText;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_VALUE)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_ODDS_VALUE)
    private WebElement bottomPopupLowFundsDialogOddsValue;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_QUESTION)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_QUESTION)
    private WebElement bottomPopupLowFundsDialogQuestion;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_REMIND_CHECKBOX)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_REMIND_CHECKBOX)
    private WebElement bottomPopupLowFundsDialogReminderCheckbox;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_REMIND)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_REMIND)
    private WebElement bottomPopupLowFundsDialogReminder;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_DEPOSIT_BUTTON)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_LOW_FUNDS_DIALOG_DEPOSIT_BUTTON)
    private WebElement bottomPopupLowFundsDialogDepositLimitButton;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_ADD_TO_FAVOURITES)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_ADD_TO_FAVOURITES)
    private WebElement bottomPopupAddToFavourites;

    @AndroidFindBy(accessibility = BOTTOM_POPUP_ADD_TO_FAVOURITES_INPUT_FIELD)
    @iOSXCUITFindBy(accessibility = BOTTOM_POPUP_ADD_TO_FAVOURITES_INPUT_FIELD)
    private WebElement bottomPopupAddToFavouritesInputField;


    public BottomPopupDialog(WebDriver driver) {
        super(driver);
    }

    public void waitUntilClosePopupButtonVisible() {
        waitVisibilityOfElement(closePopupButton);
    }

    public void clickOnClosePopupButton() {
        closePopupButton.click();
    }

    public boolean isClosePopupButtonDisplayed() {
        return closePopupButton.isDisplayed();
    }

    public boolean isBottomPopupIconDisplayed() {
        return bottomPopupIcon.isDisplayed();
    }

    public String getBottomPopupTitle() {
        return bottomPopupTitleText.getText();
    }

    public String getBottomPopupNotificationText() {
        return bottomPopupNotificationText.getText();
    }

    public boolean isBottomPopupButton1Displayed() {
        return bottomPopupButton1.isDisplayed();
    }

    public String getBottomPopupLoginErrorMessage() {
        return bottomPopupLoginErrorMessage.getText();
    }

    public boolean isBottomPopupCloseButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(BOTTOM_POPUP_CLOSE_BUTTON);
    }

    public boolean getBottomPopupLoginErrorPopUpsDisplayed() {
        return bottomPopupLoginErrorMessage.isDisplayed();
    }

    public void clickStayInAppButton() {
        bottomPopupButton1.click();
    }

    public void clickSaveButton() {
        bottomPopupButton1.click();
    }

    public void clickLogoutButton() {
        bottomPopupButton2.click();
    }

    public boolean isBottomPopupLowFundsDialogDisplayed() {
        return bottomPopupLowFundsDialog.isDisplayed();
    }

    public boolean isBottomPopupLowFundsDialogSubPopupDisplayed() {
        return bottomPopupLowFundsDialogSubPopup.isDisplayed();
    }

    public String getBottomPopupLowFundsDialogText() {
        return bottomPopupLowFundsDialogText.getText();
    }

    public boolean isBottomPopupLowFundsDialogSpreadsMoneyLogoDisplayed() {
        return bottomPopupLowFundsDialogSpreadsLogo.isDisplayed();
    }

    public String getBottomPopupLowFundsDialogSpreadsMoneyText() {
        return bottomPopupLowFundsDialogSpreadsText.getText();
    }

    public String getBottomPopupLowFundsDialogSpreadsMoneyValue() {
        return bottomPopupLowFundsDialogSpreadsValue.getText();
    }

    public boolean isBottomPopupLowFundsDialogOddsMoneyLogoDisplayed() {
        return bottomPopupLowFundsDialogOddsLogo.isDisplayed();
    }

    public String getBottomPopupLowFundsDialogOddsMoneyText() {
        return bottomPopupLowFundsDialogOddsText.getText();
    }

    public String getBottomPopupLowFundsDialogOddsMoneyValue() {
        return bottomPopupLowFundsDialogOddsValue.getText();
    }

    public String getBottomPopupLowFundsDialogQuestion() {
        return bottomPopupLowFundsDialogQuestion.getText();
    }

    public boolean isBottomPopupLowFundsDialogReminderCheckboxDisplayed() {
        return bottomPopupLowFundsDialogReminderCheckbox.isDisplayed();
    }

    public String getBottomPopupLowFundsDialogReminderText() {
        return bottomPopupLowFundsDialogReminder.getText();
    }

    public boolean isBottomPopupLowFundsDialogMakeDepositLimitButtonDisplayed() {
        return bottomPopupLowFundsDialogDepositLimitButton.isDisplayed();
    }

    public boolean isBottomPopupAddToFavouritesDisplayed() {
        return bottomPopupAddToFavourites.isDisplayed();
    }

    public String getBottomPopupAddToFavouritesInputFieldText() {
        return bottomPopupAddToFavouritesInputField.getText();
    }

    public void fillBottomPopupAddToFavouritesInputField(String input) {
        bottomPopupAddToFavouritesInputField.sendKeys(input);
    }

    public boolean isErrorTitleNotVisible() {
        return isElementsByAccessibilityIdNotPresent(BOTTOM_POPUP_TITLE);
    }
}