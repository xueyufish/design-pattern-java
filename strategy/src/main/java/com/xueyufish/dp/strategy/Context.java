package com.xueyufish.dp.strategy;

/**
 * @author xueyufish
 */

public class Context {

	private SortStrategy strategy;

	public Context(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public int[] sort(int[] nums) {
		return this.strategy.sort(nums);
	}
}
