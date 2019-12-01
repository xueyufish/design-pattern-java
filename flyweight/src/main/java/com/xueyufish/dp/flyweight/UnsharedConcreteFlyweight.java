
package com.xueyufish.dp.flyweight;

/**
 * @author xueyufish
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    private String allState;

    public UnsharedConcreteFlyweight(String allState) {
        this.allState = allState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight.allState" + allState);
        System.out.println("UnsharedConcreteFlyweight.extrinsicState" + extrinsicState);
    }
}
