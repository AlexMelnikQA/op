package Pages.Menus.ResponsibleGambling;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountOperationRules extends BasePage {
    final static String ACCOUNT_OPERATION_RULES_SCREEN = "accountOperationsRulesScreen";
    final static String ACCOUNT_OPERATION_RULES_NAME = "accountOperationsRulesName";
    final static String ACCOUNT_OPERATION_RULES_DATE = "accountOperationsRulesEffectiveDate";
    final static String ACCOUNT_OPERATION_RULES_IMPORTANT_TEXT = "accountOperationsRulesImportantText";
    final static String ACCOUNT_OPERATION_RULES_ADDITIONAL_TEXT = "accountOperationsRulesText1";
    final static String ACCOUNT_OPERATION_RULES_IMPORTANT_VIEW = "accountOperationsRulesView1";

    final static String ACCOUNT_OPERATION_RULES_INTRODUCTION = "1IntroductionAccountOperationsRules";
    final static String ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_1 =
            "11SportingIndexLimitedTradingAsSportingIndex(“We”,“Us”,“Our”,“Ours”And“Ourselves”," +
                    "AsAppropriate)IsACompanyRegulatedInTheUkByThe:AccountOperationsRules";
    final static String ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_2 =
            "111FinancialConductAuthorityUnderRegistrationNumber150404InRespectOfNonFinancialSpreadBets;" +
                    "AndAccountOperationsRules";
    final static String ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_3 =
            "112BritishGamblingCommission(LicenceNumber:0027343R30889808)" +
                    "InRespectOfFixedOddsBetsAccountOperationsRules";
    final static String ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_4 =
            "12OurRegisteredAddressIsGatewayHouse,MilvertonStreet,London,Se114apAccountOperationsRules";
    final static String ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_5 =
            "13OurCustomerServices(“CustomerServices”)ContactDetailsAre:800969607(ExUk+442078404050)" +
                    "AndEnquiries@SportingindexComCustomerServicesCanBeReached24HoursADay," +
                    "7DaysAWeekAccountOperationsRules";
    final static String ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_6 =
            "14TheFca'SAddressIs:25TheNorthColonnade,London,E145hsTheGamblingCommission’SAddressIsVictoriaSquareHouse," +
                    "VictoriaSquare,Birmingham,B24bpAccountOperationsRules";

    final static String ACCOUNT_OPERATION_RULES_TITLE = "2AccountOperatingRulesAccountOperationsRules";
    final static String ACCOUNT_OPERATION_RULES_TEXT1 =
            "21InTheseAccountOperatingRules,WeReferToTheAccountOperatingRulesAndTheAdditionalRulesAndPolicies" +
                    "ListedInClause25Below,JointlyAndSeparatelyAsThe“Rules”AccountOperationsRules";


    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_SCREEN)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_SCREEN)
    private WebElement accountOperationRulesScreen;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_NAME)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_NAME)
    private WebElement accountOperationName;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_DATE)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_DATE)
    private WebElement accountOperationRulesDate;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_IMPORTANT_TEXT)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_IMPORTANT_TEXT)
    private WebElement accountOperationImportantText;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_ADDITIONAL_TEXT)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_ADDITIONAL_TEXT)
    private WebElement accountOperationAdditionalText;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_IMPORTANT_VIEW)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_IMPORTANT_VIEW)
    private WebElement accountOperationImportantView;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION)
    private WebElement accountOperationsRulesIntroduction;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_1)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_1)
    private WebElement accountOperationsRulesIntroductionText1;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_2)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_2)
    private WebElement accountOperationsRulesIntroductionText2;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_3)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_3)
    private WebElement accountOperationsRulesIntroductionText3;


    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_4)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_4)
    private WebElement accountOperationsRulesIntroductionText4;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_5)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_5)
    private WebElement accountOperationsRulesIntroductionText5;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_6)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_INTRODUCTION_TEXT_6)
    private WebElement accountOperationsRulesIntroductionText6;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_TITLE)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_TITLE)
    private WebElement accountOperationsRulesSectionTitle;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_TEXT1)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_TEXT1)
    private WebElement accountOperationsRulesSectionText1;


    public AccountOperationRules(WebDriver driver) {
        super(driver);
    }

    public boolean isAccountOperationRulesDisplayed() {
        return accountOperationRulesScreen.isDisplayed();
    }

    public boolean isAccountOperationRulesNameDisplayed() {
        return accountOperationName.isDisplayed();
    }

    public String getAccountOperationRulesDate() {
        return accountOperationRulesDate.getText();
    }

    public String getAccountOperationRulesImportantText() {
        return accountOperationImportantText.getText();
    }

    public String getAccountOperationRulesAdditionalText() {
        return accountOperationAdditionalText.getText();
    }

    public boolean isAccountOperationRulesImportantViewVisible() {
        return accountOperationImportantView.isDisplayed();
    }

    public String getAccountOperationRulesIntroduction() {
        return accountOperationsRulesIntroduction.getText();
    }

    public String getAccountOperationRulesIntroductionText1() {
        return accountOperationsRulesIntroductionText1.getText();
    }

    public String getAccountOperationRulesIntroductionText2() {
        return accountOperationsRulesIntroductionText2.getText();
    }

    public String getAccountOperationRulesIntroductionText3() {
        return accountOperationsRulesIntroductionText3.getText();
    }

    public String getAccountOperationRulesIntroductionText4() {
        return accountOperationsRulesIntroductionText4.getText();
    }

    public String getAccountOperationRulesIntroductionText5() {
        return accountOperationsRulesIntroductionText5.getText();
    }

    public String getAccountOperationRulesIntroductionText6() {
        return accountOperationsRulesIntroductionText6.getText();
    }

    public String getAccountOperationRulesSectionTitle() {
        return accountOperationsRulesSectionTitle.getText();
    }

    public String getAccountOperationRulesSectionText1() {
        return accountOperationsRulesSectionText1.getText();
    }
}