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

import static Pages.BasePage.scrollTeenyUp;
import static Utils.RestClient.getListOfAllActualSports;


public class BottomTabAZSportsTest extends TestBase {

    private BottomMenu bottomMenu;
    private AZSportsPage azSportsPage;
    private HomePage homePage;

    @BeforeTest
    public void setUpPage() {
        bottomMenu = new BottomMenu(driver);
        azSportsPage = new AZSportsPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void checkSportsOnAZPageNotLoggedUser() throws IOException {
        final List<String> sports = new ArrayList<>();
        getListOfAllActualSports().getData().getItems().stream().forEach(f -> sports.add(f.getTitle()));
        Collections.sort(sports);
        int sportsCount = sports.size();

        homePage.waitUntilMainMenuLinkIsVisible();
        bottomMenu.clickOnBottomMenu_AZSports();
        azSportsPage.waitUntilAZSportsMenuIsDisplayed();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(azSportsPage.isAZSportsScreenDisplayed());
        softAssert.assertTrue(bottomMenu.isActiveBottomMenu_AZSportsDisplayed());
        softAssert.assertTrue(azSportsPage.isAZSportsScreenSearchDisplayed());
        softAssert.assertEquals(azSportsPage.getAzSportsScreenText(), "A-Z");

        if (sportsCount > 0) {
            softAssert.assertTrue(azSportsPage.isSport1IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport1Name(), sports.get(0));
            softAssert.assertTrue(azSportsPage.isSport1StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 1) {
            softAssert.assertTrue(azSportsPage.isSport2IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport2Name(), sports.get(1));
            softAssert.assertTrue(azSportsPage.isSport2StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 2) {
            softAssert.assertTrue(azSportsPage.isSport3IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport3Name(), sports.get(2));
            softAssert.assertTrue(azSportsPage.isSport3StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 3) {
            softAssert.assertTrue(azSportsPage.isSport4IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport4Name(), sports.get(3));
            softAssert.assertTrue(azSportsPage.isSport4StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 4) {
            softAssert.assertTrue(azSportsPage.isSport5IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport5Name(), sports.get(4));
            softAssert.assertTrue(azSportsPage.isSport5StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 5) {
            softAssert.assertTrue(azSportsPage.isSport6IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport6Name(), sports.get(5));
            softAssert.assertTrue(azSportsPage.isSport6StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 6) {
            softAssert.assertTrue(azSportsPage.isSport7IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport7Name(), sports.get(6));
            softAssert.assertTrue(azSportsPage.isSport7StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 7) {
            softAssert.assertTrue(azSportsPage.isSport8IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport8Name(), sports.get(7));
            softAssert.assertTrue(azSportsPage.isSport8StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 8) {
            softAssert.assertTrue(azSportsPage.isSport9IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport9Name(), sports.get(8));
            softAssert.assertTrue(azSportsPage.isSport9StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 9) {
            softAssert.assertTrue(azSportsPage.isSport10IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport10Name(), sports.get(9));
            softAssert.assertTrue(azSportsPage.isSport10StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 10) {
            softAssert.assertTrue(azSportsPage.isSport11IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport11Name(), sports.get(10));
            softAssert.assertTrue(azSportsPage.isSport11StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 11) {
            softAssert.assertTrue(azSportsPage.isSport12IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport12Name(), sports.get(11));
            softAssert.assertTrue(azSportsPage.isSport12StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 12) {
            softAssert.assertTrue(azSportsPage.isSport13IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport13Name(), sports.get(12));
            softAssert.assertTrue(azSportsPage.isSport13StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 13) {
            softAssert.assertTrue(azSportsPage.isSport14IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport14Name(), sports.get(13));
            softAssert.assertTrue(azSportsPage.isSport14StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 14) {
            softAssert.assertTrue(azSportsPage.isSport15IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport15Name(), sports.get(14));
            softAssert.assertTrue(azSportsPage.isSport15StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 15) {
            softAssert.assertTrue(azSportsPage.isSport16IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport16Name(), sports.get(15));
            softAssert.assertTrue(azSportsPage.isSport16StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 16) {
            softAssert.assertTrue(azSportsPage.isSport17IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport17Name(), sports.get(16));
            softAssert.assertTrue(azSportsPage.isSport17StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 17) {
            softAssert.assertTrue(azSportsPage.isSport18IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport18Name(), sports.get(17));
            softAssert.assertTrue(azSportsPage.isSport18StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 18) {
            softAssert.assertTrue(azSportsPage.isSport19IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport19Name(), sports.get(18));
            softAssert.assertTrue(azSportsPage.isSport19StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 19) {
            softAssert.assertTrue(azSportsPage.isSport20IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport20Name(), sports.get(19));
            softAssert.assertTrue(azSportsPage.isSport20StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 20) {
            softAssert.assertTrue(azSportsPage.isSport21IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport21Name(), sports.get(20));
            softAssert.assertTrue(azSportsPage.isSport21StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 21) {
            softAssert.assertTrue(azSportsPage.isSport22IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport22Name(), sports.get(21));
            softAssert.assertTrue(azSportsPage.isSport22StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 22) {
            softAssert.assertTrue(azSportsPage.isSport23IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport23Name(), sports.get(22));
            softAssert.assertTrue(azSportsPage.isSport23StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 23) {
            softAssert.assertTrue(azSportsPage.isSport24IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport24Name(), sports.get(23));
            softAssert.assertTrue(azSportsPage.isSport24StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 24) {
            softAssert.assertTrue(azSportsPage.isSport25IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport25Name(), sports.get(24));
            softAssert.assertTrue(azSportsPage.isSport25StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 25) {
            softAssert.assertTrue(azSportsPage.isSport26IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport26Name(), sports.get(25));
            softAssert.assertTrue(azSportsPage.isSport26StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 26) {
            softAssert.assertTrue(azSportsPage.isSport27IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport27Name(), sports.get(26));
            softAssert.assertTrue(azSportsPage.isSport27StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 27) {
            softAssert.assertTrue(azSportsPage.isSport28IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport28Name(), sports.get(27));
            softAssert.assertTrue(azSportsPage.isSport28StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 28) {
            softAssert.assertTrue(azSportsPage.isSport29IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport29Name(), sports.get(28));
            softAssert.assertTrue(azSportsPage.isSport29StarNotDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 29) {
            softAssert.assertTrue(azSportsPage.isSport30IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport30Name(), sports.get(29));
            softAssert.assertTrue(azSportsPage.isSport30StarNotDisplayed());
            scrollTeenyUp();
        }
        softAssert.assertAll();
    }

    @Test
    public void checkSportsOnAZPageLoggedUser() throws InterruptedException, IOException {
        final List<String> sports = new ArrayList<>();
        getListOfAllActualSports().getData().getItems().stream().forEach(f -> sports.add(f.getTitle()));
        Collections.sort(sports);
        int sportsCount = sports.size();

        homePage.waitUntilMainMenuLinkIsVisible();
        login(ADMIN_LOGIN, ADMIN_PASSWORD);
        bottomMenu.clickOnBottomMenu_AZSports();
        azSportsPage.waitUntilAZSportsMenuIsDisplayed();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(azSportsPage.isAZSportsScreenDisplayed());
        softAssert.assertTrue(bottomMenu.isActiveBottomMenu_AZSportsDisplayed());
        softAssert.assertTrue(azSportsPage.isAZSportsScreenSearchDisplayed());
        softAssert.assertEquals(azSportsPage.getAzSportsScreenText(), "A-Z");
        azSportsPage.waitUntilSport1Displayed();

        if (sportsCount > 0) {
            softAssert.assertTrue(azSportsPage.isSport1IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport1Name(), sports.get(0));
            softAssert.assertTrue(azSportsPage.isSport1StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 1) {
            softAssert.assertTrue(azSportsPage.isSport2IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport2Name(), sports.get(1));
            softAssert.assertTrue(azSportsPage.isSport2StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 2) {
            softAssert.assertTrue(azSportsPage.isSport3IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport3Name(), sports.get(2));
            softAssert.assertTrue(azSportsPage.isSport3StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 3) {
            softAssert.assertTrue(azSportsPage.isSport4IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport4Name(), sports.get(3));
            softAssert.assertTrue(azSportsPage.isSport4StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 4) {
            softAssert.assertTrue(azSportsPage.isSport5IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport5Name(), sports.get(4));
            softAssert.assertTrue(azSportsPage.isSport5StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 5) {
            softAssert.assertTrue(azSportsPage.isSport6IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport6Name(), sports.get(5));
            softAssert.assertTrue(azSportsPage.isSport6StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 6) {
            softAssert.assertTrue(azSportsPage.isSport7IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport7Name(), sports.get(6));
            softAssert.assertTrue(azSportsPage.isSport7StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 7) {
            softAssert.assertTrue(azSportsPage.isSport8IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport8Name(), sports.get(7));
            softAssert.assertTrue(azSportsPage.isSport8StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 8) {
            softAssert.assertTrue(azSportsPage.isSport9IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport9Name(), sports.get(8));
            softAssert.assertTrue(azSportsPage.isSport9StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 9) {
            softAssert.assertTrue(azSportsPage.isSport10IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport10Name(), sports.get(9));
            softAssert.assertTrue(azSportsPage.isSport10StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 10) {
            softAssert.assertTrue(azSportsPage.isSport11IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport11Name(), sports.get(10));
            softAssert.assertTrue(azSportsPage.isSport11StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 11) {
            softAssert.assertTrue(azSportsPage.isSport12IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport12Name(), sports.get(11));
            softAssert.assertTrue(azSportsPage.isSport12StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 12) {
            softAssert.assertTrue(azSportsPage.isSport13IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport13Name(), sports.get(12));
            softAssert.assertTrue(azSportsPage.isSport13StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 13) {
            softAssert.assertTrue(azSportsPage.isSport14IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport14Name(), sports.get(13));
            softAssert.assertTrue(azSportsPage.isSport14StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 14) {
            softAssert.assertTrue(azSportsPage.isSport15IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport15Name(), sports.get(14));
            softAssert.assertTrue(azSportsPage.isSport15StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 15) {
            softAssert.assertTrue(azSportsPage.isSport16IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport16Name(), sports.get(15));
            softAssert.assertTrue(azSportsPage.isSport16StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 16) {
            softAssert.assertTrue(azSportsPage.isSport17IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport17Name(), sports.get(16));
            softAssert.assertTrue(azSportsPage.isSport17StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 17) {
            softAssert.assertTrue(azSportsPage.isSport18IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport18Name(), sports.get(17));
            softAssert.assertTrue(azSportsPage.isSport18StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 18) {
            softAssert.assertTrue(azSportsPage.isSport19IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport19Name(), sports.get(18));
            softAssert.assertTrue(azSportsPage.isSport19StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 19) {
            softAssert.assertTrue(azSportsPage.isSport20IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport20Name(), sports.get(19));
            softAssert.assertTrue(azSportsPage.isSport20StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 20) {
            softAssert.assertTrue(azSportsPage.isSport21IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport21Name(), sports.get(20));
            softAssert.assertTrue(azSportsPage.isSport21StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 21) {
            softAssert.assertTrue(azSportsPage.isSport22IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport22Name(), sports.get(21));
            softAssert.assertTrue(azSportsPage.isSport22StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 22) {
            softAssert.assertTrue(azSportsPage.isSport23IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport23Name(), sports.get(22));
            softAssert.assertTrue(azSportsPage.isSport23StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 23) {
            softAssert.assertTrue(azSportsPage.isSport24IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport24Name(), sports.get(23));
            softAssert.assertTrue(azSportsPage.isSport24StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 24) {
            softAssert.assertTrue(azSportsPage.isSport25IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport25Name(), sports.get(24));
            softAssert.assertTrue(azSportsPage.isSport25StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 25) {
            softAssert.assertTrue(azSportsPage.isSport26IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport26Name(), sports.get(25));
            softAssert.assertTrue(azSportsPage.isSport26StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 26) {
            softAssert.assertTrue(azSportsPage.isSport27IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport27Name(), sports.get(26));
            softAssert.assertTrue(azSportsPage.isSport27StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 27) {
            softAssert.assertTrue(azSportsPage.isSport28IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport28Name(), sports.get(27));
            softAssert.assertTrue(azSportsPage.isSport28StarDisplayed());
            scrollTeenyUp();
        }

        if (sportsCount > 28) {
            softAssert.assertTrue(azSportsPage.isSport29IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport29Name(), sports.get(28));
            softAssert.assertTrue(azSportsPage.isSport29StarDisplayed());
            scrollTeenyUp();
            scrollTeenyUp();
        }

        if (sportsCount > 29) {
            softAssert.assertTrue(azSportsPage.isSport30IconDisplayed());
            softAssert.assertEquals(azSportsPage.getSport30Name(), sports.get(29));
            softAssert.assertTrue(azSportsPage.isSport30StarDisplayed());
            scrollTeenyUp();
        }
        softAssert.assertAll();
    }
}
