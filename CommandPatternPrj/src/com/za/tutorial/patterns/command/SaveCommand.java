package com.za.tutorial.patterns.command;

public class SaveCommand extends Command {
	public SaveCommand(CommandMgr mgr){
		this.mgr = mgr;
	}

	@Override
	void doSmth() {
		mgr.save(this);

	}

}
