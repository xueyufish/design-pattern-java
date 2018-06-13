package com.xueyufish.dp.state;

/**
 * @author xueyufish
 */

public class ConcreteStateA implements State {

	@Override
	public void handle(String param) {
		System.out.println("ConcreteStateA handle ：" + param);
	}
}
