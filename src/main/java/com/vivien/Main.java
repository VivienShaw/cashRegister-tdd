package com.vivien;

public class Main {

    public static void main(String[] args) {
        Good good1 = defaultGoods();
        good1.setBarcode("ITEM000003");
        good1.setName("雪碧");
        Good good2 = defaultGoods();
        Good good3 = defaultGoods();
        good3.setBarcode("ITEM000002");
        good3.setName("百事可乐");
        Sales sales = new Sales(good1,good2,good3);
        String prices = sales.getGoodFromBarcode("ITEM000001,ITEM000001,ITEM000001,ITEM000003,ITEM000003,ITEM000003");
        System.out.print(prices);
    }

    static Good defaultGoods(){
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
