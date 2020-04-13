package Pages.Home;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeHeaderSports extends BasePage {

    final static String TOP_MENU_ONE = "1TopMenu";
    final static String TOP_MENU_TWO = "2TopMenu";
    final static String TOP_MENU_THREE = "3TopMenu";
    final static String TOP_MENU_FOUR = "4TopMenu";
    final static String TOP_MENU_FIVE = "5TopMenu";

    final static String SPORT_DETAIL_SCREEN = "sportDetailsScreen";
    final static String FIRST_SPORT_TEXT = "1SportDetailsText";
    final static String SECOND_SPORT_TEXT = "2SportDetailsText";
    final static String THIRD_SPORT_TEXT = "3SportDetailsText";
    final static String FOURTH_SPORT_TEXT = "4SportDetailsText";
    final static String FIFTH_SPORT_TEXT = "5SportDetailsText";

    @AndroidFindBy(accessibility = TOP_MENU_ONE)
    @iOSXCUITFindBy(accessibility = TOP_MENU_ONE)
    private WebElement firstTopMenuLink;

    @AndroidFindBy(accessibility = TOP_MENU_TWO)
    @iOSXCUITFindBy(accessibility = TOP_MENU_TWO)
    private WebElement secondTopMenuLink;

    @AndroidFindBy(accessibility = TOP_MENU_THREE)
    @iOSXCUITFindBy(accessibility = TOP_MENU_THREE)
    private WebElement thirdTopMenuLink;

    @AndroidFindBy(accessibility = TOP_MENU_FOUR)
    @iOSXCUITFindBy(accessibility = TOP_MENU_FOUR)
    private WebElement fourthTopMenuLink;

    @AndroidFindBy(accessibility = TOP_MENU_FIVE)
    @iOSXCUITFindBy(accessibility = TOP_MENU_FIVE)
    private WebElement fifthTopMenuLink;

    @AndroidFindBy(accessibility = SPORT_DETAIL_SCREEN)
    @iOSXCUITFindBy(accessibility = SPORT_DETAIL_SCREEN)
    private WebElement sportDetailsScreen;

    @AndroidFindBy(accessibility = FIRST_SPORT_TEXT)
    @iOSXCUITFindBy(accessibility = FIRST_SPORT_TEXT)
    private WebElement sportFirstText;

    @AndroidFindBy(accessibility = SECOND_SPORT_TEXT)
    @iOSXCUITFindBy(accessibility = SECOND_SPORT_TEXT)
    private WebElement sportSecondText;

    @AndroidFindBy(accessibility = THIRD_SPORT_TEXT)
    @iOSXCUITFindBy(accessibility = THIRD_SPORT_TEXT)
    private WebElement sportThirdText;

    @AndroidFindBy(accessibility = FOURTH_SPORT_TEXT)
    @iOSXCUITFindBy(accessibility = FOURTH_SPORT_TEXT)
    private WebElement sportFourthText;

    @AndroidFindBy(accessibility = FIFTH_SPORT_TEXT)
    @iOSXCUITFindBy(accessibility = FIFTH_SPORT_TEXT)
    private WebElement sportFifthText;


    public HomeHeaderSports(WebDriver driver) {
        super(driver);
    }

    public boolean isFirstTopMenuLinkDisplayed() {
        return firstTopMenuLink.isDisplayed();
    }

    public void clickOnFirstTopMenuLink() {
        firstTopMenuLink.click();
    }

    public String getFirstTopMenuLinkText() {
        return firstTopMenuLink.getText();
    }

    public boolean isSecondTopMenuLinkDisplayed() {
        return secondTopMenuLink.isDisplayed();
    }

    public void clickOnSecondTopMenuLink() {
        secondTopMenuLink.click();
    }

    public String getSecondTopMenuLinkText() {
        return secondTopMenuLink.getText();
    }

    public boolean isThirdTopMenuLinkDisplayed() {
        return thirdTopMenuLink.isDisplayed();
    }

    public void clickOnThirdTopMenuLink() {
        thirdTopMenuLink.click();
    }

    public String getThirdTopMenuLinkText() {
        return thirdTopMenuLink.getText();
    }

    public boolean isFourthTopMenuLinkDisplayed() {
        return fourthTopMenuLink.isDisplayed();
    }

    public void clickOnFourthTopMenuLink() {
        fourthTopMenuLink.click();
    }

    public String getFourthTopMenuLinkText() {
        return fourthTopMenuLink.getText();
    }

    public boolean isFifthTopMenuLinkDisplayed() {
        return fifthTopMenuLink.isDisplayed();
    }

    public void clickOnFifthTopMenuLink() {
        fifthTopMenuLink.click();
    }

    public String getFifthTopMenuLinkText() {
        return fifthTopMenuLink.getText();
    }

    public boolean isSportDetailsScreenDisplayed() {
        return sportDetailsScreen.isDisplayed();
    }

    public String getSportFirstText() {
        return sportFirstText.getText();
    }

    public String getSportSecondText() {
        return sportSecondText.getText();
    }

    public String getSportThirdText() {
        return sportThirdText.getText();
    }

    public String getSportFourthText() {
        return sportFourthText.getText();
    }

    public String getSportFifthText() {
        return sportFifthText.getText();
    }
}