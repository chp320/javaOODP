package com.solid.lsp;

public class LspDemo {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.setPrice(5000);
        System.out.println("bag.getPrice() = " + bag.getPrice());

        DiscountedBag dc = new DiscountedBag();
        dc.setPrice(5000);
        System.out.println("dc.getPrice() = " + dc.getPrice());
    }
}
