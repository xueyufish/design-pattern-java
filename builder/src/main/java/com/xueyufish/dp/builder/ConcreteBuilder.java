
package com.xueyufish.dp.builder;

/**
 * @author xueyufish
 */
public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void buildColor(String color) {
        product.setColor(color);
    }

    @Override
    public void buildWheels(int wheels) {
        product.setWheels(wheels);
    }

    @Override
    public Product getResult() {
        return product;
    }

}
