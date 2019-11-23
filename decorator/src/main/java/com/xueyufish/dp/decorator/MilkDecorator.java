
package com.xueyufish.dp.decorator;

/**
 * @author xueyufish
 */

public class MilkDecorator extends AbstractDecorator {

    public MilkDecorator(Drink decorator) {
        super(decorator);
    }

    @Override
    public float cost() {
        return super.cost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
