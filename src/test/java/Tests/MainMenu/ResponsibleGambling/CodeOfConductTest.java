package Tests.MainMenu.ResponsibleGambling;

import Pages.Home.HomePage;
import Pages.Menus.MainMenu;
import Pages.Menus.ResponsibleGambling.CodeOfConduct;
import Tests.AbstractBaseTests.TestBase;
import Utils.Waiters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.*;

public class CodeOfConductTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private CodeOfConduct codeOfConduct;

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        codeOfConduct = new CodeOfConduct(driver);
    }

    @Test
    public void checkCodeOfConductInformation() throws InterruptedException {
        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        mainMenu.clickOnResponsibleGamblingLink();
        Waiters.waitShort();
        codeOfConduct.clickOnCodeOfConduct();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(codeOfConduct.getCodeOfConductCommitment(), "Our commitment");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductCommitmentText(), "In some instances, betting can lead " +
                "to problems and Sporting Index is committed to taking responsible steps to discourage and reduce the" +
                " occurrence of problem gambling. Sporting Index is regulated in the UK by the Financial Conduct " +
                "Authority (FCA) in respect of spread bets and one of their overriding objectives is to secure an " +
                "appropriate degree of protection for all Sporting Index clients. Sporting Index is also regulated in" +
                " the UK by the Gambling Commission (in respect of fixed-odds bets, including binary bets) and we " +
                "adhere to all licence conditions in relation to social responsibility.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductCodeOurCodeOfConduct(), "Our code of conduct");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductCodeOurCodeOfConductText(), "Our code of conduct has " +
                "been drawn up in line with the FCA’s Treating Customers Fairly initiative and the Gambling " +
                "Commission’s licence conditions and codes of practice and is detailed below. It covers age " +
                "verification, responsible advertising and promotions, client accounts and trading limits, " +
                "selfexclusion, social responsibility and client protection, monitoring and complaints.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductAgeVerification(), "Age verification");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductAgeVerificationTextPart1(), "Under the Financial " +
                "Services and Markets Act 2000 and the Gambling Act 2005, Sporting Index is required to have " +
                "procedures in place to ensure that the identities of all its clients are properly verified and " +
                "sufficient information is gathered and recorded to permit Sporting Index to 'know its clients'. " +
                "Sporting Index will take steps to confirm the age and identification of every new customer by using " +
                "electronic verification software including voters' roll information. Where we are unable to verify a" +
                " person’s age and identification we request additional documentary evidence before an account can be" +
                " opened.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductAgeVerificationTextPart2(), "Sporting Index clearly " +
                "displays an 'over 18s only' sign on the pages of its various websites, including within the " +
                "registration process.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductAdvertisingAndPromo(), "Advertising and promotional " +
                "material");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductAdvertisingAndPromoText1(), "In relation to spread " +
                "betting, all Sporting Index advertising and promotions are compliant with the relevant Financial " +
                "Conduct Authority rulebook and advisory codes of practice. This includes appropriate risk warning " +
                "notices on all promotional materials. Advertising does not target those under the age of 18. This " +
                "includes not just the content but the placement of advertising as well.");

        softAssert.assertEquals(codeOfConduct.getCodeOfConductAdvertisingAndPromoText2(), "All advertisements and " +
                "promotions give a balanced message with regards to the possibility of winning and losing. " +
                "Advertisements specifically confirm that clients may lose more than their initial stake.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductAdvertisingAndPromoText3(), "At no time is it suggested" +
                " that gambling is a means of solving financial difficulties.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductClientAcc(), "Client accounts and trading limits");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductClientAccTextPart1(), "Clients can only have one " +
                "account with Sporting Index. Clients are able to access their recent account history including all " +
                "deposits, withdrawals and bets.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductClientAccTextPart2(), "Any 'free to play' or 'play for " +
                "fun' page displays the same links to this code of conduct as any 'play for cash' display. There is a" +
                " clear message that the 'play for free' is for over 18s only.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductClientAccTextPart3(), "Sporting Index has developed " +
                "internal controls and procedures to: (a) identify where client risk is incurred; (b) for the " +
                "approval of incurring such potential risk once incurred; and (c) for the monitoring of that risk to " +
                "ensure the satisfactory exposure of the client. All clients request their own trading limits and " +
                "either deposit funds or are given credit against which they can trade. Clients may request deposit " +
                "limits at any time. Credit limits are initially given based on the strength of information held with" +
                " the credit reference agency that we use, CallCredit. If clients want to extend their credit " +
                "facility then we will usually ask them to produce suitable evidence of funds to ensure that any " +
                "credit provided is suitable.");

        softAssert.assertEquals(codeOfConduct.getCodeOfConductClientAccTextPart4(), "Sporting Index sets expected " +
                "volatility limits for all its bets and gives credit at its discretion where requested by clients. " +
                "Note that a credit limit is not a loan or an agreement to lend you money. The sole effect of a " +
                "credit limit is that it may be offset against any losses on open bets or against any expected " +
                "volatility that we apply to your bets. Sporting Index has developed a product range and account " +
                "options to suit the different demographics within its client base so that targeted promotion can " +
                "take place. Clients can also chose a 'Stop Loss' account so that their losses are limited within " +
                "agreed parameters in the case of an unusual or volatile result. When clients reach their trading " +
                "limits, Sporting Index's trading software has automatic warning limits built in which inform the " +
                "operator that a particular bet could take the client over his trading limit. The client will be " +
                "advised that he is approaching or exceeding his limit. If clients want to increase their trading " +
                "limit, they are required to inform Sporting Index and may be asked toshow appropriate evidence of " +
                "funds.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getSelfInclusion(), "Self-exclusion");
        softAssert.assertEquals(codeOfConduct.getSelfInclusionText1(), "Sporting Index operates a self-exclusion " +
                "policy consistent with its regulatory requirements. Clients are able at any point in time to exclude" +
                " themselves from making any bet with Sporting Index, either across our whole service or applied to " +
                "specific types of bet (for example sports bets, virtual games bets or casino bets). Requests for " +
                "self-exclusion can be made through any of the contact channels available (telephone, post, email, " +
                "Live Chat or via Twitter).");
        scrollHalfUp();
        softAssert.assertEquals(codeOfConduct.getSelfInclusionText2(), "Once a client has requested for an account to" +
                " be suspended or closed, this is performed immediately with any balance on the account paid back and" +
                " the client is taken off all mailing lists. A client can specify any length of time they wish to " +
                "remain self-excluded from Sporting Index, up to a permanent period of exclusion. If no specific " +
                "duration is requested by the client, then the standard minimum period of time for self-exclusion is " +
                "six months. In the event that a client wishes to reactivate a self-excluded account once the " +
                "appropriate time period has elapsed, a 24-hour cooling off period is applied before the account can " +
                "be reopened.");

        softAssert.assertEquals(codeOfConduct.getSelfInclusionText3(), "Sporting Index also offers clients the option" +
                " to apply a ‘timeout’ period to their account should they wish the account to be closed for any " +
                "length of time up to six months.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductSocialResponsibility(), "Social responsibility and " +
                "client protection");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductSocialResponsibilityText1(), "Sporting Index mobile " +
                "application (both Android and iOS) contains this code of conduct. Applications also contain a link " +
                "to the Financial Conduct Authority's website, the Gambling Commission’s website and a risk warning " +
                "notice.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductSocialResponsibilityText2(), "Additionally clients are " +
                "required to acknowledge that they have understand the mechanics of spread betting and have read and " +
                "understood Sporting Index's risk warning notice before proceeding to open an account.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductSocialResponsibilityText3(), "Sporting Index has a " +
                "complaints handling procedure that has been drawn up consistent with FCA requirements (in respect of" +
                " spread bets) and Gambling Commission requirements (in respect of fixed-odds bets, including " +
                "binaries). This clearly states what actions clients have to take if they want to make a complaint " +
                "against Sporting Index.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductSocialResponsibilityText4(), "Sporting Index makes " +
                "annual contributions to the Responsible Gambling Trust, the UK’s leading charity committed to " +
                "minimising gamblingrelated harm.");

        softAssert.assertEquals(codeOfConduct.getCodeOfConductSocialResponsibilityText5(), "If you feel that your " +
                "gambling may be getting out of control, then please read the Recognising a Betting Problem section " +
                "below.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductMonitoring(), "Monitoring and complaints");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductMonitoringAndComplainsText1(), "All Sporting Index's " +
                "customer-facing material are subject to regular review by the FCA and the Gambling Commission. " +
                "Sporting Index is required to report at regular intervals the number of complaints it has received, " +
                "the nature of the complaint and the time taken to respond.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductMonitoringAndComplainsText2(), "Sporting Index has a " +
                "Compliance Monitoring Programme in place which seeks to ensure that the company complies at all " +
                "times with the relevant rules and guidelines of the FCA and Gambling Commission.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductMonitoringAndComplainsText3(), "Sporting Index's " +
                "account operating rules apply to all clients who open an account with Sporting Index and every " +
                "client is asked to acknowledge that they have read and understand these rules. In the event of any " +
                "perceived conflict between the rules and this code of conduct, the account operating rules shall " +
                "always apply.");

        softAssert.assertEquals(codeOfConduct.getCodeOfConductRecognisingBettingProblem(), "Recognising a betting " +
                "problem");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductRecognisingBettingProblemText(), "If you feel you might" +
                " have a betting problem here are some steps on how to recognise the symptoms and what help is " +
                "available.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductHowToIdentify(), "How to identify a betting" +
                " problem");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductHowToIdentifyText1(), "If you feel you might have a " +
                "betting problem here are some steps on how to recognise the symptoms and what help is available.");

        softAssert.assertTrue(codeOfConduct.isCodeOfConductionIdentifyQustionsVisible());

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductHowToIdentifyText2(), "The more you answer 'Yes' to the" +
                " above questions, the more likely you are to have a betting problem.");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductHowToGetHelp(), "How to get help");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductHowToGetHelpText1(), "If you feel you are in " +
                "difficulty with your betting, or know someone who is, contact GamCare here or on their UK Helpline 0" +
                " 845 600 0133. GamCare is a charity committed to promoting responsible attitudes towards gambling " +
                "and working for the provision of proper care for those harmed by gambling dependency.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductHowToGetHelpText2(), "A GamCare counsellor will listen" +
                " to you carefully and encourage you to talk about your concerns. Sometimes just telling someone can " +
                "be a relief, and is an important first step towards dealing with the problem. The counsellor will be" +
                " able to suggest ways of helping yourself to stop betting, or if you are someone who is affected by " +
                "a betting problem, ways to support the person in their process of stopping, and ways to deal with " +
                "the effects on your own life. If you want to address the underlying issues that drive you to bet " +
                "more than you want, the counsellor may be able to help you do that too.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductHowToGetHelpText3(), "The Gamcare helpline is open " +
                "from 10.00am to 10.00pm Monday to Friday, 10.00am to 6.00pm on Saturdays and 6.00pm to 10.00pm on " +
                "Sundays.");

        scrollHalfUp();

        softAssert.assertEquals(codeOfConduct.getCodeOfConductUpdates(), "Updates");
        softAssert.assertEquals(codeOfConduct.getCodeOfConductUpdatesText(), "This code of Conduct was last updated " +
                "on 28 October 2015. It is regularly reviewed to ensure Sporting Index complies with its licensing " +
                "obligations and industry best practice.");

        scrollHalfUp();

        softAssert.assertTrue(codeOfConduct.isConductLabelisVisible());
        softAssert.assertAll();
    }
}
