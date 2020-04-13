package Tests.AbstractBaseTests;

import DTO.MyBet.BetSleepDto;
import Pages.BetSleep.BetSleepHeaderPage;
import Pages.BetSleep.BetSleepPage;
import Pages.Home.HomePage;
import Pages.Home.HomePageLiveTab;
import Pages.LoginPage;
import Pages.Menus.BottomMenu;
import Pages.MyBets.MyBetsPage;
import Pages.MyBets.QuickSetBetPopup;
import Pages.Popups.AuthenticateDialog;
import Pages.Popups.BottomPopupDialog;
import Pages.Popups.LocationPopup;
import Utils.Waiters;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import static Pages.BasePage.scrollHalfUp;
import static Pages.BasePage.scrollTeenyUp;
import static Utils.Waiters.waitMiddle;
import static Utils.Waiters.waitShort;


public abstract class TestBase {

    public static AppiumDriver appiumDriver;
    public static WebDriver driver;
    private HomePageLiveTab homePageLiveTab;
    private HomePage homePage;
    private LoginPage loginPage;
    private AuthenticateDialog authenticateDialog;
    private BetSleepHeaderPage betSleepHeaderPage;
    private BottomMenu bottomMenu;
    private LocationPopup locationPopup;
    private QuickSetBetPopup quickSetBetPopup;
    private BetSleepPage betSleepPage;
    private MyBetsPage myBetsPage;
    private BottomPopupDialog bottomPopupDialog;

    protected static final String ADMIN_LOGIN = "ag622";
    protected static final String ADMIN_PASSWORD = "12086704";
    protected static final String USER_WITH_BALANCE = "A1856";
    protected static final String USER_WITH_RESTRICTED_ACCESS = "AV954";
    protected static final String USER_WITH_0_BALANCE_NAME = "A0388";
    protected static final String USER_WITH_0_BALANCE_PASSWORD = "43224618";
    protected static final String BASE_PASSWORD = "Sporting123";
    protected static final String PASSWORD = "Vadim@2020";
    protected static final String USER_WITH_TIME_OUT ="G3391";
    protected static final String USER_WITH_TIME_OUT_PASSWORD ="26734725";

    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        final URL url = new URL(URL_STRING);

        FileInputStream propertyFile;
        Properties property = new Properties();
        try {
            propertyFile = new FileInputStream("target/test-classes/env.properties");
            property.load(propertyFile);
        } catch (IOException e) {
            System.err.println("File error");
        }

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);

        //* Android
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.sportingindex.spreadsQA");// property.getProperty("appPackage"));
        cap.setCapability("platformVersion", "7.1.2"); //property.getProperty("platformVersion"));
        cap.setCapability("deviceName", "Redmi");//"emulator-5554");//"FA7B31A02205");
        cap.setCapability("appActivity", "com.spin.MainActivity");
        cap.setCapability("launchActivity", "com.spin.MainActivity");
        cap.setCapability("automationName", "UiAutomator2");
        //  */

        /* iOS
        cap.setCapability("platformName", "iOS");
        cap.setCapability("platformVersion", "12.3.1");
        cap.setCapability("deviceName", "Musterious");
        cap.setCapability("udid", "auto");
        cap.setCapability("bundleId", "io.appium.connection.AppiumRealDeviceRunner");//com.sportingindex.spreadsQA");

        cap.setCapability("app", "/Users/vakr/Desktop/spin.ipa");
        cap.setCapability("xcodeOrgId", "<your org id>");
        cap.setCapability("xcodeSigningId", "iPhone Developer");

       // cap.setCapability("automationName", "XCUITest");
   /*     cap.setCapability("useNewWDA", false);
        cap.setCapability("noReset", true);
        cap.setCapability("app", "/Users/vakr/Desktop/spin.ipa");
        cap.setCapability("waitForQuiescence", false);
        //  */


   /*     capabilities.setCapability("xcodeOrgId", "<your org id>");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("updatedWDABundleId", "<bundle id in scope of provisioning profile>");
*/
        driver = new AppiumDriver(url, cap);
        appiumDriver = (AppiumDriver) driver;
    }

    @BeforeMethod
    public void waitBeforeEachMethod() throws InterruptedException {
        waitShort();
        locationPopup = new LocationPopup(driver);
        locationPopup.clickAllowButton();
        locationPopup.clickAskCheckbox();
        locationPopup.clickAllowButtonInstall();

        Waiters.waitMiddle();
        Waiters.waitLong();
        bottomPopupDialog = new BottomPopupDialog(driver);
        if (!bottomPopupDialog.isBottomPopupCloseButtonNotDisplayed()) {
            //      if (bottomPopupDialog.getBottomPopupTitle().equals("Promotions")) {
            bottomPopupDialog.clickOnClosePopupButton();
            //     }
        }
    }

    @AfterSuite
    public void tearDownAppium() {
        if (driver != null)
            driver.quit();
    }

    @AfterMethod
    public void restartApp() {
        if (appiumDriver != null)
            appiumDriver.resetApp();
    }

    public void login(String userName) throws InterruptedException {
        loginInit();
        loginPage.login(userName, PASSWORD);
        authenticateDialog.clickOkButton();
    }

    public void login(String userName, String password) throws InterruptedException {
        loginInit();
        loginPage.login(userName, password);
        authenticateDialog.clickOkButton();
    }

    private void loginInit() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        authenticateDialog = new AuthenticateDialog(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);

        homePage.waitUntilLoginButtonIsVisible();
        homePage.clickOnLoginButton();
    }

    public void addItemsToBetSleep() throws InterruptedException {
        homePageLiveTab = new HomePageLiveTab(driver);
        quickSetBetPopup = new QuickSetBetPopup(driver);
        if (homePageLiveTab.isFirstMarketSportFirstNotSuspendedDisplayed()) {
            homePageLiveTab.clickOnFirstMarketSportFirstBuyButton();
            Waiters.waitMiddle();
            if (!quickSetBetPopup.isAddToBetSlipButtonNotVisible()) {
                quickSetBetPopup.clickOnAddToBetSlipButton();
            }
            System.out.println("First Market Sport First is not Suspended");
        } else {
            System.out.println("First Market Sport First is present but Suspended");
        }

        if (!homePageLiveTab.isSecondMarketSportFirstNotDisplayed()) {
            if (homePageLiveTab.isSecondMarketSportFirstNotSuspendedDisplayed()) {
                homePageLiveTab.clickOnSecondMarketSportFirstSellButton();
                Waiters.waitMiddle();
                if (!quickSetBetPopup.isAddToBetSlipButtonNotVisible()) {
                    quickSetBetPopup.clickOnAddToBetSlipButton();
                }
                System.out.println("Second Market Sport First is not Suspended");
            } else {
                System.out.println("Second Market Sport First is present but Suspended");
            }

            if (!homePageLiveTab.isThirdMarketSportFirstNotDisplayed()) {
                scrollHalfUp();
                if (homePageLiveTab.isThirdMarketSportFirstNotSuspendedDisplayed()) {
                    homePageLiveTab.clickOnThirdMarketSportFirstBuyButton();
                    Waiters.waitMiddle();
                    if (!quickSetBetPopup.isAddToBetSlipButtonNotVisible()) {
                        quickSetBetPopup.clickOnAddToBetSlipButton();
                    }
                    System.out.println("Third Market Sport First is not Suspended");
                } else {
                    System.out.println("Third Market Sport First is present but Suspended");
                }

                if (!homePageLiveTab.isFirstMarketSportSecondNotDisplayed()) {
                    scrollHalfUp();
                    if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
                        homePageLiveTab.clickOnFirstMarketSportSecondSellButton();
                        System.out.println("First Market Sport Second is not Suspended");
                    } else {
                        System.out.println("First Market Sport Second is present but Suspended");
                    }
                }
            }

        } else if (!homePageLiveTab.isFirstMarketSportSecondNotDisplayed()) {
            if (homePageLiveTab.isFirstMarketSportSecondNotSuspendedDisplayed()) {
                homePageLiveTab.clickOnFirstMarketSportSecondBuyButton();
                scrollTeenyUp();
                Waiters.waitMiddle();
                if (!quickSetBetPopup.isAddToBetSlipButtonNotVisible()) {
                    quickSetBetPopup.clickOnAddToBetSlipButton();
                }
                System.out.println("First Market Sport Second is not Suspended");
            } else {
                System.out.println("First Market Sport Second is present but Suspended");
            }
            if (!homePageLiveTab.isSecondMarketSportSecondNotDisplayed()) {
                if (homePageLiveTab.isSecondMarketSportSecondNotSuspendedDisplayed()) {
                    scrollTeenyUp();
                    homePageLiveTab.clickOnSecondMarketSportSecondSellButton();
                    scrollTeenyUp();
                    if (!quickSetBetPopup.isAddToBetSlipButtonNotVisible()) {
                        quickSetBetPopup.clickOnAddToBetSlipButton();
                    }
                    System.out.println("Second Market Sport Second is not Suspended");
                } else {
                    System.out.println("Second Market Sport Second is present but Suspended");
                }
            } else {
                if (!homePageLiveTab.isFirstMarketSportThirdNotDisplayed()) {
                    if (homePageLiveTab.isFirstMarketSportThirdNotSuspendedDisplayed()) {
                        scrollTeenyUp();
                        homePageLiveTab.clickOnFirstMarketSportThirdBuyButton();
                        System.out.println("First Market Sport Third is not Suspended");
                    } else {
                        System.out.println("First Market Sport Third is present but Suspended");
                    }
                }
            }
        }
    }

    public BetSleepDto createBet() throws InterruptedException {
        homePage = new HomePage(driver);
        betSleepHeaderPage = new BetSleepHeaderPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        bottomMenu = new BottomMenu(driver);
        betSleepPage = new BetSleepPage(driver);
        BetSleepDto betSleepDto = new BetSleepDto();
        final String SPORT_AMOUNT = "0.01";

        homePage.clickOnLiveTab();
        addItemsToBetSleep();

        Assert.assertTrue(betSleepHeaderPage.isBetSlipArrowUpButtonDisplayed());
        betSleepHeaderPage.clickOnBetSlipArrowUpButton();

        betSleepPage.setBetSleepFirstMeetingFirstSportAmount(SPORT_AMOUNT);
        betSleepDto.setAmount(SPORT_AMOUNT);
        betSleepDto.setMeetingName(betSleepPage.getBetSleepFirstMeetingFirstSportName());
        betSleepDto.setMeetingDetails(betSleepPage.getBetSleepFirstMeetingFirstSportDetails());
        betSleepDto.setMeetingComment(betSleepPage.getBetSleepFirstMeetingFirstSportCommentText());
        betSleepDto.setMeetingLabel(betSleepPage.getBetSleepFirstMeetingFirstSportLabelText());

        betSleepPage.clickOnBetSleepFirstMeetingFirstSportActivePlaceButton();
        bottomPopupDialog.waitUntilClosePopupButtonVisible();
        bottomPopupDialog.clickOnClosePopupButton();
        bottomMenu.clickOnBottomMenu_MyBets();
        return betSleepDto;
    }

    public void closeBet() throws InterruptedException {
        myBetsPage = new MyBetsPage(driver);
        bottomMenu = new BottomMenu(driver);
        bottomMenu.clickOnBottomMenu_MyBets();
        waitMiddle();
        if (myBetsPage.noOpenBetsAreActive()) {
            myBetsPage.clickOnMyBetsFirstItem();
            myBetsPage.clickOnMyBetsFirstCashOutButton();
            bottomPopupDialog.clickSaveButton();
            bottomPopupDialog.clickOnClosePopupButton();
        }
    }
}