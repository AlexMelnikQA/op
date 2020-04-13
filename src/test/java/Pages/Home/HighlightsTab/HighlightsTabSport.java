package Pages.Home.HighlightsTab;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightsTabSport extends BasePage {
    final static String HIGHLIGHTS_FIRST_SELL_BUTTON = "sportMeetingDetailsSellButton1";
    final static String HIGHLIGHTS_HIDE_OR_SHOW_SCOREBOARD = "sportMeetingHideShowScoreboard";

    @AndroidFindBy(accessibility = HIGHLIGHTS_FIRST_SELL_BUTTON)
    @iOSXCUITFindBy(accessibility = HIGHLIGHTS_FIRST_SELL_BUTTON)
    private WebElement firstSellButton;

    @AndroidFindBy(accessibility = HIGHLIGHTS_HIDE_OR_SHOW_SCOREBOARD)
    @iOSXCUITFindBy(accessibility = HIGHLIGHTS_HIDE_OR_SHOW_SCOREBOARD)
    private WebElement hideAndShowScoreBoard;

    public HighlightsTabSport(WebDriver driver) {
        super(driver);
    }

    public void clickOnFirstSellButton() {
        firstSellButton.click();
    }

    public void csrollToFirstSellButton() {
        scrollToElement(HIGHLIGHTS_FIRST_SELL_BUTTON);
    }

    public boolean isForSellButtonNotVisible() {
        return isElementsByAccessibilityIdNotPresent(HIGHLIGHTS_FIRST_SELL_BUTTON);
    }

    public boolean isHideAndShowScoreboardNotVisible() {
        return isElementsByAccessibilityIdNotPresent(HIGHLIGHTS_HIDE_OR_SHOW_SCOREBOARD);
    }

    public void clickOnHideAndShowScoreBoard() {
        hideAndShowScoreBoard.click();
    }

}
