package Tests.BottomTabInPlay;

import DTO.InPlayFilters.InPlayFiltersName;
import Pages.Home.HomePage;
import Pages.InPlay.InPlayPage;
import Pages.Menus.BottomMenu;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import static Utils.Constants.DATA_PATTERN;
import static Utils.RestClient.getInPlayFilters;
import static org.testng.Assert.assertTrue;


public class InPlayTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private InPlayPage inPlayPage;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        inPlayPage = new InPlayPage(driver);
    }

    @Test
    public void checkInPlayPageElements() throws IOException {
        final String YEAR = ".2020";
        List<InPlayFiltersName> filterList =
                getInPlayFilters().getData().getMeetingsBySport().get(0).getVal().getUpNext();
        int filterListSize = filterList.size();

        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_InPlay();
        inPlayPage.waitFirstSportBecomesVisible();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(inPlayPage.isInPlayScreenDisplayed());
        softAssert.assertTrue(bottomMenu.isActiveBottomMenu_InPlayDisplayed());

        softAssert.assertEquals(inPlayPage.getInPlayTodayFilterText(), "TODAY");
        if (filterListSize > 1) {
            softAssert.assertEquals(inPlayPage.getInPlayTomorrowFilterText(), "TOMORROW");
        }

        if (filterListSize > 2) {
            softAssert.assertEquals(inPlayPage.getInPlayOneDayMoreFilterText() + YEAR,
                    filterList.get(2).getName().split(" ")[1].replace("/", "."));
        }

        if (filterListSize > 3) {
            softAssert.assertEquals(inPlayPage.getInPlayTwoDayMoreFilterText() + YEAR,
                    filterList.get(3).getName().split(" ")[1].replace("/", "."));
        }

        if (filterListSize > 4) {
            softAssert.assertEquals(inPlayPage.getInPlayThreeDayMoreFilterText() + YEAR,
                    filterList.get(4).getName().split(" ")[1].replace("/", "."));
        }

        softAssert.assertEquals(inPlayPage.getChooseSportButtonText(), "Choose Sport");
        softAssert.assertEquals(inPlayPage.getFirstSportTimeText(), "Live");
        softAssert.assertTrue(inPlayPage.isFirstSportIconDisplayed());
        softAssert.assertTrue(inPlayPage.isFirstSportNameDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void checkInPlayTabFilters() throws IOException {
        int filterListSize =
                getInPlayFilters().getData().getMeetingsBySport().get(0).getVal().getUpNext().size();

        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_InPlay();
        inPlayPage.waitFirstSportBecomesVisible();
        String firstSportName = inPlayPage.getFirstSportNameText();
        assertTrue(firstSportName != null && firstSportName.length() != 0);

        if (filterListSize > 1) {
            inPlayPage.clickInPlayTomorrowFilter();
            checkFilterData();
        }

        if (filterListSize > 2) {
            inPlayPage.clickInPlayOneDayMoreFilter();
            checkFilterData();
        }

        if (filterListSize > 3) {
            inPlayPage.clickInPlayTwoDayMoreFilter();
            checkFilterData();
        }

        if (filterListSize > 4) {
            inPlayPage.clickInPlayThreeDayMoreFilter();
            checkFilterData();
        }
    }

    private void checkFilterData() {
        inPlayPage.waitFirstSportTimeBecomesVisible();
        inPlayPage.waitFirstSportBecomesVisible();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Pattern.matches(DATA_PATTERN, inPlayPage.getFirstSportTimeText()),
                "First Sport Time Text is incorrect");
        softAssert.assertTrue(inPlayPage.isFirstSportIconDisplayed(),
                "First Sport Icon NOT Displayed");
        softAssert.assertTrue(inPlayPage.isFirstSportNameDisplayed(),
                "First Sport Name NOT Displayed");
        softAssert.assertAll();
    }
}