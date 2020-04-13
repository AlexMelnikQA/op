package Tests.SportsDetails;

import DTO.Sports.SportData;
import Pages.AZSportsPage;
import Pages.Home.HomeHeaderSports;
import Pages.Home.HomePage;
import Pages.MatchPage;
import Pages.Menus.BottomMenu;
import Pages.SportsDetails.SportsBinaries;
import Pages.SportsDetails.SportsHeader;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static Utils.Constants.HORSE_RACING;
import static Utils.RestClient.getAllDataBySportName;
import static Utils.RestClient.getListOfAllActualSports;

public class SportsBinariesTest extends TestBase {
    private HomePage homePage;
    private HomeHeaderSports homeHeaderSports;
    private BottomMenu bottomMenu;
    private SportsHeader sportsHeader;
    private AZSportsPage azSportsPage;
    private SportsBinaries sportsBinaries;
    private MatchPage sportsMatches;
    private Logger logger;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        homeHeaderSports = new HomeHeaderSports(driver);
        sportsHeader = new SportsHeader(driver);
        azSportsPage = new AZSportsPage(driver);
        sportsBinaries = new SportsBinaries(driver);
        sportsMatches = new MatchPage(driver);
        logger = Logger.getLogger(SportsInPlayTabTest.class.getName());
    }

    @Test
    public void checkBinariesOnSportsScreenFromAZSportPage() throws InterruptedException, IOException {
        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        final String sportName = azSportsPage.getSport1Name();
        azSportsPage.clickOnSport1Link();

        if (binariesTabExistForSport(sportName)) {
            sportsHeader.clickOnSportDetailsBinariesButton();
            Waiters.waitShort();
            checkMarketData(sportsBinaries.getBinariesSportTitle());
            logger.info(sportName + " Sport Link checked");
        } else logger.info("Binaries Tab is Empty for Sport from AZ " + sportName);
    }

    @Test
    public void checkBinariesOnSportsScreen() throws IOException, InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        final List<String> sports = new ArrayList<>();
        getListOfAllActualSports().getData().getItems().stream().limit(5).forEach(f -> sports.add(f.getTitle()));

        String sportName = sports.get(0);
        if (binariesTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFirstTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsBinariesButton();
                checkMarketData(sportName);
                logger.info(sportName + " 1 - Sport Link checked");
            }
        } else logger.info("1 - Binaries Tab is Empty for Sport " + sportName);

        sportName = sports.get(1);
        if (binariesTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnSecondTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsBinariesButton();
                checkMarketData(sportName);
                logger.info(sportName + " 2 - Sport Link checked");
            }
        } else logger.info("2 - Binaries Tab is Empty for Sport " + sportName);

        sportName = sports.get(2);
        if (binariesTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnThirdTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsBinariesButton();
                checkMarketData(sportName);
                logger.info(sportName + " 3 - Sport Link checked");
            }
        } else logger.info("3 - Binaries Tab is Empty for Sport " + sportName);

        sportName = sports.get(3);
        if (binariesTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFourthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsBinariesButton();
                checkMarketData(sportName);
                logger.info(sportName + " 4 - Sport Link checked");
            }
        } else logger.info("4 - Binaries Tab is Empty for Sport " + sportName);

        sportName = sports.get(4);
        if (binariesTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFifthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsBinariesButton();
                checkMarketData(sportName);
                logger.info(sportName + " 5 - Sport Link checked");
            }
        } else logger.info("5 - Binaries Tab is Empty for Sport " + sportName);
    }

    private void checkMarketData(String sportName) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        Waiters.waitMiddle();

        sportsBinaries.clickOnFirstMeetingInBinaries();
        softAssert.assertEquals(sportsMatches.getSportTitleText(), sportName);

        softAssert.assertTrue(sportsMatches.isFirstMarketNameDisplayed());
        softAssert.assertEquals("Main", sportsMatches.getMarketContainerName(), "Market Container Name is Incorrect");

        if (sportsMatches.isFirstMarketSuspendedNotPresent()) {
            softAssert.assertTrue(sportsMatches.isFirstMarketSellButtonDisplayed());
            softAssert.assertTrue(sportsMatches.isFirstMarketBuyButtonDisplayed());
        }
        bottomMenu.clickOnHomeLink();
        softAssert.assertAll();
    }

    protected static boolean binariesTabExistForSport(String sportName) throws IOException {
        boolean result = false;
        final String sportId = getListOfAllActualSports().getData().getItems().stream().
                filter(f -> f.getTitle().equals(sportName)).findFirst().get().getUrl().replace("/cats/", "");
        final SportData data = getAllDataBySportName(sportId).getData();

        if (data.getBinaries() != null) {
            result = true;
        }
        return result;
    }
}