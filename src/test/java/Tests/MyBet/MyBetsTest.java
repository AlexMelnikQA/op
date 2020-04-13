package Tests.MyBet;

import DTO.MyBet.BetSleepDto;
import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Pages.MyBets.MyBetsPage;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.regex.Pattern;

import static Utils.Constants.*;
import static Utils.Waiters.waitLong;


public class MyBetsTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private MyBetsPage myBetsPage;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        myBetsPage = new MyBetsPage(driver);
    }

    @Test
    public void checkMyBetsScreenForLoggedUserDisplayedEmptyBets() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);

        bottomMenu.clickOnBottomMenu_MyBets();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(myBetsPage.isMyBetsScreenDisplayed());
        if (!myBetsPage.noOpenBetsAreActive()) {
            softAssert.assertEquals(myBetsPage.getMessageForLoggedUser(),
                    "You currently have no open bets");
        } else
            softAssert.assertTrue(bottomMenu.isActiveBottomMenu_MyBetsDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void checkMyBetsScreenForNotLoggedUserDisplayed() {
        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_MyBets();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(myBetsPage.isMyBetsScreenDisplayed());
        softAssert.assertEquals(myBetsPage.getMessageForNotLoggedUser(),
                "You are unable to see your bets until log in. Please log in to view");
        softAssert.assertTrue(bottomMenu.isActiveBottomMenu_MyBetsDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void checkMyBetsScreenForLoggedUserDisplayedNotEmptyBet() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
        closeBet();
        bottomMenu.clickOnHomeLink();
        BetSleepDto betData = createBet();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(myBetsPage.isMyBetsFirstItemDisplayed(),
                "MyBets First Item NOT Displayed");
        softAssert.assertEquals(myBetsPage.getMyBetsFirstStakeText(), "£" + betData.getAmount());
        softAssert.assertEquals(myBetsPage.getMyBetsFirstSubheadingText(), betData.getMeetingName());
        String[] marketPriceText = myBetsPage.getMyBetsFirstMarketPriceText().split(" @ ");
        softAssert.assertTrue(Pattern.matches(BOUGHT_SOLD_PATTERN, marketPriceText[0]),
                "MyBets First Market Price Text is NOT equal to BOUGHT_SOLD_PATTERN");
        softAssert.assertEquals(marketPriceText[1], betData.getMeetingLabel().split(" ")[1]);
        softAssert.assertEquals(myBetsPage.getMyBetsFirstCurrentlyText(), "Currently");
        softAssert.assertEquals(myBetsPage.getMyBetsFirstHeadingText(), betData.getMeetingDetails());
        softAssert.assertTrue(myBetsPage.isMyBetsFirstCurrentlyValueDisplayed(),
                "MyBets First Currently Value NOT Displayed");
        softAssert.assertTrue(myBetsPage.isMyBetsFirstCashOutButtonDisplayed(),
                "MyBets First Cash out Button NOT Displayed");
        softAssert.assertEquals(myBetsPage.getMyBetsFirstCashOutButtonText(), "CASH OUT");
        //TODO
        // softAssert.assertEquals(myBetsPage.getMyBetsFirstCashOutButtonValue(), "£" + betData.getAmount());

        myBetsPage.clickOnMyBetsFirstItem();
        String[] currentSpreadText = myBetsPage.getMyBetsFirstItemCurrentSpreadText().split(": ");
        softAssert.assertEquals(currentSpreadText[0], "Current spread");
        softAssert.assertTrue(Pattern.matches(SPREAD_PATTERN, currentSpreadText[1]),
                "MyBets First Item Current Spread Text is NOT equal to SPREAD_PATTERN");
        String[] betValue = myBetsPage.getMyBetsFirstItemBetValue().split(": ");
        softAssert.assertEquals(betValue[0], "Bet value");
        softAssert.assertTrue(Pattern.matches(BET_VALUE_MONEY_PATTERN, betValue[1]),
                "MyBets First Item Bet Value is NOT equal to BET_VALUE_MONEY_PATTERN");
        softAssert.assertTrue(myBetsPage.isMyBetsFirstItemBetReferenceDisplayed(),
                "MyBets First Item Bet Reference NOT Displayed");
        softAssert.assertTrue(myBetsPage.isMyBetsFirstItemBetReferenceDateDisplayed(),
                "MyBets First Item Bet Reference Date NOT Displayed");
        softAssert.assertEquals(myBetsPage.getMyBetsFirstItemYourCashoutText(), "Your Cashout stake");
        softAssert.assertEquals(myBetsPage.getMyBetsFirstItemYourCashoutValue(), "£ " + betData.getAmount());
        softAssert.assertTrue(myBetsPage.isMyBetsFirstItemYourCashoutFormSliderDisplayed(),
                "MyBets First Item Your Cash out Form Slider NOT Displayed");
        softAssert.assertAll();
    }
}