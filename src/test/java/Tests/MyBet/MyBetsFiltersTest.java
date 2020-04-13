package Tests.MyBet;


import Pages.MyBets.MyBetsPage;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyBetsFiltersTest extends TestBase {

    private MyBetsPage myBetsPage;
    private BottomPopupDialog bottomPopupDialog;

    @BeforeTest
    public void setUpPage() {
        myBetsPage = new MyBetsPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
    }

    @Test
    public void checkMyBetsFilter() throws InterruptedException {
        login(USER_WITH_BALANCE, PASSWORD);
  //todo      homePage.waitUntilMainMenuLinkIsVisible();

        createBet();
        SoftAssert softAssert = new SoftAssert();
        Waiters.waitMiddle();
        myBetsPage.clickOnMyBetsFilterButton();
        softAssert.assertEquals(myBetsPage.getMyBetsShortTermFilterButtonText(), "SHORT TERM");
        softAssert.assertEquals(myBetsPage.getMyBetsLongTermFilterButtonText(), "LONG TERM");
        myBetsPage.clickOnMyBetsLongTermFilterButton();
        softAssert.assertEquals(myBetsPage.getMyBetsHiddenByFilterMessageText(),
                "All your open bets are hidden by your currently selected filter");
        myBetsPage.clickOnMyBetsShortTermFilterButton();
        softAssert.assertTrue(myBetsPage.isMyBetsFirstItemDisplayed());
        softAssert.assertAll();
    }
}