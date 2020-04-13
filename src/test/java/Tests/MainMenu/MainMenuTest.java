package Tests.MainMenu;

import Pages.Home.HomePage;
import Pages.LoginPage;
import Pages.Menus.BottomMenu;
import Pages.Menus.MainMenu;
import Pages.Popups.AuthenticateDialog;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MainMenuTest extends TestBase {

    private HomePage homePage;
    private LoginPage loginPage;
    private MainMenu mainMenu;
    private BottomMenu bottomMenu;
    private AuthenticateDialog authenticateDialog;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        mainMenu = new MainMenu(driver);
        bottomMenu = new BottomMenu(driver);
        authenticateDialog = new AuthenticateDialog(driver);
    }

    @Test
    public void mainMenuForNotLoggedUser() {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainMenu.isHomeLinkDisplayed());
        softAssert.assertTrue(mainMenu.isPromotionsLinkDisplayed());
        softAssert.assertTrue(mainMenu.isResponsibleGamblingLinkDisplayed());
        mainMenu.clickOnResponsibleGamblingLink();
        softAssert.assertTrue(mainMenu.isResponsibleGamblingControlLinkDisplayed());
        mainMenu.clickOnResponsibleGamblingLink();
        softAssert.assertTrue(mainMenu.isHelpAndSupportLinkDisplayed());
        softAssert.assertTrue(mainMenu.isLoginLinkNotDisplayed());
        softAssert.assertTrue(mainMenu.isLogoutLinkNotDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void mainMenuForLoggedUser() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        login(ADMIN_LOGIN, ADMIN_PASSWORD);
        homePage.clickOnMainMenuLink();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainMenu.isHomeLinkDisplayed());
        softAssert.assertTrue(mainMenu.isAccountDetailsLinkDisplayed());
        softAssert.assertTrue(mainMenu.isPromotionsLinkDisplayed());
        softAssert.assertTrue(mainMenu.isResponsibleGamblingLinkDisplayed());
        softAssert.assertTrue(mainMenu.isHelpAndSupportLinkDisplayed());
        softAssert.assertTrue(mainMenu.isLoginLinkNotDisplayed());
        softAssert.assertTrue(mainMenu.isLogoutLinkDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void checkPromotionLinksExist() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        Waiters.waitShort();
        mainMenu.clickOnPromotionLink();
        Waiters.waitShort();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainMenu.isPromotionsSubLinkPromotionsDisplayed());
        softAssert.assertTrue(mainMenu.isPromotionsSubLinkReferAndEarnDisplayed());
        softAssert.assertAll();
    }
}