package Pages;

import Tests.AbstractBaseTests.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static Tests.AbstractBaseTests.TestBase.appiumDriver;


public abstract class BasePage {

    protected static WebDriver driver = TestBase.driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static void scrollUp() {
        Dimension size = appiumDriver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.10);
        swipe(startx, startx, starty, endy);
    }

    public static void scrollHalfUp() {
        Dimension size = appiumDriver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.40);
        swipe(startx, startx, starty, endy);
    }

    public static void scrollTeenyUp() {
        Dimension size = appiumDriver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.746);
        swipe(startx, startx, starty, endy);
    }

    public void scrollToElement(String element) {
        for (int i = 0; i < 5; i++) {
            if (isElementsByAccessibilityIdNotPresent(element))
                scrollHalfUp();
            else {
                scrollTeenyUp();
                break;
            }
        }
    }

    public static void swipe(int startX, int endX, int startY, int endY) {
        try {
            new TouchAction(appiumDriver).press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endX, endY)).release().perform();
        } catch (Exception e) {
            System.out.println("unable to swipe");
        }
    }

    public boolean isElementsByAccessibilityIdNotPresent(String element) {
        return appiumDriver.findElementsByAccessibilityId(element).size() == 0;
    }
}