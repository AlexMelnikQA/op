package Pages.Menus.ResponsibleGambling.ResponsibleGamblingRules;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TakeOurTest extends BasePage {
    final static String TAKE_OUR_TEST_SCREEN = "TakeOutScreenIsRendered";
    final static String TAKE_OUR_TEST_TEXT_FIRST = "TakeOutScreenIsRenderedText1";
    final static String TAKE_OUR_TEST_LIST_1 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[3]";
    final static String TAKE_OUR_TEST_LIST_2 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[5]";
    final static String TAKE_OUR_TEST_LIST_3 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[7]";
    final static String TAKE_OUR_TEST_LIST_4 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[9]";
    final static String TAKE_OUR_TEST_LIST_5 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[11]";
    final static String TAKE_OUR_TEST_LIST_6 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[13]";
    final static String TAKE_OUR_TEST_LIST_7 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[15]";
    final static String TAKE_OUR_TEST_LIST_8 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[17]";
    final static String TAKE_OUR_TEST_LIST_9 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[19]";
    final static String TAKE_OUR_TEST_LIST_10 = "//android.view.ViewGroup[@content-desc=\"TakeOutScreenIsRendered\"]/android.widget.TextView[21]";
    final static String TAKE_OUR_TEST_TEXT_SECOND = "TakeOutScreenIsRenderedText2";
    final static String TAKE_OUR_TEST_LINK_FIRST = "TakeOutScreenIsRenderedSource1";
    final static String TAKE_OUR_TEST_LINK_SECOND = "TakeOutScreenIsRenderedSource2";
    final static String TAKE_OUR_TEST_TEXT_THIRD = "TakeOutScreenIsRenderedText3";


    @AndroidFindBy(accessibility = TAKE_OUR_TEST_SCREEN)
    @iOSXCUITFindBy(accessibility = TAKE_OUR_TEST_SCREEN)
    private WebElement takeOurTestScreen;

    @AndroidFindBy(accessibility = TAKE_OUR_TEST_TEXT_FIRST)
    @iOSXCUITFindBy(accessibility = TAKE_OUR_TEST_TEXT_FIRST)
    private WebElement takeOurTestScreenTextFirst;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_1)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_1)
    private WebElement takeOurTestScreenList1;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_2)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_2)
    private WebElement takeOurTestScreenList2;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_3)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_3)
    private WebElement takeOurTestScreenList3;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_4)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_4)
    private WebElement takeOurTestScreenList4;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_5)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_5)
    private WebElement takeOurTestScreenList5;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_6)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_6)
    private WebElement takeOurTestScreenList6;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_7)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_7)
    private WebElement takeOurTestScreenList7;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_8)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_8)
    private WebElement takeOurTestScreenList8;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_9)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_9)
    private WebElement takeOurTestScreenList9;

    @AndroidFindBy(xpath = TAKE_OUR_TEST_LIST_10)
    @iOSXCUITFindBy(xpath = TAKE_OUR_TEST_LIST_10)
    private WebElement takeOurTestScreenList10;

    @AndroidFindBy(accessibility = TAKE_OUR_TEST_TEXT_SECOND)
    @iOSXCUITFindBy(accessibility = TAKE_OUR_TEST_TEXT_SECOND)
    private WebElement takeOurTestScreenTextSecond;

    @AndroidFindBy(accessibility = TAKE_OUR_TEST_LINK_FIRST)
    @iOSXCUITFindBy(accessibility = TAKE_OUR_TEST_LINK_FIRST)
    private WebElement takeOurTestScreenLinkFirst;

    @AndroidFindBy(accessibility = TAKE_OUR_TEST_LINK_SECOND)
    @iOSXCUITFindBy(accessibility = TAKE_OUR_TEST_LINK_SECOND)
    private WebElement takeOurTestScreenLinkSecond;

    @AndroidFindBy(accessibility = TAKE_OUR_TEST_TEXT_THIRD)
    @iOSXCUITFindBy(accessibility = TAKE_OUR_TEST_TEXT_THIRD)
    private WebElement takeOurTestScreenTextThird;


    public TakeOurTest(WebDriver driver) {
        super(driver);
    }

    public boolean isTakeOurTestScreenVisible() {
        return takeOurTestScreen.isDisplayed();
    }

    public String getTakeOurTestScreenFirstText() {
        return takeOurTestScreenTextFirst.getText();
    }

    public void scrollToTakeOurTestScreenFirstList() {
        scrollToElement(TAKE_OUR_TEST_LIST_1);
    }

    public String getTakeOurTestScreenList1Text() {
        return takeOurTestScreenList1.getText();
    }

    public String getTakeOurTestScreenList2Text() {
        return takeOurTestScreenList2.getText();
    }

    public String getTakeOurTestScreenList3Text() {
        return takeOurTestScreenList3.getText();
    }

    public String getTakeOurTestScreenList4Text() {
        return takeOurTestScreenList4.getText();
    }

    public String getTakeOurTestScreenList5Text() {
        return takeOurTestScreenList5.getText();
    }

    public String getTakeOurTestScreenList6Text() {
        return takeOurTestScreenList6.getText();
    }

    public String getTakeOurTestScreenList7Text() {
        return takeOurTestScreenList7.getText();
    }

    public String getTakeOurTestScreenList8Text() {
        return takeOurTestScreenList8.getText();
    }

    public String getTakeOurTestScreenList9Text() {
        return takeOurTestScreenList9.getText();
    }

    public String getTakeOurTestScreenList10Text() {
        return takeOurTestScreenList10.getText();
    }

    public String getTakeOurTestScreenSecondText() {
        return takeOurTestScreenTextSecond.getText();
    }

    public boolean isTakeOurTestScreenLinkFirstVisible() {
        return takeOurTestScreenLinkFirst.isDisplayed();
    }

    public boolean isTakeOurTestScreenLinkSecondVisible() {
        return takeOurTestScreenLinkSecond.isDisplayed();
    }

    public String getTakeOurTestScreenThirdText() {
        return takeOurTestScreenTextThird.getText();
    }
}