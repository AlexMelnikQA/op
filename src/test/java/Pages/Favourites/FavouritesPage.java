package Pages.Favourites;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FavouritesPage extends BasePage {

    final static String FAVOURITES_SCREEN = "favouritesScreen";
    final static String FAVOURITES_SCREEN_TEXT = "favouritesScreenText";

    final static String FAVOURITES_FIRST_GROUP = "1FavouritesScreenGroup";
    final static String FAVOURITES_FIRST_GROUP_FIRST_ITEN_NAME = "1FavouritesScreenItemName1";
    final static String FAVOURITES_FIRST_GROUP_FIRST_ITEN_ICON = "1FavouritesScreenItemIcon1";
    final static String FAVOURITES_FIRST_GROUP_FIRST_ITEN_STAR = "1FavouritesScreenItemStar1";

    final static String FAVOURITES_SECOND_GROUP = "2FavouritesScreenGroup";
    final static String FAVOURITES_SECOND_GROUP_FIRST_ITEN_NAME = "2FavouritesScreenItemName1";
    final static String FAVOURITES_SECOND_GROUP_FIRST_ITEN_ICON = "2FavouritesScreenItemIcon1";
    final static String FAVOURITES_SECOND_GROUP_FIRST_ITEN_STAR = "2FavouritesScreenItemStar1";
    final static String FAVOURITES_SECOND_GROUP_SECOND_ITEN_NAME = "2FavouritesScreenItemName2";
    final static String FAVOURITES_SECOND_GROUP_SECOND_ITEN_ICON = "2FavouritesScreenItemIcon2";
    final static String FAVOURITES_SECOND_GROUP_SECOND_ITEN_STAR = "2FavouritesScreenItemStar2";

    final static String FAVOURITES_NOT_LOGGED = "unableToSeePromotionsUntilLoggedIn";


    @AndroidFindBy(accessibility = FAVOURITES_SCREEN)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SCREEN)
    private WebElement favouritesScreen;

    @AndroidFindBy(accessibility = FAVOURITES_SCREEN_TEXT)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SCREEN_TEXT)
    private WebElement favouritesScreenText;

    @AndroidFindBy(accessibility = FAVOURITES_FIRST_GROUP)
    @iOSXCUITFindBy(accessibility = FAVOURITES_FIRST_GROUP)
    private WebElement favouritesFirstGroup;

    @AndroidFindBy(accessibility = FAVOURITES_FIRST_GROUP_FIRST_ITEN_NAME)
    @iOSXCUITFindBy(accessibility = FAVOURITES_FIRST_GROUP_FIRST_ITEN_NAME)
    private WebElement favouritesFirstGroupFirstItemName;

    @AndroidFindBy(accessibility = FAVOURITES_FIRST_GROUP_FIRST_ITEN_ICON)
    @iOSXCUITFindBy(accessibility = FAVOURITES_FIRST_GROUP_FIRST_ITEN_ICON)
    private WebElement favouritesFirstGroupFirstItemIcon;

    @AndroidFindBy(accessibility = FAVOURITES_FIRST_GROUP_FIRST_ITEN_STAR)
    @iOSXCUITFindBy(accessibility = FAVOURITES_FIRST_GROUP_FIRST_ITEN_STAR)
    private WebElement favouritesFirstGroupFirstItemStar;

    @AndroidFindBy(accessibility = FAVOURITES_SECOND_GROUP)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SECOND_GROUP)
    private WebElement favouritesSecondGroup;

    @AndroidFindBy(accessibility = FAVOURITES_SECOND_GROUP_FIRST_ITEN_NAME)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SECOND_GROUP_FIRST_ITEN_NAME)
    private WebElement favouritesSecondGroupFirstItemName;

    @AndroidFindBy(accessibility = FAVOURITES_SECOND_GROUP_FIRST_ITEN_ICON)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SECOND_GROUP_FIRST_ITEN_ICON)
    private WebElement favouritesSecondGroupFirstItemIcon;

    @AndroidFindBy(accessibility = FAVOURITES_SECOND_GROUP_FIRST_ITEN_STAR)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SECOND_GROUP_FIRST_ITEN_STAR)
    private WebElement favouritesSecondGroupFirstItemStar;

    @AndroidFindBy(accessibility = FAVOURITES_SECOND_GROUP_SECOND_ITEN_NAME)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SECOND_GROUP_SECOND_ITEN_NAME)
    private WebElement favouritesSecondGroupSecondItemName;

    @AndroidFindBy(accessibility = FAVOURITES_SECOND_GROUP_SECOND_ITEN_ICON)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SECOND_GROUP_SECOND_ITEN_ICON)
    private WebElement favouritesSecondGroupSecondItemIcon;

    @AndroidFindBy(accessibility = FAVOURITES_SECOND_GROUP_SECOND_ITEN_STAR)
    @iOSXCUITFindBy(accessibility = FAVOURITES_SECOND_GROUP_SECOND_ITEN_STAR)
    private WebElement favouritesSecondGroupSecondItemStar;

    @AndroidFindBy(accessibility = FAVOURITES_NOT_LOGGED)
    @iOSXCUITFindBy(accessibility = FAVOURITES_NOT_LOGGED)
    private WebElement favouritesNotLoggedUserText;


    public FavouritesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isFavouritesScreenDisplayed() {
        return favouritesScreen.isDisplayed();
    }

    public String getFavouritesScreenText() {
        return favouritesScreenText.getText();
    }

    public String getFavouritesFirstGroupText() {
        return favouritesFirstGroup.getText();
    }

    public String getFavouritesFirstGroupFirstItemName() {
        return favouritesFirstGroupFirstItemName.getText();
    }

    public void clickOnFavouritesFirstGroupFirstItemName() {
        favouritesFirstGroupFirstItemName.click();
    }

    public boolean isFavouritesFirstGroupFirstItemIconDisplayed() {
        return favouritesFirstGroupFirstItemIcon.isDisplayed();
    }

    public boolean isFavouritesFirstGroupFirstItemStarDisplayed() {
        return favouritesFirstGroupFirstItemStar.isDisplayed();
    }

    public String getFavouritesSecondGroupText() {
        return favouritesSecondGroup.getText();
    }

    public String getFavouritesSecondGroupFirstItemName() {
        return favouritesSecondGroupFirstItemName.getText();
    }

    public boolean isFavouritesSecondGroupFirstItemIconDisplayed() {
        return favouritesSecondGroupFirstItemIcon.isDisplayed();
    }

    public boolean isFavouritesSecondGroupFirstItemStarDisplayed() {
        return favouritesSecondGroupFirstItemStar.isDisplayed();
    }

    public String getFavouritesSecondGroupSecondItemName() {
        return favouritesSecondGroupSecondItemName.getText();
    }

    public boolean isFavouritesSecondGroupSecondItemIconDisplayed() {
        return favouritesSecondGroupSecondItemIcon.isDisplayed();
    }

    public boolean isFavouritesSecondGroupSecondItemStarDisplayed() {
        return favouritesSecondGroupSecondItemStar.isDisplayed();
    }

    public String getFavouritesNotLoggedUserText() {
        return favouritesNotLoggedUserText.getText();
    }

    public boolean isFavouritesNotLoggedUserTextNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FAVOURITES_NOT_LOGGED);
    }
}