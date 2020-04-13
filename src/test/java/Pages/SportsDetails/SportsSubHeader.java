package Pages.SportsDetails;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SportsSubHeader extends BasePage {
    final static String FIRST_SELL_BUTTON = "sportMeetingDetailsSellButton1";
    final static String HIDE_OR_SHOW_SCOREBOARD = "sportMeetingHideShowScoreboard";
    final static String SPORT_HEADER_MATCH_TEXT_NAME = "sportScreenSubheaderMatchName";
    final static String SPORT_HEADER_MATCH_ARROW_LEFT = "sportScreenSubheaderArrow1TO";
    final static String SPORT_HEADER_MATCH_ARROW_RIGHT = "sportScreenSubheaderArrow2TO";
    final static String FIRST_MEETING_SUSPENDED = "sportMeetingDetailsMeetingSuspended1";


    @AndroidFindBy(accessibility = FIRST_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = FIRST_SELL_BUTTON)
    private WebElement firstSellButton;

    @AndroidFindBy(accessibility = HIDE_OR_SHOW_SCOREBOARD)
    @iOSXCUITFindBy(accessibility = HIDE_OR_SHOW_SCOREBOARD)
    private WebElement hideAndShowScoreBoard;

    @AndroidFindBy(accessibility = SPORT_HEADER_MATCH_TEXT_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_HEADER_MATCH_TEXT_NAME)
    private WebElement subheaderMatchName;

    @AndroidFindBy(accessibility = SPORT_HEADER_MATCH_ARROW_LEFT)
    @iOSXCUITFindBy(accessibility = SPORT_HEADER_MATCH_ARROW_LEFT)
    private WebElement subheaderMatchArrowLeft;

    @AndroidFindBy(accessibility = SPORT_HEADER_MATCH_ARROW_RIGHT)
    @iOSXCUITFindBy(accessibility = SPORT_HEADER_MATCH_ARROW_RIGHT)
    private WebElement subheaderMatchArrowRight;


    public SportsSubHeader(WebDriver driver) {
        super(driver);
    }

    public void clickOnFirstSellButton() {
        firstSellButton.click();
    }

    public boolean isSellButtonNotVisible() {
        return isElementsByAccessibilityIdNotPresent(FIRST_SELL_BUTTON);
    }

    public void clickOnHideAndShowScoreBoard() {
        hideAndShowScoreBoard.click();
    }

    public String getSportSubheaderMatchName() {
        return subheaderMatchName.getText();
    }

    public boolean isSportHeaderNameNotVisible() {
        return isElementsByAccessibilityIdNotPresent(SPORT_HEADER_MATCH_TEXT_NAME);
    }

    public void clickOnSportMatchArrowLeftButton() {
        subheaderMatchArrowLeft.click();
    }

    public boolean isSportMatchArrowLeftNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_HEADER_MATCH_ARROW_LEFT);
    }

    public void clickOnSportMatchArrowRightButton() {
        subheaderMatchArrowRight.click();
    }

    public boolean isSportMatchArrowRightNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_HEADER_MATCH_ARROW_RIGHT);
    }

    public boolean isHideAndShowScoreboardNotVisible() {
        return isElementsByAccessibilityIdNotPresent(HIDE_OR_SHOW_SCOREBOARD);
    }

    public boolean isFirstMeetingSuspendedNotVisible() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MEETING_SUSPENDED);
    }
}