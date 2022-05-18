import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyUtil {

    public static String format(double money) {

        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, RoundingMode.HALF_UP);
        return "€" + rounded;
    }


}
