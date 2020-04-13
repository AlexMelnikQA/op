package Pages.SportsDetails;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SportsLongTerm extends BasePage {

    final static String SPORT_LONG_TERMS_FIRST_MATCH = "longTermTabMatchHeaderNameText1";
    final static String SPORT_LONG_TERMS_FIRST_MEETING = "1LongTermTabMeetingNameText1";
    final static String SPORT_LONG_TERMS_NO_MATCH = "longTermSubTabNoMatches";


    @AndroidFindBy(accessibility = SPORT_LONG_TERMS_FIRST_MATCH)
    @iOSXCUITFindBy(accessibility = SPORT_LONG_TERMS_FIRST_MATCH)
    private WebElement sportLongTermFirstMatch;

    @AndroidFindBy(accessibility = SPORT_LONG_TERMS_FIRST_MEETING)
    @iOSXCUITFindBy(accessibility = SPORT_LONG_TERMS_FIRST_MEETING)
    private WebElement sportLongTermFirstMeeting;

    @AndroidFindBy(accessibility = SPORT_LONG_TERMS_NO_MATCH)
    @iOSXCUITFindBy(accessibility = SPORT_LONG_TERMS_NO_MATCH)
    private WebElement sportLongTermNoMatch;


    public SportsLongTerm(WebDriver driver) {
        super(driver);
    }

    public String getSportLongTermFirstMatchText() {
        return sportLongTermFirstMatch.getText();
    }

    public boolean isSportLongTermFirstMatchDisplayed() {
        return sportLongTermFirstMatch.isDisplayed();
    }

    public void clickOnSportLongTermFirstMatch() {
        sportLongTermFirstMatch.click();
    }

    public String getSportLongTermFirstMeetingText() {
        return sportLongTermFirstMeeting.getText();
    }


    public boolean isSportLongTermFirstMeetingDisplayed() {
        return sportLongTermFirstMeeting.isDisplayed();
    }

    public boolean isSportLongTermFirstMeetingNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_LONG_TERMS_FIRST_MEETING);
    }

    public boolean isSportLongTermNoCurrentMatchesDisplayed() {
        return sportLongTermNoMatch.isDisplayed();
    }

    public String getSportLongTermNoCurrentMatchesText() {
        return sportLongTermNoMatch.getText();
    }
}