
package com.xueyufish.dp.fm;

/**
 * @author xueyufish
 */

public class FactoryB implements Factory {

    @Override
    public Product build() {
        return new ProductB();
    }
}
