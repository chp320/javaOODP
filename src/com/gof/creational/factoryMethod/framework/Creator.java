package com.gof.creational.factoryMethod.framework;

public abstract class Creator {
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

    // template method?? 생성(createProduct), 등록(registerProduct)를 하위 클래스에서 상세 구현...
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
