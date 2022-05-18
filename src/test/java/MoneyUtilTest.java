import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1500);
        Assert.assertEquals("€1500.00", money );
    }

}
