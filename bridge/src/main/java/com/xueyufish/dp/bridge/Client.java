
package com.xueyufish.dp.bridge;

/**
 * @author xueyufish
 */
public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
