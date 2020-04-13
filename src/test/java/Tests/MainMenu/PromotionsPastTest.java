package Tests.MainMenu;

import Pages.Home.HomePage;
import Pages.Menus.MainMenu;
import Pages.Popups.BottomPopupDialog;
import Pages.Screens.PromotionsPastScreen;
import Pages.Screens.PromotionsScreen;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class PromotionsPastTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private PromotionsScreen promotionsScreen;
    private PromotionsPastScreen promotionsPastScreen;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        promotionsScreen = new PromotionsScreen(driver);
        promotionsPastScreen = new PromotionsPastScreen(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
    }

    @Test
    public void checkPastPromotions() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);

        homePage.clickOnMainMenuLink();
        mainMenu.clickOnPromotionLink();
        mainMenu.clickOnPromotionsSubLinkPromotions();
        promotionsScreen.clickOnPastTab();
        promotionsPastScreen.waitUntilFirstPromotionNameIsVisible();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionNameText(), "new opinov8 1  year");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionDescriptionText(), "100% profit boost on net wins (Max: £100).");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionSummaryDescriptionText(), "Completed");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionExpandText(), "Show details");
        softAssert.assertTrue(promotionsPastScreen.isFirstPromotionExpandArrowDisplayed(),
                "Expand Arrow is NOT Displayed");
        softAssert.assertTrue(promotionsPastScreen.isFirstPromotionSubItemNotDisplayed(), "Sub item is Displayed");

        promotionsPastScreen.clickOnFirstPromotionExpandArrow();
        promotionsPastScreen.waitUntilFirstPromotionSubItemVisible();

        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionMarketLabelText(), "Market");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionMarketText(), "Tuesday LIVE Aggregates (6)");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionMarketCategoryText(), "Homes/Aways");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionMarketDirectionLabelText(), "Direction");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionMarketDirectionTypeText(), "Sell");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionMarketStakeLabelText(), "Stake");
        softAssert.assertEquals(promotionsPastScreen.getFirstPromotionMarketStakeTypeText(), "£0.01");

        promotionsPastScreen.clickOnFirstPromotionExpandArrow();
        Waiters.waitShort();
        softAssert.assertTrue(promotionsPastScreen.isFirstPromotionSubItemNotDisplayed(), "Sub item is Displayed");
        softAssert.assertAll();
    }
}