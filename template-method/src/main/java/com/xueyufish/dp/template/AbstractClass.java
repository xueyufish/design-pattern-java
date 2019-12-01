
package com.xueyufish.dp.template;

/**
 * @author xueyufish
 */
public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    void primitiveOperation1() {
        System.out.println("AbstractClass.primitiveOperation1");
    }

    void primitiveOperation2() {
        System.out.println("AbstractClass.primitiveOperation2");
    }

}
