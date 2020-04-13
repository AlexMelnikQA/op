package Pages.Home.HighlightsTab;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HighlightsTab extends BasePage {

    final static String FIRST_SPORT_SECTION = "1HighlightsTabSportSection";
    final static String FIRST_MEETING_DESCRIPTION = "1HighlightsTabMeetingDescription1";
    final static String FIRST_MEETING_DATE = "1HighlightsTabMeetingDate1";

    @AndroidFindBy(accessibility = FIRST_SPORT_SECTION)
    @iOSXCUITFindBy(accessibility = FIRST_SPORT_SECTION)
    private WebElement firstSportSection;

    @AndroidFindBy(accessibility = FIRST_MEETING_DESCRIPTION)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_DESCRIPTION)
    private WebElement firstMeetingDescription;

    @AndroidFindBy(accessibility = FIRST_MEETING_DATE)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_DATE)
    private WebElement firstMeetingDate;


    public HighlightsTab(WebDriver driver) {
        super(driver);
    }

    public boolean isFirstSportSectionDisplayed() {
        return firstSportSection.isDisplayed();
    }

    public void clickOnFirstSportSection() {
        firstSportSection.click();
    }

    public String getFirstSportSectionText() {
        return firstSportSection.getText();
    }


    public boolean isFirstMeetingDescriptionDisplayed() {
        return firstMeetingDescription.isDisplayed();
    }

    public void clickOnFirstMeetingDescription() {
        firstMeetingDescription.click();
    }

    public boolean isFirstMeetingDescriptionNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MEETING_DESCRIPTION);
    }

    public boolean isFirstMeetingDateDisplayed() {
        return firstMeetingDate.isDisplayed();
    }

    public boolean isFirstMeetingDateNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(FIRST_MEETING_DATE);
    }

}