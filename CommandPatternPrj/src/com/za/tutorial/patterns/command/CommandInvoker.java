package com.za.tutorial.patterns.command;
import java.util.HashMap;


public class CommandInvoker {
	private HashMap<String, Command> commandMap = new HashMap<String, Command>();
	private CommandMgr mgr = null;
	public CommandInvoker(CommandMgr mgr){
		this.mgr = mgr;
		commandMap.put("open", new OpenCommand(mgr));
		commandMap.put("save", new SaveCommand(mgr));
		commandMap.put("close", new CloseCommand(mgr));
	}
	
	public void invoke(String command){
//		System.out.println("entering CommandInvoker.invoke...");
		commandMap.get(command).doSmth();
	}

	public CommandMgr getMgr() {
		return mgr;
	}
	
	
}
