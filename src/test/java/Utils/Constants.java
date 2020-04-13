package Utils;


public class Constants {

    public static int SLEEP = 1000;

    public static String BUY_SELL_PATTERN = "^(Sell|Buy)$";
    public static String BOUGHT_SOLD_PATTERN = "^(Sold|Bought)$";
    public static String MONEY_PATTERN = "^ (|-)£ (|-)(|\\d{1,3},)\\d{1,3}.\\d{2}$";
    //TODO remove after fix format on promo side
    public static String TEMPORARY_MONEY_PATTERN_FOR_PROMO = "(|-)£(\\d{1,5}.\\d{1,2})|£\\d{1,2}|£ \\d{1,2}| £\\d{1,2}|  £ 0";
    //TODO remove after fix format MyBets Item Bet Value
    public static String BET_VALUE_MONEY_PATTERN = "^(-|)£(|\\d{1,3},)\\d{1,3}.\\d{2}(| Profit| Loss)$";
    public static String DATA_PATTERN = "\\d{2}:\\d{2}";
    public static String FINDER_DATA_PATTERN = "\\d{2}:\\d{2}|Live";
    public static String SPREAD_PATTERN = "((-|)\\d{1,2}.\\d{1,2}|\\d{1,2}) - (\\d{1,2}.\\d{1,2}|\\d{1,2})";

    public static final String TODAY = "Today";
    public static final String TOMORROW = "Tomorrow";
    public static final String IN_PROGRESS = "In Progress";
    public static final String HORSE_RACING = "Horse Racing";
    public static final String LONG_TERM = "Long Term";
    public static final String TOTALS = "Totals";
    public static final String BUY = "Buy";
    public static final String SELL = "Sell";
}