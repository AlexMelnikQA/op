package Pages.SportsDetails;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class SportsHeader extends BasePage {

    final static String SPORT_DETAIL_SCREEN = "sportDetailsScreen";
    final static String SPORT_DETAIL_TITLE = "sportDetailsTitle";
    final static String SPORT_DETAIL_TITLE_TEXT = "sportDetailsTitleText";
    final static String SPORT_DETAIL_TITLE_ACTIVE_STAR = "sportDetailsTitleActiveStar";
    final static String SPORT_DETAIL_TITLE_INACTIVE_STAR = "sportDetailsTitleInactiveStar";
    final static String SPORT_DETAIL_IN_PLAY_BUTTON = "inPlayTabBarLabel";
    final static String SPORT_DETAIL_LONG_TERMS_BUTTON = "longTermTabBarLabel";
    final static String SPORT_DETAIL_TOTALS_BUTTON = "totalsTabBarLabel";
    final static String SPORT_DETAIL_BINARIES_BUTTON = "binariesTabBarLabel";
    final static String SPORT_DETAIL_FINDER_BUTTON = "finderTabBarLabel";


    @AndroidFindBy(accessibility = SPORT_DETAIL_SCREEN)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_SCREEN)
    private WebElement sportDetailsScreen;

    @AndroidFindBy(accessibility = SPORT_DETAIL_TITLE)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_TITLE)
    private WebElement sportDetailsTitle;

    @AndroidFindBy(accessibility = SPORT_DETAIL_TITLE_TEXT)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_TITLE_TEXT)
    private WebElement sportDetailsTitleText;

    @AndroidFindBy(accessibility = SPORT_DETAIL_TITLE_ACTIVE_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_TITLE_ACTIVE_STAR)
    private WebElement sportDetailsTitleActiveStar;

    @AndroidFindBy(accessibility = SPORT_DETAIL_TITLE_INACTIVE_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_TITLE_INACTIVE_STAR)
    private WebElement sportDetailsTitleInactiveStar;

    @AndroidFindBy(accessibility = SPORT_DETAIL_IN_PLAY_BUTTON)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_IN_PLAY_BUTTON)
    private WebElement sportDetailsInPlayButton;

    @AndroidFindBy(accessibility = SPORT_DETAIL_LONG_TERMS_BUTTON)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_LONG_TERMS_BUTTON)
    private WebElement sportDetailsLongTermsButton;

    @AndroidFindBy(accessibility = SPORT_DETAIL_TOTALS_BUTTON)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_TOTALS_BUTTON)
    private WebElement sportDetailsTotalsButton;

    @AndroidFindBy(accessibility = SPORT_DETAIL_BINARIES_BUTTON)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_BINARIES_BUTTON)
    private WebElement sportDetailsBinariesButton;

    @AndroidFindBy(accessibility = SPORT_DETAIL_FINDER_BUTTON)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_FINDER_BUTTON)
    private WebElement sportDetailsFinderButton;


    public SportsHeader(WebDriver driver) {
        super(driver);
    }

    public boolean isSportDetailsScreenDisplayed() {
        return sportDetailsScreen.isDisplayed();
    }

    public void waitUntilSportDetailsScreenDisplayed() {
        waitVisibilityOfElement(sportDetailsScreen);
    }

    public boolean isSportDetailsTitleDisplayed() {
        return sportDetailsTitle.isDisplayed();
    }

    public String getSportDetailsTitleText() {
        return sportDetailsTitleText.getText();
    }

    public boolean isSportDetailsTitleActiveStarDisplayed() {
        return sportDetailsTitleActiveStar.isDisplayed();
    }

    public boolean isSportDetailsTitleInactiveStarDisplayed() {
        return sportDetailsTitleInactiveStar.isDisplayed();
    }

    public boolean isSportDetailsTitleInactiveStarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_DETAIL_TITLE_INACTIVE_STAR);
    }

    public boolean isSportDetailsInPlayButtonDisplayed() {
        return sportDetailsInPlayButton.isDisplayed();
    }

    public void clickOnSportDetailsInPlayButton() {
        sportDetailsInPlayButton.click();
    }

    public boolean isSportDetailsLongTermsButtonDisplayed() {
        return sportDetailsLongTermsButton.isDisplayed();
    }

    public boolean isSportDetailsLongTermsButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_DETAIL_LONG_TERMS_BUTTON);
    }

    public void clickOnSportDetailsLongTermsButton() {
        sportDetailsLongTermsButton.click();
    }

    public boolean isSportDetailsTotalsButtonDisplayed() {
        return sportDetailsTotalsButton.isDisplayed();
    }

    public boolean isSportDetailsTotalsButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_DETAIL_TOTALS_BUTTON);
    }

    public void clickOnSportDetailsTotalsButton() {
        sportDetailsTotalsButton.click();
    }

    public boolean isSportDetailsBinariesButtonDisplayed() {
        return sportDetailsBinariesButton.isDisplayed();
    }

    public void clickOnSportDetailsBinariesButton() {
        sportDetailsBinariesButton.click();
    }

    public boolean isSportDetailsFinderButtonDisplayed() {
        return sportDetailsFinderButton.isDisplayed();
    }

    public void clickOnSportDetailsFinderButton() {
        sportDetailsFinderButton.click();
    }

    public boolean isFinderTabSelected() {
        return sportDetailsFinderButton.getAttribute("selected").matches(String.valueOf(true));
    }
}