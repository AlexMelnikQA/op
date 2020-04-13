package Tests.MainMenu;

import Pages.Home.HomePage;
import Pages.Menus.MainMenu;
import Pages.Popups.BottomPopupDialog;
import Pages.Screens.PromotionsActiveScreen;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Utils.Constants.BUY_SELL_PATTERN;
import static Utils.Constants.TEMPORARY_MONEY_PATTERN_FOR_PROMO;


public class PromotionsActiveTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private PromotionsActiveScreen promotionsActiveScreen;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        promotionsActiveScreen = new PromotionsActiveScreen(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
    }

    @Test
    public void checkActivePromotions() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);

        homePage.clickOnMainMenuLink();
        mainMenu.clickOnPromotionLink();
        mainMenu.clickOnPromotionsSubLinkPromotions();
        promotionsActiveScreen.waitUntilFirstPromotionVisible();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(promotionsActiveScreen.getFirstPromotionNameText(), "nu 1 year opinov8");
        softAssert.assertTrue(promotionsActiveScreen.isForfeitButtonIsDisplayed());

        softAssert.assertEquals(promotionsActiveScreen.getFirstPromotionDescriptionText(),
                "100% profit boost on net wins (Max: £1000).  Bets can be on any market. The profit boost " +
                        "is paid upon hitting the maximum profit boost amount on the net wins of all settled bets. " +
                        "Fully, partially or reverse closed bets will not be counted.");

        String[] promoDescription = promotionsActiveScreen.getFirstPromotionSummaryDescriptionText().split(":");
        softAssert.assertEquals(promoDescription[0], "Potential profit boost so far");
        softAssert.assertTrue(promoDescription[1].matches(TEMPORARY_MONEY_PATTERN_FOR_PROMO),
                "Money value doesn't match the pattern");

        softAssert.assertEquals(promotionsActiveScreen.getFirstPromotionStartDayLabelText(), "Start offer date: ");
        softAssert.assertEquals(promotionsActiveScreen.getFirstPromotionStartDayText(), " 14:54 on 20.09.2019");

        softAssert.assertEquals(promotionsActiveScreen.getForfeitButtonText(), "Forfeit promotion");
        softAssert.assertTrue(promotionsActiveScreen.isPromotionSubItemNotDisplayed(), "Sub item is not Displayed");

        promotionsActiveScreen.clickExpandArrow();
        promotionsActiveScreen.waitUntilLabelBecomesVisible();
        softAssert.assertTrue(promotionsActiveScreen.isPromotionBetMarketLabelDisplayed());
        softAssert.assertTrue(promotionsActiveScreen.directionTypeCheck().matches(BUY_SELL_PATTERN));
        softAssert.assertTrue(promotionsActiveScreen.getPromotionBetProfit().matches(TEMPORARY_MONEY_PATTERN_FOR_PROMO),
                "Profit value doesn't match the pattern");
        softAssert.assertTrue(promotionsActiveScreen.getPromotionBetStake().matches(TEMPORARY_MONEY_PATTERN_FOR_PROMO),
                "Stake value doesn't match the pattern");

        promotionsActiveScreen.clickExpandArrow();
        Waiters.waitShort();
        softAssert.assertTrue(promotionsActiveScreen.isPromotionSubItemNotDisplayed(), "Sub item is Displayed");

        softAssert.assertAll();
    }
}