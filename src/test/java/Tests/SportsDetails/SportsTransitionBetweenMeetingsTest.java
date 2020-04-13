package Tests.SportsDetails;

import Pages.Home.HomePageLiveTab;
import Pages.SportsDetails.SportsSubHeader;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SportsTransitionBetweenMeetingsTest extends TestBase {
    private HomePageLiveTab homePageLiveTab;
    private SportsSubHeader sportsSubHeader;

    @BeforeTest
    public void setUpPage() {
        homePageLiveTab = new HomePageLiveTab(driver);
        sportsSubHeader = new SportsSubHeader(driver);
    }

    @Test
    public void checkTransitionBetweenMeetingsUser() {
        SoftAssert softAssert = new SoftAssert();
        homePageLiveTab.waitFistSportBecomesVisible();
        String marketNameFirstMeeting = homePageLiveTab.getFirstMeetingFirstSportNameText().toUpperCase().replace("/", " V ");
        String marketNameSecondMeeting;

        if (homePageLiveTab.isSecondMarketSportFirstNotDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstItem();
            softAssert.assertEquals(sportsSubHeader.getSportSubheaderMatchName(), marketNameFirstMeeting);
            softAssert.assertTrue(sportsSubHeader.isSportMatchArrowLeftNotDisplayed());
            softAssert.assertTrue(sportsSubHeader.isSportMatchArrowRightNotDisplayed());
        } else {
            marketNameSecondMeeting = homePageLiveTab.getSecondMeetingFirstSportNameText().toUpperCase().replace("/", " V ");
            homePageLiveTab.clickOnFirstMarketSportFirstItem();
            softAssert.assertEquals(sportsSubHeader.getSportSubheaderMatchName(), marketNameFirstMeeting);
            sportsSubHeader.clickOnSportMatchArrowRightButton();
            softAssert.assertEquals(sportsSubHeader.getSportSubheaderMatchName(), marketNameSecondMeeting);
            sportsSubHeader.clickOnSportMatchArrowLeftButton();
            softAssert.assertEquals(sportsSubHeader.getSportSubheaderMatchName(), marketNameFirstMeeting);
        }
        softAssert.assertAll();
    }
}