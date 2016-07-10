import com.vivien.Cart;
import com.vivien.CartItem;
import com.vivien.Good;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SalesTest {
    @Test
    public void should_return_true_when_input_ITEM000001() throws Exception {
        Good good = defaultGoods();
        Sales sales = new Sales(good);
        String salesInfor = sales.getGoodFromBarcode(good.getBarcode());
        assertTrue(salesInfor.contains(good.getCategory()));
        assertTrue(salesInfor.contains(good.getUnit()));
        assertTrue(salesInfor.contains(good.getName()));
        assertTrue(salesInfor.contains(good.getSubCategory()));
    }

    @Test
    public void should_return_true_when_input_ITEM000001_3() throws Exception {
        Good good = defaultGoods();
        Sales sales = new Sales(good);
        String prices = sales.getGoodFromBarcode("ITEM000001,ITEM000001,ITEM000001");
        assertTrue(prices.contains("小计："+6.00));
    }

    @Test
    public void should_return_true_when_input_ITEM000003_3() throws Exception {
        Good good = defaultGoods();
        good.setBarcode("ITEM000003");
        good.setName("雪碧");
        Sales sales = new Sales(good);
        String prices = sales.getGoodFromBarcode("ITEM000003,ITEM000003,ITEM000003");
        assertTrue(prices.contains("小计："+9.00));
    }

    Good defaultGoods(){
        Good good = new Good();
        String barcode = "ITEM000001";
        String category = "食品";
        String unit = "瓶";
        String name = "可口可乐";
        String subCategory = "碳酸饮料";
        good.setBarcode(barcode);
        good.setCategory(category);
        good.setUnit(unit);
        good.setName(name);
        good.setPrice(3);
        good.setSubCategory(subCategory);
        return good;
    }
}