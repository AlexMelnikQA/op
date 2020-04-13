package Tests.SportsDetails;

import DTO.FinderFilter.FinderFilterGroupTitle;
import DTO.FinderFilter.FinderMeetingSubGroups;
import DTO.FinderFilter.FinderSubCategoryGroupName;
import DTO.ListOfSports.SportsDto;
import Pages.AZSportsPage;
import Pages.Filters.FilterPage;
import Pages.Home.HomeHeaderSports;
import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Pages.Popups.BottomPopupDialog;
import Pages.SportsDetails.SportsFinder;
import Pages.SportsDetails.SportsHeader;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static Pages.BasePage.scrollTeenyUp;
import static Utils.Constants.*;
import static Utils.RestClient.getAllDataBySportName;
import static Utils.RestClient.getListOfAllActualSports;


public class SportsFinderTabTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private HomeHeaderSports homeHeaderSports;
    private SportsHeader sportsHeader;
    private SportsFinder sportsFinderScreen;
    private FilterPage filterPage;
    private AZSportsPage azSportsPage;
    private BottomPopupDialog bottomPopupDialog;
    private Logger logger;

    @BeforeTest

    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        homeHeaderSports = new HomeHeaderSports(driver);
        sportsHeader = new SportsHeader(driver);
        sportsFinderScreen = new SportsFinder(driver);
        filterPage = new FilterPage(driver);
        azSportsPage = new AZSportsPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        logger = Logger.getLogger(SportsFinderTabTest.class.getName());
    }

    @Test
    public void checkFinderTabDayFiltersAndContext() throws IOException, InterruptedException {
        String sportName;
        String sportSubCategory;
        homePage.waitUntilMainMenuLinkIsVisible();
        final List<String> sportsUrls = new ArrayList<>();
        getListOfAllActualSports().getData().getItems().stream().limit(5)
                .forEach(f -> sportsUrls.add(f.getUrl().replace("/cats/", "")));

        //First
        sportName = getListOfAllActualSports().getData().getItems().get(0).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFirstTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                    sportSubCategory = sportsFinderScreen.getSportFinderFirstSubCategoryName();
                    sportsFinderScreen.clickOnSportFinderFirstSubCategoryLink();
                    checkDayFiltersForSport(selectCorrectFiltersList(getAllDataBySportName(sportsUrls.get(0)).getData().getAllMeetings(),
                            sportSubCategory));
                } else {
                    if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                        checkDayFiltersForSport(getAllDataBySportName(sportsUrls.get(0)).getData().getAllMeetings());
                    } else logger.info(sportName + " 5 - No one Finder Match");
                }
                logger.info(sportName + " 1 - Sport checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 1 - Unchecked");
        } else logger.info("1 - Finder Tab is Empty for Sport " + sportName);

        //Second
        sportName = getListOfAllActualSports().getData().getItems().get(1).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnSecondTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                    sportSubCategory = sportsFinderScreen.getSportFinderFirstSubCategoryName();
                    sportsFinderScreen.clickOnSportFinderFirstSubCategoryLink();
                    checkDayFiltersForSport(selectCorrectFiltersList(getAllDataBySportName(sportsUrls.get(1)).getData().getAllMeetings(),
                            sportSubCategory));
                } else {
                    if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                        checkDayFiltersForSport(getAllDataBySportName(sportsUrls.get(1)).getData().getAllMeetings());
                    } else logger.info(sportName + " 5 - No one Finder Match");
                }
                logger.info(sportName + " 2 - Sport checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 2 - Unchecked");
        } else logger.info("2 - Finder Tab is Empty for Sport " + sportName);

        //Third
        sportName = getListOfAllActualSports().getData().getItems().get(2).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnThirdTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                    sportSubCategory = sportsFinderScreen.getSportFinderFirstSubCategoryName();
                    sportsFinderScreen.clickOnSportFinderFirstSubCategoryLink();
                    checkDayFiltersForSport(selectCorrectFiltersList(getAllDataBySportName(sportsUrls.get(2)).getData().getAllMeetings(),
                            sportSubCategory));
                } else {
                    if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                        checkDayFiltersForSport(getAllDataBySportName(sportsUrls.get(2)).getData().getAllMeetings());
                    } else logger.info(sportName + " 5 - No one Finder Match");
                }
                logger.info(sportName + " 3 - Sport checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 3 - Unchecked");
        } else logger.info("3 - Finder Tab is Empty for Sport " + sportName);

        //Fourth
        sportName = getListOfAllActualSports().getData().getItems().get(3).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFourthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                    sportSubCategory = sportsFinderScreen.getSportFinderFirstSubCategoryName();
                    sportsFinderScreen.clickOnSportFinderFirstSubCategoryLink();
                    checkDayFiltersForSport(selectCorrectFiltersList(getAllDataBySportName(sportsUrls.get(3)).getData().getAllMeetings(),
                            sportSubCategory));
                } else {
                    if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                        checkDayFiltersForSport(getAllDataBySportName(sportsUrls.get(3)).getData().getAllMeetings());
                    } else logger.info(sportName + " 5 - No one Finder Match");
                }
                logger.info(sportName + " 4 - Sport checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 4 - Unchecked");
        } else logger.info("4 - Finder Tab is Empty for Sport " + sportName);

        //Fifth
        sportName = getListOfAllActualSports().getData().getItems().get(4).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFifthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                    sportSubCategory = sportsFinderScreen.getSportFinderFirstSubCategoryName();
                    sportsFinderScreen.clickOnSportFinderFirstSubCategoryLink();
                    checkDayFiltersForSport(selectCorrectFiltersList(getAllDataBySportName(sportsUrls.get(4)).getData().getAllMeetings(),
                            sportSubCategory));
                } else {
                    if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                        checkDayFiltersForSport(getAllDataBySportName(sportsUrls.get(4)).getData().getAllMeetings());
                    } else logger.info(sportName + " 5 - No one Finder Match");
                }
                logger.info(sportName + " 5 - Sport checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 5 - Unchecked");
        } else logger.info("5 - Finder Tab is Empty for Sport " + sportName);
    }

    @Test
    public void checkFinderTabDayFiltersAndContextFromAZSport() throws IOException, InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        final String sportName = azSportsPage.getSport1Name();
        String sportSubCategory;
        final List<String> sportsUrls = new ArrayList<>();

        getListOfAllActualSports().getData().getItems().stream().filter(f -> f.getTitle().equals(sportName))
                .forEach(p -> sportsUrls.add(p.getUrl().replace("/cats/", "")));

        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                azSportsPage.clickOnSport1Link();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                if (sportsFinderScreen.isFinderScreenNotDisplayed()) {
                    sportSubCategory = sportsFinderScreen.getSportFinderFirstSubCategoryName();
                    sportsFinderScreen.clickOnSportFinderFirstSubCategoryLink();
                    checkDayFiltersForSport(selectCorrectFiltersList(getAllDataBySportName(sportsUrls.get(0)).getData().getAllMeetings(),
                            sportSubCategory));
                } else {
                    checkDayFiltersForSport(getAllDataBySportName(sportsUrls.get(0)).getData().getAllMeetings());
                }
                logger.info(sportName + " AZ - Sport checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " AZ - Unchecked");
        } else logger.info("1 - Finder Tab is Empty for Sport " + sportName);
    }

    @Test
    public void checkFinderFilterSportsScreenNotLoggedUser() throws IOException, InterruptedException {
        String sportName;
        SportsDto sports = getListOfAllActualSports();
        homePage.waitUntilMainMenuLinkIsVisible();

        //First
        sportName = sports.getData().getItems().get(0).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFirstTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkFilterPageFromFinderTab();
                Assert.assertTrue(filterPage.isFilterScreenAddToFavouritesButtonNotDisplayed(),
                        "Finder Filter Screen Add To Favourites Button Displayed");
                logger.info(sportName + " 1 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 1 - Unchecked");
        } else logger.info("1 - Finder Tab is Empty for Sport " + sportName);

        //Second
        sportName = sports.getData().getItems().get(1).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnSecondTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkFilterPageFromFinderTab();
                Assert.assertTrue(filterPage.isFilterScreenAddToFavouritesButtonNotDisplayed(),
                        "Finder Filter Screen Add To Favourites Button Displayed");
                logger.info(sportName + " 2 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 2 - Unchecked");
        } else logger.info("2 - Finder Tab is Empty for Sport " + sportName);

        //Third
        sportName = sports.getData().getItems().get(2).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnThirdTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkFilterPageFromFinderTab();
                Assert.assertTrue(filterPage.isFilterScreenAddToFavouritesButtonNotDisplayed(),
                        "Finder Filter Screen Add To Favourites Button Displayed");
                logger.info(sportName + " 3 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 3 - Unchecked");
        } else logger.info("3 - Finder Tab is Empty for Sport " + sportName);

        //Fourth
        sportName = sports.getData().getItems().get(3).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFourthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkFilterPageFromFinderTab();
                Assert.assertTrue(filterPage.isFilterScreenAddToFavouritesButtonNotDisplayed(),
                        "Finder Filter Screen Add To Favourites Button Displayed");
                logger.info(sportName + " 4 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 4 - Unchecked");
        } else logger.info("4 - Finder Tab is Empty for Sport " + sportName);

        //Fifth
        sportName = sports.getData().getItems().get(4).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFifthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkFilterPageFromFinderTab();
                Assert.assertTrue(filterPage.isFilterScreenAddToFavouritesButtonNotDisplayed(),
                        "Finder Filter Screen Add To Favourites Button Displayed");
                logger.info(sportName + " 5 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 5 - Unchecked");
        } else logger.info("5 - Finder Tab is Empty for Sport " + sportName);
    }

    @Test
    public void checkFinderFilterSportsScreenLoggedUserAndAddToFavoriteFilter() throws IOException, InterruptedException {
        String sportName;
        SportsDto sports = getListOfAllActualSports();
        homePage.waitUntilMainMenuLinkIsVisible();
        login(USER_WITH_0_BALANCE_NAME, USER_WITH_0_BALANCE_PASSWORD);
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        bottomPopupDialog.clickOnClosePopupButton();

        //First
        sportName = sports.getData().getItems().get(0).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFirstTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkAddFilterToFavorites();
                logger.info(sportName + " 1 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 1 - Unchecked");
        } else logger.info("1 - Finder Tab is Empty for Sport " + sportName);

        //Second
        sportName = sports.getData().getItems().get(1).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnSecondTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkAddFilterToFavorites();
                logger.info(sportName + " 2 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 2 - Unchecked");
        } else logger.info("2 - Finder Tab is Empty for Sport " + sportName);

        //Third
        sportName = sports.getData().getItems().get(2).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnThirdTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkAddFilterToFavorites();
                logger.info(sportName + " 3 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 3 - Unchecked");
        } else logger.info("3 - Finder Tab is Empty for Sport " + sportName);

        //Fourth
        sportName = sports.getData().getItems().get(3).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFourthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkAddFilterToFavorites();
                logger.info(sportName + " 4 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 4 - Unchecked");
        } else logger.info("4 - Finder Tab is Empty for Sport " + sportName);

        //Fifth
        sportName = sports.getData().getItems().get(4).getTitle();
        if (finderTabExistForSport(sportName)) {
            if (!sportName.equals(HORSE_RACING)) {
                homeHeaderSports.clickOnFifthTopMenuLink();
                Waiters.waitShort();
                sportsHeader.clickOnSportDetailsFinderButton();
                Waiters.waitShort();
                sportsFinderScreen.clickOnFinderFilterButton();
                checkAddFilterToFavorites();
                logger.info(sportName + " 5 - Sport Link checked");
                bottomMenu.clickOnHomeLink();
            } else logger.info(sportName + " 5 - Unchecked");
        } else logger.info("5 - Finder Tab is Empty for Sport " + sportName);
    }

    protected static boolean finderTabExistForSport(String sportName) throws IOException {
        final String sportId = getListOfAllActualSports().getData().getItems().stream().
                filter(f -> f.getTitle().equals(sportName)).findFirst().get().getUrl().replace("/cats/", "");
        List<FinderFilterGroupTitle> allMeetings = getAllDataBySportName(sportId).getData().getAllMeetings();
        return allMeetings.stream().anyMatch(f -> !f.getTitle().equals(LONG_TERM) || !f.getTitle().equals(TOTALS));
    }

    private String filterCorrection(String filterTitle) {
        if (filterTitle.equals(TODAY) || filterTitle.equals(TOMORROW) || filterTitle.equals(IN_PROGRESS)) {
            filterTitle = filterTitle.toUpperCase();
        } else {
            filterTitle = StringUtils.substring(filterTitle, 0, filterTitle.length() - 5).
                    replace("/", ".").split(" ")[1];
        }
        return filterTitle;
    }

    private void checkDayFiltersForSport(List<FinderFilterGroupTitle> finderFilters) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        final int finderFiltersSize = finderFilters.size();
        if (finderFiltersSize > 0) {
            softAssert.assertEquals(filterCorrection(finderFilters.get(0).getTitle()), sportsFinderScreen.getFinderFirstFilterText());
            checkFinderContent();
        }

        if (finderFiltersSize > 1 && !((LONG_TERM).equals(finderFilters.get(1).getTitle()) || (TOTALS).equals(finderFilters.get(1).getTitle()))) {
            softAssert.assertEquals(filterCorrection(finderFilters.get(1).getTitle()), sportsFinderScreen.getFinderSecondFilterText());
            sportsFinderScreen.clickOnFinderSecondFilter();
            checkFinderContent();
        }

        if (finderFiltersSize > 2 && !((LONG_TERM).equals(finderFilters.get(2).getTitle()) || (TOTALS).equals(finderFilters.get(2).getTitle()))) {
            softAssert.assertEquals(filterCorrection(finderFilters.get(2).getTitle()), sportsFinderScreen.getFinderThirdFilterText());
            sportsFinderScreen.clickOnFinderThirdFilter();
            checkFinderContent();
        }

        if (finderFiltersSize > 3 && !((LONG_TERM).equals(finderFilters.get(3).getTitle()) || (TOTALS).equals(finderFilters.get(3).getTitle()))) {
            softAssert.assertEquals(filterCorrection(finderFilters.get(3).getTitle()), sportsFinderScreen.getFinderForthFilterText());
            sportsFinderScreen.clickOnFinderForthFilter();
            checkFinderContent();
        }

        if (finderFiltersSize > 4 && !((LONG_TERM).equals(finderFilters.get(4).getTitle()) || (TOTALS).equals(finderFilters.get(4).getTitle()))) {
            softAssert.assertEquals(filterCorrection(finderFilters.get(4).getTitle()), sportsFinderScreen.getFinderFifthFilterText());
            sportsFinderScreen.clickOnFinderFifthFilter();
            checkFinderContent();
        }
        softAssert.assertAll();
    }

    private List<FinderFilterGroupTitle> selectCorrectFiltersList
            (List<FinderFilterGroupTitle> allMeetings, String sportSubCategory) {
        List<FinderFilterGroupTitle> meetingWithDayFilter = new ArrayList<>();
        List<FinderFilterGroupTitle> subFilters = allMeetings;

        for (FinderFilterGroupTitle filterGroupTitle : subFilters) {
            List<FinderMeetingSubGroups> meetingSubGroups = filterGroupTitle.getMeetingSubGroups();

            for (FinderMeetingSubGroups meetingFilters : meetingSubGroups) {
                List<FinderSubCategoryGroupName> meetingByNameFilters = meetingFilters.getSubGroupMeeting();

                for (FinderSubCategoryGroupName filtersByName : meetingByNameFilters) {
                    if (filtersByName.getCategoryGroupName().equals(sportSubCategory)) {
                        meetingWithDayFilter.add(filterGroupTitle);
                        break;
                    }
                }
            }
        }
        return meetingWithDayFilter;
    }

    //TODO update locators (all)
    private void checkFinderContent() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        Waiters.waitLong();
        softAssert.assertTrue(sportsFinderScreen.isFinderTitle(), "Finder Title NOT Displayed");
        //TODO for few sports Filter is not exist
        //     softAssert.assertTrue(sportsFinderScreen.isFinderFilterButtonDisplayed(), "Finder Filter Button NOT Displayed");
        //     softAssert.assertEquals("Filter", sportsFinderScreen.getFinderFilterButtonText());
        softAssert.assertTrue(sportsFinderScreen.isFinderFirstMatchInfoIconDisplayed(),
                "Finder First Match Info Icon NOT Displayed");
        //softAssert.assertTrue(Pattern.matches(FINDER_DATA_PATTERN, sportsFinderScreen.getSportFinderFirstMatchTime()),
        //       "Sport Finder First Match Time is incorrect");
        softAssert.assertTrue(sportsFinderScreen.isSportFinderFirstMatchDescriptionDisplayed(),//1FinderMarketDescription1
                "Finder First Match Description NOT Displayed");
        softAssert.assertAll();
    }

    private void checkFilterPageFromFinderTab() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(filterPage.isFilterScreenDisplayed(), "Finder Filter Screen NOT Displayed");
        softAssert.assertTrue(filterPage.isFilterScreenArrowLeftDisplayed(),
                "Finder Filter Screen Arrow Left NOT Displayed");
        softAssert.assertTrue(filterPage.isFilterScreenTitleDisplayed(),
                "Finder Filter Screen Title NOT Displayed");
        softAssert.assertEquals("TOURNAMENT", filterPage.getFilterScreenTournamentLabelName());
        softAssert.assertTrue(filterPage.isFilterScreenTournamentSelectionNameDisplayed(),
                "Finder Filter Screen Tournament Selection Name NOT Displayed");
        softAssert.assertTrue(filterPage.isFilterScreenTournamentCheckboxDisplayed(),
                "Finder Filter Screen Tournament Checkbox NOT Displayed");
        filterPage.clickOnFilterScreenTournamentCheckbox();

        filterPage.scrollToFilterScreenMarketTypesTitle();
        scrollTeenyUp();
        softAssert.assertEquals("MARKET TYPES", filterPage.getFilterScreenMarketTypesTitleName());
        softAssert.assertTrue(filterPage.isFilterScreenMarketTypesSelectionNameDisplayed(),
                "Finder Filter Screen Market Types Selection Name NOT Displayed");
        softAssert.assertTrue(filterPage.isFilterScreenMarketTypesCheckboxDisplayed(),
                "Finder Filter Screen Market Types Checkbox NOT Displayed");
        filterPage.clickOnFilterScreenMarketTypesCheckbox();

        filterPage.scrollToFilterScreenApplyButton();

        softAssert.assertTrue(filterPage.isFilterScreenApplyButtonDisplayed(),
                "Finder Filter Screen Apply Button NOT Displayed");

        filterPage.clickOnFilterScreenApplyButton();

        Waiters.waitShort();
        if (filterPage.isFilterScreenNoResultsNotDisplayed()) {
            checkFinderContent();
        } else {
            softAssert.assertEquals("No results found, please try different categories and market types",
                    filterPage.getFilterScreenNoResultsText());
        }
        softAssert.assertAll();
    }

    private void checkAddFilterToFavorites() throws InterruptedException {
        final String FILTER_NAME = RandomStringUtils.random(10, true, false);
        filterPage.clickOnFilterScreenTournamentCheckbox();
        filterPage.scrollToFilterScreenMarketTypesTitle();
        filterPage.clickOnFilterScreenMarketTypesCheckbox();
        filterPage.scrollToFilterScreenAddToFavouritesButton();
        scrollTeenyUp();
        filterPage.clickOnFilterScreenAddToFavouritesButton();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupAddToFavouritesDisplayed(), "Add To Favourites Dialog NOT Displayed");
        softAssert.assertTrue(bottomPopupDialog.isBottomPopupIconDisplayed(), "Add To Favourites Icon NOT Displayed");
        softAssert.assertTrue(bottomPopupDialog.isClosePopupButtonDisplayed(), "Add To Favourites Close Popup Button NOT Displayed");
        softAssert.assertEquals("Please enter the name for this favourite", bottomPopupDialog.getBottomPopupTitle());
        softAssert.assertEquals("My filter", bottomPopupDialog.getBottomPopupAddToFavouritesInputFieldText());


        bottomPopupDialog.fillBottomPopupAddToFavouritesInputField(FILTER_NAME);
        bottomPopupDialog.clickSaveButton();
        Waiters.waitShort();
        softAssert.assertEquals("Filter added to favourites", bottomPopupDialog.getBottomPopupTitle());
        bottomPopupDialog.clickOnClosePopupButton();

        filterPage.clickOnFilterScreenAddToFavouritesButton();
        bottomPopupDialog.fillBottomPopupAddToFavouritesInputField(FILTER_NAME);
        bottomPopupDialog.clickSaveButton();
        Waiters.waitShort();
        softAssert.assertEquals("You sure you want to overwrite your existing favourite " + FILTER_NAME, bottomPopupDialog.getBottomPopupTitle());
        bottomPopupDialog.clickOnClosePopupButton();
        softAssert.assertAll();
    }
}