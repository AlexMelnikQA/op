package Tests.BottomTabFavourites;

import Pages.Favourites.FavouritesPage;
import Pages.Filters.CustomFilterPage;
import Pages.Filters.FilterPage;
import Pages.Menus.BottomMenu;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class FavoritesTest extends TestBase {

    private BottomMenu bottomMenu;
    private FavouritesPage favouritesPage;
    private FilterPage filterPage;
    private CustomFilterPage customFilterPage;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest
    public void setUpPage() {
        bottomMenu = new BottomMenu(driver);
        favouritesPage = new FavouritesPage(driver);
        filterPage = new FilterPage(driver);
        customFilterPage = new CustomFilterPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
    }

    @Test
    public void checkFavoritesScreenForNotLoggedUser() throws InterruptedException {
        Waiters.waitShort();
        bottomMenu.clickOnBottomMenu_Favourites();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bottomMenu.isActiveBottomMenu_FavouritesDisplayed());
        softAssert.assertTrue(favouritesPage.isFavouritesScreenDisplayed());
        softAssert.assertEquals(favouritesPage.getFavouritesScreenText(), "Favourites");
        softAssert.assertEquals(favouritesPage.getFavouritesNotLoggedUserText(),
                "You are unable to see your favourites until log in. Please log in to view");
        softAssert.assertAll();
    }

    @Test
    public void checkFavoritesScreenForLoggedUser() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
        bottomMenu.clickOnBottomMenu_Favourites();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(favouritesPage.getFavouritesFirstGroupText(), "QUICK FILTERS");
        softAssert.assertEquals(favouritesPage.getFavouritesFirstGroupFirstItemName(), "my favourite filter 1");
        softAssert.assertTrue(favouritesPage.isFavouritesFirstGroupFirstItemIconDisplayed());
        softAssert.assertTrue(favouritesPage.isFavouritesFirstGroupFirstItemStarDisplayed());

        softAssert.assertEquals(favouritesPage.getFavouritesSecondGroupText(), "SPREADS");
        softAssert.assertEquals(favouritesPage.getFavouritesSecondGroupFirstItemName(), "Boxing");
        softAssert.assertTrue(favouritesPage.isFavouritesSecondGroupFirstItemIconDisplayed());
        softAssert.assertTrue(favouritesPage.isFavouritesSecondGroupFirstItemStarDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void checkEditFavoritesForLoggedUser() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
        bottomMenu.clickOnBottomMenu_Favourites();
        final String favouritesName = favouritesPage.getFavouritesFirstGroupFirstItemName();
        favouritesPage.clickOnFavouritesFirstGroupFirstItemName();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(customFilterPage.isFilterScreenBackToFavouriteDisplayed(),
                "BackToFavourite button is NOT Displayed");
        softAssert.assertEquals("Favourite", customFilterPage.getFilterTitleText());
        softAssert.assertEquals(favouritesName, customFilterPage.getFilterNameText());
        customFilterPage.waitUntilintFilterSportSectionVisible();
        softAssert.assertTrue(customFilterPage.isFilterSportSectionDisplayed(),
                "Sport Section is NOT Displayed");
        softAssert.assertTrue(customFilterPage.isFilterFirstSportNameDisplayed(),
                "First Sport Name is NOT Displayed");
        softAssert.assertTrue(customFilterPage.isFilterFirstSportSellButtonDisplayed(),
                "First Sport Sell Button is NOT Displayed");
        softAssert.assertTrue(customFilterPage.isFilterFirstSportBuyButtonDisplayed(),
                "First Sport Buy Button is NOT Displayed");
        softAssert.assertTrue(customFilterPage.isFilterFirstMeetingNameDisplayed(),
                "First Meeting Name is NOT Displayed");
        softAssert.assertTrue(customFilterPage.isFilterFirstMeetingSellButtonDisplayed(),
                "First Meeting Sell Button is NOT Displayed");
        softAssert.assertTrue(customFilterPage.isFilterFirstMeetingBuyButtonDisplayed(),
                "First Meeting Buy Button is NOT Displayed");

        customFilterPage.clickOnFilterScreenTitleEditLink();
        filterPage.clickOnSecondMarketTypesCheckbox();
        filterPage.scrollToFilterScreenApplyButton();//AddToFavouritesButton();
        filterPage.clickOnFilterScreenApplyButton();//AddToFavouritesButton();
        bottomPopupDialog.fillBottomPopupAddToFavouritesInputField(favouritesName);
        bottomPopupDialog.clickSaveButton();
        Waiters.waitShort();
        softAssert.assertEquals("You sure you want to overwrite your existing favourite " +
                favouritesName, bottomPopupDialog.getBottomPopupTitle());
        bottomPopupDialog.clickOnClosePopupButton();

        softAssert.assertAll();
    }
}