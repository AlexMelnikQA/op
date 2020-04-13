package Pages.Menus.ResponsibleGambling.ResponsibleGamblingRules;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProtectingMinors extends BasePage {
    final static String PROTECT_MINORS_TEXT_FIRST= "ProtectingMinorsIsRenderedText1";
    final static String PROTECT_MINORS_TEXT_SECOND = "ProtectingMinorsIsRenderedText2";
    final static String PROTECT_MINORS_LINK_FIRST = "ProtectingMinorsIsRenderedLink1";
    final static String PROTECT_MINORS_LINK_SECOND = "ProtectingMinorsIsRenderedLink2";
    final static String PROTECT_MINORS_LINK_THIRD = "ProtectingMinorsIsRenderedLink3";
    final static String PROTECT_MINORS_TEXT_THIRD = "ProtectingMinorsIsRenderedText3";
    final static String PROTECT_MINORS_TEXT_FOURTH = "ProtectingMinorsIsRenderedText4";


    @AndroidFindBy(accessibility = PROTECT_MINORS_TEXT_FIRST)
    @iOSXCUITFindBy(accessibility = PROTECT_MINORS_TEXT_FIRST)
    private WebElement protectMinorTextFirst;

    @AndroidFindBy(accessibility = PROTECT_MINORS_TEXT_SECOND)
    @iOSXCUITFindBy(accessibility = PROTECT_MINORS_TEXT_SECOND)
    private WebElement protectMinorTextSecond;

    @AndroidFindBy(accessibility = PROTECT_MINORS_LINK_FIRST)
    @iOSXCUITFindBy(accessibility = PROTECT_MINORS_LINK_FIRST)
    private WebElement protectMinorLinkFirst;

    @AndroidFindBy(accessibility = PROTECT_MINORS_LINK_SECOND)
    @iOSXCUITFindBy(accessibility = PROTECT_MINORS_LINK_SECOND)
    private WebElement protectMinorLinkSecond;

    @AndroidFindBy(accessibility = PROTECT_MINORS_LINK_THIRD)
    @iOSXCUITFindBy(accessibility = PROTECT_MINORS_LINK_THIRD)
    private WebElement protectMinorLinkThird;

    @AndroidFindBy(accessibility = PROTECT_MINORS_TEXT_THIRD)
    @iOSXCUITFindBy(accessibility = PROTECT_MINORS_TEXT_THIRD)
    private WebElement protectMinorTextThird;

    @AndroidFindBy(accessibility = PROTECT_MINORS_TEXT_FOURTH)
    @iOSXCUITFindBy(accessibility = PROTECT_MINORS_TEXT_FOURTH)
    private WebElement protectMinorTextFourth;


    public ProtectingMinors(WebDriver driver) {
        super(driver);
    }

    public String getProtectMinorFirstText() {
        return protectMinorTextFirst.getText();
    }

    public String getProtectMinorSecondText() {
        return protectMinorTextSecond.getText();
    }

    public String getProtectMinorLinkFirstText() {
        return protectMinorLinkFirst.getText();
    }

    public String getProtectMinorLinkSecondText() {
        return protectMinorLinkSecond.getText();
    }

    public String getProtectMinorLinkThirdText() {
        return protectMinorLinkThird.getText();
    }

    public String getProtectMinorThirdText() {
        return protectMinorTextThird.getText();
    }

    public String getProtectMinorFourthText() {
        return protectMinorTextFourth.getText();
    }
}