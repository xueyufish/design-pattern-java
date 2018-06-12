package com.xueyufish.dp.command;

/**
 * @author xueyufish
 */

public class TurnOffCommand implements Command {

	private Receiver receiver;

	public TurnOffCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.turnOff();
	}
}
