package Tests.LoginLogOut;

import Pages.Home.HomePage;
import Pages.Menus.MainMenu;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LogoutTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);

    }

    @Test
    public void logoutFlow() throws InterruptedException {
        login(ADMIN_LOGIN, ADMIN_PASSWORD);
        homePage.clickOnMainMenuLink();

        mainMenu.clickOnLogoutLink();
        Waiters.waitShort();
        bottomPopupDialog.clickStayInAppButton();
        Waiters.waitShort();

        homePage.clickOnMainMenuLink();
        Assert.assertTrue(mainMenu.isLoginLinkNotDisplayed());
        Assert.assertTrue(mainMenu.isLogoutLinkDisplayed());

        mainMenu.clickOnLogoutLink();
        Waiters.waitShort();
        bottomPopupDialog.clickLogoutButton();
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        Assert.assertTrue(mainMenu.isLogoutLinkNotDisplayed());
    }
}