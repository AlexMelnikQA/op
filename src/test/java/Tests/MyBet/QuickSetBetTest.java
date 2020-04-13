package Tests.MyBet;

import DTO.MyBet.QuickBetDto;
import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.MyBets.QuickSetBetPopup;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

import static Pages.BasePage.scrollTeenyUp;
import static Utils.Constants.BUY;
import static Utils.Constants.SELL;


public class QuickSetBetTest extends TestBase {

    private HomePage homePage;
    private BottomPopupDialog bottomPopupDialog;
    private HomePageLiveTab homePageLiveTab;
    private QuickSetBetPopup quickSetBetPopup;
    private Logger logger;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
        quickSetBetPopup = new QuickSetBetPopup(driver);
        logger = Logger.getLogger(QuickSetBetTest.class.getName());
    }

    @Test
    public void checkQuickSetBetPopupElementsForLoggedUser() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
        homePage.clickOnLiveTab();

        QuickBetDto quickBetDto = new QuickBetDto();
        quickBetDto.setMeetingName(homePageLiveTab.getFirstMeetingFirstSportNameText());
        quickBetDto.setStakeType(BUY);
        quickBetDto.setAmount(homePageLiveTab.getFirstMarketSportFirstBuyButtonText());
        homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();

        checkQuickSetBetPopup(quickBetDto);
        //TODO rewrite from Live - to Popular
        // homePage.clickOnPopularTab();
        quickBetDto.setMeetingName(homePageLiveTab.getFirstMeetingFirstSportNameText());
        quickBetDto.setStakeType(SELL);
        quickBetDto.setAmount(homePageLiveTab.getFirstMarketSportFirstSellButtonText());

        quickSetBetPopup.clickOnQuickBetPopupCloseButton();
        homePageLiveTab.clickOnFirstMarketSportFirstSellButton();
        checkQuickSetBetPopup(quickBetDto);
    }

    @Test
    public void quickSetBetStakeOnPopupForLoggedUser() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
        homePage.clickOnLiveTab();

        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
            checkQuickSetBetStakeOnPopupForLoggedUser();
        } else if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
            checkQuickSetBetStakeOnPopupForLoggedUser();
        } else if (homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
            checkQuickSetBetStakeOnPopupForLoggedUser();
        } else if (!homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnSecondMarketSportFirstBuyButton();
            checkQuickSetBetStakeOnPopupForLoggedUser();
        } else logger.warning("All matches suspended or finished");
    }

    @Test
    public void placeQuickSetBetWithMinimalPrice() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
        homePage.clickOnLiveTab();

        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
            checkPlaceQuickSetBetWithMinimalPrice();
        } else if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
            checkPlaceQuickSetBetWithMinimalPrice();
        } else if (homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
            checkPlaceQuickSetBetWithMinimalPrice();
        } else if (!homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnSecondMarketSportFirstBuyButton();
            checkPlaceQuickSetBetWithMinimalPrice();
        } else logger.warning("All matches suspended or finished");
    }

    private void checkQuickSetBetPopup(QuickBetDto betData) {
        scrollTeenyUp();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(quickSetBetPopup.getBetName().replace("/", " v "), betData.getMeetingName(), "Meeting Name is Incorrect");
        softAssert.assertEquals(quickSetBetPopup.getQuickBetType(), betData.getStakeType(),"Quick Bet Type is Incorrect");
        softAssert.assertEquals("@" + betData.getAmount(), quickSetBetPopup.getQuickBetPrice(), "Quick Bet Price is Incorrect");
        softAssert.assertTrue(quickSetBetPopup.isQuickBetMinusButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isQuickBetStakeFieldDisplayed());
        softAssert.assertEquals("Stake", quickSetBetPopup.getQuickBetStakeText(), "Quick Bet Stake Text is Incorrect");
        softAssert.assertTrue(quickSetBetPopup.isQuickBetPlusButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAddToBetSlipButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd10ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd25ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd50ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd1ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd2ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd3ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd4ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd5ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd6ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd7ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd8ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd9ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd0ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isAdd00ToStakeButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isDotButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isRemoveLastStakeDigitButtonDisplayed());
        softAssert.assertTrue(quickSetBetPopup.isPlaceQuickBetButtonDisplayed());
        softAssert.assertAll();
    }

    private void checkQuickSetBetPrice(String value) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("£ " + value, quickSetBetPopup.getQuickBetCurrentPrice(), " - Quick Bet Current Price is Incorrect");
        softAssert.assertEquals(value.replace(",", ""), quickSetBetPopup.getQuickBetStakeValue(), "Quick Bet Stake value is Incorrect");
        softAssert.assertAll();
    }

    private void clickOnRemoveLastStakeDigitButtonTimes(int index) {
        for (int i = 0; i < index; i++) {
            quickSetBetPopup.clickOnRemoveLastStakeDigitButton();
        }
    }

    private void checkPlaceQuickSetBetWithMinimalPrice() {
        quickSetBetPopup.clickOnDotButton();
        quickSetBetPopup.clickOnAdd00ToStakeButton();
        quickSetBetPopup.clickOnAdd1ToStakeButton();
        scrollTeenyUp();
        quickSetBetPopup.clickOnPlaceQuickBetButton();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Success!");
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(), "Your bet has been placed.");
        softAssert.assertAll();
    }

    private void checkQuickSetBetStakeOnPopupForLoggedUser() {
        quickSetBetPopup.clickOnQuickBetPlusButton();
        checkQuickSetBetPrice("1.00");

        quickSetBetPopup.clickOnAdd10ToStakeButton();
        checkQuickSetBetPrice("11.00");

        quickSetBetPopup.clickOnAdd25ToStakeButton();
        checkQuickSetBetPrice("36.00");

        quickSetBetPopup.clickOnAdd50ToStakeButton();
        checkQuickSetBetPrice("86.00");

        clickOnRemoveLastStakeDigitButtonTimes(4);
        checkQuickSetBetPrice("8");

        quickSetBetPopup.clickOnAdd1ToStakeButton();
        checkQuickSetBetPrice("81");

        quickSetBetPopup.clickOnAdd2ToStakeButton();
        checkQuickSetBetPrice("812");

        quickSetBetPopup.clickOnAdd3ToStakeButton();
        checkQuickSetBetPrice("8,123");

        quickSetBetPopup.clickOnAdd4ToStakeButton();
        checkQuickSetBetPrice("81,234");

        quickSetBetPopup.clickOnAdd5ToStakeButton();
        checkQuickSetBetPrice("812,345");

        clickOnRemoveLastStakeDigitButtonTimes(6);
        quickSetBetPopup.clickOnAdd6ToStakeButton();
        checkQuickSetBetPrice("6");

        quickSetBetPopup.clickOnAdd7ToStakeButton();
        checkQuickSetBetPrice("67");

        quickSetBetPopup.clickOnAdd8ToStakeButton();
        checkQuickSetBetPrice("678");

        quickSetBetPopup.clickOnAdd00ToStakeButton();
        checkQuickSetBetPrice("67,800");

        quickSetBetPopup.clickOnDotButton();
        checkQuickSetBetPrice("67,800.");

        quickSetBetPopup.clickOnAdd0ToStakeButton();
        checkQuickSetBetPrice("67,800.0");

        quickSetBetPopup.clickOnAdd9ToStakeButton();
        checkQuickSetBetPrice("67,800.09");
    }
}