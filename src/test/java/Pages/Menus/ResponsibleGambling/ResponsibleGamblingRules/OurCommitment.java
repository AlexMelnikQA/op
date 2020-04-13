package Pages.Menus.ResponsibleGambling.ResponsibleGamblingRules;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OurCommitment extends BasePage {
    final static String OUT_COMMITMENT_TEXT = "CommitmentIsRenderedText";
    final static String OUT_COMMITMENT_LINK_FIRST = "CommitmentIsRenderedLink1";
    final static String OUT_COMMITMENT_LINK_SECOND = "CommitmentIsRenderedLink2";


    @AndroidFindBy(accessibility = OUT_COMMITMENT_TEXT)
    @iOSXCUITFindBy(accessibility = OUT_COMMITMENT_TEXT)
    private WebElement ourCommitmentText;

    @AndroidFindBy(accessibility = OUT_COMMITMENT_LINK_FIRST)
    @iOSXCUITFindBy(accessibility = OUT_COMMITMENT_LINK_FIRST)
    private WebElement ourCommitmentLinkFirst;

    @AndroidFindBy(accessibility = OUT_COMMITMENT_LINK_SECOND)
    @iOSXCUITFindBy(accessibility = OUT_COMMITMENT_LINK_SECOND)
    private WebElement ourCommitmentLinkSecond;


    public OurCommitment(WebDriver driver) {
        super(driver);
    }

    public String getOurCommitmentText() {
        return ourCommitmentText.getText();
    }

    public String getOurCommitmentLinkFirstText() {
        return ourCommitmentLinkFirst.getText();
    }

    public String getOurCommitmentLinkSecondText() {
        return ourCommitmentLinkSecond.getText();
    }
}