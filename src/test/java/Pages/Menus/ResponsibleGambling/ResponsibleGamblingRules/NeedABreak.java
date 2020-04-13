package Pages.Menus.ResponsibleGambling.ResponsibleGamblingRules;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NeedABreak extends BasePage {
    final static String NEED_A_BREAK_TITLE_FIRST = "NeedABreakIsRenderedTitle1";
    final static String NEED_A_BREAK_TEXT_FIRST = "NeedABreakIsRenderedText1";
    final static String NEED_A_BREAK_TEXT_SECOND = "NeedABreakIsRenderedText2";
    final static String NEED_A_BREAK_TEXT_THIRD = "NeedABreakIsRenderedText3";
    final static String NEED_A_BREAK_LINK_FIRST = "NeedABreakIsRenderedLink1";
    final static String NEED_A_BREAK_LINK_SECOND = "NeedABreakIsRenderedLink2";
    final static String NEED_A_BREAK_TITLE_SECOND = "NeedABreakIsRenderedTitle2";
    final static String NEED_A_BREAK_TEXT_SECOND_DOT_FIRST = "NeedABreakIsRenderedText21";
    final static String NEED_A_BREAK_TEXT_SECOND_DOT_SECOND = "NeedABreakIsRenderedText22";
    final static String NEED_A_BREAK_TITLE_THIRD = "NeedABreakIsRenderedTitle3";
    final static String NEED_A_BREAK_TEXT_THIRD_DOT_FIRST = "NeedABreakIsRenderedText31";
    final static String NEED_A_BREAK_TEXT_THIRD_DOT_SECOND = "NeedABreakIsRenderedText32";
    final static String NEED_A_BREAK_LINK_THIRD_DOT_FIRST = "NeedABreakIsRenderedLink31";
    final static String NEED_A_BREAK_LINK_THIRD_DOT_SECOND = "NeedABreakIsRenderedLink32";
    final static String NEED_A_BREAK_TITLE_FOURTH = "NeedABreakIsRenderedTitle4";
    final static String NEED_A_BREAK_TEXT_FOURTH_DOT_FIRST = "NeedABreakIsRenderedText41";
    final static String NEED_A_BREAK_LINK_FOURTH_DOT_FIRST = "NeedABreakIsRenderedLink41";
    final static String NEED_A_BREAK_IMAGE_LOGO = "NeedABreakIsRenderedImageLogo";


    @AndroidFindBy(accessibility = NEED_A_BREAK_TITLE_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TITLE_FIRST)
    private WebElement needABreakTitle1;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_FIRST)
    private WebElement needABreakText11;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_SECOND)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_SECOND)
    private WebElement needABreakText12;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_THIRD)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_THIRD)
    private WebElement needABreakText13;

    @AndroidFindBy(accessibility = NEED_A_BREAK_LINK_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_LINK_FIRST)
    private WebElement needABreakLink11;

    @AndroidFindBy(accessibility = NEED_A_BREAK_LINK_SECOND)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_LINK_SECOND)
    private WebElement needABreakLink12;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TITLE_SECOND)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_LINK_SECOND)
    private WebElement needABreakTitle2;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_SECOND_DOT_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_SECOND_DOT_FIRST)
    private WebElement needABreakText21;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_SECOND_DOT_SECOND)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_SECOND_DOT_SECOND)
    private WebElement needABreakText22;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TITLE_THIRD)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TITLE_THIRD)
    private WebElement needABreakTitle3;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_THIRD_DOT_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_THIRD_DOT_FIRST)
    private WebElement needABreakText31;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_THIRD_DOT_SECOND)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_THIRD_DOT_SECOND)
    private WebElement needABreakText32;

    @AndroidFindBy(accessibility = NEED_A_BREAK_LINK_THIRD_DOT_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_LINK_THIRD_DOT_FIRST)
    private WebElement needABreakLink31;

    @AndroidFindBy(accessibility = NEED_A_BREAK_LINK_THIRD_DOT_SECOND)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_LINK_THIRD_DOT_SECOND)
    private WebElement needABreakLink32;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TITLE_FOURTH)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TITLE_FOURTH)
    private WebElement needABreakTitle4;

    @AndroidFindBy(accessibility = NEED_A_BREAK_TEXT_FOURTH_DOT_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_TEXT_FOURTH_DOT_FIRST)
    private WebElement needABreakText41;

    @AndroidFindBy(accessibility = NEED_A_BREAK_LINK_FOURTH_DOT_FIRST)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_LINK_FOURTH_DOT_FIRST)
    private WebElement needABreakLink41;

    @AndroidFindBy(accessibility = NEED_A_BREAK_IMAGE_LOGO)
    @iOSXCUITFindBy(accessibility = NEED_A_BREAK_IMAGE_LOGO)
    private WebElement needABreakImageLogo;


    public NeedABreak(WebDriver driver) {
        super(driver);
    }

    public String getNeedABreakTitleFirstText() {
        return needABreakTitle1.getText();
    }

    public String getNeedABreakText11() {
        return needABreakText11.getText();
    }

    public String getNeedABreakText12() {
        return needABreakText12.getText();
    }

    public String getNeedABreakText13() {
        return needABreakText13.getText();
    }

    public String getNeedABreakLink11() {
        return needABreakLink11.getText();
    }

    public String getNeedABreakLink12() {
        return needABreakLink12.getText();
    }

    public String getNeedABreakTitleSecondText() {
        return needABreakTitle2.getText();
    }

    public String getNeedABreakText21() {
        return needABreakText21.getText();
    }

    public String getNeedABreakText22() {
        return needABreakText22.getText();
    }

    public String getNeedABreakTitleThirdText() {
        return needABreakTitle3.getText();
    }

    public String getNeedABreakText31() {
        return needABreakText31.getText();
    }

    public String getNeedABreakText32() {
        return needABreakText32.getText();
    }

    public String getNeedABreakLink31() {
        return needABreakLink31.getText();
    }

    public String getNeedABreakLink32() {
        return needABreakLink32.getText();
    }

    public String getNeedABreakTitleFourthText() {
        return needABreakTitle4.getText();
    }

    public String getNeedABreakText41() {
        return needABreakText41.getText();
    }

    public String getNeedABreakLink41() {
        return needABreakLink41.getText();
    }

    public boolean isNeedABreakImageLogoVisible() {
        return needABreakImageLogo.isDisplayed();
    }
}