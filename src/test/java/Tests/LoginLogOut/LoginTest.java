package Tests.LoginLogOut;

import Pages.Home.HomePage;
import Pages.LoginPage;
import Pages.Menus.MainMenu;
import Pages.Popups.AuthenticateDialog;
import Pages.Popups.BottomPopupDialog;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    private HomePage homePage;
    private MainMenu mainMenu;
    private LoginPage loginPage;
    private BottomPopupDialog bottomPopupDialog;
    private AuthenticateDialog authenticateDialog;

    protected static final String ERROR_MESSAGE_TITLE = "Unable to login";
    protected static final String ERROR_MESSAGE_INCORRECT_FIELD = "Sorry, the login details you have entered are incorrect. " +
            "If you’ve recently changed your password then remember the new one must contain a minimum of 8 characters," +
            " at least one capital letter and at least one number. Please try again.If you cannot log in please call our " +
            "Customer Service Team (open 24/7) on 0 800 096 9607 (UK freephone), +1 800 556 675 (ROI freephone) or " +
            "+44 207 840 4050. Alternatively email enquiries@sportingindex.com.";
    protected static final String ERROR_MESSAGE_EMPTY_FIELD = "Either your Account number or Password/PIN is required";
    protected static final String INCORRECT_LOGIN_NAME = "incorrectName";
    protected static final String INCORRECT_PASSWORD_PIN = "incorrectPassword";

    @BeforeTest
    public void setUpPage() {
        homePage = new HomePage(driver);
        mainMenu = new MainMenu(driver);
        loginPage = new LoginPage(driver);
        bottomPopupDialog = new BottomPopupDialog(driver);
        authenticateDialog = new AuthenticateDialog(driver);
    }

    @Test
    public void loginSuccess() throws InterruptedException {
        login(ADMIN_LOGIN, ADMIN_PASSWORD);

        homePage.waitUntilMainMenuLinkIsVisible();
        homePage.clickOnMainMenuLink();
        Assert.assertTrue(mainMenu.isLogoutLinkDisplayed());
        Assert.assertTrue(mainMenu.isLoginLinkNotDisplayed());
    }

    @Test
    public void loginIncorrectUserName() throws InterruptedException { ;
        login(INCORRECT_LOGIN_NAME, PASSWORD);
        Assert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), ERROR_MESSAGE_TITLE);
        Assert.assertEquals(bottomPopupDialog.getBottomPopupLoginErrorMessage(), ERROR_MESSAGE_INCORRECT_FIELD);
    }

    @Test
    public void loginIncorrectPassword() throws InterruptedException {
        login(USER_WITH_BALANCE, INCORRECT_PASSWORD_PIN);
        Assert.assertEquals(bottomPopupDialog.getBottomPopupTitle(), ERROR_MESSAGE_TITLE);
        Assert.assertEquals(bottomPopupDialog.getBottomPopupLoginErrorMessage(), ERROR_MESSAGE_INCORRECT_FIELD);
    }

    @Test
    public void loginCheckClickableLoginButton() {
        homePage.waitUntilLoginButtonIsVisible();
        homePage.clickOnLoginButton();
        loginPage.waitUntilAccountNumberFieldIsVisible();
        Assert.assertTrue(loginPage.isLoginButtonDisabledDisplayed());
        loginPage.fillAccountNumberField(USER_WITH_BALANCE);
        Assert.assertTrue(loginPage.isLoginButtonDisabledDisplayed());
        loginPage.fillPasswordPinField(PASSWORD);
        Assert.assertTrue(loginPage.isLoginButtonActiveDisplayed());

        loginPage.clearAccountNumberField();
        loginPage.clickOnAccountNumberField();
        loginPage.clickDisabledLoginButton();
        Assert.assertEquals(loginPage.getLoginErrorMessage(), ERROR_MESSAGE_EMPTY_FIELD);
        Assert.assertTrue(loginPage.isLoginButtonDisabledDisplayed());
        loginPage.fillAccountNumberField(USER_WITH_BALANCE);
        Assert.assertTrue(loginPage.isLoginButtonActiveDisplayed());

        loginPage.clearPasswordPinField();
        loginPage.clickDisabledLoginButton();
        Assert.assertTrue(loginPage.isLoginButtonDisabledDisplayed());
        loginPage.clickOnPasswordPinField();
        loginPage.clickOnAccountNumberField();
        Assert.assertEquals(loginPage.getLoginErrorMessage(), ERROR_MESSAGE_EMPTY_FIELD);
    }
}