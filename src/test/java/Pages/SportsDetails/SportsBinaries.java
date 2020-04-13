package Pages.SportsDetails;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SportsBinaries extends BasePage {
    final static String SPORT_TITLE_IN_BINARIES = "sportDetailsTitleText";
    final static String FIRST_MEETING_IN_BINARIES = "1BinariesTabMeetingNameText1";
    final static String NO_MATCHES_TEXT = "noBinariesMatchesText";

    @AndroidFindBy(accessibility = SPORT_TITLE_IN_BINARIES)
    @iOSXCUITFindBy(accessibility = SPORT_TITLE_IN_BINARIES)
    private WebElement sportTitleInBinaries;

    @AndroidFindBy(accessibility = FIRST_MEETING_IN_BINARIES)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_IN_BINARIES)
    private WebElement firstMeetingInBinaries;

    @AndroidFindBy(accessibility = NO_MATCHES_TEXT)
    @iOSXCUITFindBy(accessibility = NO_MATCHES_TEXT)
    private WebElement noMatchesText;


    public SportsBinaries(WebDriver driver) {
        super(driver);
    }

    public String getBinariesSportTitle() {
        return sportTitleInBinaries.getText();
    }

    public String getFirstMeetingInBinariesText() {
        return firstMeetingInBinaries.getText();
    }

    public void clickOnFirstMeetingInBinaries() {
        firstMeetingInBinaries.click();
    }

    public boolean isNoMatchesTextNotPresent() {
        return isElementsByAccessibilityIdNotPresent(NO_MATCHES_TEXT);
    }

    public String getNoMatchesText() {
        return noMatchesText.getText();
    }
}