package com.solid.lsp;

/**
 * 가격을 설정하고 조회하는 기능의 클래스
 * => 가격은 설정된 가격 그대로 조회된다.
 */
public class Bag {
    private int price = 0 ;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
