package Tests.BottomTabInPlay;

import Pages.Home.HomePage;
import Pages.InPlay.InPlayPage;
import Pages.InPlay.InPlaySportsPage;
import Pages.Menus.BottomMenu;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Pages.BasePage.scrollUp;
import static Utils.RestClient.getInPlayFilters;


public class InPlaySportsTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private InPlayPage inPlayPage;
    private InPlaySportsPage inPlaySportsPage;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        inPlayPage = new InPlayPage(driver);
        inPlaySportsPage = new InPlaySportsPage(driver);
    }

    @Test
    public void checkSportsOnInPlayPage() throws IOException {
        final List<String> filterList = new ArrayList<>();
        getInPlayFilters().getData().getMeetingsBySport().stream().forEach(f -> filterList.add(f.getName()));
        Collections.sort(filterList);
        int filterListSize = filterList.size();

        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_InPlay();
        inPlayPage.waitFirstSportBecomesVisible();
        inPlayPage.clickOnChooseSportButton();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(inPlaySportsPage.isInPlaySportsScreenDisplayed());
        softAssert.assertTrue(inPlaySportsPage.isBackToInPlayScreenButtonDisplayed());
        softAssert.assertEquals(inPlaySportsPage.getInPlaySportsText(), "Sports");

        inPlaySportsPage.clickFirstSportCheckbox();
        inPlaySportsPage.clickBackToInPlayScreenButton();
        softAssert.assertTrue(inPlaySportsPage.isInPlaySportsScreenDisplayed());

        inPlaySportsPage.clickFirstSportCheckbox();

        if (filterListSize > 0) {
            softAssert.assertEquals(inPlaySportsPage.getSport1Name(), filterList.get(0));
            softAssert.assertTrue(inPlaySportsPage.isSport1CheckboxDisplayed());
        }

        if (filterListSize > 1) {
            softAssert.assertEquals(inPlaySportsPage.getSport2Name(), filterList.get(1));
            softAssert.assertTrue(inPlaySportsPage.isSport2CheckboxDisplayed());
        }

        if (filterListSize > 2) {
            softAssert.assertEquals(inPlaySportsPage.getSport3Name(), filterList.get(2));
            softAssert.assertTrue(inPlaySportsPage.isSport3CheckboxDisplayed());
        }

        if (filterListSize > 3) {
            softAssert.assertEquals(inPlaySportsPage.getSport4Name(), filterList.get(3));
            softAssert.assertTrue(inPlaySportsPage.isSport4CheckboxDisplayed());
        }

        if (filterListSize > 4) {
            softAssert.assertEquals(inPlaySportsPage.getSport5Name(), filterList.get(4));
            softAssert.assertTrue(inPlaySportsPage.isSport5CheckboxDisplayed());
        }

        if (filterListSize > 5) {
            softAssert.assertEquals(inPlaySportsPage.getSport6Name(), filterList.get(5));
            softAssert.assertTrue(inPlaySportsPage.isSport6CheckboxDisplayed());
        }

        if (filterListSize > 6) {
            softAssert.assertEquals(inPlaySportsPage.getSport7Name(), filterList.get(6));
            softAssert.assertTrue(inPlaySportsPage.isSport7CheckboxDisplayed());
        }

        if (filterListSize > 7) {
            softAssert.assertEquals(inPlaySportsPage.getSport8Name(), filterList.get(7));
            softAssert.assertTrue(inPlaySportsPage.isSport8CheckboxDisplayed());
        }

        scrollUp();

        if (filterListSize > 8) {
            softAssert.assertEquals(inPlaySportsPage.getSport9Name(), filterList.get(8));
            softAssert.assertTrue(inPlaySportsPage.isSport9CheckboxDisplayed());
        }

        if (filterListSize > 9) {
            softAssert.assertEquals(inPlaySportsPage.getSport10Name(), filterList.get(9));
            softAssert.assertTrue(inPlaySportsPage.isSport10CheckboxDisplayed());
        }

        if (filterListSize > 10) {
            softAssert.assertEquals(inPlaySportsPage.getSport11Name(), filterList.get(10));
            softAssert.assertTrue(inPlaySportsPage.isSport11CheckboxDisplayed());
        }

        if (filterListSize > 11) {
            softAssert.assertEquals(inPlaySportsPage.getSport12Name(), filterList.get(11));
            softAssert.assertTrue(inPlaySportsPage.isSport12CheckboxDisplayed());
        }

        if (filterListSize > 12) {
            softAssert.assertEquals(inPlaySportsPage.getSport13Name(), filterList.get(12));
            softAssert.assertTrue(inPlaySportsPage.isSport13CheckboxDisplayed());
        }

        if (filterListSize > 13) {
            softAssert.assertEquals(inPlaySportsPage.getSport14Name(), filterList.get(13));
            softAssert.assertTrue(inPlaySportsPage.isSport14CheckboxDisplayed());
        }

        scrollUp();

        if (filterListSize > 14) {
            softAssert.assertEquals(inPlaySportsPage.getSport15Name(), filterList.get(14));
            softAssert.assertTrue(inPlaySportsPage.isSport15CheckboxDisplayed());
        }

        if (filterListSize > 15) {
            softAssert.assertEquals(inPlaySportsPage.getSport16Name(), filterList.get(15));
            softAssert.assertTrue(inPlaySportsPage.isSport16CheckboxDisplayed());
        }

        if (filterListSize > 16) {
            softAssert.assertEquals(inPlaySportsPage.getSport17Name(), filterList.get(16));
            softAssert.assertTrue(inPlaySportsPage.isSport17CheckboxDisplayed());
        }

        if (filterListSize > 17) {
            softAssert.assertEquals(inPlaySportsPage.getSport18Name(), filterList.get(17));
            softAssert.assertTrue(inPlaySportsPage.isSport18CheckboxDisplayed());
        }

        if (filterListSize > 18) {
            softAssert.assertEquals(inPlaySportsPage.getSport19Name(), filterList.get(18));
            softAssert.assertTrue(inPlaySportsPage.isSport19CheckboxDisplayed());
        }

        if (filterListSize > 19) {
            softAssert.assertEquals(inPlaySportsPage.getSport20Name(), filterList.get(19));
            softAssert.assertTrue(inPlaySportsPage.isSport20CheckboxDisplayed());
        }

        scrollUp();

        if (filterListSize > 20) {
            softAssert.assertEquals(inPlaySportsPage.getSport21Name(), filterList.get(20));
            softAssert.assertTrue(inPlaySportsPage.isSport21CheckboxDisplayed());
        }

        if (filterListSize > 21) {
            softAssert.assertEquals(inPlaySportsPage.getSport22Name(), filterList.get(21));
            softAssert.assertTrue(inPlaySportsPage.isSport22CheckboxDisplayed());
        }

        if (filterListSize > 22) {
            softAssert.assertEquals(inPlaySportsPage.getSport23Name(), filterList.get(22));
            softAssert.assertTrue(inPlaySportsPage.isSport23CheckboxDisplayed());
        }

        if (filterListSize > 23) {
            softAssert.assertEquals(inPlaySportsPage.getSport24Name(), filterList.get(23));
            softAssert.assertTrue(inPlaySportsPage.isSport24CheckboxDisplayed());
        }

        if (filterListSize > 24) {
            softAssert.assertEquals(inPlaySportsPage.getSport25Name(), filterList.get(24));
            softAssert.assertTrue(inPlaySportsPage.isSport25CheckboxDisplayed());
        }

        inPlaySportsPage.clickBackToInPlayScreenButton();
        inPlayPage.waitUntilChooseSportButtonDisplayed();
        softAssert.assertTrue(inPlayPage.isChooseSportButtonDisplayed());
        softAssert.assertAll();
    }
}