package Tests.BottomTabHome;

import Pages.Home.HomeHeaderSports;
import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.Menus.BottomMenu;
import Pages.Screens.HomeScreen;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.scrollUp;


public class BarTabsTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private HomeScreen homeScreen;
    private HomePageLiveTab homePageLiveTab;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        homeScreen = new HomeScreen(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
    }

    @Test
    public void checkBarTabs() {
        homePage.waitUntilLoginButtonIsVisible();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homeScreen.isHomeScreenDisplayed());
        softAssert.assertTrue(bottomMenu.isBottomMenu_HomeLinkDisplayed());
        bottomMenu.clickOnHomeLink();
        softAssert.assertTrue(bottomMenu.isActiveHomeLinkDisplayed());
        softAssert.assertTrue(homePage.isLiveTabDisplayed());
        softAssert.assertTrue(homePage.isPopularTabDisplayed());
        softAssert.assertTrue(homePage.isHighlightsTabDisplayed());
        softAssert.assertTrue(homePage.isUpNextTabDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void checkHomeScreenFooter() {
        homePage.waitUntilLoginButtonIsVisible();
        homePageLiveTab.waitFistSportBecomesVisible();
        scrollUp();
        scrollUp();
        scrollUp();
        scrollUp();
        scrollUp();
        scrollUp();
        scrollUp();
        Assert.assertEquals(homeScreen.getFirstFooterText(), "In relation to spread betting Sporting Index Ltd is " +
                "authorised and regulated in the UK by the Financial Conduct Authority registration number 150404 which " +
                "can be verified here. In relation to fixed-odds betting Sporting Index Ltd is licensed and regulated " +
                "in Great Britain by the Gambling Commission under licence number 27343 which can be verified here. " +
                "Remember to bet responsibly. In relation to territories other than the UK and Republic of Ireland, " +
                "please read our disclaimer.");
        Assert.assertEquals(homeScreen.getSecondFooterText(), "When you use our Mobile Apps we and third parties " +
                "may record unique identifiers associated with your device (such as the device ID, advertising identifiers, " +
                "or IP address), your activity within the App and your network location. This information may be used " +
                "to analyse and improve our services, learn how you use our Mobile Apps, and to serve advertising to you.");
    }
}