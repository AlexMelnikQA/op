package Pages.Screens;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeScreen extends BasePage {

    final static String HOME_SCRIN = "homeScreen";
    final static String FIRST_FOOTER = "footerTextFirstParagraph";
    final static String SECOND_FOOTER = "footerTextSecondParagraph";

    @AndroidFindBy(accessibility = HOME_SCRIN)
    @iOSXCUITFindBy(accessibility = HOME_SCRIN)
    private WebElement homeScreen;

    @AndroidFindBy(accessibility = FIRST_FOOTER)
    @iOSXCUITFindBy(accessibility = FIRST_FOOTER)
    private WebElement firstFooter;

    @AndroidFindBy(accessibility = SECOND_FOOTER)
    @iOSXCUITFindBy(accessibility = SECOND_FOOTER)
    private WebElement secondFooter;


    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeScreenDisplayed() {
        return homeScreen.isDisplayed();
    }

    public String getFirstFooterText() {
        return firstFooter.getText();
    }

    public String getSecondFooterText() {
        return secondFooter.getText();
    }
}