package Tests.BottomTabHome;

import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LiveTabTest extends TestBase {

    private HomePage homePage;
    private HomePageLiveTab homePageLiveTab;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
    }

    @Test
    public void checkFirstLiveMatchAndMeeting() throws InterruptedException {
        homePageLiveTab.waitFistSportBecomesVisible();
        SoftAssert softAssert = new SoftAssert();

        if (homePageLiveTab.isLiveTabNotDisplayed()) {
            homePage.clickOnLiveTab();
            Waiters.waitShort();
            softAssert.assertTrue(homePageLiveTab.isLiveTabNotHaveLiveMatchesDisplayed());
            softAssert.assertEquals(homePageLiveTab.getLiveTabNoHaveLiveMatchesText(),
                    "There are currently no live matches in-play. Check again soon to see available in-play matches.");
        } else {
            homePageLiveTab.clickOnFirstSportLine();
            homePage.waitUntilLiveTabIsVisible();

            softAssert.assertTrue(homePageLiveTab.isFirstMeetingSportFirstNotDisplayed());
            softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstDescriptionNotDisplayed());
            softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstResultNotDisplayed());
            softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstBuyNotDisplayed());
            softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstSellNotDisplayed());
            softAssert.assertAll();

            homePageLiveTab.clickOnFirstSportLine();
            softAssert.assertTrue(homePageLiveTab.isFirstMeetingSportFirstDisplayed());
            softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstDescriptionDisplayed());
            softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstResultDisplayed());
            if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
                softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstBuyDisplayed());
                softAssert.assertTrue(homePageLiveTab.isFirstMarketSportFirstSellDisplayed());
            }
            softAssert.assertAll();
        }
    }
}