package Tests.BottomTabHome;

import Pages.Home.HomePage;
import Pages.Home.HighlightsTab.HighlightsTab;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HighlightsTabTest extends TestBase {

    private HomePage homePage;
    private HighlightsTab highlightsTab;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        highlightsTab = new HighlightsTab(driver);
    }

    @Test
    public void checkFirstHighlightsMatchAndMeeting() {
        homePage.waitUntilLoginButtonIsVisible();
        homePage.clickOnHighlightsTab();
        homePage.waitUntilHighlightsTabIsVisible();
        highlightsTab.clickOnFirstSportSection();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(highlightsTab.isFirstSportSectionDisplayed());
        softAssert.assertTrue(highlightsTab.isFirstMeetingDescriptionNotDisplayed());
        softAssert.assertTrue(highlightsTab.isFirstMeetingDateNotDisplayed());

        highlightsTab.clickOnFirstSportSection();
        softAssert.assertTrue(highlightsTab.isFirstSportSectionDisplayed());
        softAssert.assertTrue(highlightsTab.isFirstMeetingDescriptionDisplayed());
        softAssert.assertTrue(highlightsTab.isFirstMeetingDateDisplayed());
        softAssert.assertAll();
    }
}