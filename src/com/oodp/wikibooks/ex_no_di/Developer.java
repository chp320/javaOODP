package com.oodp.wikibooks.ex_no_di;

public class Developer {

    private DevWay devWay;

    public Developer() {
        devWay = new UseDB();
    }

    public String getDevWay() {
        return "개발 방법: " + devWay.getWay();
    }
}
