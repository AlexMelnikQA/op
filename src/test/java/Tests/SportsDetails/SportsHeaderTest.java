package Tests.SportsDetails;

import DTO.ListOfSports.SportsData;
import Pages.AZSportsPage;
import Pages.Home.HomeHeaderSports;
import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Pages.Popups.BottomPopupDialog;
import Pages.SportsDetails.SportsHeader;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import static Utils.Constants.HORSE_RACING;
import static Utils.RestClient.getListOfAllActualSports;


public class SportsHeaderTest extends TestBase {

    private HomePage homePage;
    private HomeHeaderSports homeHeaderSports;
    private BottomMenu bottomMenu;
    private SportsHeader sportsHeader;
    private AZSportsPage azSportsPage;
    private BottomPopupDialog bottomPopupDialog;
    private Logger logger;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        homeHeaderSports = new HomeHeaderSports(driver);
        sportsHeader = new SportsHeader(driver);
        azSportsPage = new AZSportsPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        logger = Logger.getLogger(SportsInPlayTabTest.class.getName());
    }

    @Test
    public void checkHeadersOnSportsScreenNotLoggedUser() throws IOException {
        List<SportsData> sports = getListOfAllActualSports().getData().getItems();
        String sportName = sports.get(0).getTitle();

        homePage.waitUntilMainMenuLinkIsVisible();

        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFirstTopMenuLink();
            checkSportsDetailsHeaderNotLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(1).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnSecondTopMenuLink();
            checkSportsDetailsHeaderNotLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(2).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnThirdTopMenuLink();
            checkSportsDetailsHeaderNotLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(3).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFourthTopMenuLink();
            checkSportsDetailsHeaderNotLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(4).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFifthTopMenuLink();
            checkSportsDetailsHeaderNotLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }
    }

    @Test
    public void checkHeadersOnSportsScreenLoggedUser() throws IOException, InterruptedException {
        login(USER_WITH_RESTRICTED_ACCESS, BASE_PASSWORD);

        List<SportsData> sports = getListOfAllActualSports().getData().getItems();

        String sportName = sports.get(0).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFirstTopMenuLink();
            checkSportsDetailsHeaderLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(1).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnSecondTopMenuLink();
            checkSportsDetailsHeaderLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(2).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnThirdTopMenuLink();
            checkSportsDetailsHeaderLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(3).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFourthTopMenuLink();
            checkSportsDetailsHeaderLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.get(4).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFifthTopMenuLink();
            checkSportsDetailsHeaderLoggedUser(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }
    }

    @Test
    public void checkHeadersOnSportsScreenFromAZSportPage() throws IOException {
        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        String sportName = azSportsPage.getSport1Name();
        azSportsPage.clickOnSport1Link();
        checkSportsDetailsHeaderNotLoggedUser(sportName);
        logger.info(sportName + "Sport checked");
    }

    private void checkSportsDetailsHeaderNotLoggedUser(String sportName) throws IOException {
        checkSportsDetailsHeader(sportName);
        Assert.assertTrue(sportsHeader.isSportDetailsTitleInactiveStarNotDisplayed(), "Title Inactive Star Displayed");
    }

    private void checkSportsDetailsHeaderLoggedUser(String sportName) throws IOException {
        checkSportsDetailsHeader(sportName);
        Assert.assertTrue(sportsHeader.isSportDetailsTitleInactiveStarDisplayed(), "Inactive Star Not Displayed");
    }

    private void checkSportsDetailsHeader(String sportName) throws IOException {
        SoftAssert softAssert = new SoftAssert();
        sportsHeader.waitUntilSportDetailsScreenDisplayed();
        softAssert.assertTrue(sportsHeader.isSportDetailsScreenDisplayed(), "Sport Details Screen Not Displayed");
        softAssert.assertTrue(sportsHeader.isSportDetailsTitleDisplayed(), "Sport Details Title Not Displayed");
        softAssert.assertEquals(sportName, sportsHeader.getSportDetailsTitleText(), "Sport name is mismatch");
        if (SportsInPlayTabTest.inPlayTabExistForSport(sportName)) {
            softAssert.assertTrue(sportsHeader.isSportDetailsInPlayButtonDisplayed(), "InPlay Button Not Displayed");
        } else logger.info(sportName + " Sport don't have a InPlay matches");
        if (SportsFinderTabTest.finderTabExistForSport(sportName)) {
            softAssert.assertTrue(sportsHeader.isSportDetailsFinderButtonDisplayed(), "Finder Button Not Displayed");
        } else logger.info(sportName + " Sport don't have a Finder matches");
        if (SportsLongTermTabTest.longTermsTabExistForSport(sportName)) {
            softAssert.assertTrue(sportsHeader.isSportDetailsLongTermsButtonDisplayed(), "Long Terms Button Not Displayed");
        } else logger.info(sportName + " Sport don't have a Long Terms matches");
        if (SportsTotalsTabTest.totalsTabExistForSport(sportName)) {
            softAssert.assertTrue(sportsHeader.isSportDetailsTotalsButtonDisplayed(), "Totals Button Not Displayed");
        } else logger.info(sportName + " Sport don't have a Totals matches");
        if (SportsBinariesTest.binariesTabExistForSport(sportName)) {
            softAssert.assertTrue(sportsHeader.isSportDetailsBinariesButtonDisplayed(), "Binaries Button Not Displayed");
        } else logger.info(sportName + " Sport don't have a Binaries matches");
        softAssert.assertAll();
    }
}