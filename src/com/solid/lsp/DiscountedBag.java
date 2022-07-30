package com.solid.lsp;

/**
 * 할인된 기능을 가지는 클래스
 * Bag 클래스의 기본 기능을 그대로 상속
 */
public class DiscountedBag extends Bag {
    private double discountedRate = 0 ;

    public void setDiscounted(double dc) {
        discountedRate = dc ;
    }

    public void applyDiscount(int price) {
        super.setPrice(price - (int) (discountedRate * price));
    }
}
