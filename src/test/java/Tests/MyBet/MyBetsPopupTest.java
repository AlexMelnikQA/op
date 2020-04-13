package Tests.MyBet;

import Pages.Home.HighlightsTab.HighlightsTab;
import Pages.Home.HighlightsTab.HighlightsTabSport;
import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.Home.UpNextTab.UpNextTab;
import Pages.SportsDetails.SportsSubHeader;
import Pages.MyBets.QuickSetBetPopup;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.scrollTeenyUp;

public class MyBetsPopupTest extends TestBase {
    private HomePage homePage;
    private QuickSetBetPopup quickSetBetPopup;
    private HomePageLiveTab homePageLiveTab;
    private BottomPopupDialog bottomPopupDialog;
    private UpNextTab upNextTab;
    private SportsSubHeader sportsSubHeader;
    private HighlightsTab highlightsTab;
    private HighlightsTabSport highlightsTabSport;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        quickSetBetPopup = new QuickSetBetPopup(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        upNextTab = new UpNextTab(driver);
        sportsSubHeader = new SportsSubHeader(driver);
        highlightsTab = new HighlightsTab(driver);
        highlightsTabSport = new HighlightsTabSport(driver);
    }

    @Test
    public void checkPermissionDeniedPopup() throws InterruptedException {
        login(USER_WITH_RESTRICTED_ACCESS, BASE_PASSWORD);
        homePageLiveTab.waitFistSportBecomesVisible();

        homePage.clickOnUpNextTab();
        upNextTab.clickOnFirstMeetingNameLink();
        Waiters.waitShort();

        Assert.assertFalse(sportsSubHeader.isSportHeaderNameNotVisible(),
                "Blank page is shown, because back-end doesn't sent us proper data");

        if (!sportsSubHeader.isHideAndShowScoreboardNotVisible()) {
            sportsSubHeader.clickOnHideAndShowScoreBoard();
        }
        Assert.assertTrue(sportsSubHeader.isFirstMeetingSuspendedNotVisible(),
                "Meeting suspended, impossible to check functionality");
        sportsSubHeader.clickOnFirstSellButton();
        quickSetBetPopup.waitUntilQuickBetPlusButtonVisible();
        scrollTeenyUp();
        quickSetBetPopup.clickOnDotButton();
        quickSetBetPopup.clickOnAdd00ToStakeButton();
        quickSetBetPopup.clickOnAdd1ToStakeButton();
        scrollTeenyUp();
        quickSetBetPopup.clickOnPlaceQuickBetButton();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Permission denied");
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(),
                "You do not have permission to place spread bets, please contact" +
                        " customer services for an upgrade your account.");
        softAssert.assertAll();
    }

    @Test
    public void checkInsufficientFundsPopup() throws InterruptedException {
        login(USER_WITH_0_BALANCE_NAME, USER_WITH_0_BALANCE_PASSWORD);
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        bottomPopupDialog.clickOnClosePopupButton();
        homePageLiveTab.waitFistSportBecomesVisible();
        homePage.clickOnHighlightsTab();
        highlightsTab.clickOnFirstMeetingDescription();

        if (!highlightsTabSport.isHideAndShowScoreboardNotVisible()) {
            highlightsTabSport.clickOnHideAndShowScoreBoard();
        }

        highlightsTabSport.csrollToFirstSellButton();
        highlightsTabSport.clickOnFirstSellButton();
        quickSetBetPopup.waitUntilQuickBetPlusButtonVisible();
        quickSetBetPopup.scrollToPlaceQuickBetButton();
        quickSetBetPopup.clickOnQuickBetPlusButton();
        quickSetBetPopup.clickOnPlaceQuickBetButton();

        SoftAssert softAssert = new SoftAssert();

        //TODO check all elements after Andriy
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Insufficient funds");
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(), "Additional funds required to " +
                "place bet");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupButton1Displayed());
        softAssert.assertAll();
    }
}