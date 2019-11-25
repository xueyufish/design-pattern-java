
package com.xueyufish.dp.builder;

/**
 * @author xueyufish
 */
public class Director {

    private Builder builder;

    public Director(final Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildWheels(4);
        builder.buildColor("red");
    }
}
