package Pages.Menus;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class BottomMenu extends BasePage {

    final static String HOME = "homeBottomMenu";
    final static String ACTIVE_HOME = "activeItemhomeBottomMenu";
    final static String IN_PLAY = "inPlayBottomMenu";
    final static String ACTIVE_IN_PLAY = "activeIteminPlayBottomMenu";
    final static String FAVOURITES = "favouritesBottomMenu";
    final static String ACTIVE_FAVOURITES = "activeItemfavouritesBottomMenu";
    final static String MY_BETS = "myBetsBottomMenu";
    final static String ACTIVE_MY_BETS = "activeItemmyBetsBottomMenu";
    final static String AZSPORTS = "azSportsBottomMenu";
    final static String ACTIVE_AZSPORTS = "activeItemazSportsBottomMenu";

    @AndroidFindBy(accessibility = HOME)
    @iOSXCUITFindBy(accessibility = HOME)
    private WebElement homeLink;

    @AndroidFindBy(accessibility = ACTIVE_HOME)
    @iOSXCUITFindBy(accessibility = ACTIVE_HOME)
    private WebElement activeHomeLink;

    @AndroidFindBy(accessibility = IN_PLAY)
    @iOSXCUITFindBy(accessibility = IN_PLAY)
    private WebElement bottomMenu_InPlay;

    @AndroidFindBy(accessibility = ACTIVE_IN_PLAY)
    @iOSXCUITFindBy(accessibility = ACTIVE_IN_PLAY)
    private WebElement activeBottomMenu_InPlay;

    @AndroidFindBy(accessibility = AZSPORTS)
    @iOSXCUITFindBy(accessibility = AZSPORTS)
    private WebElement bottomMenu_AZSports;

    @AndroidFindBy(accessibility = ACTIVE_AZSPORTS)
    @iOSXCUITFindBy(accessibility = ACTIVE_AZSPORTS)
    private WebElement activeBottomMenu_AZSports;

    @AndroidFindBy(accessibility = FAVOURITES)
    @iOSXCUITFindBy(accessibility = FAVOURITES)
    private WebElement bottomMenu_Favourites;

    @AndroidFindBy(accessibility = ACTIVE_FAVOURITES)
    @iOSXCUITFindBy(accessibility = ACTIVE_FAVOURITES)
    private WebElement activeBottomMenu_Favourites;

    @AndroidFindBy(accessibility = MY_BETS)
    @iOSXCUITFindBy(accessibility = MY_BETS)
    private WebElement bottomMenu_MyBets;

    @AndroidFindBy(accessibility = ACTIVE_MY_BETS)
    @iOSXCUITFindBy(accessibility = ACTIVE_MY_BETS)
    private WebElement activeBottomMenu_MyBets;


    public BottomMenu(WebDriver driver) {
        super(driver);
    }

    public void clickOnHomeLink() {
        homeLink.click();
    }

    public boolean isBottomMenu_HomeLinkDisplayed() {
        return homeLink.isDisplayed();
    }

    public void clickOnActiveHomeLink() {
        activeHomeLink.click();
    }

    public boolean isActiveHomeLinkDisplayed() {
        return activeHomeLink.isDisplayed();
    }

    public void clickOnBottomMenu_InPlay() {
        bottomMenu_InPlay.click();
    }

    public boolean isBottomMenu_InPlayDisplayed() {
        return bottomMenu_InPlay.isDisplayed();
    }

    public void clickOnActiveBottomMenu_InPlay() {
        activeBottomMenu_InPlay.click();
    }

    public boolean isActiveBottomMenu_InPlayDisplayed() {
        return activeBottomMenu_InPlay.isDisplayed();
    }

    public void clickOnBottomMenu_AZSports() {
        bottomMenu_AZSports.click();
    }

    public boolean isBottomMenu_AZSportsDisplayed() {
        return bottomMenu_AZSports.isDisplayed();
    }

    public void clickOnActiveBottomMenu_AZSports() {
        activeBottomMenu_AZSports.click();
    }

    public boolean isActiveBottomMenu_AZSportsDisplayed() {
        return activeBottomMenu_AZSports.isDisplayed();
    }

    public void clickOnBottomMenu_Favourites() {
        bottomMenu_Favourites.click();
    }

    public boolean isBottomMenu_FavouritesDisplayed() {
        return bottomMenu_Favourites.isDisplayed();
    }

    public void clickOnActiveBottomMenu_Favourites() {
        activeBottomMenu_Favourites.click();
    }

    public boolean isActiveBottomMenu_FavouritesDisplayed() {
        return activeBottomMenu_Favourites.isDisplayed();
    }

    public void clickOnBottomMenu_MyBets() {
        bottomMenu_MyBets.click();
    }

    public boolean isBottomMenu_MyBetsDisplayed() {
        return bottomMenu_MyBets.isDisplayed();
    }

    public void waitUntilBottomMenuIsDisplayed() {
        waitVisibilityOfElement(bottomMenu_MyBets);
    }

    public void clickOnActiveBottomMenu_MyBets() {
        activeBottomMenu_MyBets.click();
    }

    public boolean isActiveBottomMenu_MyBetsDisplayed() {
        return activeBottomMenu_MyBets.isDisplayed();
    }
}