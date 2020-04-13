package Tests.MyBet;

import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.Menus.BottomMenu;
import Pages.MyBets.MyBetsPage;
import Pages.MyBets.QuickSetBetPopup;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import Tests.SportsDetails.SportsTotalsTabTest;
import Utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static Pages.BasePage.scrollTeenyUp;


public class MyBetsUpdateDataTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private BottomPopupDialog bottomPopupDialog;
    private HomePageLiveTab homePageLiveTab;
    private QuickSetBetPopup quickSetBetPopup;
    private MyBetsPage myBetsPage;
    private Logger logger;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
        quickSetBetPopup = new QuickSetBetPopup(driver);
        myBetsPage = new MyBetsPage(driver);
        logger = Logger.getLogger(SportsTotalsTabTest.class.getName());
    }

    @Test
    public void checkUpdateDataOnMyBetPage() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
//        bottomPopupDialog.waitUntilClosePopupButtonVisible();
//        bottomPopupDialog.clickOnClosePopupButton();

        homePage.clickOnLiveTab();

        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
            placeQuickSetBetWithMinimalPrice();
        } else if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
            placeQuickSetBetWithMinimalPrice();
        } else if (homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
            placeQuickSetBetWithMinimalPrice();
        } else if (!homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnSecondMarketSportFirstBuyButton();
            placeQuickSetBetWithMinimalPrice();
        } else logger.warning("All matches suspended or finished");
    }

    private void placeQuickSetBetWithMinimalPrice() throws InterruptedException {
        quickSetBetPopup.clickOnDotButton();
        quickSetBetPopup.clickOnAdd00ToStakeButton();
        quickSetBetPopup.clickOnAdd1ToStakeButton();
        scrollTeenyUp();
        quickSetBetPopup.clickOnPlaceQuickBetButton();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        bottomPopupDialog.clickOnClosePopupButton();

        bottomMenu.clickOnBottomMenu_MyBets();
        final String updateInfo = myBetsPage.getMyBetUpdateInfoText();
        myBetsPage.clickOnMyBetsRefreshButton();
        Waiters.waitMiddle();
        Assert.assertNotEquals(updateInfo, myBetsPage.getMyBetUpdateInfoText(), "Page is not refreshed");
    }
}