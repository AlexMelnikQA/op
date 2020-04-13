package Pages.Menus.HelpAndSupport;

import Pages.BasePage;
import Utils.Waiters;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Disclaimer extends BasePage {

    final static String DISCLAIMER_LINK = "disclaimerDisclaimerLink";
    final static String DISCLAIMER_SCREEN = "disclaimerScreen";
    final static String DISCLAIMER_NAME = "disclaimerNameText";
    final static String DISCLAIMER_COMMENT_TEXT = "disclaimerCommentText";
    final static String DISCLAIMER_TEXT_PART1 = "disclaimerTextPart1";
    final static String DISCLAIMER_TEXT_PART2 = "disclaimerTextPart2";
    final static String DISCLAIMER_TEXT_PART3 = "disclaimerTextPart3";
    final static String DISCLAIMER_TEXT_PART4 = "disclaimerTextPart4";


    @AndroidFindBy(accessibility = DISCLAIMER_LINK)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_LINK)
    private WebElement disclaimerLink;

    @AndroidFindBy(accessibility = DISCLAIMER_SCREEN)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_SCREEN)
    private WebElement disclaimerScreen;

    @AndroidFindBy(accessibility = DISCLAIMER_NAME)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_NAME)
    private WebElement disclaimerName;

    @AndroidFindBy(accessibility = DISCLAIMER_COMMENT_TEXT)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_COMMENT_TEXT)
    private WebElement disclaimerCommentText;

    @AndroidFindBy(accessibility = DISCLAIMER_TEXT_PART1)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_TEXT_PART1)
    private WebElement disclaimerTextPart1;

    @AndroidFindBy(accessibility = DISCLAIMER_TEXT_PART2)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_TEXT_PART2)
    private WebElement disclaimerTextPart2;

    @AndroidFindBy(accessibility = DISCLAIMER_TEXT_PART3)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_TEXT_PART3)
    private WebElement disclaimerTextPart3;

    @AndroidFindBy(accessibility = DISCLAIMER_TEXT_PART4)
    @iOSXCUITFindBy(accessibility = DISCLAIMER_TEXT_PART4)
    private WebElement disclaimerTextPart4;


    public Disclaimer(WebDriver driver) {
        super(driver);
    }

    public void clickOnDisclaimerLink() {
        disclaimerLink.click();
    }

    public String getDisclaimerNameText() {
        return disclaimerName.getText();
    }

    public String getDisclaimerCommentText() {
        return disclaimerCommentText.getText();
    }

    public boolean isDisclaimerScreenDisplayed() {
        return disclaimerScreen.isDisplayed();
    }

    public String getDisclaimerTextPart1() {
        return disclaimerTextPart1.getText();
    }

    public String getDisclaimerTextPart2() {
        return disclaimerTextPart2.getText();
    }

    public String getDisclaimerTextPart3() {
        return disclaimerTextPart3.getText();
    }

    public String getDisclaimerTextPart4() {
        return disclaimerTextPart4.getText();
    }

    public void waitUntilLinkIsVisible() {
        Waiters.waitVisibilityOfElement(disclaimerLink);
    }

}
