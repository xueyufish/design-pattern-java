
package com.xueyufish.dp.observer;

import lombok.AllArgsConstructor;

/**
 * 具体观察者
 *
 * @author xueyufish
 */
@AllArgsConstructor
public class ConcreteObserver1 implements Observer {

    private String name;

    private String message;

    @Override
    public void update() {
        System.out.println("ConcreteObserver1: " + name + " get message " + message);
    }
}
