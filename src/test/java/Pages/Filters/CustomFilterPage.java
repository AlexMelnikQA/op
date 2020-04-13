package Pages.Filters;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class CustomFilterPage extends BasePage {

    final static String FILTER_BACK_TO_FAVOURITES = "BackToFavouriteScreen";
    final static String FILTER_TITLE_TEXT = "CustomFavouriteTitleText";
    final static String FILTER_EDIT_LINK = "CustomFavouriteEditLink";
    final static String FILTER_NAME_TEXT = "CustomFavouriteNameText";

    final static String FILTER_SPORTS_SECTION = "sportsFilter";
    final static String FILTER_FIRST_SPORT_NAME = "1LiveTabSportsName";
    final static String FILTER_FIRST_SPORT_SELL = "1CustomFavouriteGroupSell";
    final static String FILTER_FIRST_SPORT_BUY = "1CustomFavouriteGroupBuy";
    final static String FILTER_FIRST_MEETING_NAME = "1LiveTabMeeting1";
    final static String FILTER_FIRST_MEETING_SELL = "1LiveTabMarketSellButton1";
    final static String FILTER_FIRST_MEETING_BUY = "1LiveTabMarketBuyButton1";


    @AndroidFindBy(accessibility = FILTER_BACK_TO_FAVOURITES)
    @iOSXCUITFindBy(accessibility = FILTER_BACK_TO_FAVOURITES)
    private WebElement filterScreenBackToFavourite;

    @AndroidFindBy(accessibility = FILTER_TITLE_TEXT)
    @iOSXCUITFindBy(accessibility = FILTER_TITLE_TEXT)
    private WebElement filterTitleText;

    @AndroidFindBy(accessibility = FILTER_EDIT_LINK)
    @iOSXCUITFindBy(accessibility = FILTER_EDIT_LINK)
    private WebElement filterScreenTitleEditLink;

    @AndroidFindBy(accessibility = FILTER_NAME_TEXT)
    @iOSXCUITFindBy(accessibility = FILTER_NAME_TEXT)
    private WebElement filterNameText;

    @AndroidFindBy(accessibility = FILTER_SPORTS_SECTION)
    @iOSXCUITFindBy(accessibility = FILTER_SPORTS_SECTION)
    private WebElement filterSportSection;

    @AndroidFindBy(accessibility = FILTER_FIRST_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FILTER_FIRST_SPORT_NAME)
    private WebElement filterFirstSportName;

    @AndroidFindBy(accessibility = FILTER_FIRST_SPORT_SELL)
    @iOSXCUITFindBy(accessibility = FILTER_FIRST_SPORT_SELL)
    private WebElement filterFirstSportSellButton;

    @AndroidFindBy(accessibility = FILTER_FIRST_SPORT_BUY)
    @iOSXCUITFindBy(accessibility = FILTER_FIRST_SPORT_BUY)
    private WebElement filterFirstSportBuyButton;

    @AndroidFindBy(accessibility = FILTER_FIRST_MEETING_NAME)
    @iOSXCUITFindBy(accessibility = FILTER_FIRST_MEETING_NAME)
    private WebElement filterFirstMeetingName;

    @AndroidFindBy(accessibility = FILTER_FIRST_MEETING_SELL)
    @iOSXCUITFindBy(accessibility = FILTER_FIRST_MEETING_SELL)
    private WebElement filterFirstMeetingSellButton;

    @AndroidFindBy(accessibility = FILTER_FIRST_MEETING_BUY)
    @iOSXCUITFindBy(accessibility = FILTER_FIRST_MEETING_BUY)
    private WebElement filterFirstMeetingBuyButton;


    public CustomFilterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isFilterScreenBackToFavouriteDisplayed() {
        return filterScreenBackToFavourite.isDisplayed();
    }

    public void clickOnFilterScreenBackToFavouriteButton() {
        filterScreenBackToFavourite.click();
    }

    public boolean isFilterTitleTextDisplayed() {
        return filterTitleText.isDisplayed();
    }

    public String getFilterTitleText() {
        return filterTitleText.getText();
    }

    public boolean isFilterScreenTitleEditLinkDisplayed() {
        return filterScreenTitleEditLink.isDisplayed();
    }

    public void clickOnFilterScreenTitleEditLink() {
        filterScreenTitleEditLink.click();
    }

    public boolean isFilterNameTextDisplayed() {
        return filterNameText.isDisplayed();
    }

    public String getFilterNameText() {
        return filterNameText.getText();
    }

    public boolean isFilterSportSectionDisplayed() {
        return filterSportSection.isDisplayed();
    }

    public void waitUntilintFilterSportSectionVisible() {
        waitVisibilityOfElement(filterSportSection);
    }

    public boolean isFilterFirstSportNameDisplayed() {
        return filterFirstSportName.isDisplayed();
    }

    public boolean isFilterFirstSportSellButtonDisplayed() {
        return filterFirstSportSellButton.isDisplayed();
    }

    public boolean isFilterFirstSportBuyButtonDisplayed() {
        return filterFirstSportBuyButton.isDisplayed();
    }

    public boolean isFilterFirstMeetingNameDisplayed() {
        return filterFirstMeetingName.isDisplayed();
    }

    public boolean isFilterFirstMeetingSellButtonDisplayed() {
        return filterFirstMeetingSellButton.isDisplayed();
    }

    public boolean isFilterFirstMeetingBuyButtonDisplayed() {
        return filterFirstMeetingBuyButton.isDisplayed();
    }
}