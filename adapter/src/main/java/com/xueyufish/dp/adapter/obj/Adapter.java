
package com.xueyufish.dp.adapter.obj;

/**
 * 对 Adaptee 的接口与 Target 接口进行适配
 *
 * @author xueyufish
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void requesst() {
        adaptee.specificRequest();
    }

}
