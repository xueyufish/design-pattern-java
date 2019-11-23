
package com.xueyufish.dp.observer;

import lombok.AllArgsConstructor;

/**
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
