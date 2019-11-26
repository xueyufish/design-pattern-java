
package com.xueyufish.dp.adapter.cls;

/**
 * @author xueyufish
 */

public class Adapter implements Target, Adaptee {

    @Override
    public void request() {
        System.out.println("request");
    }

    @Override
    public void specificRequest() {
        System.out.println("specificRequest");
    }
}
