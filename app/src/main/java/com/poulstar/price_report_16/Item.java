package com.poulstar.price_report_16;

public class Item {
    String name;
    String price;
    String base;
    String date;

    public Item(String name, String price, String base, String date){
        this.name = name;
        this.price = price;
        this.base = base;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }
}
