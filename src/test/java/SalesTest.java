import com.vivien.Good;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalesTest {
    @Test
    public void should_return_true_when_input_ITEM000001() throws Exception {
        String barcode = "ITEM000001";
        Good good = new Good();
        Sales sales = new Sales();
        good = sales.getGoodFromBarcode(barcode);
        assertEquals(good.toString(),"this is Goods");
    }
}