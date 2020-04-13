package Tests.MyBet;

import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.Menus.BottomMenu;
import Pages.MyBets.MyBetsPage;
import Pages.MyBets.QuickSetBetPopup;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

import static Pages.BasePage.scrollTeenyUp;


public class MyBetsCloseTest extends TestBase {

    private HomePage homePage;
    private BottomPopupDialog bottomPopupDialog;
    private HomePageLiveTab homePageLiveTab;
    private QuickSetBetPopup quickSetBetPopup;
    private BottomMenu bottomMenu;
    private MyBetsPage myBetsPage;
    private Logger logger;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
        quickSetBetPopup = new QuickSetBetPopup(driver);
        bottomMenu = new BottomMenu(driver);
        myBetsPage = new MyBetsPage(driver);
        logger = Logger.getLogger(MyBetsCloseTest.class.getName());
    }

    @Test
    public void checkCloseBet() throws InterruptedException {
        placeQuickSetBet();
        bottomMenu.clickOnBottomMenu_MyBets();

        myBetsPage.clickOnMyBetsFirstItem();
        myBetsPage.clickOnMyBetsFirstCashOutButton();
        checkCashOutPopup();
        bottomPopupDialog.clickSaveButton();
        checkConfirmPopup();
        bottomPopupDialog.clickOnClosePopupButton();
        Assert.assertEquals(myBetsPage.getMessageForLoggedUser(), "You currently have no open bets");
    }

    private void checkCashOutPopup() {
        SoftAssert softAssert = new SoftAssert();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Cash out?");
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(),
                "Are you sure you want to cash out £0.01?");
        softAssert.assertAll();
    }

    private void checkConfirmPopup() {
        SoftAssert softAssert = new SoftAssert();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Success!");
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(),
                "This bet has been fully cashed out");
        softAssert.assertAll();
    }

    private void placeQuickSetBet() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
        homePage.clickOnLiveTab();

        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
        } else if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
        } else if (homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
        } else if (!homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnSecondMarketSportFirstBuyButton();
        } else logger.warning("All matches suspended or finished");

        quickSetBetPopup.clickOnDotButton();
        quickSetBetPopup.clickOnAdd00ToStakeButton();
        quickSetBetPopup.clickOnAdd1ToStakeButton();
        scrollTeenyUp();
        quickSetBetPopup.clickOnPlaceQuickBetButton();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        bottomPopupDialog.clickOnClosePopupButton();
    }
}