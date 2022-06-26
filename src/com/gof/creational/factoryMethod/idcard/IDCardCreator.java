package com.gof.creational.factoryMethod.idcard;

import com.gof.creational.factoryMethod.framework.Creator;
import com.gof.creational.factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * createProduct, registerProduct 메서드를 구현
 */
public class IDCardCreator extends Creator {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
