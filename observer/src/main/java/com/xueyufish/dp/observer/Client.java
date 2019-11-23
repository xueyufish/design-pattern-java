
package com.xueyufish.dp.observer;

/**
 * @author xueyufish
 */

public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    private void test() {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1("zhangsan", "123");
        Observer observer2 = new ConcreteObserver2("lisi", "456");
        Observer observer3 = new ConcreteObserver3("wangwu", "789");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        subject.notifyObserver();

        subject.removeObserver(observer2);
        subject.notifyObserver();
    }
}
