package com.gof.structural.facade.javatpoint;

/**
 * Step5.
 * Create a ShopKeeper concrete class that will use MobileShop interface.
 */
public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public ShopKeeper() {
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new BlackBerry();
    }

    public void iphoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

    public void blackBerrySale() {
        blackberry.modelNo();
        blackberry.price();
    }
}
