
import com.vivien.Cart;
import com.vivien.CartItem;
import com.vivien.Good;

import java.util.List;

public class Sales {

    Good[] goods;

    public Sales(Good... good) {

        goods = good;
    }

    public String getGoodFromBarcode(String barcodes) {
        String[] barcode = barcodes.split(",");
        Cart cartInfo = new Cart();
        int goodsNum;
        for (int i=0;i<barcode.length;i++) {
            CartItem currentItem = new CartItem();
            for (Good good : goods) {
                if (good.getBarcode().equals(barcode[i])) {
                    if (cartInfo.isContainsGood(good)) {
                        goodsNum = cartInfo.getItem(good).getGoodsNum();
                        cartInfo.getItem(good).setGoodsNum(++goodsNum);
                    }
                    currentItem.setGood(good);
                    currentItem.setGoodsNum(1);
                    if (returnSalesGoods().contains(barcode[i])) {
                        currentItem.getGood().setSale(true);
                    }
                    cartInfo.addItem(currentItem);
                }
            }
        }
        return cartInfo.toString();
    }

    public String returnSalesGoods() {
        return "ITEM000001,ITEM000002";
    }


}
