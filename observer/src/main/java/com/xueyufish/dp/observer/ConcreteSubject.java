
package com.xueyufish.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体目标
 * <p>
 * 将有关状态存入各具体观察者（ConcreteObserver）对象, 当状态发生改变时, 向各个观察者发出通知
 *
 * @author xueyufish
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!observers.isEmpty()) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
