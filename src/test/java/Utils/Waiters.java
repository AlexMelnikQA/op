package Utils;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utils.Constants.SLEEP;


public class Waiters extends BasePage {

    private static int timeLimitInSeconds = 60;

    public Waiters(WebDriver driver) {
        super(driver);
    }

    public static void waitVisibilityOfElement(WebElement targetResourceId) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
            wait.until(ExpectedConditions.visibilityOf(targetResourceId));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void waitShort() throws InterruptedException {
        Thread.sleep(SLEEP);
    }

    public static void waitMiddle() throws InterruptedException {
        Thread.sleep(SLEEP * 2);
    }

    public static void waitLong() throws InterruptedException {
        Thread.sleep(SLEEP * 5);
    }
}