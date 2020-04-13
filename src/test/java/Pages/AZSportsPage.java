package Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class AZSportsPage extends BasePage {

    final static String AZ_SPORTS_SCREEN = "azSportsScreen";
    final static String AZ_SPORTS_SCREEN_TEXT = "azSportsScreenText";
    final static String AZ_SPORTS_SCREEN_SEARCH = "azSportsScreenSearch";
    final static String AZ_SPORTS_SCREEN_SEARCH_ICON = "azSportSearchIcon";
    final static String AZ_SPORTS_SCREEN_SEARCH_FIELD = "azSportSearchBar";
    final static String AZ_SPORTS_SCREEN_SEARCH_CLOSE_BUTTON = "azSportFilledSearchCloseButton";


    final static String SPORT_1_ICON = "1SportIcon";
    final static String SPORT_1_NAME = "1SportName";
    final static String SPORT_1_STAR = "1SportStar";
    final static String SPORT_2_ICON = "2SportIcon";
    final static String SPORT_2_NAME = "2SportName";
    final static String SPORT_2_STAR = "2SportStar";
    final static String SPORT_3_ICON = "3SportIcon";
    final static String SPORT_3_NAME = "3SportName";
    final static String SPORT_3_STAR = "3SportStar";
    final static String SPORT_4_ICON = "4SportIcon";
    final static String SPORT_4_NAME = "4SportName";
    final static String SPORT_4_STAR = "4SportStar";
    final static String SPORT_5_ICON = "5SportIcon";
    final static String SPORT_5_NAME = "5SportName";
    final static String SPORT_5_STAR = "5SportStar";
    final static String SPORT_6_ICON = "6SportIcon";
    final static String SPORT_6_NAME = "6SportName";
    final static String SPORT_6_STAR = "6SportStar";
    final static String SPORT_7_ICON = "7SportIcon";
    final static String SPORT_7_NAME = "7SportName";
    final static String SPORT_7_STAR = "7SportStar";
    final static String SPORT_8_ICON = "8SportIcon";
    final static String SPORT_8_NAME = "8SportName";
    final static String SPORT_8_STAR = "8SportStar";
    final static String SPORT_9_ICON = "9SportIcon";
    final static String SPORT_9_NAME = "9SportName";
    final static String SPORT_9_STAR = "9SportStar";
    final static String SPORT_10_ICON = "10SportIcon";
    final static String SPORT_10_NAME = "10SportName";
    final static String SPORT_10_STAR = "10SportStar";
    final static String SPORT_11_ICON = "11SportIcon";
    final static String SPORT_11_NAME = "11SportName";
    final static String SPORT_11_STAR = "11SportStar";
    final static String SPORT_12_ICON = "12SportIcon";
    final static String SPORT_12_NAME = "12SportName";
    final static String SPORT_12_STAR = "12SportStar";
    final static String SPORT_13_ICON = "13SportIcon";
    final static String SPORT_13_NAME = "13SportName";
    final static String SPORT_13_STAR = "13SportStar";
    final static String SPORT_14_ICON = "14SportIcon";
    final static String SPORT_14_NAME = "14SportName";
    final static String SPORT_14_STAR = "14SportStar";
    final static String SPORT_15_ICON = "15SportIcon";
    final static String SPORT_15_NAME = "15SportName";
    final static String SPORT_15_STAR = "15SportStar";
    final static String SPORT_16_ICON = "16SportIcon";
    final static String SPORT_16_NAME = "16SportName";
    final static String SPORT_16_STAR = "16SportStar";
    final static String SPORT_17_ICON = "17SportIcon";
    final static String SPORT_17_NAME = "17SportName";
    final static String SPORT_17_STAR = "17SportStar";
    final static String SPORT_18_ICON = "18SportIcon";
    final static String SPORT_18_NAME = "18SportName";
    final static String SPORT_18_STAR = "18SportStar";
    final static String SPORT_19_ICON = "19SportIcon";
    final static String SPORT_19_NAME = "19SportName";
    final static String SPORT_19_STAR = "19SportStar";
    final static String SPORT_20_ICON = "20SportIcon";
    final static String SPORT_20_NAME = "20SportName";
    final static String SPORT_20_STAR = "20SportStar";
    final static String SPORT_21_ICON = "21SportIcon";
    final static String SPORT_21_NAME = "21SportName";
    final static String SPORT_21_STAR = "21SportStar";
    final static String SPORT_22_ICON = "22SportIcon";
    final static String SPORT_22_NAME = "22SportName";
    final static String SPORT_22_STAR = "22SportStar";
    final static String SPORT_23_ICON = "23SportIcon";
    final static String SPORT_23_NAME = "23SportName";
    final static String SPORT_23_STAR = "23SportStar";
    final static String SPORT_24_ICON = "24SportIcon";
    final static String SPORT_24_NAME = "24SportName";
    final static String SPORT_24_STAR = "24SportStar";
    final static String SPORT_25_ICON = "25SportIcon";
    final static String SPORT_25_NAME = "25SportName";
    final static String SPORT_25_STAR = "25SportStar";
    final static String SPORT_26_ICON = "26SportIcon";
    final static String SPORT_26_NAME = "26SportName";
    final static String SPORT_26_STAR = "26SportStar";
    final static String SPORT_27_ICON = "27SportIcon";
    final static String SPORT_27_NAME = "27SportName";
    final static String SPORT_27_STAR = "27SportStar";
    final static String SPORT_28_ICON = "28SportIcon";
    final static String SPORT_28_NAME = "28SportName";
    final static String SPORT_28_STAR = "28SportStar";
    final static String SPORT_29_ICON = "29SportIcon";
    final static String SPORT_29_NAME = "29SportName";
    final static String SPORT_29_STAR = "29SportStar";
    final static String SPORT_30_ICON = "30SportIcon";
    final static String SPORT_30_NAME = "30SportName";
    final static String SPORT_30_STAR = "30SportStar";


    @AndroidFindBy(accessibility = AZ_SPORTS_SCREEN)
    @iOSXCUITFindBy(accessibility = AZ_SPORTS_SCREEN)
    private WebElement azSportsScreen;

    @AndroidFindBy(accessibility = AZ_SPORTS_SCREEN_TEXT)
    @iOSXCUITFindBy(accessibility = AZ_SPORTS_SCREEN_TEXT)
    private WebElement azSportsScreenText;

    @AndroidFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH)
    @iOSXCUITFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH)
    private WebElement azSportsScreenSearch;

    @AndroidFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH_ICON)
    @iOSXCUITFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH_ICON)
    private WebElement azSportsScreenSearchIcon;

    @AndroidFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH_FIELD)
    @iOSXCUITFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH_FIELD)
    private WebElement azSportsScreenSearchField;

    @AndroidFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH_CLOSE_BUTTON)
    @iOSXCUITFindBy(accessibility = AZ_SPORTS_SCREEN_SEARCH_CLOSE_BUTTON)
    private WebElement azSportsScreenSearchCloseButton;

    @AndroidFindBy(accessibility = SPORT_1_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_1_ICON)
    private WebElement sport1Icon;

    @AndroidFindBy(accessibility = SPORT_1_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_1_NAME)
    private WebElement sport1Name;

    @AndroidFindBy(accessibility = SPORT_1_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_1_STAR)
    private WebElement sport1Star;

    @AndroidFindBy(accessibility = SPORT_2_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_2_ICON)
    private WebElement sport2Icon;

    @AndroidFindBy(accessibility = SPORT_2_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_2_NAME)
    private WebElement sport2Name;

    @AndroidFindBy(accessibility = SPORT_2_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_2_STAR)
    private WebElement sport2Star;

    @AndroidFindBy(accessibility = SPORT_3_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_3_ICON)
    private WebElement sport3Icon;

    @AndroidFindBy(accessibility = SPORT_3_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_3_NAME)
    private WebElement sport3Name;

    @AndroidFindBy(accessibility = SPORT_3_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_3_STAR)
    private WebElement sport3Star;

    @AndroidFindBy(accessibility = SPORT_4_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_4_ICON)
    private WebElement sport4Icon;

    @AndroidFindBy(accessibility = SPORT_4_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_4_NAME)
    private WebElement sport4Name;

    @AndroidFindBy(accessibility = SPORT_4_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_4_STAR)
    private WebElement sport4Star;

    @AndroidFindBy(accessibility = SPORT_5_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_5_ICON)
    private WebElement sport5Icon;

    @AndroidFindBy(accessibility = SPORT_5_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_5_NAME)
    private WebElement sport5Name;

    @AndroidFindBy(accessibility = SPORT_5_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_5_STAR)
    private WebElement sport5Star;

    @AndroidFindBy(accessibility = SPORT_6_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_6_ICON)
    private WebElement sport6Icon;

    @AndroidFindBy(accessibility = SPORT_6_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_6_NAME)
    private WebElement sport6Name;

    @AndroidFindBy(accessibility = SPORT_6_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_6_STAR)
    private WebElement sport6Star;

    @AndroidFindBy(accessibility = SPORT_7_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_7_ICON)
    private WebElement sport7Icon;

    @AndroidFindBy(accessibility = SPORT_7_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_7_NAME)
    private WebElement sport7Name;

    @AndroidFindBy(accessibility = SPORT_7_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_7_STAR)
    private WebElement sport7Star;

    @AndroidFindBy(accessibility = SPORT_8_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_8_ICON)
    private WebElement sport8Icon;

    @AndroidFindBy(accessibility = SPORT_8_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_8_NAME)
    private WebElement sport8Name;

    @AndroidFindBy(accessibility = SPORT_8_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_8_STAR)
    private WebElement sport8Star;

    @AndroidFindBy(accessibility = SPORT_9_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_9_ICON)
    private WebElement sport9Icon;

    @AndroidFindBy(accessibility = SPORT_9_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_9_NAME)
    private WebElement sport9Name;

    @AndroidFindBy(accessibility = SPORT_9_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_9_STAR)
    private WebElement sport9Star;

    @AndroidFindBy(accessibility = SPORT_10_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_10_ICON)
    private WebElement sport10Icon;

    @AndroidFindBy(accessibility = SPORT_10_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_10_NAME)
    private WebElement sport10Name;

    @AndroidFindBy(accessibility = SPORT_10_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_10_STAR)
    private WebElement sport10Star;

    @AndroidFindBy(accessibility = SPORT_11_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_11_ICON)
    private WebElement sport11Icon;

    @AndroidFindBy(accessibility = SPORT_11_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_11_NAME)
    private WebElement sport11Name;

    @AndroidFindBy(accessibility = SPORT_11_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_11_STAR)
    private WebElement sport11Star;

    @AndroidFindBy(accessibility = SPORT_12_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_12_ICON)
    private WebElement sport12Icon;

    @AndroidFindBy(accessibility = SPORT_12_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_12_NAME)
    private WebElement sport12Name;

    @AndroidFindBy(accessibility = SPORT_12_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_12_STAR)
    private WebElement sport12Star;

    @AndroidFindBy(accessibility = SPORT_13_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_13_ICON)
    private WebElement sport13Icon;

    @AndroidFindBy(accessibility = SPORT_13_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_13_NAME)
    private WebElement sport13Name;

    @AndroidFindBy(accessibility = SPORT_13_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_13_STAR)
    private WebElement sport13Star;

    @AndroidFindBy(accessibility = SPORT_14_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_14_ICON)
    private WebElement sport14Icon;

    @AndroidFindBy(accessibility = SPORT_14_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_14_NAME)
    private WebElement sport14Name;

    @AndroidFindBy(accessibility = SPORT_14_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_14_STAR)
    private WebElement sport14Star;

    @AndroidFindBy(accessibility = SPORT_15_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_15_ICON)
    private WebElement sport15Icon;

    @AndroidFindBy(accessibility = SPORT_15_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_15_NAME)
    private WebElement sport15Name;

    @AndroidFindBy(accessibility = SPORT_15_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_15_STAR)
    private WebElement sport15Star;

    @AndroidFindBy(accessibility = SPORT_16_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_16_ICON)
    private WebElement sport16Icon;

    @AndroidFindBy(accessibility = SPORT_16_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_16_NAME)
    private WebElement sport16Name;

    @AndroidFindBy(accessibility = SPORT_16_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_16_STAR)
    private WebElement sport16Star;

    @AndroidFindBy(accessibility = SPORT_17_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_17_ICON)
    private WebElement sport17Icon;

    @AndroidFindBy(accessibility = SPORT_17_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_17_NAME)
    private WebElement sport17Name;

    @AndroidFindBy(accessibility = SPORT_17_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_17_STAR)
    private WebElement sport17Star;

    @AndroidFindBy(accessibility = SPORT_18_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_18_ICON)
    private WebElement sport18Icon;

    @AndroidFindBy(accessibility = SPORT_18_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_18_NAME)
    private WebElement sport18Name;

    @AndroidFindBy(accessibility = SPORT_18_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_18_STAR)
    private WebElement sport18Star;

    @AndroidFindBy(accessibility = SPORT_19_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_19_ICON)
    private WebElement sport19Icon;

    @AndroidFindBy(accessibility = SPORT_19_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_19_NAME)
    private WebElement sport19Name;

    @AndroidFindBy(accessibility = SPORT_19_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_19_STAR)
    private WebElement sport19Star;

    @AndroidFindBy(accessibility = SPORT_20_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_20_ICON)
    private WebElement sport20Icon;

    @AndroidFindBy(accessibility = SPORT_20_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_20_NAME)
    private WebElement sport20Name;

    @AndroidFindBy(accessibility = SPORT_20_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_20_STAR)
    private WebElement sport20Star;

    @AndroidFindBy(accessibility = SPORT_21_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_21_ICON)
    private WebElement sport21Icon;

    @AndroidFindBy(accessibility = SPORT_21_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_21_NAME)
    private WebElement sport21Name;

    @AndroidFindBy(accessibility = SPORT_21_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_21_STAR)
    private WebElement sport21Star;

    @AndroidFindBy(accessibility = SPORT_22_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_22_ICON)
    private WebElement sport22Icon;

    @AndroidFindBy(accessibility = SPORT_22_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_22_NAME)
    private WebElement sport22Name;

    @AndroidFindBy(accessibility = SPORT_22_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_22_STAR)
    private WebElement sport22Star;

    @AndroidFindBy(accessibility = SPORT_23_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_23_ICON)
    private WebElement sport23Icon;

    @AndroidFindBy(accessibility = SPORT_23_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_23_NAME)
    private WebElement sport23Name;

    @AndroidFindBy(accessibility = SPORT_23_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_23_STAR)
    private WebElement sport23Star;

    @AndroidFindBy(accessibility = SPORT_24_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_24_ICON)
    private WebElement sport24Icon;

    @AndroidFindBy(accessibility = SPORT_24_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_24_NAME)
    private WebElement sport24Name;

    @AndroidFindBy(accessibility = SPORT_24_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_24_STAR)
    private WebElement sport24Star;

    @AndroidFindBy(accessibility = SPORT_25_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_25_ICON)
    private WebElement sport25Icon;

    @AndroidFindBy(accessibility = SPORT_25_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_25_NAME)
    private WebElement sport25Name;

    @AndroidFindBy(accessibility = SPORT_25_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_25_STAR)
    private WebElement sport25Star;

    @AndroidFindBy(accessibility = SPORT_26_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_26_ICON)
    private WebElement sport26Icon;

    @AndroidFindBy(accessibility = SPORT_26_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_26_NAME)
    private WebElement sport26Name;

    @AndroidFindBy(accessibility = SPORT_26_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_26_STAR)
    private WebElement sport26Star;

    @AndroidFindBy(accessibility = SPORT_27_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_27_ICON)
    private WebElement sport27Icon;

    @AndroidFindBy(accessibility = SPORT_27_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_27_NAME)
    private WebElement sport27Name;

    @AndroidFindBy(accessibility = SPORT_27_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_27_STAR)
    private WebElement sport27Star;

    @AndroidFindBy(accessibility = SPORT_28_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_28_ICON)
    private WebElement sport28Icon;

    @AndroidFindBy(accessibility = SPORT_28_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_28_NAME)
    private WebElement sport28Name;

    @AndroidFindBy(accessibility = SPORT_28_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_28_STAR)
    private WebElement sport28Star;

    @AndroidFindBy(accessibility = SPORT_29_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_29_ICON)
    private WebElement sport29Icon;

    @AndroidFindBy(accessibility = SPORT_29_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_29_NAME)
    private WebElement sport29Name;

    @AndroidFindBy(accessibility = SPORT_29_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_29_STAR)
    private WebElement sport29Star;

    @AndroidFindBy(accessibility = SPORT_30_ICON)
    @iOSXCUITFindBy(accessibility = SPORT_30_ICON)
    private WebElement sport30Icon;

    @AndroidFindBy(accessibility = SPORT_30_NAME)
    @iOSXCUITFindBy(accessibility = SPORT_30_NAME)
    private WebElement sport30Name;

    @AndroidFindBy(accessibility = SPORT_30_STAR)
    @iOSXCUITFindBy(accessibility = SPORT_30_STAR)
    private WebElement sport30Star;


    public AZSportsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAZSportsScreenDisplayed() {
        return azSportsScreen.isDisplayed();
    }

    public String getAzSportsScreenText() {
        return azSportsScreenText.getText();
    }

    public boolean isAZSportsScreenSearchDisplayed() {
        return azSportsScreenSearch.isDisplayed();
    }

    public void clickAZSportsScreenSearch() {
        azSportsScreenSearch.click();
    }

    public boolean isAZSportsScreenSearchIconDisplayed() {
        return azSportsScreenSearchIcon.isDisplayed();
    }

    public void clearAZSportsScreenSearchField() {
        azSportsScreenSearchField.clear();
    }

    public void populateAZSportsScreenSearchField(String text) {
        azSportsScreenSearchField.sendKeys(text);
    }

    public void clickAZSportsScreenSearchCloseButton() {
        azSportsScreenSearchCloseButton.click();
    }

    public boolean isSport1IconDisplayed() {
        return sport1Icon.isDisplayed();
    }

    public String getSport1Name() {
        return sport1Name.getText();
    }

    public boolean isSport1StarDisplayed() {
        return sport1Star.isDisplayed();
    }

    public boolean isSport1StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_1_STAR);
    }

    public boolean isSport2IconDisplayed() {
        return sport2Icon.isDisplayed();
    }

    public String getSport2Name() {
        return sport2Name.getText();
    }

    public boolean isSport2StarDisplayed() {
        return sport2Star.isDisplayed();
    }

    public boolean isSport2StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_2_STAR);
    }

    public boolean isSport3IconDisplayed() {
        return sport3Icon.isDisplayed();
    }

    public String getSport3Name() {
        return sport3Name.getText();
    }

    public boolean isSport3StarDisplayed() {
        return sport3Star.isDisplayed();
    }

    public boolean isSport3StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_3_STAR);
    }

    public boolean isSport4IconDisplayed() {
        return sport4Icon.isDisplayed();
    }

    public String getSport4Name() {
        return sport4Name.getText();
    }

    public boolean isSport4StarDisplayed() {
        return sport4Star.isDisplayed();
    }

    public boolean isSport4StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_4_STAR);
    }

    public boolean isSport5IconDisplayed() {
        return sport5Icon.isDisplayed();
    }

    public String getSport5Name() {
        return sport5Name.getText();
    }

    public boolean isSport5StarDisplayed() {
        return sport5Star.isDisplayed();
    }

    public boolean isSport5StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_5_STAR);
    }

    public boolean isSport6IconDisplayed() {
        return sport6Icon.isDisplayed();
    }

    public String getSport6Name() {
        return sport6Name.getText();
    }

    public boolean isSport6StarDisplayed() {
        return sport6Star.isDisplayed();
    }

    public boolean isSport6StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_6_STAR);
    }

    public boolean isSport7IconDisplayed() {
        return sport7Icon.isDisplayed();
    }

    public String getSport7Name() {
        return sport7Name.getText();
    }

    public boolean isSport7StarDisplayed() {
        return sport7Star.isDisplayed();
    }

    public boolean isSport7StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_7_STAR);
    }

    public boolean isSport8IconDisplayed() {
        return sport8Icon.isDisplayed();
    }

    public String getSport8Name() {
        return sport8Name.getText();
    }

    public boolean isSport8StarDisplayed() {
        return sport8Star.isDisplayed();
    }

    public boolean isSport8StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_8_STAR);
    }

    public boolean isSport9IconDisplayed() {
        return sport9Icon.isDisplayed();
    }

    public String getSport9Name() {
        return sport9Name.getText();
    }

    public boolean isSport9StarDisplayed() {
        return sport9Star.isDisplayed();
    }

    public boolean isSport9StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_9_STAR);
    }

    public boolean isSport10IconDisplayed() {
        return sport10Icon.isDisplayed();
    }

    public String getSport10Name() {
        return sport10Name.getText();
    }

    public boolean isSport10StarDisplayed() {
        return sport10Star.isDisplayed();
    }

    public boolean isSport10StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_10_STAR);
    }

    public boolean isSport11IconDisplayed() {
        return sport11Icon.isDisplayed();
    }

    public String getSport11Name() {
        return sport11Name.getText();
    }

    public boolean isSport11StarDisplayed() {
        return sport11Star.isDisplayed();
    }

    public boolean isSport11StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_11_STAR);
    }

    public boolean isSport12IconDisplayed() {
        return sport12Icon.isDisplayed();
    }

    public String getSport12Name() {
        return sport12Name.getText();
    }

    public boolean isSport12StarDisplayed() {
        return sport12Star.isDisplayed();
    }

    public boolean isSport12StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_12_STAR);
    }

    public boolean isSport13IconDisplayed() {
        return sport13Icon.isDisplayed();
    }

    public String getSport13Name() {
        return sport13Name.getText();
    }

    public boolean isSport13StarDisplayed() {
        return sport13Star.isDisplayed();
    }

    public boolean isSport13StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_13_STAR);
    }

    public boolean isSport14IconDisplayed() {
        return sport14Icon.isDisplayed();
    }

    public String getSport14Name() {
        return sport14Name.getText();
    }

    public boolean isSport14StarDisplayed() {
        return sport14Star.isDisplayed();
    }

    public boolean isSport14StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_14_STAR);
    }

    public boolean isSport15IconDisplayed() {
        return sport15Icon.isDisplayed();
    }

    public String getSport15Name() {
        return sport15Name.getText();
    }

    public boolean isSport15StarDisplayed() {
        return sport15Star.isDisplayed();
    }

    public boolean isSport15StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_15_STAR);
    }

    public boolean isSport16IconDisplayed() {
        return sport16Icon.isDisplayed();
    }

    public String getSport16Name() {
        return sport16Name.getText();
    }

    public boolean isSport16StarDisplayed() {
        return sport16Star.isDisplayed();
    }

    public boolean isSport16StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_16_STAR);
    }

    public boolean isSport17IconDisplayed() {
        return sport17Icon.isDisplayed();
    }

    public String getSport17Name() {
        return sport17Name.getText();
    }

    public boolean isSport17StarDisplayed() {
        return sport17Star.isDisplayed();
    }

    public boolean isSport17StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_17_STAR);
    }

    public boolean isSport18IconDisplayed() {
        return sport18Icon.isDisplayed();
    }

    public String getSport18Name() {
        return sport18Name.getText();
    }

    public boolean isSport18StarDisplayed() {
        return sport18Star.isDisplayed();
    }

    public boolean isSport18StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_18_STAR);
    }

    public boolean isSport19IconDisplayed() {
        return sport19Icon.isDisplayed();
    }

    public String getSport19Name() {
        return sport19Name.getText();
    }

    public boolean isSport19StarDisplayed() {
        return sport19Star.isDisplayed();
    }

    public boolean isSport19StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_19_STAR);
    }

    public boolean isSport20IconDisplayed() {
        return sport20Icon.isDisplayed();
    }

    public String getSport20Name() {
        return sport20Name.getText();
    }

    public boolean isSport20StarDisplayed() {
        return sport20Star.isDisplayed();
    }

    public boolean isSport20StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_20_STAR);
    }

    public boolean isSport21IconDisplayed() {
        return sport21Icon.isDisplayed();
    }

    public String getSport21Name() {
        return sport21Name.getText();
    }

    public boolean isSport21StarDisplayed() {
        return sport21Star.isDisplayed();
    }

    public boolean isSport21StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_21_STAR);
    }

    public boolean isSport22IconDisplayed() {
        return sport22Icon.isDisplayed();
    }

    public String getSport22Name() {
        return sport22Name.getText();
    }

    public boolean isSport22StarDisplayed() {
        return sport22Star.isDisplayed();
    }

    public boolean isSport22StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_22_STAR);
    }

    public boolean isSport23IconDisplayed() {
        return sport23Icon.isDisplayed();
    }

    public String getSport23Name() {
        return sport23Name.getText();
    }

    public boolean isSport23StarDisplayed() {
        return sport23Star.isDisplayed();
    }

    public boolean isSport23StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_23_STAR);
    }

    public boolean isSport24IconDisplayed() {
        return sport24Icon.isDisplayed();
    }

    public String getSport24Name() {
        return sport24Name.getText();
    }

    public boolean isSport24StarDisplayed() {
        return sport24Star.isDisplayed();
    }

    public boolean isSport24StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_24_STAR);
    }

    public boolean isSport25IconDisplayed() {
        return sport25Icon.isDisplayed();
    }

    public String getSport25Name() {
        return sport25Name.getText();
    }

    public boolean isSport25StarDisplayed() {
        return sport25Star.isDisplayed();
    }

    public boolean isSport25StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_25_STAR);
    }

    public boolean isSport26IconDisplayed() {
        return sport26Icon.isDisplayed();
    }

    public String getSport26Name() {
        return sport26Name.getText();
    }

    public boolean isSport26StarDisplayed() {
        return sport26Star.isDisplayed();
    }

    public boolean isSport26StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_26_STAR);
    }

    public boolean isSport27IconDisplayed() {
        return sport27Icon.isDisplayed();
    }

    public String getSport27Name() {
        return sport27Name.getText();
    }

    public boolean isSport27StarDisplayed() {
        return sport27Star.isDisplayed();
    }

    public boolean isSport27StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_27_STAR);
    }

    public boolean isSport28IconDisplayed() {
        return sport28Icon.isDisplayed();
    }

    public String getSport28Name() {
        return sport28Name.getText();
    }

    public boolean isSport28StarDisplayed() {
        return sport28Star.isDisplayed();
    }

    public boolean isSport28StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_28_STAR);
    }

    public boolean isSport29IconDisplayed() {
        return sport29Icon.isDisplayed();
    }

    public String getSport29Name() {
        return sport29Name.getText();
    }

    public boolean isSport29StarDisplayed() {
        return sport29Star.isDisplayed();
    }

    public boolean isSport29StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_29_STAR);
    }

    public boolean isSport30IconDisplayed() {
        return sport30Icon.isDisplayed();
    }

    public String getSport30Name() {
        return sport30Name.getText();
    }

    public boolean isSport30StarDisplayed() {
        return sport30Star.isDisplayed();
    }

    public boolean isSport30StarNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(SPORT_30_STAR);
    }

    public void waitUntilAZSportsMenuIsDisplayed() {
        waitVisibilityOfElement(azSportsScreen);
    }

    public void clickOnSport1Link() {
        sport1Name.click();
    }

    public void waitUntilSport1Displayed() {
        waitVisibilityOfElement(sport1Name);
    }
}