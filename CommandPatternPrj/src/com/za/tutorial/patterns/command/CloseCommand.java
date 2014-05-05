package com.za.tutorial.patterns.command;

public class CloseCommand extends Command {
	public CloseCommand(CommandMgr mgr){
		this.mgr = mgr;
	}

	@Override
	void doSmth() {
		
		mgr.close(this);
	}

}
