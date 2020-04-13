package Pages.Home;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class HomePage extends BasePage {

    final static String LOGIN_BUTTON = "loginButton";
    final static String PROFILE_BUTTON = "profileButton";
    final static String MAIN_MENU = "mainMenuButton";
    final static String TAB_LIVE = "liveTabBarLabel";
    final static String TAB_POPULAR = "popularTabBarLabel";
    final static String TAB_HIGHLIGHTS = "highlightsTabBarLabel";
    final static String TAB_UP_NEXT = "upNextTabBarLabel";
    final static String WALLET_VALUE = "walletSize";

    @AndroidFindBy(accessibility = LOGIN_BUTTON)
    @iOSXCUITFindBy(accessibility = LOGIN_BUTTON)
    public WebElement loginButton;

    @AndroidFindBy(accessibility = PROFILE_BUTTON)
    @iOSXCUITFindBy(accessibility = PROFILE_BUTTON)
    private WebElement profileButton;

    @AndroidFindBy(accessibility = MAIN_MENU)
    @iOSXCUITFindBy(accessibility = MAIN_MENU)
    public WebElement mainMenuLink;

    @AndroidFindBy(accessibility = TAB_LIVE)
    @iOSXCUITFindBy(accessibility = TAB_LIVE)
    private WebElement liveTab;

    @AndroidFindBy(accessibility = TAB_POPULAR)
    @iOSXCUITFindBy(accessibility = TAB_POPULAR)
    private WebElement popularTab;

    @AndroidFindBy(accessibility = TAB_HIGHLIGHTS)
    @iOSXCUITFindBy(accessibility = TAB_HIGHLIGHTS)
    private WebElement highlightsTab;

    @AndroidFindBy(accessibility = TAB_UP_NEXT)
    @iOSXCUITFindBy(accessibility = TAB_UP_NEXT)
    private WebElement upNextTab;

    @AndroidFindBy(accessibility = WALLET_VALUE)
    @iOSXCUITFindBy(accessibility = WALLET_VALUE)
    private WebElement walletValue;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void clickOnMainMenuLink() {
        mainMenuLink.click();
    }

    public void clickOnProfileButton() {
        profileButton.click();
    }

    public void clickOnLiveTab() {
        liveTab.click();
    }

    public boolean isLiveTabDisplayed() {
        return liveTab.isDisplayed();
    }

    public boolean isPopularTabDisplayed() {
        return popularTab.isDisplayed();
    }

    public void clickOnPopularTab() {
        popularTab.click();
    }

    public boolean isHighlightsTabDisplayed() {
        return highlightsTab.isDisplayed();
    }

    public void clickOnHighlightsTab() {
        highlightsTab.click();
    }

    public boolean isUpNextTabDisplayed() {
        return upNextTab.isDisplayed();
    }

    public void clickOnUpNextTab() {
        upNextTab.click();
    }

    public String getBalanceValue() {
        return walletValue.getText();
    }

    public void waitUntilLoginButtonIsVisible() {
        waitVisibilityOfElement(loginButton);
    }

    public void waitUntilMainMenuLinkIsVisible() {
        waitVisibilityOfElement(mainMenuLink);
    }

    public void waitUntilLiveTabIsVisible() {
        waitVisibilityOfElement(liveTab);
    }

    public void waitUntilHighlightsTabIsVisible() {
        waitVisibilityOfElement(highlightsTab);
    }

    public void waitUntilProfileButtonIsVisible() {
        waitVisibilityOfElement(profileButton);
    }

}