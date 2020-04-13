package Pages.InPlay;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InPlaySportsPage extends BasePage {

    final static String SPORTS_SCREEN = "SportsFilterScreen";
    final static String SPORTS_SCREEN_TEXT = "SportsFilterText";
    final static String SPORTS_BACK_TO_IN_PLAY = "BackToInPlayScreen";

    final static String SPORT_1 = "1InplayChooseSport";
    final static String SPORT_1_CHECKBOX = "1InplayChooseSportCheckbox";
    final static String SPORT_2 = "2InplayChooseSport";
    final static String SPORT_2_CHECKBOX = "2InplayChooseSportCheckbox";
    final static String SPORT_3 = "3InplayChooseSport";
    final static String SPORT_3_CHECKBOX = "3InplayChooseSportCheckbox";
    final static String SPORT_4 = "4InplayChooseSport";
    final static String SPORT_4_CHECKBOX = "4InplayChooseSportCheckbox";
    final static String SPORT_5 = "5InplayChooseSport";
    final static String SPORT_5_CHECKBOX = "5InplayChooseSportCheckbox";
    final static String SPORT_6 = "6InplayChooseSport";
    final static String SPORT_6_CHECKBOX = "6InplayChooseSportCheckbox";
    final static String SPORT_7 = "7InplayChooseSport";
    final static String SPORT_7_CHECKBOX = "7InplayChooseSportCheckbox";
    final static String SPORT_8 = "8InplayChooseSport";
    final static String SPORT_8_CHECKBOX = "8InplayChooseSportCheckbox";
    final static String SPORT_9 = "9InplayChooseSport";
    final static String SPORT_9_CHECKBOX = "9InplayChooseSportCheckbox";
    final static String SPORT_10 = "10InplayChooseSport";
    final static String SPORT_10_CHECKBOX = "10InplayChooseSportCheckbox";
    final static String SPORT_11 = "11InplayChooseSport";
    final static String SPORT_11_CHECKBOX = "11InplayChooseSportCheckbox";
    final static String SPORT_12 = "12InplayChooseSport";
    final static String SPORT_12_CHECKBOX = "12InplayChooseSportCheckbox";
    final static String SPORT_13 = "13InplayChooseSport";
    final static String SPORT_13_CHECKBOX = "13InplayChooseSportCheckbox";
    final static String SPORT_14 = "14InplayChooseSport";
    final static String SPORT_14_CHECKBOX = "14InplayChooseSportCheckbox";
    final static String SPORT_15 = "15InplayChooseSport";
    final static String SPORT_15_CHECKBOX = "15InplayChooseSportCheckbox";
    final static String SPORT_16 = "16InplayChooseSport";
    final static String SPORT_16_CHECKBOX = "16InplayChooseSportCheckbox";
    final static String SPORT_17 = "17InplayChooseSport";
    final static String SPORT_17_CHECKBOX = "17InplayChooseSportCheckbox";
    final static String SPORT_18 = "18InplayChooseSport";
    final static String SPORT_18_CHECKBOX = "18InplayChooseSportCheckbox";
    final static String SPORT_19 = "19InplayChooseSport";
    final static String SPORT_19_CHECKBOX = "19InplayChooseSportCheckbox";
    final static String SPORT_20 = "20InplayChooseSport";
    final static String SPORT_20_CHECKBOX = "20InplayChooseSportCheckbox";
    final static String SPORT_21 = "21InplayChooseSport";
    final static String SPORT_21_CHECKBOX = "21InplayChooseSportCheckbox";
    final static String SPORT_22 = "22InplayChooseSport";
    final static String SPORT_22_CHECKBOX = "22InplayChooseSportCheckbox";
    final static String SPORT_23 = "23InplayChooseSport";
    final static String SPORT_23_CHECKBOX = "23InplayChooseSportCheckbox";
    final static String SPORT_24 = "24InplayChooseSport";
    final static String SPORT_24_CHECKBOX = "24InplayChooseSportCheckbox";
    final static String SPORT_25 = "25InplayChooseSport";
    final static String SPORT_25_CHECKBOX = "25InplayChooseSportCheckbox";

    @AndroidFindBy(accessibility = SPORTS_SCREEN)
    @iOSXCUITFindBy(accessibility = SPORTS_SCREEN)
    private WebElement sportsScreen;

    @AndroidFindBy(accessibility = SPORTS_SCREEN_TEXT)
    @iOSXCUITFindBy(accessibility = SPORTS_SCREEN_TEXT)
    private WebElement sportsScreenText;

    @AndroidFindBy(accessibility = SPORTS_BACK_TO_IN_PLAY)
    @iOSXCUITFindBy(accessibility = SPORTS_BACK_TO_IN_PLAY)
    private WebElement sportsBackToInPlayPage;

    @AndroidFindBy(accessibility = SPORT_1)
    @iOSXCUITFindBy(accessibility = SPORT_1)
    private WebElement sport1;

    @AndroidFindBy(accessibility = SPORT_1_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_1_CHECKBOX)
    private WebElement sport1Checkbox;

    @AndroidFindBy(accessibility = SPORT_2)
    @iOSXCUITFindBy(accessibility = SPORT_2)
    private WebElement sport2;

    @AndroidFindBy(accessibility = SPORT_2_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_2_CHECKBOX)
    private WebElement sport2Checkbox;

    @AndroidFindBy(accessibility = SPORT_3)
    @iOSXCUITFindBy(accessibility = SPORT_3)
    private WebElement sport3;

    @AndroidFindBy(accessibility = SPORT_3_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_3_CHECKBOX)
    private WebElement sport3Checkbox;

    @AndroidFindBy(accessibility = SPORT_4)
    @iOSXCUITFindBy(accessibility = SPORT_4)
    private WebElement sport4;

    @AndroidFindBy(accessibility = SPORT_4_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_4_CHECKBOX)
    private WebElement sport4Checkbox;

    @AndroidFindBy(accessibility = SPORT_5)
    @iOSXCUITFindBy(accessibility = SPORT_5)
    private WebElement sport5;

    @AndroidFindBy(accessibility = SPORT_5_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_5_CHECKBOX)
    private WebElement sport5Checkbox;

    @AndroidFindBy(accessibility = SPORT_6)
    @iOSXCUITFindBy(accessibility = SPORT_6)
    private WebElement sport6;

    @AndroidFindBy(accessibility = SPORT_6_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_6_CHECKBOX)
    private WebElement sport6Checkbox;

    @AndroidFindBy(accessibility = SPORT_7)
    @iOSXCUITFindBy(accessibility = SPORT_7)
    private WebElement sport7;

    @AndroidFindBy(accessibility = SPORT_7_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_7_CHECKBOX)
    private WebElement sport7Checkbox;

    @AndroidFindBy(accessibility = SPORT_8)
    @iOSXCUITFindBy(accessibility = SPORT_8)
    private WebElement sport8;

    @AndroidFindBy(accessibility = SPORT_8_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_8_CHECKBOX)
    private WebElement sport8Checkbox;

    @AndroidFindBy(accessibility = SPORT_9)
    @iOSXCUITFindBy(accessibility = SPORT_9)
    private WebElement sport9;

    @AndroidFindBy(accessibility = SPORT_9_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_9_CHECKBOX)
    private WebElement sport9Checkbox;

    @AndroidFindBy(accessibility = SPORT_10)
    @iOSXCUITFindBy(accessibility = SPORT_10)
    private WebElement sport10;

    @AndroidFindBy(accessibility = SPORT_10_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_10_CHECKBOX)
    private WebElement sport10Checkbox;

    @AndroidFindBy(accessibility = SPORT_11)
    @iOSXCUITFindBy(accessibility = SPORT_11)
    private WebElement sport11;

    @AndroidFindBy(accessibility = SPORT_11_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_11_CHECKBOX)
    private WebElement sport11Checkbox;

    @AndroidFindBy(accessibility = SPORT_12)
    @iOSXCUITFindBy(accessibility = SPORT_12)
    private WebElement sport12;

    @AndroidFindBy(accessibility = SPORT_12_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_12_CHECKBOX)
    private WebElement sport12Checkbox;

    @AndroidFindBy(accessibility = SPORT_13)
    @iOSXCUITFindBy(accessibility = SPORT_13)
    private WebElement sport13;

    @AndroidFindBy(accessibility = SPORT_13_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_13_CHECKBOX)
    private WebElement sport13Checkbox;

    @AndroidFindBy(accessibility = SPORT_14)
    @iOSXCUITFindBy(accessibility = SPORT_14)
    private WebElement sport14;

    @AndroidFindBy(accessibility = SPORT_14_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_14_CHECKBOX)
    private WebElement sport14Checkbox;

    @AndroidFindBy(accessibility = SPORT_15)
    @iOSXCUITFindBy(accessibility = SPORT_15)
    private WebElement sport15;

    @AndroidFindBy(accessibility = SPORT_15_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_15_CHECKBOX)
    private WebElement sport15Checkbox;

    @AndroidFindBy(accessibility = SPORT_16)
    @iOSXCUITFindBy(accessibility = SPORT_16)
    private WebElement sport16;

    @AndroidFindBy(accessibility = SPORT_16_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_16_CHECKBOX)
    private WebElement sport16Checkbox;

    @AndroidFindBy(accessibility = SPORT_17)
    @iOSXCUITFindBy(accessibility = SPORT_17)
    private WebElement sport17;

    @AndroidFindBy(accessibility = SPORT_17_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_17_CHECKBOX)
    private WebElement sport17Checkbox;

    @AndroidFindBy(accessibility = SPORT_18)
    @iOSXCUITFindBy(accessibility = SPORT_18)
    private WebElement sport18;

    @AndroidFindBy(accessibility = SPORT_18_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_18_CHECKBOX)
    private WebElement sport18Checkbox;

    @AndroidFindBy(accessibility = SPORT_19)
    @iOSXCUITFindBy(accessibility = SPORT_19)
    private WebElement sport19;

    @AndroidFindBy(accessibility = SPORT_19_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_19_CHECKBOX)
    private WebElement sport19Checkbox;

    @AndroidFindBy(accessibility = SPORT_20)
    @iOSXCUITFindBy(accessibility = SPORT_20)
    private WebElement sport20;

    @AndroidFindBy(accessibility = SPORT_20_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_20_CHECKBOX)
    private WebElement sport20Checkbox;

    @AndroidFindBy(accessibility = SPORT_21)
    @iOSXCUITFindBy(accessibility = SPORT_21)
    private WebElement sport21;

    @AndroidFindBy(accessibility = SPORT_21_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_21_CHECKBOX)
    private WebElement sport21Checkbox;

    @AndroidFindBy(accessibility = SPORT_22)
    @iOSXCUITFindBy(accessibility = SPORT_22)
    private WebElement sport22;

    @AndroidFindBy(accessibility = SPORT_22_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_22_CHECKBOX)
    private WebElement sport22Checkbox;

    @AndroidFindBy(accessibility = SPORT_23)
    @iOSXCUITFindBy(accessibility = SPORT_23)
    private WebElement sport23;

    @AndroidFindBy(accessibility = SPORT_23_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_23_CHECKBOX)
    private WebElement sport23Checkbox;

    @AndroidFindBy(accessibility = SPORT_24)
    @iOSXCUITFindBy(accessibility = SPORT_24)
    private WebElement sport24;

    @AndroidFindBy(accessibility = SPORT_24_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_24_CHECKBOX)
    private WebElement sport24Checkbox;


    @AndroidFindBy(accessibility = SPORT_25)
    @iOSXCUITFindBy(accessibility = SPORT_25)
    private WebElement sport25;

    @AndroidFindBy(accessibility = SPORT_25_CHECKBOX)
    @iOSXCUITFindBy(accessibility = SPORT_25_CHECKBOX)
    private WebElement sport25Checkbox;


    public InPlaySportsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInPlaySportsScreenDisplayed() {
        return sportsScreen.isDisplayed();
    }

    public boolean isBackToInPlayScreenButtonDisplayed() {
        return sportsBackToInPlayPage.isDisplayed();
    }

    public void clickBackToInPlayScreenButton() {
        sportsBackToInPlayPage.click();
    }

    public String getInPlaySportsText() {
        return sportsScreenText.getText();
    }

    public void clickFirstSportCheckbox() {
        sport1.click();
    }

    public String getSport1Name() {
        return sport1.getText();
    }

    public boolean isSport1CheckboxDisplayed() {
        return sport1Checkbox.isDisplayed();
    }

    public String getSport2Name() {
        return sport2.getText();
    }

    public boolean isSport2CheckboxDisplayed() {
        return sport2Checkbox.isDisplayed();
    }

    public String getSport3Name() {
        return sport3.getText();
    }

    public boolean isSport3CheckboxDisplayed() {
        return sport3Checkbox.isDisplayed();
    }

    public String getSport4Name() {
        return sport4.getText();
    }

    public boolean isSport4CheckboxDisplayed() {
        return sport4Checkbox.isDisplayed();
    }

    public String getSport5Name() {
        return sport5.getText();
    }

    public boolean isSport5CheckboxDisplayed() {
        return sport5Checkbox.isDisplayed();
    }

    public String getSport6Name() {
        return sport6.getText();
    }

    public boolean isSport6CheckboxDisplayed() {
        return sport6Checkbox.isDisplayed();
    }

    public String getSport7Name() {
        return sport7.getText();
    }

    public boolean isSport7CheckboxDisplayed() {
        return sport7Checkbox.isDisplayed();
    }

    public String getSport8Name() {
        return sport8.getText();
    }

    public boolean isSport8CheckboxDisplayed() {
        return sport8Checkbox.isDisplayed();
    }

    public String getSport9Name() {
        return sport9.getText();
    }

    public boolean isSport9CheckboxDisplayed() {
        return sport9Checkbox.isDisplayed();
    }

    public String getSport10Name() {
        return sport10.getText();
    }

    public boolean isSport10CheckboxDisplayed() {
        return sport10Checkbox.isDisplayed();
    }

    public String getSport11Name() {
        return sport11.getText();
    }

    public boolean isSport11CheckboxDisplayed() {
        return sport11Checkbox.isDisplayed();
    }

    public String getSport12Name() {
        return sport12.getText();
    }

    public boolean isSport12CheckboxDisplayed() {
        return sport12Checkbox.isDisplayed();
    }

    public String getSport13Name() {
        return sport13.getText();
    }

    public boolean isSport13CheckboxDisplayed() {
        return sport13Checkbox.isDisplayed();
    }

    public String getSport14Name() {
        return sport14.getText();
    }

    public boolean isSport14CheckboxDisplayed() {
        return sport14Checkbox.isDisplayed();
    }

    public String getSport15Name() {
        return sport15.getText();
    }

    public boolean isSport15CheckboxDisplayed() {
        return sport15Checkbox.isDisplayed();
    }

    public String getSport16Name() {
        return sport16.getText();
    }

    public boolean isSport16CheckboxDisplayed() {
        return sport16Checkbox.isDisplayed();
    }

    public String getSport17Name() {
        return sport17.getText();
    }

    public boolean isSport17CheckboxDisplayed() {
        return sport17Checkbox.isDisplayed();
    }

    public String getSport18Name() {
        return sport18.getText();
    }

    public boolean isSport18CheckboxDisplayed() {
        return sport18Checkbox.isDisplayed();
    }

    public String getSport19Name() {
        return sport19.getText();
    }

    public boolean isSport19CheckboxDisplayed() {
        return sport19Checkbox.isDisplayed();
    }

    public String getSport20Name() {
        return sport20.getText();
    }

    public boolean isSport20CheckboxDisplayed() {
        return sport20Checkbox.isDisplayed();
    }

    public String getSport21Name() {
        return sport21.getText();
    }

    public boolean isSport21CheckboxDisplayed() {
        return sport21Checkbox.isDisplayed();
    }

    public String getSport22Name() {
        return sport22.getText();
    }

    public boolean isSport22CheckboxDisplayed() {
        return sport22Checkbox.isDisplayed();
    }

    public String getSport23Name() {
        return sport23.getText();
    }

    public boolean isSport23CheckboxDisplayed() {
        return sport23Checkbox.isDisplayed();
    }

    public String getSport24Name() {
        return sport24.getText();
    }

    public boolean isSport24CheckboxDisplayed() {
        return sport24Checkbox.isDisplayed();
    }

    public String getSport25Name() {
        return sport25.getText();
    }

    public boolean isSport25CheckboxDisplayed() {
        return sport25Checkbox.isDisplayed();
    }
}