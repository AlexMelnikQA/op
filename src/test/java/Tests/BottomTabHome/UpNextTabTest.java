package Tests.BottomTabHome;

import Pages.Home.HomePage;
import Pages.Home.UpNextTab.UpNextTab;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class UpNextTabTest extends TestBase {

    private HomePage homePage;
    private UpNextTab upNextTab;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        upNextTab = new UpNextTab(driver);
    }

    @Test
    public void checkUpNextTabFilters() {
        homePage.waitUntilLoginButtonIsVisible();
        homePage.clickOnUpNextTab();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(upNextTab.isFiltertLaterTodayDisplayed());
        softAssert.assertEquals("LATER TODAY", upNextTab.getFiltertLaterTodayText());
        softAssert.assertTrue(upNextTab.isFiltertTomorrowDisplayed());
        softAssert.assertEquals("TOMORROW", upNextTab.getFiltertTomorrowText());
        softAssert.assertAll();
    }

    @Test
    public void checkFirstUpNextMatchAndMeeting() throws InterruptedException {
        homePage.waitUntilLoginButtonIsVisible();
        homePage.clickOnUpNextTab();
        Waiters.waitShort();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(upNextTab.isFirstMeetingDisplayed());
        softAssert.assertTrue(upNextTab.isFirstMeetingTimeDisplayed());
        softAssert.assertTrue(upNextTab.isFirstMeetingIconDisplayed());
        softAssert.assertTrue(upNextTab.isFirstMeetingNameDisplayed());
        softAssert.assertAll();
    }
}