package Tests.MainMenu.HelpAndSupport;

import Pages.Home.HomePage;
import Pages.Menus.HelpAndSupport.Disclaimer;
import Pages.Menus.MainMenu;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.scrollHalfUp;

public class DisclaimerTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private Disclaimer disclaimer;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        disclaimer = new Disclaimer(driver);
    }

    @Test
    public void checkDisclaimerInformation() {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        mainMenu.waitUntilHelpAndSupportLinkIsVisible();
        mainMenu.clickOnHelpAndSupportLink();
        disclaimer.waitUntilLinkIsVisible();
        scrollHalfUp();
        disclaimer.clickOnDisclaimerLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(disclaimer.isDisclaimerScreenDisplayed(), "Disclaimer Screen is displayed");
        softAssert.assertEquals(disclaimer.getDisclaimerNameText(), "Disclaimer");
        softAssert.assertEquals(disclaimer.getDisclaimerCommentText(), "Please read carefully");
        softAssert.assertEquals(disclaimer.getDisclaimerTextPart1(), "The information on this mobile optimised " +
                "website is not directed at residents of the United States or any particular country outside the " +
                "UK/ROI and is not intended for \n" +
                "distribution to, or use by, any person in any country or jurisdiction where such distribution or use" +
                " would be contrary to local law or regulation.");
        softAssert.assertEquals(disclaimer.getDisclaimerTextPart2(), "It is the responsibility of visitors to this " +
                "website to ascertain the terms of and comply with any local law or regulation to which they are " +
                "subject.");
        softAssert.assertEquals(disclaimer.getDisclaimerTextPart3(), "Whilst Sporting Index has made every effort to " +
                "ensure the accuracy of the information on this website, the information given on the website is " +
                "subject to change, often \n" +
                "without notice. It is for guidance only and no liability is accepted by Sporting Index for its " +
                "accuracy or otherwise.");
        softAssert.assertEquals(disclaimer.getDisclaimerTextPart4(), "Whilst Sporting Index makes every effort to " +
                "prohibit unauthorised registration or usage of this website, it cannot prevent determined and " +
                "deliberate avoidance or evasion \n" +
                "of the regulations and therefore cannot guarantee local jurisdictional compliance.");
        softAssert.assertAll();
    }

}
