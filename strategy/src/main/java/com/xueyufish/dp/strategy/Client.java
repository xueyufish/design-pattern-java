package com.xueyufish.dp.strategy;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	private void test() {
		int[] nums = {1, 5, 8, 2, 4, 3};

		Context context = new Context(new QuicksortStrategy());
		context.sort(nums);

		context.setStrategy(new MergesortStrategy());
		context.sort(nums);

		context.setStrategy(new ShellsortStrategy());
		context.sort(nums);
	}
}
