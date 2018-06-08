package com.xueyufish.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	void test() {
		List<Character> compositeState = new ArrayList<>(5);
		compositeState.add('a');
		compositeState.add('b');
		compositeState.add('c');
		compositeState.add('a');
		compositeState.add('b');

		FlyweightFactory flyFactory = new FlyweightFactory();
		Flyweight compositeFly1 = flyFactory.factory(compositeState);
		Flyweight compositeFly2 = flyFactory.factory(compositeState);
		compositeFly1.operation("Composite Call");

		Character state = 'a';
		Flyweight fly1 = flyFactory.factory(state);
		Flyweight fly2 = flyFactory.factory(state);

		System.out.println("compositeFly1 == compositeFly1：" + (compositeFly1 == compositeFly2));
		System.out.println("fly1 == fly2：" + (fly1 == fly2));

	}


}
