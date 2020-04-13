package Pages.Filters;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FilterPage extends BasePage {

    final static String FILTER_SCREEN = "QuickFilterScreen";
    final static String FILTER_SCREEN_ARROW_LEFT = "sportScreenDetailsTitleArrowLeftFilter";
    final static String FILTER_SCREEN_TITLE = "subCategoryFavourite";
    final static String FILTER_SCREEN_TOURNAMENT_LABEL = "tournamentFinderTabFilter";
    final static String FILTER_SCREEN_TOURNAMENT_FIRST_SELECTION_NAME_V1 = "finderTabFilterTournament1";
    final static String FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX_V1 = "finderTabFilterTournamentCheckbox1";
    final static String FILTER_SCREEN_TOURNAMENT_FIRST_SELECTION_NAME = "finderTabFilterTournament2";
    final static String FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX = "finderTabFilterTournamentCheckbox2";
    final static String FILTER_SCREEN_MARKET_TYPES_LABEL = "marketTypesFinderTabFilter";
    final static String FILTER_SCREEN_MARKET_TYPES_FIRST_SELECTION_NAME = "finderTabFilterMarketTypes1";
    final static String FILTER_SCREEN_MARKET_TYPES_FIRST_CHECK_BOX = "finderTabFilterMarketTypesCheckbox1";
    final static String FILTER_SCREEN_MARKET_TYPES_SECOND_CHECK_BOX = "finderTabFilterMarketTypesCheckbox2";
    final static String FILTER_SCREEN_APPLY_BUTTON = "applyButton";
    final static String FILTER_SCREEN_ADD_TO_FAVOURITES_BUTTON = "addToFavourites";
    final static String FILTER_SCREEN_NO_RESULTS = "noResultsFoundOnQuickFilter";


    @AndroidFindBy(accessibility = FILTER_SCREEN)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN)
    private WebElement filterScreen;

    @AndroidFindBy(accessibility = FILTER_SCREEN_ARROW_LEFT)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_ARROW_LEFT)
    private WebElement filterScreenArrowLeft;

    @AndroidFindBy(accessibility = FILTER_SCREEN_TITLE)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_TITLE)
    private WebElement filterScreenTitle;

    @AndroidFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_LABEL)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_LABEL)
    private WebElement filterFilterScreenTournamentLabel;

    @AndroidFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_SELECTION_NAME_V1)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_SELECTION_NAME_V1)
    private WebElement filterScreenTournamentSelectionName_V1;

    @AndroidFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX_V1)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX_V1)
    private WebElement filterScreenTournamentCheckbox_V1;

    @AndroidFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_SELECTION_NAME)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_SELECTION_NAME)
    private WebElement filterScreenTournamentSelectionName;

    @AndroidFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX)
    private WebElement filterScreenTournamentCheckbox;

    @AndroidFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_LABEL)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_LABEL)
    private WebElement filterScreenMarketTypesTitle;

    @AndroidFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_FIRST_SELECTION_NAME)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_FIRST_SELECTION_NAME)
    private WebElement filterScreenFirstMarketTypesSelectionName;

    @AndroidFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_FIRST_CHECK_BOX)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_FIRST_CHECK_BOX)
    private WebElement filterScreenFirstMarketTypesCheckbox;

    @AndroidFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_SECOND_CHECK_BOX)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_MARKET_TYPES_SECOND_CHECK_BOX)
    private WebElement filterScreenSecondMarketTypesCheckbox;

    @AndroidFindBy(accessibility = FILTER_SCREEN_APPLY_BUTTON)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_APPLY_BUTTON)
    private WebElement filterScreenApplyButton;

    @AndroidFindBy(accessibility = FILTER_SCREEN_ADD_TO_FAVOURITES_BUTTON)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_ADD_TO_FAVOURITES_BUTTON)
    private WebElement filterScreenAddToFavouritesButton;

    @AndroidFindBy(accessibility = FILTER_SCREEN_NO_RESULTS)
    @iOSXCUITFindBy(accessibility = FILTER_SCREEN_NO_RESULTS)
    private WebElement filterScreenNoResultsText;


    public FilterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isFilterScreenDisplayed() {
        return filterScreen.isDisplayed();
    }

    public boolean isFilterScreenArrowLeftDisplayed() {
        return filterScreenArrowLeft.isDisplayed();
    }

    public boolean isFilterScreenTitleDisplayed() {
        return filterScreenTitle.isDisplayed();
    }

    public String getFilterScreenTournamentLabelName() {
        return filterFilterScreenTournamentLabel.getText();
    }

    public boolean isFilterScreenTournamentSelectionNameDisplayed() {
        boolean result;
        if (isElementsByAccessibilityIdNotPresent(FILTER_SCREEN_TOURNAMENT_FIRST_SELECTION_NAME)) {
            result = filterScreenTournamentSelectionName_V1.isDisplayed();
        } else result = filterScreenTournamentSelectionName.isDisplayed();
        return result;
    }

    public boolean isFilterScreenTournamentCheckboxDisplayed() {
        boolean result;
        if (isElementsByAccessibilityIdNotPresent(FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX_V1)) {
            result = filterScreenTournamentCheckbox.isDisplayed();
        } else result = filterScreenTournamentCheckbox_V1.isDisplayed();
        return result;
    }

    public void clickOnFilterScreenTournamentCheckbox() {
        if (isElementsByAccessibilityIdNotPresent(FILTER_SCREEN_TOURNAMENT_FIRST_CHECK_BOX_V1)) {
            filterScreenTournamentCheckbox.click();
        } else filterScreenTournamentCheckbox_V1.click();
    }

    public void clickOnSecondMarketTypesCheckbox() {
        filterScreenSecondMarketTypesCheckbox.click();
    }

    public String getFilterScreenMarketTypesTitleName() {
        return filterScreenMarketTypesTitle.getText();
    }

    public boolean isFilterScreenMarketTypesSelectionNameDisplayed() {
        return filterScreenFirstMarketTypesSelectionName.isDisplayed();
    }

    public boolean isFilterScreenMarketTypesCheckboxDisplayed() {
        return filterScreenFirstMarketTypesCheckbox.isDisplayed();
    }

    public void clickOnFilterScreenMarketTypesCheckbox() {
        filterScreenFirstMarketTypesCheckbox.click();
    }

    public boolean isFilterScreenApplyButtonDisplayed() {
        return filterScreenApplyButton.isDisplayed();
    }

    public void clickOnFilterScreenApplyButton() {
        filterScreenApplyButton.click();
    }

    public boolean isFilterScreenAddToFavouritesButtonDisplayed() {
        return filterScreenAddToFavouritesButton.isDisplayed();
    }

    public void clickOnFilterScreenAddToFavouritesButton() {
        filterScreenAddToFavouritesButton.click();
    }

    public String getFilterScreenNoResultsText() {
        return filterScreenNoResultsText.getText();
    }

    public boolean isFilterScreenNoResultsNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FILTER_SCREEN_NO_RESULTS);
    }

    public void scrollToFilterScreenMarketTypesTitle() {
        scrollToElement(FILTER_SCREEN_MARKET_TYPES_LABEL);
    }

    public void scrollToFilterScreenApplyButton() {
        scrollToElement(FILTER_SCREEN_APPLY_BUTTON);
    }

    public void scrollToFilterScreenAddToFavouritesButton() {
        scrollToElement(FILTER_SCREEN_ADD_TO_FAVOURITES_BUTTON);
    }

    public boolean isFilterScreenAddToFavouritesButtonNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FILTER_SCREEN_ADD_TO_FAVOURITES_BUTTON);
    }
}