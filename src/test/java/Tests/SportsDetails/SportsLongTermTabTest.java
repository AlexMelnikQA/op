package Tests.SportsDetails;

import DTO.Sports.LongTermMeetingsData;
import Pages.AZSportsPage;
import Pages.Home.HomeHeaderSports;
import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Pages.SportsDetails.SportsHeader;
import Pages.SportsDetails.SportsLongTerm;
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


public class SportsLongTermTabTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private HomeHeaderSports homeHeaderSports;
    private SportsHeader sportsHeader;
    private SportsLongTerm sportsLongTerm;
    private AZSportsPage azSportsPage;
    private Logger logger;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        homeHeaderSports = new HomeHeaderSports(driver);
        sportsHeader = new SportsHeader(driver);
        sportsLongTerm = new SportsLongTerm(driver);
        azSportsPage = new AZSportsPage(driver);
        logger = Logger.getLogger(SportsLongTermTabTest.class.getName());
    }

    @Test
    public void checkLongTermTabOnSportsScreen() throws InterruptedException, IOException {
        final List<String> sports = new ArrayList<>();
        getListOfAllActualSports().getData().getItems().stream().limit(5).forEach(f -> sports.add(f.getTitle()));

        String sportName = sports.get(0);
        if (longTermsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFirstTopMenuLink();
                checkLongTermTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("1 - Long Terms Tab is Empty for Sport " + sportName);

        sportName = sports.get(1);
        if (longTermsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnSecondTopMenuLink();
                checkLongTermTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("2 - Long Terms Tab is Empty for Sport " + sportName);

        sportName = sports.get(2);
        if (longTermsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnThirdTopMenuLink();
                checkLongTermTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("3 - Long Terms Tab is Empty for Sport " + sportName);

        sportName = sports.get(3);
        if (longTermsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFourthTopMenuLink();
                checkLongTermTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("4 - Long Terms Tab is Empty for Sport " + sportName);

        sportName = sports.get(4);
        if (longTermsTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFifthTopMenuLink();
                checkLongTermTabData();
                logger.info(sportName + " Sport Link checked");
                bottomMenu.clickOnHomeLink();
            }
        } else logger.info("5 - Long Terms Tab is Empty for Sport " + sportName);
    }

    @Test
    public void checkLongTermTabOnSportsScreenFromAZSportPage() throws InterruptedException, IOException {
        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        final String sportName = azSportsPage.getSport1Name();
        azSportsPage.clickOnSport1Link();
        if (longTermsTabExistForSport(sportName)) {
            checkLongTermTabData();
            logger.info(getListOfAllActualSports().getData().getItems().get(0).getTitle() + " Sport checked");
        } else logger.info("Long Terms Tab is Empty for Sport from AZ " + sportName);
    }

    private void checkLongTermTabData() throws InterruptedException {
        Waiters.waitMiddle();
        sportsHeader.clickOnSportDetailsLongTermsButton();
        SoftAssert softAssert = new SoftAssert();

        //TODO update according backend side, not all first match displayed
        //softAssert.assertTrue(sportsLongTerm.isSportLongTermFirstMatchDisplayed(),
        //        "Sport Long Term Tab Firs Match Not Displayed");
        softAssert.assertTrue(sportsLongTerm.isSportLongTermFirstMeetingDisplayed(),
                "Sport Long Term Tab First Meeting Not Displayed");

        softAssert.assertAll();
    }

    protected static boolean longTermsTabExistForSport(String sportName) throws IOException {
        boolean result = false;
        final String sportId = getListOfAllActualSports().getData().getItems().stream().
                filter(f -> f.getTitle().equals(sportName)).findFirst().get().getUrl().replace("/cats/", "");
        final LongTermMeetingsData data = getAllDataBySportName(sportId).getData().getLongTermMeetings();

        if (data.getMeetingSubGroups().size() != 0) {
            result = true;
        }
        return result;
    }
}