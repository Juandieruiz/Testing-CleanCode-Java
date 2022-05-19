import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyUtil {

    public static String format(double money) {
        return format(money, "€");
    }

    public static String format(double money, String symbol) {
        if(symbol == null) {
            throw new IllegalArgumentException("Symbol cannot be null");
        }

        if(money < 0){
            symbol = "-" + symbol;
            money = money * (-1);
        }

        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, RoundingMode.HALF_UP);

        return symbol + rounded;
    }


}
