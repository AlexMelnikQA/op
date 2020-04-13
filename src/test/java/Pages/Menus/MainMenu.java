package Pages.Menus;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Tests.AbstractBaseTests.TestBase.appiumDriver;
import static Utils.Waiters.waitVisibilityOfElement;

public class MainMenu extends BasePage {

    final static String HOME = "homeHomeLink";
    final static String ACCOUNT_DETAILS = "accountDetailsPersonalInfoLink";
    final static String ACCOUNT_DETAILS_BALANCE_LINK = "balanceBalanceLink";
    final static String PROMOTIONS = "promotionsPromotionssubmenuLink";
    final static String PROMOTIONS_SUB_PROMOTIONS = "promotionsPromotionsLink";
    final static String PROMOTIONS_SUB_REFER_AND_EARN = "referAndEarnRefAndEarnLink";
    final static String RESPONSIBLE_GAMBLING = "responsibleGamblingResponsibleGamblingLink";
    final static String ACCOUNT_OPERATION_RULES_LINK = "accountOperatingRulesAccountOperatingLink";
    final static String RESPONSIBLE_GAMBLING_RULES_LINK = "responsibleGamblingRulesResponsiblegamblingrulesLink";
    final static String HELP_AND_SUPPORT = "helpAndSupportSupportLink";
    final static String LOGIN_LINK = "loginBottomMenu";
    final static String LOGOUT_LINK = "logoutLink";

    @AndroidFindBy(accessibility = HOME)
    @iOSXCUITFindBy(accessibility = HOME)
    private WebElement homeLink;

    @AndroidFindBy(accessibility = ACCOUNT_DETAILS)
    @iOSXCUITFindBy(accessibility = ACCOUNT_DETAILS)
    private WebElement accountDetailsLink;

    @AndroidFindBy(accessibility = ACCOUNT_DETAILS_BALANCE_LINK)
    @iOSXCUITFindBy(accessibility = ACCOUNT_DETAILS_BALANCE_LINK)
    private WebElement accountDetailsBalanceLink;

    @AndroidFindBy(accessibility = PROMOTIONS)
    @iOSXCUITFindBy(accessibility = PROMOTIONS)
    private WebElement promotionLink;

    @AndroidFindBy(accessibility = PROMOTIONS_SUB_PROMOTIONS)
    @iOSXCUITFindBy(accessibility = PROMOTIONS_SUB_PROMOTIONS)
    private WebElement promotionSubPromotionsLink;

    @AndroidFindBy(accessibility = PROMOTIONS_SUB_REFER_AND_EARN)
    @iOSXCUITFindBy(accessibility = PROMOTIONS_SUB_REFER_AND_EARN)
    private WebElement promotionSubReferAndEarnLink;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING)
    private WebElement responsibleGamblingLink;

    @AndroidFindBy(accessibility = ACCOUNT_OPERATION_RULES_LINK)
    @iOSXCUITFindBy(accessibility = ACCOUNT_OPERATION_RULES_LINK)
    private WebElement accountOperationLink;

    @AndroidFindBy(accessibility = RESPONSIBLE_GAMBLING_RULES_LINK)
    @iOSXCUITFindBy(accessibility = RESPONSIBLE_GAMBLING_RULES_LINK)
    private WebElement responsibleGamblingRilesLink;

    @AndroidFindBy(accessibility = HELP_AND_SUPPORT)
    @iOSXCUITFindBy(accessibility = HELP_AND_SUPPORT)
    private WebElement helpAndSupportLink;

    @AndroidFindBy(accessibility = LOGIN_LINK)
    @iOSXCUITFindBy(accessibility = LOGIN_LINK)
    private WebElement loginLink;

    @AndroidFindBy(accessibility = LOGOUT_LINK)
    @iOSXCUITFindBy(accessibility = LOGOUT_LINK)
    private WebElement logoutLink;


    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }

    public void clickOnPromotionLink() {
        promotionLink.click();
    }

    public boolean isHomeLinkDisplayed() {
        return homeLink.isDisplayed();
    }

    public boolean isAccountDetailsLinkDisplayed() {
        return accountDetailsLink.isDisplayed();
    }

    public void clickOnAccountDetailsLink() {
        accountDetailsLink.click();
    }

    public void clickOnAccountDetailsBalanceLink() {
        accountDetailsBalanceLink.click();
    }

    public boolean isPromotionsLinkDisplayed() {
        return promotionLink.isDisplayed();
    }

    public boolean isPromotionsSubLinkPromotionsDisplayed() {
        return promotionSubPromotionsLink.isDisplayed();
    }

    public void clickOnPromotionsSubLinkPromotions() {
        promotionSubPromotionsLink.click();
    }

    public boolean isPromotionsSubLinkReferAndEarnDisplayed() {
        return promotionSubReferAndEarnLink.isDisplayed();
    }

    public boolean isResponsibleGamblingLinkDisplayed() {
        return responsibleGamblingLink.isDisplayed();
    }

    public boolean isHelpAndSupportLinkDisplayed() {
        return helpAndSupportLink.isDisplayed();
    }

    public void clickOnHelpAndSupportLink() {
        helpAndSupportLink.click();
    }

    public boolean isLoginLinkNotDisplayed() {
        return appiumDriver.findElementsByAccessibilityId(LOGIN_LINK).isEmpty();
    }

    public boolean isLoginLinkDisplayed() {
        return loginLink.isDisplayed();
    }

    public boolean isLogoutLinkDisplayed() {
        return logoutLink.isDisplayed();
    }

    public boolean isLogoutLinkNotDisplayed() {
        return appiumDriver.findElementsByAccessibilityId(LOGOUT_LINK).isEmpty();
    }

    public void clickOnResponsibleGamblingLink() {
        responsibleGamblingLink.click();
    }

    public void waitUntilResponsibleGamblingLinkIsVisible() {
        waitVisibilityOfElement(responsibleGamblingLink);
    }

    public void clickOnAccountOperationLink() {
        accountOperationLink.click();
    }

    public boolean isResponsibleGamblingControlLinkDisplayed() {
        return responsibleGamblingRilesLink.isDisplayed();
    }

    public void clickOnResponsibleGamblingControlsLink() {
        responsibleGamblingRilesLink.click();
    }

    public void waitUntilHelpAndSupportLinkIsVisible() {
        waitVisibilityOfElement(helpAndSupportLink);
    }

    public void waitUntilPromotionsSubLinkIsVisible() {
        waitVisibilityOfElement(promotionSubPromotionsLink);
    }
}