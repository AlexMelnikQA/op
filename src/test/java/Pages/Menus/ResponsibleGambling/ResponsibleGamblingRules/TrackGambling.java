package Pages.Menus.ResponsibleGambling.ResponsibleGamblingRules;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrackGambling extends BasePage {
    final static String TRACK_GAMBLING_SCREEN = "TrackGamblingIsRendered";
    final static String TRACK_GAMBLING_TEXT_1 = "TrackGamblingIsRenderedText1";
    final static String TRACK_GAMBLING_TEXT_2 = "TrackGamblingIsRenderedText2";
    final static String TRACK_GAMBLING_TEXT_3 = "TrackGamblingIsRenderedText3";
    final static String TRACK_GAMBLING_TEXT_4 = "TrackGamblingIsRenderedText4";
    final static String TRACK_GAMBLING_TEXT_5 = "TrackGamblingIsRenderedText5";
    final static String TRACK_GAMBLING_TEXT_6 = "TrackGamblingIsRenderedText6";
    final static String TRACK_GAMBLING_TEXT_7 = "TrackGamblingIsRenderedText7";
    final static String TRACK_GAMBLING_TEXT_8 = "TrackGamblingIsRenderedText8";
    final static String TRACK_GAMBLING_TEXT_9 = "TrackGamblingIsRenderedText9";


    @AndroidFindBy(accessibility = TRACK_GAMBLING_SCREEN)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_SCREEN)
    private WebElement trackGamblingScreen;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_1)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_1)
    private WebElement trackGamblingText1;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_2)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_2)
    private WebElement trackGamblingText2;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_3)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_3)
    private WebElement trackGamblingText3;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_4)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_4)
    private WebElement trackGamblingText4;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_5)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_5)
    private WebElement trackGamblingText5;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_6)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_6)
    private WebElement trackGamblingText6;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_7)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_7)
    private WebElement trackGamblingText7;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_8)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_8)
    private WebElement trackGamblingText8;

    @AndroidFindBy(accessibility = TRACK_GAMBLING_TEXT_9)
    @iOSXCUITFindBy(accessibility = TRACK_GAMBLING_TEXT_9)
    private WebElement trackGamblingText9;


    public TrackGambling(WebDriver driver) {
        super(driver);
    }

    public boolean isTrackGamblingScreenVisible() {
        return trackGamblingScreen.isDisplayed();
    }

    public String getTrackGamblingText1() {
        return trackGamblingText1.getText();
    }

    public String getTrackGamblingText2() {
        return trackGamblingText2.getText();
    }

    public String getTrackGamblingText3() {
        return trackGamblingText3.getText();
    }

    public String getTrackGamblingText4() {
        return trackGamblingText4.getText();
    }

    public String getTrackGamblingText5() {
        return trackGamblingText5.getText();
    }

    public String getTrackGamblingText6() {
        return trackGamblingText6.getText();
    }

    public String getTrackGamblingText7() {
        return trackGamblingText7.getText();
    }

    public String getTrackGamblingText8() {
        return trackGamblingText8.getText();
    }

    public String getTrackGamblingText9() {
        return trackGamblingText9.getText();
    }
}