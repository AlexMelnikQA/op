package Tests.Balance;

import Pages.BalancePage;
import Pages.Home.HomePage;
import Pages.LoginPage;
import Pages.Menus.MainMenu;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.regex.Pattern;

import static Utils.Constants.MONEY_PATTERN;
import static Utils.Constants.TEMPORARY_MONEY_PATTERN_FOR_PROMO;


public class BalanceTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private BalancePage balancePage;
    private LoginPage loginPage;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        balancePage = new BalancePage(driver);
        loginPage = new LoginPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
    }

    @Test
    public void checkBalancePageFromTopIcon() throws InterruptedException {
        login(ADMIN_LOGIN, ADMIN_PASSWORD);

        homePage.waitUntilProfileButtonIsVisible();
        homePage.clickOnProfileButton();
        checkBalancePage();
    }

    @Test
    public void checkBalancePageFromMainMenu() throws InterruptedException {
        login(ADMIN_LOGIN, ADMIN_PASSWORD);

        homePage.clickOnMainMenuLink();
        mainMenu.clickOnAccountDetailsLink();
        mainMenu.clickOnAccountDetailsBalanceLink();
        checkBalancePage();
    }

    @Test
    public void checkBalanceIsSameAsSpreadAvailable() throws InterruptedException {
        login(ADMIN_LOGIN, ADMIN_PASSWORD);

        homePage.clickOnMainMenuLink();
        Waiters.waitShort();
        mainMenu.clickOnAccountDetailsLink();
        mainMenu.clickOnAccountDetailsBalanceLink();
        Assert.assertEquals(balancePage.getAvailableMoneyValueText(), homePage.getBalanceValue(),
                "Balance is not correct, not the same as Spreads Available Money");
    }

    @Test
    public void checkLowBalancePopupAfterLogin() throws InterruptedException {
        login(USER_WITH_0_BALANCE_NAME, USER_WITH_0_BALANCE_PASSWORD);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupLowFundsDialogDisplayed(), "Low Funds Dialog is NOT Displayed");
        softAssert.assertTrue(bottomPopupDialog.isClosePopupButtonDisplayed(), "Close Popup Button on Dialog is NOT Displayed");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupIconDisplayed(), "Low Funds Icon is NOT Displayed");
        softAssert.assertEquals("Low funds", bottomPopupDialog.getBottomPopupTitle(), "Low Funds Title is Incorrect");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupLowFundsDialogSubPopupDisplayed(), "Low Funds Sub Popup is NOT Displayed");
        softAssert.assertEquals("Your founds are running low.", bottomPopupDialog.getBottomPopupLowFundsDialogText(),
                "Low Funds Dialog Text is Incorrect");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupLowFundsDialogSpreadsMoneyLogoDisplayed(),
                "Low Funds Dialog, Spreads Money Logo is NOT Displayed");
        softAssert.assertEquals("SPREADS", bottomPopupDialog.getBottomPopupLowFundsDialogSpreadsMoneyText(),
                "Low Funds Dialog, Spreads Money Text is Incorrect");
        softAssert.assertTrue(Pattern.matches(TEMPORARY_MONEY_PATTERN_FOR_PROMO, bottomPopupDialog.getBottomPopupLowFundsDialogSpreadsMoneyValue()),
                "Low Funds Dialog, Spreads Money Value is NOT matches to MONEY_PATTERN");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupLowFundsDialogOddsMoneyLogoDisplayed(),
                "Low Funds Dialog, Odds Money Logo is NOT Displayed");
        softAssert.assertEquals("ODDS", bottomPopupDialog.getBottomPopupLowFundsDialogOddsMoneyText(),
                "Low Funds Dialog, Odds Money Text is Incorrect");
        softAssert.assertTrue(Pattern.matches(TEMPORARY_MONEY_PATTERN_FOR_PROMO, bottomPopupDialog.getBottomPopupLowFundsDialogOddsMoneyValue()),
                "Low Funds Dialog, Odds Money Value is NOT matches to MONEY_PATTERN");
        softAssert.assertEquals("Would you like to make a deposit?", bottomPopupDialog.getBottomPopupLowFundsDialogQuestion(),
                "Low Funds Dialog, Question text is Incorrect");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupLowFundsDialogReminderCheckboxDisplayed(),
                "Low Funds Dialog, Reminder Checkbox is NOT Displayed");
        softAssert.assertEquals("Do not remind me of low funds again", bottomPopupDialog.getBottomPopupLowFundsDialogReminderText(),
                "Low Funds Dialog, Reminder text is Incorrect");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupLowFundsDialogMakeDepositLimitButtonDisplayed(),
                "Low Funds Dialog, Make Deposit Limit Button is NOT Displayed");
        softAssert.assertAll();
    }

    private void checkBalancePage() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(balancePage.isBalanceScreenDisplayed(),
                "Balance Screen Not Displayed");
        softAssert.assertEquals(balancePage.getBalanceScreenText(), "Balance");
        //TODO defect - this control is missing - will be fixed later
        //softAssert.assertTrue(balancePage.isBackFromBalanceScreenButtonDisplayed(),
        //        "Back From Balance Screen Button Not Displayed");

        softAssert.assertTrue(balancePage.isTotalFundsLogoDisplayed(),
                "Total Funds Logo Not Displayed");
        softAssert.assertEquals(balancePage.getTotalFundsText(), "TOTAL FUNDS");
        softAssert.assertTrue(Pattern.matches(MONEY_PATTERN, balancePage.getTotalFundsValueText()),
                "Total Funds Value is incorrect");

        softAssert.assertTrue(balancePage.isSpreadsMoneyLogoDisplayed(),
                "Spreads Money Logo Not Displayed");
        softAssert.assertEquals(balancePage.getSpreadsMoneyText(), "SPREADS");
        softAssert.assertTrue(Pattern.matches(MONEY_PATTERN, balancePage.getSpreadsMoneyValueText()),
                "Spreads Money Value is incorrect");
        softAssert.assertEquals(balancePage.getAvailableMoneyText(), "Available");
        softAssert.assertTrue(Pattern.matches(MONEY_PATTERN, balancePage.getAvailableMoneyValueText()),
                "Available Money Value is incorrect");
        softAssert.assertEquals(balancePage.getPromoMoneyText(), "Promo balance");
        softAssert.assertTrue(Pattern.matches(MONEY_PATTERN, balancePage.getPromoMoneyValueText()),
                "Promo Money Value is incorrect");
        softAssert.assertEquals(balancePage.getMidMoneyText(), "Open Bets Mid - Point");
        softAssert.assertTrue(Pattern.matches(MONEY_PATTERN, balancePage.getMidMoneyValueText()),
                "Mid Money Value is incorrect");

        softAssert.assertTrue(balancePage.isOddsMoneyLogoDisplayed(),
                "Odds Money Logo Not Displayed");
        softAssert.assertEquals(balancePage.getOddsMoneyText(), "ODDS");
        softAssert.assertTrue(Pattern.matches(MONEY_PATTERN, balancePage.getOddsMoneyValueText()),
                "Odds Money Value is incorrect");
        softAssert.assertEquals(balancePage.getOddsAvailableText(), "Available");
        softAssert.assertTrue(Pattern.matches(MONEY_PATTERN, balancePage.getOddsAvailableValueText()),
                "Odds Available Value is incorrect");

        softAssert.assertTrue(balancePage.isTransferFundsButtonDisplayed(),
                "Transfer Funds Button Not Displayed");
        softAssert.assertTrue(balancePage.isDepositFundsButtonDisplayed(),
                "Deposit Funds Button Not Displayed");
        softAssert.assertAll();
    }
}