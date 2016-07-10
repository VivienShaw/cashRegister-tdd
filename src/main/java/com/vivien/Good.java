package com.vivien;

public class Good {

    String barcode;
    String name;
    String unit;
    String category;
    String subCategory;
    float price;

    @Override
    public String toString() {
        return "barcode:"+ barcode
                +"name"+ name
                +"unit"+ unit
                +"category"+category
                +"subCategory"+subCategory
                +"price"+price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
