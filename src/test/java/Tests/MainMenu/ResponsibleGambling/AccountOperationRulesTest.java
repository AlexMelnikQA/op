package Tests.MainMenu.ResponsibleGambling;

import Pages.Home.HomePage;
import Pages.Menus.MainMenu;
import Pages.Menus.ResponsibleGambling.AccountOperationRules;
import Tests.AbstractBaseTests.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.scrollHalfUp;

public class AccountOperationRulesTest extends TestBase {
    private HomePage homePage;
    private MainMenu mainMenu;
    private AccountOperationRules accountOperationRules;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        accountOperationRules = new AccountOperationRules(driver);
    }

    @Test
    public void checkAccountOperationInformation() {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        mainMenu.waitUntilResponsibleGamblingLinkIsVisible();
        mainMenu.clickOnResponsibleGamblingLink();
        mainMenu.clickOnAccountOperationLink();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(accountOperationRules.isAccountOperationRulesDisplayed());
        softAssert.assertTrue(accountOperationRules.isAccountOperationRulesNameDisplayed());
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesDate(), "Effective Date: 13 March 2019");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesImportantText(),
                "IMPORTANT – THESE ACCOUNT OPERATING RULES FORM THE LEGALLY BINDING AGREEMENT BETWEEN YOU AND US. " +
                        "THIS MEANS YOU SHOULD READ THEM, AND THE DOCUMENTS WE REFER TO IN THEM, CAREFULLY BEFORE " +
                        "USING OUR FACILITIES. WE RECOMMEND YOU KEEP A COPY FOR YOUR RECORDS. PLEASE NOTE THAT " +
                        "THESE ACCOUNT OPERATING RULES ARE SUBJECT TO CHANGE.");

        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesAdditionalText(),
                "We would like to draw your attention specifically to the following clauses:");
        softAssert.assertTrue(accountOperationRules.isAccountOperationRulesImportantViewVisible());

        scrollHalfUp();

        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesIntroduction(), "1. INTRODUCTION");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesIntroductionText1(),
                "1.1. Sporting Index Limited trading as Sporting Index (“we”, “us”, “our”, “ours” and “ourselves”, " +
                        "as appropriate) is a company regulated in the UK by the:");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesIntroductionText2(),
                "1.1.1. Financial Conduct Authority under registration number 150404 in respect of non-financial Spread Bets; and");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesIntroductionText3(),
                "1.1.2. British Gambling Commission (licence number: 000-027343-R- 308898-008) in respect of Fixed Odds Bets.");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesIntroductionText4(),
                "1.2. Our registered address is Gateway House, Milverton Street, London, SE11 4AP.");

        scrollHalfUp();

        //TODO empty locator from component
        //softAssert.assertEquals(accountOperationRules.getAccountOperationRulesIntroductionText5(),
        //        "1.3. Our customer services (“Customer Services”) contact details are: 0800 096 9607 " +
        //                "(ex-UK +44 20 7840 4050)  and enquiries@sportingindex.com. " +
        //                "Customer Services can be reached 24 hours a day, 7 days a week.");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesIntroductionText6(),
                "1.4. The FCA's address is: 25 The North Colonnade, London, E14 5HS. The Gambling Commission’s " +
                        "address is Victoria Square House, Victoria Square, Birmingham, B2 4BP.");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesSectionTitle(), "2. ACCOUNT OPERATING RULES");
        softAssert.assertEquals(accountOperationRules.getAccountOperationRulesSectionText1(),
                "2.1. In these Account Operating Rules, we refer to the Account Operating Rules and the additional " +
                        "rules and policies listed in clause 2.5 below, jointly and separately as the “Rules”.");

        softAssert.assertTrue(accountOperationRules.isAccountOperationRulesNameDisplayed());
        softAssert.assertAll();
    }
}