package Tests.BetSleep;

import Pages.BetSleep.BetSleepHeaderPage;
import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.scrollTeenyUp;


public class BetSleepHeaderTest extends TestBase {

    private HomePage homePage;
    private HomePageLiveTab homePageLiveTab;
    private BetSleepHeaderPage betSleepHeaderPage;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        homePageLiveTab = new HomePageLiveTab(driver);
        betSleepHeaderPage = new BetSleepHeaderPage(driver);
    }

    @Test
    public void checkBetSleepHeader() {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnLiveTab();
        homePageLiveTab.waitFistSportBecomesVisible();

        boolean isFirstMarketSportFirstNotSuspended = false;
        boolean isSecondMarketSportFirstNotSuspended = false;
        boolean isThirdMarketSportFirstNotSuspended = false;

        boolean isFirstMarketSportSecondNotSuspended = false;
        boolean isSecondMarketSportSecondNotSuspended = false;

        boolean isFirstMarketSportThirdNotSuspended = false;


        SoftAssert softAssert = new SoftAssert();

        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            isFirstMarketSportFirstNotSuspended = true;
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
            checkBetSleepHeaderElements();
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getFirstMarketSportFirstDescriptionText());

            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());

            homePageLiveTab.clickOnFirstMarketSportFirstSellButton();
            checkBetSleepHeaderElements();
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getFirstMarketSportFirstDescriptionText());

            homePageLiveTab.clickOnFirstMarketSportFirstSellButton();
            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

            homePageLiveTab.clickOnFirstMarketSportFirstSellButton();
            System.out.println("First Market Sport First is not Suspended");
        } else {
            System.out.println("First Market Sport First is present but Suspended");
        }

        if (!homePageLiveTab.isSecondMarketSportFirstNotDisplayed()) {
            if (homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
                isSecondMarketSportFirstNotSuspended = true;
                homePageLiveTab.clickOnSecondMarketSportFirstBuyButton();
                if (!isFirstMarketSportFirstNotSuspended) {
                    checkBetSleepHeaderElements();
                    softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                            homePageLiveTab.getSecondMarketSportFirstDescriptionText());

                    homePageLiveTab.clickOnSecondMarketSportFirstBuyButton();
                    softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                    homePageLiveTab.clickOnSecondMarketSportFirstBuyButton();
                    softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());

                    homePageLiveTab.clickOnSecondMarketSportFirstSellButton();
                    checkBetSleepHeaderElements();
                    softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                            homePageLiveTab.getFirstMarketSportFirstDescriptionText());

                    homePageLiveTab.clickOnSecondMarketSportFirstSellButton();
                    softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                    homePageLiveTab.clickOnSecondMarketSportFirstSellButton();
                } else {
                    checkBetSleepInfoWithFirstSelectedMeeting();
                }
                System.out.println("Second Market Sport First is not Suspended");
            } else {
                System.out.println("Second Market Sport First is present but Suspended");
            }

            if (!homePageLiveTab.isThirdMarketSportFirstNotDisplayed()) {
                if (homePageLiveTab.isThirdMarketSportFirstNotSuspendedDisplayed()) {
                    isThirdMarketSportFirstNotSuspended = true;
                    scrollTeenyUp();
                    homePageLiveTab.clickOnThirdMarketSportFirstBuyButton();
                    if (!isFirstMarketSportFirstNotSuspended && !isSecondMarketSportFirstNotSuspended) {
                        checkBetSleepHeaderElements();
                        softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                homePageLiveTab.getThirdMarketSportFirstDescriptionText());

                        homePageLiveTab.clickOnThirdMarketSportFirstBuyButton();
                        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                        homePageLiveTab.clickOnThirdMarketSportFirstBuyButton();
                        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());

                        homePageLiveTab.clickOnThirdMarketSportFirstSellButton();
                        checkBetSleepHeaderElements();
                        softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                homePageLiveTab.getThirdMarketSportFirstDescriptionText());

                        homePageLiveTab.clickOnThirdMarketSportFirstSellButton();
                        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                        homePageLiveTab.clickOnThirdMarketSportFirstSellButton();
                    } else {
                        checkBetSleepInfoWithFirstAndSecondSelectedMeeting(
                                isFirstMarketSportFirstNotSuspended, isSecondMarketSportFirstNotSuspended);
                    }
                    System.out.println("Third Market Sport First is not Suspended");
                } else {
                    System.out.println("Third Market Sport First is present but Suspended");

                    if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
                        isFirstMarketSportSecondNotSuspended = true;
                        homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
                        if (!isFirstMarketSportFirstNotSuspended && !isSecondMarketSportFirstNotSuspended) {
                            checkBetSleepHeaderElements();
                            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                    homePageLiveTab.getFirstMarketSportSecondDescriptionText());

                            homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
                            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                            homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
                            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());

                            homePageLiveTab.clickOnFirstMarketSportSecondSellButton();
                            checkBetSleepHeaderElements();
                            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                    homePageLiveTab.getFirstMarketSportSecondDescriptionText());

                            homePageLiveTab.clickOnFirstMarketSportSecondSellButton();
                            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                            homePageLiveTab.clickOnFirstMarketSportSecondSellButton();
                        } else {
                            checkBetSleepInfoWithFirstAndSecondSelectedMeeting(
                                    isFirstMarketSportFirstNotSuspended, isSecondMarketSportFirstNotSuspended);
                        }
                        System.out.println("First Market Sport Second is not Suspended");
                    } else {
                        System.out.println("First Market Sport Second is present but Suspended");
                    }
                }
            }

        } else if (!homePageLiveTab.isFirstMarketSportSecondNotDisplayed()) {
            if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
                isFirstMarketSportSecondNotSuspended = true;
                homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
                if (!isFirstMarketSportFirstNotSuspended) {
                    checkBetSleepHeaderElements();
                    softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                            homePageLiveTab.getFirstMarketSportSecondDescriptionText());

                    homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
                    softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                    homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
                    softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());

                    homePageLiveTab.clickOnFirstMarketSportSecondSellButton();
                    checkBetSleepHeaderElements();
                    softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                            homePageLiveTab.getFirstMarketSportSecondDescriptionText());

                    homePageLiveTab.clickOnFirstMarketSportSecondSellButton();
                    softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                    homePageLiveTab.clickOnFirstMarketSportSecondSellButton();
                } else {
                    checkBetSleepInfoWithFirstSelectedMeeting();
                }
                System.out.println("First Market Sport Second is not Suspended");
            } else {
                System.out.println("First Market Sport Second is present but Suspended");
            }

            if (!homePageLiveTab.isSecondMarketSportSecondNotDisplayed()) {
                if (homePageLiveTab.isSecondMarketSportSecondNotSuspendedDisplayed()) {
                    isSecondMarketSportSecondNotSuspended = true;
                    scrollTeenyUp();
                    homePageLiveTab.clickOnSecondMarketSportSecondBuyButton();
                    if (!isFirstMarketSportFirstNotSuspended && !isFirstMarketSportSecondNotSuspended) {
                        checkBetSleepHeaderElements();
                        softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                homePageLiveTab.getSecondMarketSportSecondDescriptionText());

                        homePageLiveTab.clickOnSecondMarketSportSecondBuyButton();
                        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                        homePageLiveTab.clickOnSecondMarketSportSecondBuyButton();
                        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());

                        homePageLiveTab.clickOnSecondMarketSportSecondSellButton();
                        checkBetSleepHeaderElements();
                        softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                homePageLiveTab.getSecondMarketSportSecondDescriptionText());

                        homePageLiveTab.clickOnSecondMarketSportSecondSellButton();
                        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                        homePageLiveTab.clickOnSecondMarketSportSecondSellButton();
                    } else {
                        checkBetSleepInfoWithFirstAndThirdSelectedMeeting(
                                isFirstMarketSportFirstNotSuspended, isFirstMarketSportSecondNotSuspended);
                    }
                    System.out.println("Second Market Sport Second is not Suspended");
                } else {
                    System.out.println("Second Market Sport Second is present but Suspended");
                }

            } else {
                if (!homePageLiveTab.isFirstMarketSportThirdNotDisplayed()) {
                    if (homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
                        isFirstMarketSportThirdNotSuspended = true;
                        homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
                        if (!isFirstMarketSportFirstNotSuspended && !isFirstMarketSportSecondNotSuspended) {
                            checkBetSleepHeaderElements();
                            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                    homePageLiveTab.getFirstMarketSportThirdDescriptionText());

                            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
                            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                            homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
                            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());

                            homePageLiveTab.clickOnFirstMarketSportThirdSellButton();
                            checkBetSleepHeaderElements();
                            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                                    homePageLiveTab.getFirstMarketSportThirdDescriptionText());

                            homePageLiveTab.clickOnFirstMarketSportThirdSellButton();
                            softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextNotDisplayed());

                            homePageLiveTab.clickOnFirstMarketSportThirdSellButton();
                        } else {
                            checkBetSleepInfoWithFirstAndThirdSelectedMeeting(
                                    isFirstMarketSportFirstNotSuspended, isFirstMarketSportSecondNotSuspended);
                        }
                        System.out.println("First Market Sport Third is not Suspended");
                    } else {
                        System.out.println("First Market Sport Third is present but Suspended");
                    }
                }
                softAssert.assertAll();
            }
        }
    }

    private void checkBetSleepHeaderElements() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(betSleepHeaderPage.isBetSlipArrowUpButtonDisplayed());
        softAssert.assertTrue(betSleepHeaderPage.isBetSlipInformTextDisplayed());
        softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "1 outcome in Bet slip");
        softAssert.assertTrue(betSleepHeaderPage.isBetSlipMarketNameDisplayed());
        softAssert.assertAll();
    }

    private void checkBetSleepInfoWithFirstSelectedMeeting() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "2 outcomes in Bet slip");
        softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                homePageLiveTab.getFirstMarketSportFirstDescriptionText().replace(" v ", "/") + " and 1 more");
        softAssert.assertAll();
    }

    private void checkBetSleepInfoWithFirstAndSecondSelectedMeeting(
            boolean isFirstMarketSportFirstNotSuspended, boolean isSecondMarketSportFirstNotSuspended) {
        SoftAssert softAssert = new SoftAssert();
        if (!isFirstMarketSportFirstNotSuspended && isSecondMarketSportFirstNotSuspended) {
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "2 outcomes in Bet slip");
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getSecondMarketSportFirstDescriptionText().replace(" v ", "/") + " and 1 more");
        } else if (isFirstMarketSportFirstNotSuspended && !isSecondMarketSportFirstNotSuspended) {
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "2 outcomes in Bet slip");
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getFirstMarketSportFirstDescriptionText().replace(" v ", "/") + " and 1 more");
        } else {
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "3 outcomes in Bet slip");
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getFirstMarketSportFirstDescriptionText().replace(" v ", "/") + " and 2 more");
        }
        softAssert.assertAll();
    }

    private void checkBetSleepInfoWithFirstAndThirdSelectedMeeting(
            boolean isFirstMarketSportFirstNotSuspended, boolean isFirstMarketSportSecondNotSuspended) {
        SoftAssert softAssert = new SoftAssert();
        if (!isFirstMarketSportFirstNotSuspended && isFirstMarketSportSecondNotSuspended) {
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "2 outcomes in Bet slip");
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getFirstMarketSportSecondDescriptionText().replace(" v ", "/") + " and 1 more");
        } else if (isFirstMarketSportFirstNotSuspended && !isFirstMarketSportSecondNotSuspended) {
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "2 outcomes in Bet slip");
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getFirstMarketSportFirstDescriptionText().replace(" v ", "/") + " and 1 more");
        } else {
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipInformText(), "3 outcomes in Bet slip");
            softAssert.assertEquals(betSleepHeaderPage.getBetSlipMarketNameText(),
                    homePageLiveTab.getFirstMarketSportFirstDescriptionText().replace(" v ", "/") + " and 2 more");
        }
        softAssert.assertAll();
    }
}