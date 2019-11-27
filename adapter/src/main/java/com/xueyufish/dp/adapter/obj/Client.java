
package com.xueyufish.dp.adapter.obj;

/**
 * @author xueyufish
 */
public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        Target adapter = new Adapter(new Adaptee());
        adapter.requesst();
    }

}
