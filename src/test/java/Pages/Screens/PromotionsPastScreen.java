package Pages.Screens;

import Pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Waiters.waitVisibilityOfElement;


public class PromotionsPastScreen extends BasePage {

    final static String PROMO_FIRST_NAME = "itemstore@/Past/1PromotionName";
    final static String PROMO_FIRST_DESCRIPTION = "itemstore@/Past/1PromotionDescription";
    final static String PROMO_FIRST_SUMMARY_DESCRIPTION = "itemstore@/Past/1PromotionSummaryDescription";
    final static String PROMO_EXPAND_TEXT = "expandPromotionText";
    final static String PROMO_EXPAND_ARROW = "expandPromotionArrow";

    final static String PROMOTION_SUB_ITEM = "PromotionItem";
    final static String PROMOTION_BET_MARKET_LABEL = "1PromotionBetMarketLabel";
    final static String PROMOTION_BET_MARKET = "1PromotionBetMarket";
    final static String PROMOTION_BET_MARKET_CATEGORY = "1PromotionBetCategory";
    final static String PROMOTION_BET_MARKET_DIRECTION_LABEL = "1PromotionBetDirectionLabel";
    final static String PROMOTION_BET_MARKET_DIRECTION_TYPE = "1PromotionBetDirection";
    final static String PROMOTION_BET_MARKET_STAKE_LABEL = "1PromotionBetStakeLabel";
    final static String PROMOTION_BET_MARKET_STAKE_TYPE = "1PromotionBetStake";


    @AndroidFindBy(accessibility = PROMO_FIRST_NAME)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_NAME)
    private WebElement firstPromoName;

    @AndroidFindBy(accessibility = PROMO_FIRST_DESCRIPTION)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_DESCRIPTION)
    private WebElement firstPromoDescription;

    @AndroidFindBy(accessibility = PROMO_FIRST_SUMMARY_DESCRIPTION)
    @iOSXCUITFindBy(accessibility = PROMO_FIRST_SUMMARY_DESCRIPTION)
    private WebElement firstPromoSummaryDescription;

    @AndroidFindBy(accessibility = PROMO_EXPAND_TEXT)
    @iOSXCUITFindBy(accessibility = PROMO_EXPAND_TEXT)
    private WebElement firstPromoExpandText;

    @AndroidFindBy(accessibility = PROMO_EXPAND_ARROW)
    @iOSXCUITFindBy(accessibility = PROMO_EXPAND_ARROW)
    private WebElement firstPromoExpandArrow;

    @AndroidFindBy(accessibility = PROMOTION_SUB_ITEM)
    @iOSXCUITFindBy(accessibility = PROMOTION_SUB_ITEM)
    private WebElement firstPromotionSubItem;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET_LABEL)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET_LABEL)
    private WebElement firstPromotionBetMarketLabel;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET)
    private WebElement firstPromotionBetMarket;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET_CATEGORY)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET_CATEGORY)
    private WebElement firstPromotionBetMarketCategory;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET_DIRECTION_LABEL)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET_DIRECTION_LABEL)
    private WebElement firstPromotionBetMarketDirectionLabel;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET_DIRECTION_TYPE)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET_DIRECTION_TYPE)
    private WebElement firstPromotionBetMarketDirectionType;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET_STAKE_LABEL)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET_STAKE_LABEL)
    private WebElement firstPromotionBetMarketStakeLabel;

    @AndroidFindBy(accessibility = PROMOTION_BET_MARKET_STAKE_TYPE)
    @iOSXCUITFindBy(accessibility = PROMOTION_BET_MARKET_STAKE_TYPE)
    private WebElement firstPromotionBetMarketStakeType;


    public PromotionsPastScreen(WebDriver driver) {
        super(driver);
    }

    public String getFirstPromotionNameText() {
        return firstPromoName.getText();
    }

    public void waitUntilFirstPromotionNameIsVisible() {
        waitVisibilityOfElement(firstPromoName);
    }

    public String getFirstPromotionDescriptionText() {
        return firstPromoDescription.getText();
    }

    public String getFirstPromotionSummaryDescriptionText() {
        return firstPromoSummaryDescription.getText();
    }

    public String getFirstPromotionExpandText() {
        return firstPromoExpandText.getText();
    }

    public boolean isFirstPromotionExpandArrowDisplayed() {
        return firstPromoExpandArrow.isDisplayed();
    }

    public void clickOnFirstPromotionExpandArrow() {
        firstPromoExpandArrow.click();
    }

    public void waitUntilFirstPromotionSubItemVisible() {
        waitVisibilityOfElement(firstPromotionSubItem);
    }

    public boolean isFirstPromotionSubItemNotDisplayed() {
        return isElementsByAccessibilityIdNotPresent(PROMOTION_SUB_ITEM);
    }

    public String getFirstPromotionMarketLabelText() {
        return firstPromotionBetMarketLabel.getText();
    }

    public String getFirstPromotionMarketText() {
        return firstPromotionBetMarket.getText();
    }

    public String getFirstPromotionMarketCategoryText() {
        return firstPromotionBetMarketCategory.getText();
    }

    public String getFirstPromotionMarketDirectionLabelText() {
        return firstPromotionBetMarketDirectionLabel.getText();
    }

    public String getFirstPromotionMarketDirectionTypeText() {
        return firstPromotionBetMarketDirectionType.getText();
    }

    public String getFirstPromotionMarketStakeLabelText() {
        return firstPromotionBetMarketStakeLabel.getText();
    }

    public String getFirstPromotionMarketStakeTypeText() {
        return firstPromotionBetMarketStakeType.getText();
    }
}