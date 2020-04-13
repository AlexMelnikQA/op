package Pages.SportsDetails;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SportsFinder extends BasePage {

    final static String SPORT_FINDER_FIRST_SUB_CATEGORY = "finderPageSportSubCategories1";
    final static String FINDER_SCREEN = "internalFinderScreen";

    //TODO update "International" on index when developer will fix this
    final static String FINDER_ARROW_LEFT = "sportScreenDetailsTitleArrowLeftInternational";
    final static String FINDER_TITLE = "subCategoryFinderText";
    final static String FINDER_FIRST_FILTER = "1FinderTabsName";
    final static String FINDER_SECOND_FILTER = "2FinderTabsName";
    final static String FINDER_THIRD_FILTER = "3FinderTabsName";
    final static String FINDER_FORTH_FILTER = "4FinderTabsName";
    final static String FINDER_FIFTH_FILTER = "5FinderTabsName";
    final static String FINDER_FILTER_BUTTON = "finderTabButton";
    final static String FINDER_FILTER_BUTTON_TEXT = "finderTabButtonText";
    final static String SPORT_FINDER_FIRST_MATCH_INFO_ICON = "1FinderTabRowInfo1";
    final static String SPORT_FINDER_FIRST_MATCH_TIME = "1FinderTabRowTime";
    final static String SPORT_FINDER_FIRST_MATCH_NAME = "1FinderTabRowName";
    final static String SPORT_FINDER_FIRST_MATCH_DESCRIPTION = "1FinderMarketDescription1";


    @AndroidFindBy(accessibility = SPORT_FINDER_FIRST_SUB_CATEGORY)
    @iOSXCUITFindBy(accessibility = SPORT_FINDER_FIRST_SUB_CATEGORY)
    private WebElement sportFinderFirstSubCategory;

    @AndroidFindBy(accessibility = FINDER_SCREEN)
    @iOSXCUITFindBy(accessibility = FINDER_SCREEN)
    private WebElement finderScreen;

    @AndroidFindBy(accessibility = FINDER_ARROW_LEFT)
    @iOSXCUITFindBy(accessibility = FINDER_ARROW_LEFT)
    private WebElement finderArrowLeft;

    @AndroidFindBy(accessibility = FINDER_TITLE)
    @iOSXCUITFindBy(accessibility = FINDER_TITLE)
    private WebElement finderTitle;

    @AndroidFindBy(accessibility = FINDER_FIRST_FILTER)
    @iOSXCUITFindBy(accessibility = FINDER_FIRST_FILTER)
    private WebElement finderFirstFilter;

    @AndroidFindBy(accessibility = FINDER_SECOND_FILTER)
    @iOSXCUITFindBy(accessibility = FINDER_SECOND_FILTER)
    private WebElement finderSecondFilter;

    @AndroidFindBy(accessibility = FINDER_THIRD_FILTER)
    @iOSXCUITFindBy(accessibility = FINDER_THIRD_FILTER)
    private WebElement finderThirdFilter;

    @AndroidFindBy(accessibility = FINDER_FORTH_FILTER)
    @iOSXCUITFindBy(accessibility = FINDER_FORTH_FILTER)
    private WebElement finderForthFilter;

    @AndroidFindBy(accessibility = FINDER_FIFTH_FILTER)
    @iOSXCUITFindBy(accessibility = FINDER_FIFTH_FILTER)
    private WebElement finderFifthFilter;

    @AndroidFindBy(accessibility = FINDER_FILTER_BUTTON)
    @iOSXCUITFindBy(accessibility = FINDER_FILTER_BUTTON)
    private WebElement finderFilterButton;

    @AndroidFindBy(accessibility = FINDER_FILTER_BUTTON_TEXT)
    @iOSXCUITFindBy(accessibility = FINDER_FILTER_BUTTON_TEXT)
    private WebElement finderFilterButtonText;

    @AndroidFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_INFO_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_INFO_ICON)
    private WebElement sportFinderFirstMatchInfoIcon;

    @AndroidFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_TIME)
    @iOSXCUITFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_TIME)
    private WebElement sportFinderFirstMatchTime;

    @AndroidFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_NAME)
    private WebElement sportFinderFirstMatchName;

    @AndroidFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_DESCRIPTION)
    @iOSXCUITFindBy(accessibility = SPORT_FINDER_FIRST_MATCH_DESCRIPTION)
    private WebElement sportFinderFirstMatchDescription;


    public SportsFinder(WebDriver driver) {
        super(driver);
    }

    public boolean isSportFinderFirstSubCategoryDisplayed() {
        return sportFinderFirstSubCategory.isDisplayed();
    }

    public boolean isSportFinderFirstSubCategoryNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_FINDER_FIRST_SUB_CATEGORY);
    }

    public void clickOnSportFinderFirstSubCategoryLink() {
        sportFinderFirstSubCategory.click();
    }

    public String getSportFinderFirstSubCategoryName() {
        return sportFinderFirstSubCategory.getText();
    }

    public boolean isFinderScreenDisplayed() {
        return finderScreen.isDisplayed();
    }

    public boolean isFinderScreenNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FINDER_SCREEN);
    }

    public boolean isFinderArrowLeftDisplayed() {
        return finderArrowLeft.isDisplayed();
    }

    public boolean isFinderTitle() {
        return finderTitle.isDisplayed();
    }

    public String getFinderFirstFilterText() {
        return finderFirstFilter.getText();
    }

    public String getFinderSecondFilterText() {
        return finderSecondFilter.getText();
    }

    public String getFinderThirdFilterText() {
        return finderThirdFilter.getText();
    }

    public String getFinderForthFilterText() {
        return finderForthFilter.getText();
    }

    public String getFinderFifthFilterText() {
        return finderFifthFilter.getText();
    }

    public void clickOnFinderFirstFilter() {
        finderFirstFilter.click();
    }

    public void clickOnFinderSecondFilter() {
        finderSecondFilter.click();
    }

    public void clickOnFinderThirdFilter() {
        finderThirdFilter.click();
    }

    public void clickOnFinderForthFilter() {
        finderForthFilter.click();
    }

    public void clickOnFinderFifthFilter() {
        finderFifthFilter.click();
    }

    public boolean isFinderFilterButtonDisplayed() {
        return finderFilterButton.isDisplayed();
    }

    public void clickOnFinderFilterButton() {
        finderFilterButton.click();
    }

    public String getFinderFilterButtonText() {
        return finderFilterButtonText.getText();
    }

    public boolean isFinderFirstMatchInfoIconDisplayed() {
        return sportFinderFirstMatchInfoIcon.isDisplayed();
    }

    public String getSportFinderFirstMatchTime() {
        return sportFinderFirstMatchTime.getText();
    }

    public String getSportFinderFirstMatchName() {
        return sportFinderFirstMatchName.getText();
    }

    public void clickOnSportFinderFirstMatchName() {
        sportFinderFirstMatchName.click();
    }

    public boolean isSportFinderFirstMatchNameDisplayed() {
        return sportFinderFirstMatchName.isDisplayed();
    }

    public boolean isSportFinderFirstMatchNameNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_FINDER_FIRST_MATCH_NAME);
    }

    public boolean isSportFinderFirstMatchDescriptionDisplayed() {
        return sportFinderFirstMatchDescription.isDisplayed();
    }
}