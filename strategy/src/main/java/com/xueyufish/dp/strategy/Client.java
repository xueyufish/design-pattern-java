
package com.xueyufish.dp.strategy;

/**
 * @author xueyufish
 */
public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        Context context = new Context(new ConcreteStrategyA());
        context.someOperate();

        context.setStrategy(new ConcreteStrategyB());
        context.someOperate();

        context.setStrategy(new ConcreteStrategyC());
        context.someOperate();

    }
}