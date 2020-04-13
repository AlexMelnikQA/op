package Tests.MainMenu.ResponsibleGambling;

import Pages.Home.HomePage;
import Pages.LoginPage;
import Pages.Menus.MainMenu;
import Pages.Menus.ResponsibleGambling.ResponsibleGamblingRules.*;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.scrollHalfUp;
import static Pages.BasePage.scrollUp;

public class ResponsibleGamblingRulesTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private LoginPage loginPage;
    private ResponsibleGamblingRules responsibleGamblingRules;
    private TakeOurTest takeOurTest;
    private TrackGambling trackGambling;
    private NeedABreak needABreak;
    private ProtectingMinors protectingMinors;
    private OurCommitment ourCommitment;
    private BottomPopupDialog bottomPopupDialog;


    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        loginPage = new LoginPage(driver);
        responsibleGamblingRules = new ResponsibleGamblingRules(driver);
        takeOurTest = new TakeOurTest(driver);
        trackGambling = new TrackGambling(driver);
        needABreak = new NeedABreak(driver);
        protectingMinors = new ProtectingMinors(driver);
        ourCommitment = new OurCommitment(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
    }

    @Test
    public void checkControlsOnResponsiveGamblingRulesPage() {
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responsibleGamblingRules.isResponsibleGamblingScreenVisible(),
                "Responsible Gambling Screen NOT Visible");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingTitle(),
                "Responsible gambling rules");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingTitleComment(),
                "Gambling is a fun and exciting pastime so let's keep it that way");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingFirstText(),
                "The majority of people have a great time gambling and do so responsibly, " +
                        "unfortunately, for a small number of people, gambling can become a problem. " +
                        "If you feel that you are no longer gambling for fun, or you just wish to " +
                        "obtain more information about the help available to you or your loved ones, " +
                        "then over the next few pages, we at Sporting Index, can help show you the way.");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingSecondText(),
                "You can scroll down through the pages to find, among other things, advice, " +
                        "links to helpful websites and ways to evaluate your gambling, " +
                        "or that of a friend or family member. Alternatively, you can click on " +
                        "the headings below to navigate straight to what you are looking for.");
        scrollUp();
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingFirstTopicName(),
                "Take our test");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingFirstTopicDescription(),
                "Are you unsure as to whether your gambling is a problem or not? " +
                        "Or maybe you are worried about a friend or family member? " +
                        "Why not take this simple test to better evaluate your situation?");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingSecondTopicName(),
                "Track gambling");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingSecondTopicDescription(),
                "Tracking your gambling is an important part of gambling responsibly and " +
                        "can help you remain in control of your finances. " +
                        "There are a number of helpful tips and tools that may help!");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingThirdTopicName(),
                "Need a break");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingThirdTopicDescription(),
                "If so, you can choose to apply a Time Out period to your account. " +
                        "This freezes your account for a duration of your choice: " +
                        "24hours, 48hours, 7 days, 30days or 6 weeks.");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingFourthTopicName(),
                "Protecting minors");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingFourthTopicDescription(),
                "It is illegal for anyone under the age of 18 to open a " +
                        "Sporting Index account or to gamble with us and we take steps " +
                        "to confirm the age and identification of every new customer..");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingFifthTopicName(),
                "Our commitment to speaking plainly ");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingFifthTopicDescription(),
                "Our aim is to make things as easy as possible for you - we don't want you " +
                        "to have to sift through pages of jargon and come out at the end none the wiser.");
        softAssert.assertAll();
    }

    @Test
    public void checkControlsOnResponsiveGamblingRulesTakeOurTestPage() {
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();
        responsibleGamblingRules.clickOnResponsibleGamblingFirstTopic();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responsibleGamblingRules.isResponsibleGamblingBackButtonDisplayed(),
                "Responsible Gambling Back Button NOT Visible");
        softAssert.assertTrue(takeOurTest.isTakeOurTestScreenVisible(),
                "Take Our Test Screen NOT Visible");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenFirstText(),
                "Are you unsure as to whether your gambling is a problem or not? " +
                        "Or maybe you are worried about a friend or family member? " +
                        "Why not take this simple test to better evaluate your situation?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList1Text(),
                "Do you stay away from work or college to bet?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList2Text(),
                "Do you bet to escape what you feel to be a boring or unhappy life?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList3Text(),
                "When betting and you run out of money, do you feel lost and in despair, " +
                        "and need to gamble again as soon as possible?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList4Text(),
                "After losing, do you feel you must try to win back your losses as soon as possible?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList5Text(),
                "Have you bet more than you can really afford to lose?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList6Text(),
                "Do you bet until every last penny is gone, " +
                        "even the bus fare home or the cost of a cup of tea?");
        scrollHalfUp();
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList3Text(),
                "Have you had to increase the amount of money you gamble with over " +
                        "the last 12 months to experience the same level of excitement?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList4Text(),
                "Have you borrowed money or sold anything to get money to gamble?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList5Text(),
                "Have you ever felt that you might have a gambling problem?");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenList6Text(),
                "Have others criticised your levels of gambling, " +
                        "or told you that you have a gambling problem, " +
                        "regardless of whether you thought it was true?");
        scrollUp();
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenSecondText(),
                "If you answered 'Yes' to at least 4 of these questions, it is likely that you are " +
                        "experiencing gambling issues. To find out about how to get confidential expert advice " +
                        "and support, please ring the National Gambling Helpline on 0 808 802 0133 to speak " +
                        "to an advisor, or click here to be taken to the Gamcare website. " +
                        "The helpline is open 7 days a week, from 8am to midnight.");
        scrollUp();
        softAssert.assertTrue(takeOurTest.isTakeOurTestScreenLinkFirstVisible(),
                "Take Our Test Screen First Link NOT Visible");
        softAssert.assertTrue(takeOurTest.isTakeOurTestScreenLinkSecondVisible(),
                "Take Our Test Screen Second Link NOT Visible");
        softAssert.assertEquals(takeOurTest.getTakeOurTestScreenThirdText(),
                "A National Gambling Helpline advisor will listen to you carefully and encourage you " +
                        "to talk about your concerns. Sometimes just telling someone can be a relief, and " +
                        "is an important first step towards dealing with the problem. The advisor will be able " +
                        "to suggest ways of helping you to stop betting, or if you are someone who is indirectly " +
                        "affected by a betting problem, ways to support the person in their process of stopping, " +
                        "and ways to deal with the effects on your own life. If you want to address " +
                        "the underlying issues that drive you to bet more than you want, the advisor " +
                        "may be able to help you do that too.");
        softAssert.assertAll();
    }

    @Test
    public void checkControlsOnResponsiveGamblingRulesTrackGamblingPage() {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();

        responsibleGamblingRules.clickOnResponsibleGamblingSecondTopic();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responsibleGamblingRules.isResponsibleGamblingBackButtonDisplayed(),
                "Responsible Gambling Back Button NOT Visible");
  //      softAssert.assertTrue(trackGambling.isTrackGamblingScreenVisible(),
      //          "Track Gambling Screen NOT Visible");

        softAssert.assertEquals(trackGambling.getTrackGamblingText1(),
                "Tracking your gambling is an important part of gambling responsibly and can help you remain" +
                        " in control of your finances. There are a number of helpful tips and tools that may help!");
        softAssert.assertEquals(trackGambling.getTrackGamblingText2(), "Remember to manage your play:");
        softAssert.assertEquals(trackGambling.getTrackGamblingText3(),
                "Gambling should always be thought of as a form of entertainment and not a means to earn money.");
        scrollUp();
        softAssert.assertEquals(trackGambling.getTrackGamblingText4(),
                "Only you can know how best to manage your play, and it's up to you which," +
                        " if any, of these tips you will find helpful.");
        softAssert.assertEquals(trackGambling.getTrackGamblingText5(),"Keep an eye on your spending:");
        softAssert.assertEquals(trackGambling.getTrackGamblingText6(),
                "Do you know how much you are spending on gambling? This knowledge can help you " +
                        "stay in control so try using this simple calculator to see how much you are " +
                        "actually spending on gambling: begambleaware.org/safer-..-spend");
        softAssert.assertEquals(trackGambling.getTrackGamblingText7(),
                "Are you worried about a friend or a family member?");
        scrollHalfUp();
        softAssert.assertEquals(trackGambling.getTrackGamblingText8(),
                "Here are a few signs that they may not be in control of their gambling:");
        scrollHalfUp();
        softAssert.assertEquals(trackGambling.getTrackGamblingText9(),
                "If someone you know is exhibiting these signs, there are ways you can help and support them.");
        softAssert.assertAll();
    }

    @Test
    public void checkControlsOnResponsiveGamblingRulesNeedABreakPage() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();
        Waiters.waitShort();
        scrollUp();
        responsibleGamblingRules.clickOnResponsibleGamblingThirdTopic();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responsibleGamblingRules.isResponsibleGamblingBackButtonDisplayed(),
                "Responsible Gambling Back Button NOT Visible");
        softAssert.assertEquals(needABreak.getNeedABreakTitleFirstText(),
                "Do you think you need a breather?");
        softAssert.assertEquals(needABreak.getNeedABreakText11(),
                "You will not be able to place or close any bets during that period and will not receive " +
                        "any gambling-related marketing from us. Once you choose to Time Out, this will take effect " +
                        "immediately, so please close any open bets that you can before you do so. If you do not, " +
                        "then they will be allowed to run to their natural conclusion.");
        softAssert.assertEquals(needABreak.getNeedABreakText12(),
                "If you think you need a Time Out, you can request it through any of the " +
                        "contact channels available: post, email, Live Chat or via Twitter. " +
                        "You can also contact our Customer Service Team on:");
        softAssert.assertEquals(needABreak.getNeedABreakText13(),
                "If you think you need a Time Out, you can request it through any of the " +
                        "contact channels available: post, email, Live Chat or via Twitter. " +
                        "You can also contact our Customer Service Team on:");
        softAssert.assertEquals(needABreak.getNeedABreakLink11(), "U.K: 0 800 096 9607");
        softAssert.assertEquals(needABreak.getNeedABreakLink12(), "Intl: 44 207 840 4050");
        scrollHalfUp();
        softAssert.assertEquals(needABreak.getNeedABreakTitleSecondText(),
                "Perhaps you feel you need a longer break?");

        softAssert.assertEquals(needABreak.getNeedABreakText21(),
                "If you consider your gambling to have become a serious problem, you may need to self-exclude for a period of time. Self-exclusion means that you are unable to place any bet with us, across our whole service (spread bets, fixed odds or casino bets) for the pre-determined time period.");
        softAssert.assertEquals(needABreak.getNeedABreakText22(),
                "With our internal self exclusion programme you can choose to self-exclude from a minimum " +
                        "period of 6 months, 1 year or 5 years. If you don't specify a duration of self-exclusion," +
                        "then the minimum time period of six months will be applied to your account.");
        softAssert.assertEquals(needABreak.getNeedABreakTitleThirdText(), "Understanding self-exclusion");
        scrollHalfUp();
        softAssert.assertEquals(needABreak.getNeedABreakText31(),
                "Once you request a self-exclusion, it takes effect immediately by your removal " +
                        "from all mailing lists, and the balance on your account being paid back. " +
                        "Should you wish to reactivate a self-excluded account once the appropriate time period " +
                        "has elapsed, a 24-hour cooling off period is applied before your account can be reopened.");
        softAssert.assertEquals(needABreak.getNeedABreakText32(),
                "If you think you need to Self-Exclude, you can request it through any of the contact channels " +
                        "available: post, email, Live Chat or via Twitter. You can also contact our Customer Service Team on:");
        softAssert.assertEquals(needABreak.getNeedABreakLink31(), "U.K: 0 800 096 9607");
        softAssert.assertEquals(needABreak.getNeedABreakLink32(), "Intl: 44 207 840 4050");
        scrollHalfUp();
        softAssert.assertEquals(needABreak.getNeedABreakTitleFourthText(), "GAMSTOP");
        softAssert.assertEquals(needABreak.getNeedABreakText41(),
                "In addition to our own internal self-exclusion facility, we are registered with GAMSTOP, " +
                        "the self-exclusion service provided by The National Online Self Exclusion Scheme Limited.");
        softAssert.assertEquals(needABreak.getNeedABreakLink41(),
                "You can find out more details about the GAMSTOP self-exclusion service by visiting gamstop.co.uk");
        softAssert.assertTrue(needABreak.isNeedABreakImageLogoVisible(), "Image Logo is NOT Visible");
        softAssert.assertAll();
    }

    @Test
    public void checkControlsOnResponsiveGamblingRulesProtectMinorPage() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();
        Waiters.waitShort();
        scrollUp();
        responsibleGamblingRules.clickOnResponsibleGamblingFourthTopic();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responsibleGamblingRules.isResponsibleGamblingBackButtonDisplayed(),
                "Responsible Gambling Back Button NOT Visible");
        softAssert.assertEquals(protectingMinors.getProtectMinorFirstText(),
                "It is illegal for anyone under the age of 18 to open a Sporting Index account or to gamble " +
                        "with us and we take steps to confirm the age and identification of every new customer. " +
                        "We do all we can to protect minors, but if you are a parent or guardian and wish " +
                        "to actively help protect your child, then we encourage you to install filtering software " +
                        "so that children and young persons are not able to access gambling websites such as ours.");
        softAssert.assertEquals(protectingMinors.getProtectMinorSecondText(),
                "There are many different providers of filtering software available, some of the most popular are:");
        softAssert.assertEquals(protectingMinors.getProtectMinorLinkFirstText(), "netnanny.com");
        softAssert.assertEquals(protectingMinors.getProtectMinorLinkSecondText(), "cyberpatrol.com");
        softAssert.assertEquals(protectingMinors.getProtectMinorLinkThirdText(), "cybersitter.com");
        softAssert.assertEquals(protectingMinors.getProtectMinorThirdText(),
                "Further information on software which can block access to gambling sites can be found at this link - ");
        softAssert.assertEquals(protectingMinors.getProtectMinorFourthText(), "Blocking Software Information.");
        softAssert.assertAll();
    }

    @Test
    public void checkControlsOnResponsiveGamblingRulesOurCommitmentPage() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();
        Waiters.waitShort();
        scrollUp();
        responsibleGamblingRules.clickOnResponsibleGamblingFifthTopic();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responsibleGamblingRules.isResponsibleGamblingBackButtonDisplayed(),
                "Responsible Gambling Back Button NOT Visible");
        softAssert.assertEquals(ourCommitment.getOurCommitmentText(),
                "Our aim is to make things as easy as possible for you - we don't want you to have to sift " +
                        "through pages of jargon and come out at the end none the wiser, because it's in our interest " +
                        "as a business to have you clued up. That's why we have tried to keep our responsible " +
                        "gambling page as clear as possible, so that we feel comfortable that you understand. " +
                        "However, if there is something that you are unclear about, feel free to contact " +
                        "our customer services for more information, by post, email, Live Chat, or give us a call:");
        softAssert.assertEquals(ourCommitment.getOurCommitmentLinkFirstText(),
                "U.K: 0 800 096 9607");
        softAssert.assertEquals(ourCommitment.getOurCommitmentLinkSecondText(),
                "Intl: 44 207 840 4050");
        softAssert.assertAll();
    }




    /*
    @Test
    public void checkVisibilityOfElementsInResponsiveGamblingControls() throws InterruptedException {

        login(USER_WITH_BALANCE, PASSWORD);

        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responsibleGamblingRules.isResponsibleGamblingScreenVisible(), "Responsible Gambling Screen NOT Visible");
        softAssert.assertEquals(responsibleGamblingRules.getResponsibleGamblingTitle(), "Responsible gambling rules");

        softAssert.assertTrue(responsibleGamblingRules.isDepositLimitTextVisible());
        responsibleGamblingRules.clickOnDepositLimitInfoIcon();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        softAssert.assertEquals(responsibleGamblingRules.getDepositNotificationText1(),
                "Using our deposit limit controls, you can select a limit on how much you want to deposit daily, " +
                        "weekly or monthly. For your safety, should you want to increase your limit, there is a 24 " +
                        "hour waiting period.");
        softAssert.assertEquals(responsibleGamblingRules.getDepositNotificationText2(),
                "If you make a change to a deposit limit, please be aware that only deposits after the date " +
                        "confirmed, will count towards the new limit.");
        bottomPopupDialog.clickOnClosePopupButton();
        softAssert.assertTrue(responsibleGamblingRules.getPendingDepositText().substring(30, 36)
                .matches(TEMPORARY_MONEY_PATTERN_FOR_PROMO), "Money pattern doesn't match value");
        softAssert.assertTrue(responsibleGamblingRules.isPendingDepositTextVisible());
        softAssert.assertTrue(responsibleGamblingRules.isConfirmButtonVisible());
        softAssert.assertTrue(responsibleGamblingRules.isNoLimitSelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.isDailySelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.isWeeklySelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.isMonthlySelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.isAmountInputFieldVisible());
        softAssert.assertTrue(responsibleGamblingRules.isDepositApplyButtonVisible());
        scrollUp();
        softAssert.assertTrue(responsibleGamblingRules.isTimeOutTextVisible());
        responsibleGamblingRules.clickOnTimeOutIcon();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(),
                "If you wish to restrict your play with a time-out, the following options are available for you to " +
                        "suspend your account. Please note these options are all temporary.");
        bottomPopupDialog.clickOnClosePopupButton();
        softAssert.assertTrue(responsibleGamblingRules.isNoneSelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.is24SelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.is7DaysSelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.is30DaysSelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.is6WeeksSelectorVisible());
        softAssert.assertTrue(responsibleGamblingRules.isTimeOutApplyButtonVisible());
        softAssert.assertTrue(responsibleGamblingRules.isSelfExclusionTitleVisible());
        softAssert.assertTrue(responsibleGamblingRules.isSelfExclusionTextPart1Visible());
        softAssert.assertTrue(responsibleGamblingRules.isSelfExclusionTextPart2Visible());
        softAssert.assertTrue(responsibleGamblingRules.isSelfExclusionTextPar31Visible());
        responsibleGamblingRules.clickOn24HSelector();
        responsibleGamblingRules.clickOnTimeOutApplyButton();
        softAssert.assertEquals(responsibleGamblingRules.getTimeOutSettingTitle(), "Time-Out Setting Confirmation");
        softAssert.assertEquals(responsibleGamblingRules.getTimeOutSettingText1(),
                "By setting this time-out you will be unable to log in to your account to bet or play on Sporting " +
                        "Index for the chosen period. Once set, you will be unable to reverse this until the period " +
                        "ends.");
        softAssert.assertEquals(responsibleGamblingRules.getTimeOutSettingText2(),
                "At the end of your selected time out period your account will automatically be reopened");
        softAssert.assertEquals(responsibleGamblingRules.getTimeOutConfirmationValue(), "24 Hours");
        softAssert.assertTrue(responsibleGamblingRules.isTimeOutConfirmButtonVisible());
        responsibleGamblingRules.clickOnCancelButton();
        softAssert.assertAll();
    }

    @Test
    public void checkChangingDepositLimit() throws InterruptedException {
        final double randomMoneyValue = (ThreadLocalRandom.current().nextDouble(1, 100));
        final String DEPOSIT_AMOUNT = String.valueOf(Math.round(randomMoneyValue * 100.0) / 100.0);
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnLoginButton();
        // loginPage.
        login(USER_WITH_BALANCE, PASSWORD);
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();

        SoftAssert softAssert = new SoftAssert();
        Waiters.waitMiddle();
        responsibleGamblingRules.clickOnDailySelector();
        responsibleGamblingRules.setDepositLimitAmount(DEPOSIT_AMOUNT);
        responsibleGamblingRules.clickOnApplyDepositLimitButton();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Success!");
        bottomPopupDialog.clickOnClosePopupButton();
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formattedCurrentDate = DateTimeFormatter.ofPattern("dd");
        Integer formattedDate = Integer.valueOf(currentDate.format(formattedCurrentDate));
        softAssert.assertEquals(Integer.parseInt(responsibleGamblingRules.getPendingDepositText().substring(99,
                101)), formattedDate + 1, "Tomorrow day doesn't match");
        softAssert.assertAll();
    }

    @Test
    public void checkChangingTimeOutLimit() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnLoginButton();
        login(USER_WITH_TIME_OUT, USER_WITH_TIME_OUT_PASSWORD);
        //loginPage.login(USER_WITH_TIME_OUT, USER_WITH_TIME_OUT_PASSWORD);
        if (!bottomPopupDialog.isErrorTitleNotVisible()) {
            Assert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "YOUR ACCOUNT HAS BEEN TIMED OUT");
        }
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnResponsibleGamblingControlsLink();
        responsibleGamblingRules.clickOn24HSelector();
        responsibleGamblingRules.clickOnTimeOutApplyButton();
        responsibleGamblingRules.typeAccountPassword("wrongPassword");
        responsibleGamblingRules.clickConfirmTimeoutButton();
        responsibleGamblingRules.isTimeOutErrorVisible();
        responsibleGamblingRules.clearPasswordTimeoutInput();
        responsibleGamblingRules.typeAccountPassword(USER_WITH_TIME_OUT_PASSWORD);
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Confirmed");
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(), "Your time out has been " +
                "confirmed" +
                " we are now logging you out.");
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        bottomPopupDialog.clickOnClosePopupButton();
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        softAssert.assertTrue(mainMenu.isLogoutLinkNotDisplayed());
        // loginPage.
        login(USER_WITH_TIME_OUT, USER_WITH_TIME_OUT_PASSWORD);
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), "Unable to login");
        softAssert.assertEquals(bottomPopupDialog.getBottomPopupNotificationText(), "Your account is currently " +
                "set to " +
                "a period of Time Out and you will be unable to login until that period is over.");
        softAssert.assertAll();
    }*/
}