package Tests.BetSleep;

import Pages.BetSleep.BetSleepHeaderPage;
import Pages.BetSleep.BetSleepPage;
import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Pages.BasePage.swipe;
import static Utils.Waiters.waitShort;


public class BetSleepRemoveItemTest extends TestBase {

    private HomePage homePage;
    private HomePageLiveTab homePageLiveTab;
    private BetSleepHeaderPage betSleepHeaderPage;
    private BetSleepPage betSleepPage;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
        betSleepHeaderPage = new BetSleepHeaderPage(driver);
        betSleepPage = new BetSleepPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
    }

    @Test
    public void removeBetSleepItemForLoggedUser() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        login(USER_WITH_BALANCE, PASSWORD);
 //       bottomPopupDialog.waitUntilClosePopupButtonVisible();
 //       bottomPopupDialog.clickOnClosePopupButton();
        homePage.waitUntilMainMenuLinkIsVisible();

        homePage.clickOnLiveTab();
        homePageLiveTab.waitFistSportBecomesVisible();
        addItemsToBetSleep();

        Assert.assertTrue(betSleepHeaderPage.isBetSlipArrowUpButtonDisplayed());
        betSleepHeaderPage.clickOnBetSlipArrowUpButton();
        waitShort();

        int i = 0;
        while (i < 3 && !betSleepPage.isBetSleepFirstMeetingFirstSportNotDisplayed()) {
            waitShort();
            swipeFirstBetSleepItemToRight();
            betSleepPage.clickOnRemoveFirstItemButton();
            i++;
        }
        waitShort();
        Assert.assertTrue(betSleepPage.isBetSleepFirstMeetingFirstSportNotDisplayed(), "Bet Sleep First Meeting First Sport Displayed");
    }

    @Test
    public void removeBetSleepItemForNotLoggedUser() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnLiveTab();
        homePageLiveTab.waitFistSportBecomesVisible();
        addItemsToBetSleep();

        Assert.assertTrue(betSleepHeaderPage.isBetSlipArrowUpButtonDisplayed());
        betSleepHeaderPage.clickOnBetSlipArrowUpButton();
        int i = 0;
        waitShort();
        while (i < 3 && !betSleepPage.isBetSleepFirstMeetingFirstSportNotDisplayed()) {
            swipeFirstBetSleepItemToRight();
            betSleepPage.clickOnRemoveFirstItemButton();
            i++;
            waitShort();
        }
        waitShort();
        Assert.assertTrue(betSleepPage.isBetSleepFirstMeetingFirstSportNotDisplayed(), "Bet Sleep First Meeting First Sport Displayed");
    }

    private void swipeFirstBetSleepItemToRight() {
        Dimension size = betSleepPage.betSleepFirstMeetingFirstSportInactivePlaceButton.getSize();
        int startx = size.width * 5;
        int endx = startx / 2;
        int starty = size.height * 5;
        swipe(startx, endx, starty, starty);
    }
}