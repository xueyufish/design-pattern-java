
package com.xueyufish.dp.builder;

/**
 * @author xueyufish
 */

public interface Builder {

    void buildColor(final String color);

    void buildWheels(final int wheels);

    Product getResult();

}
