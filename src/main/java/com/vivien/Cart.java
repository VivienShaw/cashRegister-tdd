package com.vivien;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Cart {

    List<CartItem> items = new ArrayList<CartItem>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public CartItem getItem(Good good) {
        for (CartItem item : items) {
            if (item.getGood().equals(good)) {
                return item;
            }
        }
        return null;
    }

    public boolean isContainsGood(Good good) {
        for (CartItem item : items) {
            if (item.getGood().equals(good)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder cartInfo = new StringBuilder();
        for (CartItem item : items) {
            cartInfo.append(item.getGood().toString());
            cartInfo.append("number:"+item.getGoodsNum());
        }
        return cartInfo.toString();
    }
}
