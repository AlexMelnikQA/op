package Pages;

import Utils.Waiters;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Tests.AbstractBaseTests.TestBase.appiumDriver;
import static Utils.Waiters.waitVisibilityOfElement;


public class LoginPage extends BasePage {

    final static String ACCOUNT_NUMBER = "accountNumberInput";
    final static String PASSWORD = "accountNumberPasswordInput";
    final static String LOGIN_BUTTON_ACTIVE = "loginButtonActive";
    final static String LOGIN_BUTTON_DISABLED = "loginButtonDisabled";
    final static String SHOW_PASSWORD = "login screenTogglePasswordButton";
    final static String LOGIN_ERROR_MESSAGE = "login screenErrorMessage";

    @AndroidFindBy(accessibility = ACCOUNT_NUMBER)
    @iOSXCUITFindBy(accessibility = ACCOUNT_NUMBER)
    private WebElement accountNumberField;

    @AndroidFindBy(accessibility = PASSWORD)
    @iOSXCUITFindBy(accessibility = PASSWORD)
    private WebElement passwordPinField;

    @AndroidFindBy(accessibility = SHOW_PASSWORD)
    @iOSXCUITFindBy(accessibility = SHOW_PASSWORD)
    private WebElement showPassword;

    @AndroidFindBy(accessibility = LOGIN_BUTTON_ACTIVE)
    @iOSXCUITFindBy(accessibility = LOGIN_BUTTON_ACTIVE)
    private WebElement loginButtonActive;

    @AndroidFindBy(accessibility = LOGIN_BUTTON_DISABLED)
    @iOSXCUITFindBy(accessibility = LOGIN_BUTTON_DISABLED)
    private WebElement loginButtonDisabled;

    @AndroidFindBy(accessibility = LOGIN_ERROR_MESSAGE)
    @iOSXCUITFindBy(accessibility = LOGIN_ERROR_MESSAGE)
    private WebElement loginErrorMessage;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) throws InterruptedException {
        waitUntilAccountFieldPresent();
        accountNumberField.sendKeys(username);
        passwordPinField.sendKeys(password);
        loginButtonActive.click();
        Waiters.waitShort();
        if (!appiumDriver.findElementsByAccessibilityId(LOGIN_BUTTON_ACTIVE).isEmpty())
            loginButtonActive.click();
    }

    public void waitUntilAccountFieldPresent() {
        waitVisibilityOfElement(accountNumberField);
    }


    public void clickActiveLoginButton() {
        loginButtonActive.click();
    }

    public boolean isLoginButtonActiveDisplayed() {
        return loginButtonActive.isDisplayed();
    }

    public void clickDisabledLoginButton() {
        loginButtonDisabled.click();
    }

    public boolean isLoginButtonDisabledDisplayed() {
        return loginButtonDisabled.isDisplayed();
    }

    public void fillAccountNumberField(String username) {
        accountNumberField.sendKeys(username);
    }

    public void clearAccountNumberField() {
        accountNumberField.clear();
    }

    public void clickOnAccountNumberField() {
        accountNumberField.click();
    }

    public void waitUntilAccountNumberFieldIsVisible() {
        waitVisibilityOfElement(accountNumberField);
    }

    public void fillPasswordPinField(String password) {
        passwordPinField.sendKeys(password);
    }

    public void clearPasswordPinField() {
        passwordPinField.clear();
    }

    public void clickOnPasswordPinField() {
        passwordPinField.click();
    }

    public String getLoginErrorMessage() {
        return loginErrorMessage.getText();
    }
}