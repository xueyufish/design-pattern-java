
package com.xueyufish.dp.template;

/**
 * @author xueyufish
 */
public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        AbstractClass concrete1 = new ConcreteClass1();
        concrete1.templateMethod();

        AbstractClass concrete2 = new ConcreteClass2();
        concrete2.templateMethod();
    }
}
