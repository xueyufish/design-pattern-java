package com.xueyufish.dp.decorator;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String... args) {
		new Client().test();
	}

	private void test() {
		Drink drink = new Coffee();
		System.out.println(drink.getDescription() + ":" + drink.cost());

		drink = new MilkDecorator(drink);
		System.out.println(drink.getDescription() + ":" + drink.cost());

		drink = new SugarDecorator(drink);
		System.out.println(drink.getDescription() + ":" + drink.cost());

		drink = new SugarDecorator(drink);
		System.out.println(drink.getDescription() + ":" + drink.cost());
	}

}
