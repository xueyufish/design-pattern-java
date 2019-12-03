
package com.xueyufish.dp.observer;

/**
 * 目标
 * <p>
 * 定义观察者需要实现的职责，提供注册和删除观察者对象的接口
 *
 * @author xueyufish
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
