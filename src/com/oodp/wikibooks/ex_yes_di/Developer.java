package com.oodp.wikibooks.ex_yes_di;

public class Developer {
    private DevWay devWay;

    /* 개발 방법을 인자로 전달 받는다 */
    public Developer(DevWay devWay) {
        this.devWay = devWay;
    }
    
    public String getDevWay() {
        return "개발 방법: " + devWay.getWay();
    }
}
