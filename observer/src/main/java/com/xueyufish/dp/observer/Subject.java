package com.xueyufish.dp.observer;

/**
 * @author xueyufish
 */

public interface Subject {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();
}
