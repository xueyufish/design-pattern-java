
package com.xueyufish.dp.fm;

/**
 * @author xueyufish
 */

public class FactoryA implements Factory {

    @Override
    public Product build() {
        return new ProductA();
    }
}
