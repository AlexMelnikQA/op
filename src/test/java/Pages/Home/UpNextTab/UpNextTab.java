package Pages.Home.UpNextTab;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UpNextTab extends BasePage {

    final static String FILTER_LATER_TODAY = "1UpNextTabMeetingFilter";
    final static String FILTER_TOMORROW = "2UpNextTabMeetingFilter";
    final static String FIRST_MEETING = "1UpNextTabMeeting1";
    final static String FIRST_MEETING_TIME = "1UpNextTabMeetingTime1";
    final static String FIRST_MEETING_ICON = "1UpNextTabMeetingIcon1";
    final static String FIRST_MEETING_NAME = "1UpNextTabMeetingName1";
    final static String FIRST_MEETING_NAME_TOMORROW = "2UpNextTabMeetingName1";


    @AndroidFindBy(accessibility = FILTER_LATER_TODAY)
    @iOSXCUITFindBy(accessibility = FILTER_LATER_TODAY)
    private WebElement filtertLaterToday;

    @AndroidFindBy(accessibility = FILTER_TOMORROW)
    @iOSXCUITFindBy(accessibility = FILTER_TOMORROW)
    private WebElement filtertTomorrow;

    @AndroidFindBy(accessibility = FIRST_MEETING)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING)
    private WebElement firstMeeting;

    @AndroidFindBy(accessibility = FIRST_MEETING_TIME)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_TIME)
    private WebElement firstMeetingTime;

    @AndroidFindBy(accessibility = FIRST_MEETING_ICON)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_ICON)
    private WebElement firstMeetingIcon;

    @AndroidFindBy(accessibility = FIRST_MEETING_NAME)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_NAME)
    private WebElement firstMeetingName;

    @AndroidFindBy(accessibility = FIRST_MEETING_NAME_TOMORROW)
    @iOSXCUITFindBy(accessibility = FIRST_MEETING_NAME_TOMORROW)
    private WebElement firstMeetingNameTomorrow;


    public UpNextTab(WebDriver driver) {
        super(driver);
    }

    public boolean isFiltertLaterTodayDisplayed() {
        return filtertLaterToday.isDisplayed();
    }

    public void clickOnFiltertLaterToday() {
        filtertLaterToday.click();
    }

    public String getFiltertLaterTodayText() {
        return filtertLaterToday.getText();
    }

    public boolean isFiltertTomorrowDisplayed() {
        return filtertTomorrow.isDisplayed();
    }

    public void clickOnFilterTomorrow() {
        filtertTomorrow.click();
    }

    public String getFiltertTomorrowText() {
        return filtertTomorrow.getText();
    }

    public boolean isFirstMeetingDisplayed() {
        return firstMeeting.isDisplayed();
    }

    public boolean isFirstMeetingTimeDisplayed() {
        return firstMeetingTime.isDisplayed();
    }

    public String getFirstMeetingTimeText() {
        return firstMeetingTime.getText();
    }

    public boolean isFirstMeetingIconDisplayed() {
        return firstMeetingIcon.isDisplayed();
    }

    public boolean isFirstMeetingNameDisplayed() {
        return firstMeetingName.isDisplayed();
    }

    public String getFirstMeetingNameText() {
        return firstMeetingName.getText();
    }

    public void clickOnFirstMeetingNameLink() {
        firstMeetingName.click();
    }
}