package Pages.InPlay;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class InPlayPage extends BasePage {

    final static String IN_PLAY_SCREEN = "inPlayScreen";
    final static String FILTER_TODAY = "1InplayTabFilter";
    final static String FILTER_TOMORROW = "2InplayTabFilter";
    final static String FILTER_MORE_ONE_DAY = "3InplayTabFilter";
    final static String FILTER_MORE_TWO_DAY = "4InplayTabFilter";
    final static String FILTER_MORE_THREE_DAY = "5InplayTabFilter";

    final static String CHOOSE_SPORT = "chooseSportButton";
    final static String CHOOSE_SPORT_TEXT = "chooseSportButtonText";

    final static String FIRST_IN_PLAY_SPORT_TIME = "1InplayTabRowTime";
    final static String FIRST_IN_PLAY_SPORT_ICON = "1InplayTabRowIcon";
    final static String FIRST_IN_PLAY_SPORT_NAME = "1InplayTabRowName";

    @AndroidFindBy(accessibility = IN_PLAY_SCREEN)
    @iOSXCUITFindBy(accessibility = IN_PLAY_SCREEN)
    private WebElement inPlayScreen;

    @AndroidFindBy(accessibility = FILTER_TODAY)
    @iOSXCUITFindBy(accessibility = FILTER_TODAY)
    private WebElement filterToday;

    @AndroidFindBy(accessibility = FILTER_TOMORROW)
    @iOSXCUITFindBy(accessibility = FILTER_TOMORROW)
    private WebElement filterTomorrow;

    @AndroidFindBy(accessibility = FILTER_MORE_ONE_DAY)
    @iOSXCUITFindBy(accessibility = FILTER_MORE_ONE_DAY)
    private WebElement filterOneDayMore;

    @AndroidFindBy(accessibility = FILTER_MORE_TWO_DAY)
    @iOSXCUITFindBy(accessibility = FILTER_MORE_TWO_DAY)
    private WebElement filterTwoDayMore;

    @AndroidFindBy(accessibility = FILTER_MORE_THREE_DAY)
    @iOSXCUITFindBy(accessibility = FILTER_MORE_THREE_DAY)
    private WebElement filterThreeDayMore;

    @AndroidFindBy(accessibility = CHOOSE_SPORT)
    @iOSXCUITFindBy(accessibility = CHOOSE_SPORT)
    private WebElement chooseSportButton;

    @AndroidFindBy(accessibility = CHOOSE_SPORT_TEXT)
    @iOSXCUITFindBy(accessibility = CHOOSE_SPORT_TEXT)
    private WebElement chooseSportButtonText;

    @AndroidFindBy(accessibility = FIRST_IN_PLAY_SPORT_TIME)
    @iOSXCUITFindBy(accessibility = FIRST_IN_PLAY_SPORT_TIME)
    private WebElement firstSportTime;

    @AndroidFindBy(accessibility = FIRST_IN_PLAY_SPORT_ICON)
    @iOSXCUITFindBy(accessibility = FIRST_IN_PLAY_SPORT_ICON)
    private WebElement firstSportIcon;

    @AndroidFindBy(accessibility = FIRST_IN_PLAY_SPORT_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_IN_PLAY_SPORT_NAME)
    private WebElement firstSportName;


    public InPlayPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInPlayScreenDisplayed() {
        return inPlayScreen.isDisplayed();
    }

    public void clickInPlayTodayFilter() {
        filterToday.click();
    }

    public String getInPlayTodayFilterText() {
        return filterToday.getText();
    }

    public void clickInPlayTomorrowFilter() {
        filterTomorrow.click();
    }

    public String getInPlayTomorrowFilterText() {
        return filterTomorrow.getText();
    }

    public void clickInPlayOneDayMoreFilter() {
        filterOneDayMore.click();
    }

    public String getInPlayOneDayMoreFilterText() {
        return filterOneDayMore.getText();
    }

    public void clickInPlayTwoDayMoreFilter() {
        filterTwoDayMore.click();
    }

    public String getInPlayTwoDayMoreFilterText() {
        return filterTwoDayMore.getText();
    }

    public void clickInPlayThreeDayMoreFilter() {
        filterThreeDayMore.click();
    }

    public String getInPlayThreeDayMoreFilterText() {
        return filterThreeDayMore.getText();
    }

    public void clickOnChooseSportButton() {
        chooseSportButton.click();
    }

    public boolean isChooseSportButtonDisplayed() {
        return chooseSportButton.isDisplayed();
    }

    public void waitUntilChooseSportButtonDisplayed() {
        waitVisibilityOfElement(chooseSportButton);
    }

    public String getChooseSportButtonText() {
        return chooseSportButtonText.getText();
    }

    public String getFirstSportTimeText() {
        return firstSportTime.getText();
    }

    public boolean isFirstSportIconDisplayed() {
        return firstSportIcon.isDisplayed();
    }

    public String getFirstSportNameText() {
        return firstSportName.getText();
    }

    public boolean isFirstSportNameDisplayed() {
        return firstSportName.isDisplayed();
    }

    public void waitFirstSportBecomesVisible() {
        waitVisibilityOfElement(firstSportName);
    }

    public void waitFirstSportTimeBecomesVisible() {
        waitVisibilityOfElement(firstSportTime);
    }
}