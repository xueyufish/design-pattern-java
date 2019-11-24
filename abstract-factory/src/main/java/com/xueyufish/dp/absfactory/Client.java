
package com.xueyufish.dp.absfactory;

/**
 * @author xueyufish
 */
public class Client {

    private Client() {
    }

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        String productA1 = factory1.createProductA().productA1();
        String productA2 = factory1.createProductA().productA2();

        AbstractFactory factory2 = new ConcreteFactory2();
        String productB1 = factory2.createProductB().productB1();
        String productB2 = factory2.createProductB().productB2();

        System.out.printf("productA1: %s, productA2: %s" + System.lineSeparator(), productA1, productA2);
        System.out.printf("productB1: %s, productB2: %s" + System.lineSeparator(), productB1, productB2);
    }
}
