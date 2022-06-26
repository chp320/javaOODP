package com.gof.creational.factoryMethod;

import com.gof.creational.factoryMethod.framework.Creator;
import com.gof.creational.factoryMethod.framework.Product;
import com.gof.creational.factoryMethod.idcard.IDCardCreator;

public class Main {
    public static void main(String[] args) {
        Creator creator = new IDCardCreator();
        Product card1 = creator.create("홍길동");
        Product card2 = creator.create("이순신");
        Product card3 = creator.create("강감찬");

        card1.use();
        card2.use();
        card3.use();
    }
}
