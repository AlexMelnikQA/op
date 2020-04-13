package Tests.SportsDetails;

import DTO.ListOfSports.SportsDto;
import DTO.Sports.TotalsMeetingsData;
import Pages.AZSportsPage;
import Pages.Home.HomeHeaderSports;
import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Pages.SportsDetails.SportsHeader;
import Pages.SportsDetails.SportsTotals;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.logging.Logger;

import static Utils.Constants.HORSE_RACING;
import static Utils.RestClient.getAllDataBySportName;
import static Utils.RestClient.getListOfAllActualSports;


public class SportsTotalsTabTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private HomeHeaderSports homeHeaderSports;
    private SportsHeader sportsHeader;
    private SportsTotals sportsTotals;
    private AZSportsPage azSportsPage;
    private Logger logger;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        homeHeaderSports = new HomeHeaderSports(driver);
        sportsHeader = new SportsHeader(driver);
        sportsTotals = new SportsTotals(driver);
        azSportsPage = new AZSportsPage(driver);
        logger = Logger.getLogger(SportsTotalsTabTest.class.getName());
    }

    @Test
    public void checkTotalsTabOnSportsScreen() throws InterruptedException, IOException {
        SportsDto sports = getListOfAllActualSports();
        homePage.waitUntilMainMenuLinkIsVisible();

        String sportName = sports.getData().getItems().get(0).getTitle();
        if (totalsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFirstTopMenuLink();
                checkTotalsTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("1 - Totals Tab is Empty for Sport " + sportName);


        sportName = sports.getData().getItems().get(1).getTitle();
        if (totalsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnSecondTopMenuLink();
                checkTotalsTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("2 - Totals Tab is Empty for Sport " + sportName);


        sportName = sports.getData().getItems().get(2).getTitle();
        if (totalsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnThirdTopMenuLink();
                checkTotalsTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("3 - Totals Tab is Empty for Sport " + sportName);


        sportName = sports.getData().getItems().get(3).getTitle();
        if (totalsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFourthTopMenuLink();
                checkTotalsTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("4 - Totals Tab is Empty for Sport " + sportName);


        sportName = sports.getData().getItems().get(4).getTitle();
        if (totalsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFifthTopMenuLink();
                checkTotalsTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("5 - Totals Tab is Empty for Sport " + sportName);
    }

    @Test
    public void checkTotalsTabOnSportsScreenFromAZSportPage() throws InterruptedException, IOException {
        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        final String sportName = azSportsPage.getSport1Name();
        azSportsPage.clickOnSport1Link();

        if (totalsTabExistForSport(sportName)) {
            checkTotalsTabData();
            logger.info(getListOfAllActualSports().getData().getItems().get(0).getTitle() + " Sport checked");
        } else logger.info("Totals Tab is Empty for Sport from AZ " + sportName);
    }

    private void checkTotalsTabData() throws InterruptedException {
        Waiters.waitMiddle();
        sportsHeader.clickOnSportDetailsTotalsButton();
        SoftAssert softAssert = new SoftAssert();
        if (sportsTotals.isSportTotalsFirstMeetingNotDisplayed()) {
            Assert.assertTrue(sportsTotals.isSportTotalsNoCurrentMatchesDisplayed(),
                    "Sport Totals - No Current Matches element Not Displayed");
            Assert.assertEquals(sportsTotals.getSportTotalsNoCurrentMatchesText(),
                    "There are currently no Totals matches. Check again soon to see available Totals matches.");
        } else {
            softAssert.assertTrue(sportsTotals.isSportTotalsFirstMatchDisplayed(),
                    "Sport Totals Tab Firs Match Not Displayed");
            softAssert.assertTrue(sportsTotals.isSportTotalsFirstMeetingDisplayed(),
                    "Sport Totals Tab First Meeting Not Displayed");
        }
        softAssert.assertAll();
    }

    protected static boolean totalsTabExistForSport(String sportName) throws IOException {
        boolean result = false;
        final String sportId = getListOfAllActualSports().getData().getItems().stream().
                filter(f -> f.getTitle().equals(sportName)).findFirst().get().getUrl().replace("/cats/", "");
        final TotalsMeetingsData data = getAllDataBySportName(sportId).getData().getTotalsMeetings();

        if (data.getMeetingSubGroups().size() != 0) {
            result = true;
        }
        return result;
    }
}