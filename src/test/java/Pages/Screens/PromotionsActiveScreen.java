package Pages.Screens;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class PromotionsActiveScreen extends BasePage {

    final static String PROMO_FIRST_NAME = "1PromotionName";
    final static String PROMO_FIRST_DESCRIPTION = "1PromotionDescription";
    final static String PROMO_FIRST_SUMMARY_DESCRIPTION = "1PromotionSummaryDescription";
    final static String PROMO_FIRST_START_DAY_LABEL = "1PromotionStartDateLabel";
    final static String PROMO_FIRST_START_DAY = "1PromotionStartDate";
    final static String PROMOTION_FORFEIT_BUTTON = "1PromotionForfeitButton";
    final static String PROMOTION_EXPAND_PROMO = "expandPromotionText";
    final static String PROMOTION_BET_MARKET_LABEL = "1PromotionBetMarketLabel";
    final static String DIRECTION_TYPE = "1PromotionBetDirection";
    final static String PROMOTION_EXPAND_ARROW = "expandPromotionArrow";
    final static String PROMOTION_BET_PROFIT = "1PromotionBetProfit";
    final static String PROMOTION_BET_STAKE = "1PromotionBetStake";
    final static String PROMOTION_SUB_ITEM = "PromotionItem";

    @AndroidFindBy(accessibility = PROMO_FIRST_NAME)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_NAME)
    private WebElement promoName;

    @AndroidFindBy(accessibility = PROMO_FIRST_DESCRIPTION)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_DESCRIPTION)
    private WebElement promoDescription;

    @AndroidFindBy(accessibility = PROMO_FIRST_SUMMARY_DESCRIPTION)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_SUMMARY_DESCRIPTION)
    private WebElement promoSummaryDescription;

    @AndroidFindBy(accessibility = PROMO_FIRST_START_DAY_LABEL)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_START_DAY_LABEL)
    private WebElement startDayLabel;

    @AndroidFindBy(accessibility = PROMO_FIRST_START_DAY)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_START_DAY)
    private WebElement startDay;

    @AndroidFindBy(accessibility = PROMOTION_FORFEIT_BUTTON)
    @iOSXCUITFindBy(accessibility = PROMOTION_FORFEIT_BUTTON)
    private WebElement forfeitButton;

    @AndroidFindBy(accessibility = PROMOTION_EXPAND_PROMO)
    @iOSXCUITFindBy(accessibility = PROMOTION_EXPAND_PROMO)
    private WebElement expandPromo;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET_LABEL)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET_LABEL)
    private WebElement promotionBetMarketLabel;

    @AndroidFindBy(accessibility = DIRECTION_TYPE)
    @iOSXCUITFindBy(accessibility = DIRECTION_TYPE)
    private WebElement directionType;

    @AndroidFindBy(accessibility = PROMOTION_EXPAND_ARROW)
    @iOSXCUITFindBy(accessibility = PROMOTION_EXPAND_ARROW)
    private WebElement expandArrow;

    @AndroidFindBy(accessibility = PROMOTION_BET_PROFIT)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_PROFIT)
    private WebElement promotionBetProfit;

    @AndroidFindBy(accessibility = PROMOTION_BET_STAKE)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_STAKE)
    private WebElement promotionBetStake;

    @AndroidFindBy(accessibility = PROMOTION_SUB_ITEM)
    @iOSXCUITFindBy(accessibility = PROMOTION_SUB_ITEM)
    private WebElement promotionSubItem;


    public PromotionsActiveScreen(WebDriver driver) {
        super(driver);
    }

    public String getFirstPromotionNameText() {
        return promoName.getText();
    }


    public String getFirstPromotionDescriptionText() {
        return promoDescription.getText();
    }

    public String getFirstPromotionSummaryDescriptionText() {
        return promoSummaryDescription.getText();
    }


    public String getFirstPromotionStartDayLabelText() {
        return startDayLabel.getText();
    }

    public String getFirstPromotionStartDayText() {
        return startDay.getText();
    }

    public void waitUntilFirstPromotionVisible() {
        waitVisibilityOfElement(promoName);
    }

    public boolean isForfeitButtonIsDisplayed() {
        return forfeitButton.isDisplayed();
    }

    public String getForfeitButtonText() {
        return forfeitButton.getText();
    }

    public void clickExpandPromo() {
        expandPromo.click();
    }

    public boolean isPromotionBetMarketLabelDisplayed() {
        return promotionBetMarketLabel.isDisplayed();
    }

    public String directionTypeCheck() {
        return directionType.getText();
    }

    public void clickExpandArrow() {
        expandArrow.click();
    }

    public String getPromotionBetProfit() {
        return promotionBetProfit.getText();
    }

    public String getPromotionBetStake() {
        return promotionBetStake.getText();
    }

    public void waitUntilLabelBecomesVisible() {
        waitVisibilityOfElement(promotionBetMarketLabel);
    }

    public boolean isPromotionSubItemNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(PROMOTION_SUB_ITEM);
    }
}