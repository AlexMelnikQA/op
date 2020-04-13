package Tests.BottomTabAZSports;

import Pages.AZSportsPage;
import Pages.Home.HomePage;
import Pages.Menus.BottomMenu;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Utils.RestClient.getListOfAllActualSports;


public class PredictiveSearchAZSportsTest extends TestBase {

    private HomePage homePage;
    private BottomMenu bottomMenu;
    private AZSportsPage azSportsPage;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        bottomMenu = new BottomMenu(driver);
        azSportsPage = new AZSportsPage(driver);
    }

    @Test
    public void checkPredictiveSearchOnAZSportPage() throws IOException {
        final List<String> sports = new ArrayList<>();
        getListOfAllActualSports().getData().getItems().stream().forEach(f -> sports.add(f.getTitle()));
        Collections.sort(sports);

        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        azSportsPage.waitUntilSport1Displayed();
        azSportsPage.clickAZSportsScreenSearch();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(azSportsPage.isAZSportsScreenSearchIconDisplayed());

        azSportsPage.populateAZSportsScreenSearchField(sports.get(0));
        softAssert.assertTrue(azSportsPage.isSport1IconDisplayed());
        softAssert.assertEquals(sports.get(0), azSportsPage.getSport1Name());
        softAssert.assertTrue(azSportsPage.isSport1StarNotDisplayed());

        azSportsPage.clearAZSportsScreenSearchField();
        softAssert.assertTrue(azSportsPage.isSport2IconDisplayed());
        softAssert.assertEquals(sports.get(1), azSportsPage.getSport2Name());
        softAssert.assertTrue(azSportsPage.isSport2StarNotDisplayed());

        azSportsPage.populateAZSportsScreenSearchField(sports.get(1));
        softAssert.assertTrue(azSportsPage.isSport1IconDisplayed());
        softAssert.assertEquals(sports.get(1), azSportsPage.getSport1Name());
        softAssert.assertTrue(azSportsPage.isSport1StarNotDisplayed());

        azSportsPage.clickAZSportsScreenSearchCloseButton();
        softAssert.assertTrue(azSportsPage.isSport1IconDisplayed());
        softAssert.assertEquals(sports.get(0), azSportsPage.getSport1Name());
        softAssert.assertTrue(azSportsPage.isSport1StarNotDisplayed());

        softAssert.assertAll();
    }
}