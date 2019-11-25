
package com.xueyufish.dp.builder;

/**
 * @author xueyufish
 */
public class Client {

    public static void main(final String[] arguments) {

        final Builder builder = new ConcreteBuilder();
        final Director director = new Director(builder);

        director.construct();

        Product product = builder.getResult();

        System.out.println(product.toString());
    }
}
