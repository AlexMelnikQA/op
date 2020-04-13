package Tests.SportsDetails;

import DTO.FinderFilter.FinderFilterGroupTitle;
import DTO.ListOfSports.SportsDto;
import Pages.AZSportsPage;
import Pages.Home.HomeHeaderSports;
import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Pages.Popups.BottomPopupDialog;
import Pages.SportsDetails.SportsHeader;
import Pages.SportsDetails.SportsInPlay;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import static Utils.Constants.HORSE_RACING;
import static Utils.Constants.TODAY;
import static Utils.RestClient.getAllDataBySportName;
import static Utils.RestClient.getListOfAllActualSports;


public class SportsInPlayTabTest extends TestBase {

    private BottomMenu bottomMenu;
    private HomeHeaderSports homeHeaderSports;
    private SportsHeader sportsHeader;
    private SportsInPlay sportsInPlay;
    private AZSportsPage azSportsPage;
    private Logger logger;
    private HomePage homePage;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest

    public void setUpPage() {
        bottomMenu = new BottomMenu(driver);
        homeHeaderSports = new HomeHeaderSports(driver);
        sportsHeader = new SportsHeader(driver);
        sportsInPlay = new SportsInPlay(driver);
        azSportsPage = new AZSportsPage(driver);
        homePage = new HomePage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        logger = Logger.getLogger(SportsInPlayTabTest.class.getName());
    }

    @Test
    public void checkInPlayTabOnSportsScreen() throws InterruptedException, IOException {
        SportsDto sports = getListOfAllActualSports();
        homePage.waitUntilMainMenuLinkIsVisible();

        String sportName = sports.getData().getItems().get(0).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFirstTopMenuLink();
            checkInPlayTabData(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.getData().getItems().get(1).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnSecondTopMenuLink();
            checkInPlayTabData(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.getData().getItems().get(2).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnThirdTopMenuLink();
            checkInPlayTabData(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.getData().getItems().get(3).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFourthTopMenuLink();
            checkInPlayTabData(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }

        sportName = sports.getData().getItems().get(4).getTitle();
        if (!sportName.equals(HORSE_RACING)) {
            homeHeaderSports.clickOnFifthTopMenuLink();
            checkInPlayTabData(sportName);
            logger.info(sportName + " Sport Link checked");
            bottomMenu.clickOnHomeLink();
        }
    }

    @Test
    public void checkInPlayTabOnSportsScreenFromAZSportPage() throws InterruptedException, IOException {
        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        azSportsPage.clickOnSport1Link();
        final List<String> sports = new ArrayList<>();
        getListOfAllActualSports().getData().getItems().stream().forEach(f -> sports.add(f.getTitle()));
        Collections.sort(sports);
        final String sportName = sports.get(0);
        checkInPlayTabData(sportName);
        logger.info(sportName + " Sport checked");
    }

    private void checkInPlayTabData(String sportName) throws InterruptedException, IOException {
        SoftAssert softAssert = new SoftAssert();

        if (inPlayTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                sportsInPlay.waitFirstMatchOnSportInPlayTab();
                Waiters.waitShort();
                sportsInPlay.clickOnSportInPlayFirstMatch();

                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMeetingNotDisplayed(),
                        "First Meeting Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMeetingNameNotDisplayed(),
                        "First Meeting Name Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketNameNotDisplayed(),
                        "First Market Name Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketResultsNotDisplayed(),
                        "First Results Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketBuyButtonNotDisplayed(),
                        "First Buy Button Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketSellButtonNotDisplayed(),
                        "First Sell Button Displayed");

                sportsInPlay.clickOnSportInPlayFirstMatch();
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMeetingDisplayed(),
                        "First Meeting Not Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMeetingNameDisplayed(),
                        "First Meeting Name Not Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketNameDisplayed(),
                        "First Market Name Not Displayed");
                softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketResultsDisplayed(),
                        "First Results Not Displayed");
                if (sportsInPlay.isSportInPlayFirstMarketSuspendedNotDisplayed()) {
                    softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketBuyButtonDisplayed(),
                            "First Buy Button Not Displayed");
                    softAssert.assertTrue(sportsInPlay.isSportInPlayFirstMarketSellButtonDisplayed(),
                            "First Sell Button Not Displayed");
                }
            } else logger.info(sportName + " Unchecked");
        } else logger.info("InPlay Tab is Empty for Sport " + sportName);
        softAssert.assertAll();
    }

    protected static boolean inPlayTabExistForSport(String sportName) throws IOException {
        final String sportId = getListOfAllActualSports().getData().getItems().stream().
                filter(f -> f.getTitle().equals(sportName)).findFirst().get().getUrl().replace("/cats/", "");
        List<FinderFilterGroupTitle> allMeetings = getAllDataBySportName(sportId).getData().getAllMeetings();
        return allMeetings.stream().anyMatch(f -> f.getTitle().equals(TODAY));
    }
}