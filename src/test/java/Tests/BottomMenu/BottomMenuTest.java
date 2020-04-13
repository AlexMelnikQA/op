package Tests.BottomMenu;

import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class BottomMenuTest extends TestBase {

    private BottomMenu bottomMenu;
    private HomePage homePage;

    @BeforeTest
    public void setUpPage() {
        bottomMenu = new BottomMenu(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void checkBottomMenu() {
        homePage.waitUntilMainMenuLinkIsVisible();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bottomMenu.isBottomMenu_HomeLinkDisplayed());
        bottomMenu.clickOnHomeLink();
        softAssert.assertTrue(bottomMenu.isActiveHomeLinkDisplayed());
        softAssert.assertTrue(bottomMenu.isBottomMenu_InPlayDisplayed());
        softAssert.assertTrue(bottomMenu.isBottomMenu_AZSportsDisplayed());
        softAssert.assertTrue(bottomMenu.isBottomMenu_FavouritesDisplayed());
        softAssert.assertTrue(bottomMenu.isBottomMenu_MyBetsDisplayed());
        softAssert.assertAll();
    }
}