import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1500);
        Assert.assertEquals("€1500.00", money );
    }

    @Test
    public void moneyNegativeTest() {
        String money = MoneyUtil.format(-1500.0);
        Assert.assertEquals("-€1500.00", money );
    }

    @Test
    public void newSimbolTest() {
        String money = MoneyUtil.format(-1500.0, "$");
        Assert.assertEquals("-$1500.00", money );
    }

    @Test(expected = IllegalArgumentException.class)
    public void SimbolNullTest() {
        MoneyUtil.format(-1500.0, null);
        
    }


}
