
package com.xueyufish.dp.strategy;

/**
 * @author xueyufish
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void someOperate() {
        strategy.opetate();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
