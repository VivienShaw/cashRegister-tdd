package com.vivien;

public class Good {

    String barcode;
    String name;
    String unit;
    String category;
    String subCategory;
    float price;


    boolean isSale;

    @Override
    public String toString() {
        return "barcode:"+ barcode
                +"name:"+ name
                +"unit:"+ unit
                +"category:"+category
                +"subCategory:"+subCategory
                +"price:"+price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Good) {
            if (((Good) obj).barcode.equals(this.barcode)
                    && ((Good) obj).name.equals(this.name)
                    && ((Good) obj).category.equals(this.category)
                    && ((Good) obj).price == this.price
                    && ((Good) obj).unit.equals(this.unit)
                    && ((Good) obj).subCategory.equals(this.subCategory)) {
                return true;
            }
        }
        return false;
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

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }
}
