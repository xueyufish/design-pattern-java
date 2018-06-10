package com.xueyufish.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
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
