package com.xueyufish.dp.bridge;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xueyufish
 */
@Getter
@Setter
public abstract class Abstraction {

	private Implementor implementor;

	protected void operation() {
		implementor.operation();
	}
}
