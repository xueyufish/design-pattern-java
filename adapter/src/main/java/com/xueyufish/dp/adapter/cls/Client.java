
package com.xueyufish.dp.adapter.cls;

/**
 * @author xueyufish
 *         Created at 2018-05-29
 */

public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        Target target = new Adapter();
        target.request();
    }

}
