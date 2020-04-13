package Tests.BetSleep;

import DTO.MyBet.BetSleepDto;
import Pages.BetSleep.BetSleepHeaderPage;
import Pages.BetSleep.BetSleepPage;
import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.MyBets.QuickSetBetPopup;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

import static Pages.BasePage.scrollHalfUp;
import static Pages.BasePage.scrollTeenyUp;


public class BetSleepTest extends TestBase {

    private HomePage homePage;
    private HomePageLiveTab homePageLiveTab;
    private BottomPopupDialog bottomPopupDialog;
    private BetSleepHeaderPage betSleepHeaderPage;
    private BetSleepPage betSleepPage;
    private QuickSetBetPopup quickSetBetPopup;
    private Logger logger;

    final String PLACE_BET = "PLACE BET";
    final String STAKE = "Stake";
    final String MIN_AMOUNT = "min £ 0.01";

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        betSleepHeaderPage = new BetSleepHeaderPage(driver);
        betSleepPage = new BetSleepPage(driver);
        quickSetBetPopup = new QuickSetBetPopup(driver);
        logger = Logger.getLogger(BetSleepTest.class.getName());
    }

    @Test
    public void checkBetSleepPageNotLoggedUser() {
        BetSleepDto expectedBetSleepSportDto = new BetSleepDto();
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnLiveTab();

        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getFirstSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getFirstMarketSportFirstDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getFirstMeetingFirstSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Buy " + homePageLiveTab.getFirstMarketSportFirstBuyButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            checkBetSleepElements(expectedBetSleepSportDto);
        } else if (!homePageLiveTab.isSecondMarketSportFirstNotDisplayed() && homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondSellButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getFirstSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getSecondMarketSportFirstDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getSecondMeetingFirstSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Sell " + homePageLiveTab.getSecondMarketSportFirstSellButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            scrollTeenyUp();
            checkBetSleepElements(expectedBetSleepSportDto);
        } else if (!homePageLiveTab.isThirdMarketSportFirstNotDisplayed() && homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getFirstSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getThirdMarketSportFirstDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getThirdMeetingFirstSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Buy " + homePageLiveTab.getThirdMarketSportFirstBuyButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            scrollHalfUp();
            checkBetSleepElements(expectedBetSleepSportDto);
        } else if (!homePageLiveTab.isFirstMarketSportSecondNotDisplayed() && homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondSellButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getSecondSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getFirstMarketSportSecondDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getFirstMeetingSecondSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Sell " + homePageLiveTab.getFirstMarketSportSecondSellButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            scrollHalfUp();
            checkBetSleepElements(expectedBetSleepSportDto);
        } else logger.warning("All matches suspended or finished. No test data");
    }

    @Test
    public void checkBetSleepPageLoggedUser() throws InterruptedException {
        BetSleepDto expectedBetSleepSportDto = new BetSleepDto();

        login(USER_WITH_BALANCE, PASSWORD);
  //      bottomPopupDialog.waitUntilClosePopupButtonVisible();
  //      bottomPopupDialog.clickOnClosePopupButton();

        homePage.clickOnLiveTab();

        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getFirstSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getFirstMarketSportFirstDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getFirstMeetingFirstSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Buy " + homePageLiveTab.getFirstMarketSportFirstBuyButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            quickSetBetPopup.clickOnAddToBetSlipButton();
            checkBetSleepElements(expectedBetSleepSportDto);
        } else if (!homePageLiveTab.isSecondMarketSportFirstNotDisplayed() && homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondSellButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getFirstSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getSecondMarketSportFirstDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getSecondMeetingFirstSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Sell " + homePageLiveTab.getSecondMarketSportFirstSellButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            scrollTeenyUp();
            quickSetBetPopup.clickOnAddToBetSlipButton();
            checkBetSleepElements(expectedBetSleepSportDto);
        } else if (!homePageLiveTab.isThirdMarketSportFirstNotDisplayed() && homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getFirstSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getThirdMarketSportFirstDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getThirdMeetingFirstSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Buy " + homePageLiveTab.getThirdMarketSportFirstBuyButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            scrollHalfUp();
            quickSetBetPopup.clickOnAddToBetSlipButton();
            checkBetSleepElements(expectedBetSleepSportDto);
        } else if (!homePageLiveTab.isFirstMarketSportSecondNotDisplayed() && homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondSellButton();

            expectedBetSleepSportDto.setSportName(homePageLiveTab.getSecondSportLineText());
            expectedBetSleepSportDto.setMeetingName(homePageLiveTab.getFirstMarketSportSecondDescriptionText());
            expectedBetSleepSportDto.setMeetingDetails(homePageLiveTab.getFirstMeetingSecondSportNameText());
            expectedBetSleepSportDto.setPlaceButtonName(PLACE_BET);
            expectedBetSleepSportDto.setMeetingLabel("Sell " + homePageLiveTab.getFirstMarketSportSecondSellButtonText());
            expectedBetSleepSportDto.setMeetingComment(STAKE);
            expectedBetSleepSportDto.setAmount(MIN_AMOUNT);

            scrollHalfUp();
            quickSetBetPopup.clickOnAddToBetSlipButton();
            checkBetSleepElements(expectedBetSleepSportDto);
        } else logger.warning("All matches suspended or finished. No test data");
    }

    private void compareBetSleeps(BetSleepDto expectedDto, BetSleepDto actualDto) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedDto.getSportName(), actualDto.getSportName(), "SportName");
        softAssert.assertEquals(expectedDto.getMeetingName(), actualDto.getMeetingName(), "MeetingName");
        softAssert.assertEquals(expectedDto.getMeetingDetails(), actualDto.getMeetingDetails(), "MeetingDetails");
        softAssert.assertEquals(expectedDto.getPlaceButtonName(), actualDto.getPlaceButtonName(), "PlaceButtonName");
        softAssert.assertEquals(expectedDto.getMeetingLabel(), actualDto.getMeetingLabel(), "MeetingLabel");
        softAssert.assertEquals(expectedDto.getMeetingComment(), actualDto.getMeetingComment(), "MeetingComment");
        softAssert.assertEquals(expectedDto.getAmount(), actualDto.getAmount(), "Amount");
        softAssert.assertAll();
    }

    private void checkBetSleepElements(BetSleepDto expectedBetSleepSportDto) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(betSleepHeaderPage.isBetSlipArrowUpButtonDisplayed());
        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());
        softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "1 outcome in Bet slip");
        softAssert.assertTrue(betSleepHeaderPage.isBetSlipMarketNameDisplayed());

        betSleepHeaderPage.clickOnBetSlipArrowUpButton();

        BetSleepDto actualBetSleepSportDto = new BetSleepDto();
        actualBetSleepSportDto.setSportName(betSleepPage.getBetSleepSportFirstText().toUpperCase());
        actualBetSleepSportDto.setMeetingName(betSleepPage.getBetSleepFirstMeetingFirstSportName());
        actualBetSleepSportDto.setMeetingDetails(betSleepPage.getBetSleepFirstMeetingFirstSportDetails());
        actualBetSleepSportDto.setPlaceButtonName(betSleepPage.getBetSleepFirstMeetingFirstSportInactivePlaceButtonText());
        actualBetSleepSportDto.setMeetingLabel(betSleepPage.getBetSleepFirstMeetingFirstSportLabelText());
        actualBetSleepSportDto.setMeetingComment(betSleepPage.getBetSleepFirstMeetingFirstSportCommentText());
        actualBetSleepSportDto.setAmount(betSleepPage.getBetSleepFirstMeetingFirstSportAmountInputText());

        compareBetSleeps(expectedBetSleepSportDto, actualBetSleepSportDto);

        softAssert.assertAll();
    }
}