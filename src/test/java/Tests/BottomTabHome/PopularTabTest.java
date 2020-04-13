package Tests.BottomTabHome;

import Pages.Home.HomePage;
import Pages.Home.HomePagePopularTab;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class PopularTabTest extends TestBase {

    private HomePage homePage;
    private HomePagePopularTab homePagePopularTab;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        homePagePopularTab = new HomePagePopularTab(driver);
    }

    @Test
    public void checkPopularTabFilters() throws InterruptedException {
        homePage.waitUntilLoginButtonIsVisible();
        homePage.clickOnPopularTab();
        Waiters.waitShort();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePagePopularTab.isFilterAllDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFilterFirstDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFilterSecondDisplayed());
        softAssert.assertAll();

        homePagePopularTab.clickOnFilterFirst();
        Assert.assertEquals(actualFirstSportSectionName(), homePagePopularTab.getFilterFirstText());

        homePagePopularTab.clickOnFilterSecond();
        homePagePopularTab.clickOnFilterFirst();
        Waiters.waitShort();
        Assert.assertEquals(actualFirstSportSectionName(), homePagePopularTab.getFilterSecondText());
    }

    @Test
    public void checkFirstPopularMatchAndMeeting() throws InterruptedException {
        homePage.waitUntilLoginButtonIsVisible();
        homePage.clickOnPopularTab();
        Waiters.waitLong();
        homePagePopularTab.clickOnFirstSportSection();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePagePopularTab.isFirstSportSectionDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMeetingNameNotDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMarketDescriptionNotDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMarketResultsNotDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMarketSellButtonNotDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMarketBuyButtonNotDisplayed());
        softAssert.assertAll();

        homePagePopularTab.clickOnFirstSportSection();
        softAssert.assertTrue(homePagePopularTab.isFirstSportSectionDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMeetingNameDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMarketDescriptionDisplayed());
        softAssert.assertTrue(homePagePopularTab.isFirstMarketResultsDisplayed());
        if (homePagePopularTab.isFirstMarketSuspendedNotDisplayed()) {
            softAssert.assertTrue(homePagePopularTab.isFirstMarketSellButtonDisplayed());
            softAssert.assertTrue(homePagePopularTab.isFirstMarketBuyButtonDisplayed());
        }
        softAssert.assertAll();
    }

    private String actualFirstSportSectionName() {
        return homePagePopularTab.getFirstSportSectionText().split(" \\(", 0)[0];
    }
}