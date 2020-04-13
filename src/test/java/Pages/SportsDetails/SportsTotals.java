package Pages.SportsDetails;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SportsTotals extends BasePage {

    final static String SPORT_TOTALS_FIRST_MATCH = "totalsTabMatchHeaderNameText1";
    final static String SPORT_TOTALS_FIRST_MEETING = "1TotalsTabMeetingNameText1";
    final static String SPORT_TOTALS_NO_MATCH = "totalsSubTabNoMatches";


    @AndroidFindBy(accessibility = SPORT_TOTALS_FIRST_MATCH)
    @iOSXCUITFindBy(accessibility = SPORT_TOTALS_FIRST_MATCH)
    private WebElement sportTotalsFirstMatch;

    @AndroidFindBy(accessibility = SPORT_TOTALS_FIRST_MEETING)
    @iOSXCUITFindBy(accessibility = SPORT_TOTALS_FIRST_MEETING)
    private WebElement sportTotalsFirstMeeting;

    @AndroidFindBy(accessibility = SPORT_TOTALS_NO_MATCH)
    @iOSXCUITFindBy(accessibility = SPORT_TOTALS_NO_MATCH)
    private WebElement sportTotalsNoMatch;


    public SportsTotals(WebDriver driver) {
        super(driver);
    }

    public String getSportTotalsFirstMatchText() {
        return sportTotalsFirstMatch.getText();
    }

    public void clickOnSportTotalsFirstMatch() {
        sportTotalsFirstMatch.click();
    }

    public boolean isSportTotalsFirstMatchDisplayed() {
        return sportTotalsFirstMatch.isDisplayed();
    }

    public String getSportTotalsFirstMeetingText() {
        return sportTotalsFirstMeeting.getText();
    }

    public boolean isSportTotalsFirstMeetingNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_TOTALS_FIRST_MEETING);
    }

    public boolean isSportTotalsFirstMeetingDisplayed() {
        return sportTotalsFirstMeeting.isDisplayed();
    }

    public boolean isSportTotalsNoCurrentMatchesDisplayed() {
        return sportTotalsNoMatch.isDisplayed();
    }

    public String getSportTotalsNoCurrentMatchesText() {
        return sportTotalsNoMatch.getText();
    }
}