package com.xueyufish.dp.command;

/**
 * @author xueyufish
 */

public class Invoker {

	public void execute(Command command){
		command.execute();
	}
}
