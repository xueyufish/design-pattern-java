
package com.xueyufish.dp.decorator;

/**
 * @author xueyufish
 */

public class SugarDecorator extends AbstractDecorator {

    public SugarDecorator(Drink decorator) {
        super(decorator);
    }

    @Override
    public float cost() {
        return super.cost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
