package Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BalancePage extends BasePage {

    final static String BALANCE_SCREEN = "balanceScreen";
    final static String BALANCE_SCREEN_TEXT = "balanceScreenText";
    final static String BACK_FROM_BALANCE_SCREEN = "backFromBalanceScreen";

    final static String TOTAL_FUNDS_LOGO = "totalFundsLogo";
    final static String TOTAL_FUNDS = "totalFunds";
    final static String TOTAL_FUNDS_VALUE = "totalFundsValue";

    final static String SPREADS_MONEY_LOGO = "spreadsMoneyLogo";
    final static String SPREADS_MONEY = "spreadsMoney";
    final static String SPREADS_MONEY_VALUE = "spreadsMoneyValue";
    final static String AVAILABLE_MONEY = "availableMoney";
    final static String AVAILABLE_MONEY_VALUE = "availableMoneyValue";
    final static String PROMO_MONEY = "promoMoney";
    final static String PROMO_MONEY_VALUE = "promoMoneyValue";
    final static String MID_MONEY = "midMoney";
    final static String MID_MONEY_VALUE = "midMoneyValue";

    final static String ODDS_MONEY_LOGO = "oddsMoneyLogo";
    final static String ODDS_MONEY = "oddsMoney";
    final static String ODDS_MONEY_VALUE = "oddsMoneyValue";
    final static String ODDS_AVAILABLE = "oddsAvailable";
    final static String ODDS_AVAILABLE_VALUE = "oddsAvailableValue";

    final static String TRANSFER_FUNDS_BUTTON = "transferFundsButton";
    final static String DEPOSIT_FUNDS_BUTTON = "depositFundsButton";


    @AndroidFindBy(accessibility = BALANCE_SCREEN)
    @iOSXCUITFindBy(accessibility = BALANCE_SCREEN)
    private WebElement balanceScreen;

    @AndroidFindBy(accessibility = BALANCE_SCREEN_TEXT)
    @iOSXCUITFindBy(accessibility = BALANCE_SCREEN_TEXT)
    private WebElement balanceScreenText;

    @AndroidFindBy(accessibility = BACK_FROM_BALANCE_SCREEN)
    @iOSXCUITFindBy(accessibility = BACK_FROM_BALANCE_SCREEN)
    private WebElement backFromBalanceScreen;

    @AndroidFindBy(accessibility = TOTAL_FUNDS_LOGO)
    @iOSXCUITFindBy(accessibility = TOTAL_FUNDS_LOGO)
    private WebElement totalFundsLogo;

    @AndroidFindBy(accessibility = TOTAL_FUNDS)
    @iOSXCUITFindBy(accessibility = TOTAL_FUNDS)
    private WebElement totalFunds;

    @AndroidFindBy(accessibility = TOTAL_FUNDS_VALUE)
    @iOSXCUITFindBy(accessibility = TOTAL_FUNDS_VALUE)
    private WebElement totalFundsValue;

    @AndroidFindBy(accessibility = SPREADS_MONEY_LOGO)
    @iOSXCUITFindBy(accessibility = SPREADS_MONEY_LOGO)
    private WebElement spreadsMoneyLogo;

    @AndroidFindBy(accessibility = SPREADS_MONEY)
    @iOSXCUITFindBy(accessibility = SPREADS_MONEY)
    private WebElement spreadsMoney;

    @AndroidFindBy(accessibility = SPREADS_MONEY_VALUE)
    @iOSXCUITFindBy(accessibility = SPREADS_MONEY_VALUE)
    private WebElement spreadsMoneyValue;

    @AndroidFindBy(accessibility = AVAILABLE_MONEY)
    @iOSXCUITFindBy(accessibility = AVAILABLE_MONEY)
    private WebElement availableMoney;

    @AndroidFindBy(accessibility = AVAILABLE_MONEY_VALUE)
    @iOSXCUITFindBy(accessibility = AVAILABLE_MONEY_VALUE)
    private WebElement availableMoneyValue;

    @AndroidFindBy(accessibility = PROMO_MONEY)
    @iOSXCUITFindBy(accessibility = PROMO_MONEY)
    private WebElement promoMoney;

    @AndroidFindBy(accessibility = PROMO_MONEY_VALUE)
    @iOSXCUITFindBy(accessibility = PROMO_MONEY_VALUE)
    private WebElement promoMoneyValue;

    @AndroidFindBy(accessibility = MID_MONEY)
    @iOSXCUITFindBy(accessibility = MID_MONEY)
    private WebElement midMoney;

    @AndroidFindBy(accessibility = MID_MONEY_VALUE)
    @iOSXCUITFindBy(accessibility = MID_MONEY_VALUE)
    private WebElement midMoneyValue;

    @AndroidFindBy(accessibility = ODDS_MONEY_LOGO)
    @iOSXCUITFindBy(accessibility = ODDS_MONEY_LOGO)
    private WebElement oddsMoneyLogo;

    @AndroidFindBy(accessibility = ODDS_MONEY)
    @iOSXCUITFindBy(accessibility = ODDS_MONEY)
    private WebElement oddsMoney;

    @AndroidFindBy(accessibility = ODDS_MONEY_VALUE)
    @iOSXCUITFindBy(accessibility = ODDS_MONEY_VALUE)
    private WebElement oddsMoneyValue;

    @AndroidFindBy(accessibility = ODDS_AVAILABLE)
    @iOSXCUITFindBy(accessibility = ODDS_AVAILABLE)
    private WebElement oddsAvailable;

    @AndroidFindBy(accessibility = ODDS_AVAILABLE_VALUE)
    @iOSXCUITFindBy(accessibility = ODDS_AVAILABLE_VALUE)
    private WebElement oddsAvailableValue;

    @AndroidFindBy(accessibility = TRANSFER_FUNDS_BUTTON)
    @iOSXCUITFindBy(accessibility = TRANSFER_FUNDS_BUTTON)
    private WebElement transferFundsButton;

    @AndroidFindBy(accessibility = DEPOSIT_FUNDS_BUTTON)
    @iOSXCUITFindBy(accessibility = DEPOSIT_FUNDS_BUTTON)
    private WebElement depositFundsButton;


    public BalancePage(WebDriver driver) {
        super(driver);
    }

    public boolean isBalanceScreenDisplayed() {
        return balanceScreen.isDisplayed();
    }

    public String getBalanceScreenText() {
        return balanceScreenText.getText();
    }

    public boolean isBackFromBalanceScreenButtonDisplayed() {
        return backFromBalanceScreen.isDisplayed();
    }

    public boolean isTotalFundsLogoDisplayed() {
        return totalFundsLogo.isDisplayed();
    }

    public String getTotalFundsText() {
        return totalFunds.getText();
    }

    public String getTotalFundsValueText() {
        return totalFundsValue.getText();
    }

    public boolean isSpreadsMoneyLogoDisplayed() {
        return spreadsMoneyLogo.isDisplayed();
    }

    public String getSpreadsMoneyText() {
        return spreadsMoney.getText();
    }

    public String getSpreadsMoneyValueText() {
        return spreadsMoneyValue.getText();
    }

    public String getAvailableMoneyText() {
        return availableMoney.getText();
    }

    public String getAvailableMoneyValueText() {
        return availableMoneyValue.getText();
    }

    public String getPromoMoneyText() {
        return promoMoney.getText();
    }

    public String getPromoMoneyValueText() {
        return promoMoneyValue.getText();
    }

    public String getMidMoneyText() {
        return midMoney.getText();
    }

    public String getMidMoneyValueText() {
        return midMoneyValue.getText();
    }

    public boolean isOddsMoneyLogoDisplayed() {
        return oddsMoneyLogo.isDisplayed();
    }

    public String getOddsMoneyText() {
        return oddsMoney.getText();
    }

    public String getOddsMoneyValueText() {
        return oddsMoneyValue.getText();
    }

    public String getOddsAvailableText() {
        return oddsAvailable.getText();
    }

    public String getOddsAvailableValueText() {
        return oddsAvailableValue.getText();
    }

    public boolean isTransferFundsButtonDisplayed() {
        return transferFundsButton.isDisplayed();
    }

    public void clickOnTransferFundsButton() {
        transferFundsButton.click();
    }

    public boolean isDepositFundsButtonDisplayed() {
        return depositFundsButton.isDisplayed();
    }

    public void clickOnDepositFundsButton() {
        depositFundsButton.click();
    }
}