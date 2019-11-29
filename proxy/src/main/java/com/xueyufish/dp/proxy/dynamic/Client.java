
package com.xueyufish.dp.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author xueyufish
 */
public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        Subject subject = new RealSubject();
        CustomProxy customProxy = new CustomProxy(subject);
        subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), subject.getClass().getInterfaces(),
            customProxy);
        subject.execute();
    }
}
