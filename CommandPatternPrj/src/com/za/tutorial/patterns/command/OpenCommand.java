package com.za.tutorial.patterns.command;

public class OpenCommand extends Command {

	public OpenCommand(CommandMgr mgr){
		this.mgr = mgr;
	}
	@Override
	void doSmth() {
		mgr.open(this);

	}

}
