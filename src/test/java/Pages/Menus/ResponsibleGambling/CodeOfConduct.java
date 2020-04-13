package Pages.Menus.ResponsibleGambling;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CodeOfConduct extends BasePage {

    final static String CODE_OF_CONDUCT_LINK = "codeOfConductConductLink";
    final static String CODE_OF_CONDUCT_LABEL = "codeOfConductLabel";
    final static String CODE_OF_CONDUCT_COMMITMENT = "codeOfConductOurCommitment";
    final static String CODE_OF_CONDUCT_COMMITMENT_TEXT = "codeOfConductOurCommitmentText";
    final static String CODE_OF_CONDUCT_CODE_OUR_CODE_OF_CONDUCT = "codeOfConductOurCodeOfConduct";
    final static String CODE_OF_CONDUCT_CODE_OUR_CODE_OF_CONDUCT_TEXT = "codeOfConductOurCodeOfConductText";
    final static String CODE_OF_CONDUCT_AGE_VERIFICATION = "codeOfConductAgeVerification";
    final static String CODE_OF_CONDUCT_AGE_VERIFICATION_TEXT1 = "codeOfConductAgeVerificationTextPart1";
    final static String CODE_OF_CONDUCT_AGE_VERIFICATION_TEXT2 = "codeOfConductAgeVerificationTextPart2";
    final static String CODE_OF_CONDUCT_ADVERTISING_AND_PROMO = "codeOfConductAdvertisingAndPromo";
    final static String CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT1 = "codeOfConductAdvertisingAndPromoTextPart1";
    final static String CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT2 = "codeOfConductAdvertisingAndPromoTextPart2";
    final static String CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT3 = "codeOfConductAdvertisingAndPromoTextPart3";
    final static String CODE_OF_CONDUCT_CLIENT_ACC = "codeOfConductClientAccountsAndTradingLimit";
    final static String CODE_OF_CONDUCT_CLIENT_ACC_TEXT1 = "codeOfConductClientAccountsAndTradingLimitTextPart1";
    final static String CODE_OF_CONDUCT_CLIENT_ACC_TEXT2 = "codeOfConductClientAccountsAndTradingLimitTextPart2";
    final static String CODE_OF_CONDUCT_CLIENT_ACC_TEXT3 = "codeOfConductClientAccountsAndTradingLimitTextPart3";
    final static String CODE_OF_CONDUCT_CLIENT_ACC_TEXT4 = "codeOfConductClientAccountsAndTradingLimitTextPart4";
    final static String CODE_OF_CONDUCT_SELF_EXCLUSION = "codeOfConductSelfExclusion";
    final static String CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT1 = "codeOfConductSelfExclusionTextPart1";
    final static String CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT2 = "codeOfConductSelfExclusionTextPart2";
    final static String CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT3 = "codeOfConductSelfExclusionTextPart3";
    final static String CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY = "codeOfConductSocialResponsibilityAndClientProtection";
    final static String CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT1 =
            "codeOfConductSocialResponsibilityAndClientProtectionTextPart1";
    final static String CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT2 =
            "codeOfConductSocialResponsibilityAndClientProtectionTextPart2";
    final static String CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT3 =
            "codeOfConductSocialResponsibilityAndClientProtectionTextPart3";
    final static String CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT4 =
            "codeOfConductSocialResponsibilityAndClientProtectionTextPart4";
    final static String CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT5 =
            "codeOfConductSocialResponsibilityAndClientProtectionTextPart5";
    final static String CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS = "codeOfConductMonitoringAndComplaints";
    final static String CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT1 =
            "codeOfConductMonitoringAndComplaintsTextPart1";
    final static String CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT2 =
            "codeOfConductMonitoringAndComplaintsTextPart2";
    final static String CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT3 =
            "codeOfConductMonitoringAndComplaintsTextPart3";
    final static String CODE_OF_CONDUCT_RECOGNISING_BETTING_PROBLEM = "codeOfConductRecognisingBettingProblem";
    final static String CODE_OF_CONDUCT_RECOGNISING_BETTING_PROBLEM_TEXT = "codeOfConductRecognisingBettingProblemText";
    final static String CODE_OF_CONDUCT_HOW_TO_IDENTIFY = "codeOfConductHowToIdentifyBettingProblem";
    final static String CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT1 = "codeOfConductRecognisingBettingProblemText";
    final static String CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT1b =
            "codeOfConductHowToIdentifyBettingProblemTextPart1bQuestions";
    final static String CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT2 = "codeOfConductHowToIdentifyBettingProblemTextPart2";
    final static String CODE_OF_CONDUCT_HOW_TO_HELP = "codeOfConductHowToGetHelp";
    final static String CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT1 = "codeOfConductHowToGetHelpTextPart1";
    final static String CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT2 = "codeOfConductHowToGetHelpTextPart2";
    final static String CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT3 = "codeOfConductHowToGetHelpTextPart3";
    final static String CODE_OF_CONDUCT_UPDATES = "codeOfConductUpdates";
    final static String CODE_OF_CONDUCT_UPDATES_TEXT = "codeOfConductUpdatesText";


    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_LINK)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_LINK)
    private WebElement codeOFConductLink;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_LABEL)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_LABEL)
    private WebElement codeOFConductLabel;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_COMMITMENT)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_COMMITMENT)
    private WebElement codeOFConductCommitment;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_COMMITMENT_TEXT)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_COMMITMENT_TEXT)
    private WebElement codeOFConductCommitmentText;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_CODE_OUR_CODE_OF_CONDUCT)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_CODE_OUR_CODE_OF_CONDUCT)
    private WebElement codeOFConductOurCodeOfConduct;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_CODE_OUR_CODE_OF_CONDUCT_TEXT)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_CODE_OUR_CODE_OF_CONDUCT_TEXT)
    private WebElement codeOFConductOurCodeOfConductText;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_AGE_VERIFICATION)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_AGE_VERIFICATION)
    private WebElement codeOfConductAgeVerification;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_AGE_VERIFICATION_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_AGE_VERIFICATION_TEXT1)
    private WebElement codeOfConductAgeVerificationTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_AGE_VERIFICATION_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_AGE_VERIFICATION_TEXT2)
    private WebElement codeOfConductAgeVerificationTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO)
    private WebElement codeOfConductAdvertisingAndPromo;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT1)
    private WebElement codeOfConductAdvertisingAndPromoTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT2)
    private WebElement codeOfConductAdvertisingAndPromoTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT3)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_ADVERTISING_AND_PROMO_TEXT3)
    private WebElement codeOfConductAdvertisingAndPromoTextPart3;


    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC)
    private WebElement codeOfConductClientAccountsAndTradingLimit;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT1)
    private WebElement codeOfConductClientAccountsAndTradingLimitTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT2)
    private WebElement codeOfConductClientAccountsAndTradingLimitTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT3)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT3)
    private WebElement codeOfConductClientAccountsAndTradingLimitTextPart3;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT4)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_CLIENT_ACC_TEXT4)
    private WebElement codeOfConductClientAccountsAndTradingLimitTextPart4;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION)
    private WebElement codeOfConductSelfExclusion;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT1)
    private WebElement codeOfConductSelfExclusionTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT2)
    private WebElement codeOfConductSelfExclusionTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT3)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SELF_EXCLUSION_TEXT3)
    private WebElement codeOfConductSelfExclusionTextPart3;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY)
    private WebElement codeOfConductSocialResponsibilityAndClientProtection;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT1)
    private WebElement codeOfConductSocialResponsibilityAndClientProtectionTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT2)
    private WebElement codeOfConductSocialResponsibilityAndClientProtectionTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT3)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT3)
    private WebElement codeOfConductSocialResponsibilityAndClientProtectionTextPart3;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT4)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT4)
    private WebElement codeOfConductSocialResponsibilityAndClientProtectionTextPart4;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT5)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_SOCIAL_RESPONSIBILITY_TEXT5)
    private WebElement codeOfConductSocialResponsibilityAndClientProtectionTextPart5;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS)
    private WebElement codeOfConductMonitoringAndComplaints;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT1)
    private WebElement codeOfConductMonitoringAndComplaintsTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT2)
    private WebElement codeOfConductMonitoringAndComplaintsTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT3)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_MONITORING_AND_COMPLAINS_TEXT3)
    private WebElement codeOfConductMonitoringAndComplaintsTextPart3a;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_RECOGNISING_BETTING_PROBLEM)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_RECOGNISING_BETTING_PROBLEM)
    private WebElement codeOfConductRecognisingBettingProblem;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_RECOGNISING_BETTING_PROBLEM_TEXT)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_RECOGNISING_BETTING_PROBLEM_TEXT)
    private WebElement codeOfConductRecognisingBettingProblemText;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY)
    private WebElement codeOfConductHowToIdentifyBettingProblem;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT1)
    private WebElement codeOfConductHowToIdentifyBettingProblemTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT1b)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT1b)
    private WebElement codeOfConductHowToIdentifyBettingProblemTextPart1bQuestions;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_IDENTIFY_TEXT2)
    private WebElement codeOfConductHowToIdentifyBettingProblemTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_HELP)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_HELP)
    private WebElement codeOfConductHowToGetHelp;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT1)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT1)
    private WebElement codeOfConductHowToGetHelpTextPart1;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT2)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT2)
    private WebElement codeOfConductHowToGetHelpTextPart2;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT3)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_HOW_TO_GET_HELP_TEXT3)
    private WebElement codeOfConductHowToGetHelpTextPart3;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_UPDATES)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_UPDATES)
    private WebElement codeOfConductUpdates;

    @AndroidFindBy(accessibility = CODE_OF_CONDUCT_UPDATES_TEXT)
    @iOSXCUITFindBy(accessibility = CODE_OF_CONDUCT_UPDATES_TEXT)
    private WebElement codeOfConductUpdatesText;

    public CodeOfConduct(WebDriver driver) {
        super(driver);
    }

    public void clickOnCodeOfConduct() {
        codeOFConductLink.click();
    }

    public String getCodeOfConductCommitment() {
        return codeOFConductCommitment.getText();
    }

    public String getCodeOfConductCommitmentText() {
        return codeOFConductCommitmentText.getText();
    }

    public String getCodeOfConductCodeOurCodeOfConduct() {
        return codeOFConductOurCodeOfConduct.getText();
    }

    public String getCodeOfConductCodeOurCodeOfConductText() {
        return codeOFConductOurCodeOfConductText.getText();
    }

    public String getCodeOfConductAgeVerification() {
        return codeOfConductAgeVerification.getText();
    }

    public String getCodeOfConductAgeVerificationTextPart1() {
        return codeOfConductAgeVerificationTextPart1.getText();
    }

    public String getCodeOfConductAgeVerificationTextPart2() {
        return codeOfConductAgeVerificationTextPart2.getText();
    }

    public String getCodeOfConductAdvertisingAndPromo() {
        return codeOfConductAdvertisingAndPromo.getText();
    }

    public String getCodeOfConductAdvertisingAndPromoText1() {
        return codeOfConductAdvertisingAndPromoTextPart1.getText();
    }

    public String getCodeOfConductAdvertisingAndPromoText2() {
        return codeOfConductAdvertisingAndPromoTextPart2.getText();
    }

    public String getCodeOfConductAdvertisingAndPromoText3() {
        return codeOfConductAdvertisingAndPromoTextPart3.getText();
    }

    public String getCodeOfConductClientAcc() {
        return codeOfConductClientAccountsAndTradingLimit.getText();
    }

    public String getCodeOfConductClientAccTextPart1() {
        return codeOfConductClientAccountsAndTradingLimitTextPart1.getText();
    }

    public String getCodeOfConductClientAccTextPart2() {
        return codeOfConductClientAccountsAndTradingLimitTextPart2.getText();
    }

    public String getCodeOfConductClientAccTextPart3() {
        return codeOfConductClientAccountsAndTradingLimitTextPart3.getText();
    }

    public String getCodeOfConductClientAccTextPart4() {
        return codeOfConductClientAccountsAndTradingLimitTextPart4.getText();
    }

    public String getSelfInclusion() {
        return codeOfConductSelfExclusion.getText();
    }

    public String getSelfInclusionText1() {
        return codeOfConductSelfExclusionTextPart1.getText();
    }

    public String getSelfInclusionText2() {
        return codeOfConductSelfExclusionTextPart2.getText();
    }

    public String getSelfInclusionText3() {
        return codeOfConductSelfExclusionTextPart3.getText();
    }

    public String getCodeOfConductSocialResponsibility() {
        return codeOfConductSocialResponsibilityAndClientProtection.getText();
    }

    public String getCodeOfConductSocialResponsibilityText1() {
        return codeOfConductSocialResponsibilityAndClientProtectionTextPart1.getText();
    }

    public String getCodeOfConductSocialResponsibilityText2() {
        return codeOfConductSocialResponsibilityAndClientProtectionTextPart2.getText();
    }

    public String getCodeOfConductSocialResponsibilityText3() {
        return codeOfConductSocialResponsibilityAndClientProtectionTextPart3.getText();
    }

    public String getCodeOfConductSocialResponsibilityText4() {
        return codeOfConductSocialResponsibilityAndClientProtectionTextPart4.getText();
    }

    public String getCodeOfConductSocialResponsibilityText5() {
        return codeOfConductSocialResponsibilityAndClientProtectionTextPart5.getText();
    }

    public String getCodeOfConductMonitoring() {
        return codeOfConductMonitoringAndComplaints.getText();
    }

    public String getCodeOfConductMonitoringAndComplainsText1() {
        return codeOfConductMonitoringAndComplaintsTextPart1.getText();
    }

    public String getCodeOfConductMonitoringAndComplainsText2() {
        return codeOfConductMonitoringAndComplaintsTextPart2.getText();
    }

    public String getCodeOfConductMonitoringAndComplainsText3() {
        return codeOfConductMonitoringAndComplaintsTextPart3a.getText();
    }

    public String getCodeOfConductRecognisingBettingProblem() {
        return codeOfConductRecognisingBettingProblem.getText();
    }

    public String getCodeOfConductRecognisingBettingProblemText() {
        return codeOfConductRecognisingBettingProblemText.getText();
    }

    public String getCodeOfConductHowToIdentify() {
        return codeOfConductHowToIdentifyBettingProblem.getText();
    }

    public String getCodeOfConductHowToIdentifyText1() {
        return codeOfConductHowToIdentifyBettingProblemTextPart1.getText();
    }

    public boolean isCodeOfConductionIdentifyQustionsVisible() {
        return codeOfConductHowToIdentifyBettingProblemTextPart1bQuestions.isDisplayed();
    }

    public String getCodeOfConductHowToIdentifyText2() {
        return codeOfConductHowToIdentifyBettingProblemTextPart2.getText();
    }

    public String getCodeOfConductHowToGetHelp() {
        return codeOfConductHowToGetHelp.getText();
    }

    public String getCodeOfConductHowToGetHelpText1() {
        return codeOfConductHowToGetHelpTextPart1.getText();
    }

    public String getCodeOfConductHowToGetHelpText2() {
        return codeOfConductHowToGetHelpTextPart2.getText();
    }

    public String getCodeOfConductHowToGetHelpText3() {
        return codeOfConductHowToGetHelpTextPart3.getText();
    }

    public String getCodeOfConductUpdates() {
        return codeOfConductUpdates.getText();
    }

    public String getCodeOfConductUpdatesText() {
        return codeOfConductUpdatesText.getText();
    }

    public boolean isConductLabelisVisible() {
        return codeOFConductLabel.isDisplayed();
    }

}
