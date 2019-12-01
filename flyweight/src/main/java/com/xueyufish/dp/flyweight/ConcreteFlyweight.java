
package com.xueyufish.dp.flyweight;

/**
 * @author xueyufish
 */
public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight.intrinsicState: " + intrinsicState);
        System.out.println("ConcreteFlyweight.extrinsicState: " + extrinsicState);
    }
}
