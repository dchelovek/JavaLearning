package com.za.tutorial.patterns.command;
import java.util.LinkedList;


public class CommandMgr {

	private LinkedList<Command> commandHistory = new LinkedList<Command>();
	public void open(Command command){
		System.out.println("Running open command");
		recordHistory(command);
	}
	
	public void close(Command command){
		System.out.println("Running close command");
		recordHistory(command);
	}
	
	public void save(Command command){
		System.out.println("Running save command");
		recordHistory(command);
	}
	
	public static void printHistory(CommandMgr mgr){
		System.out.println(mgr.commandHistory.toString());
	}
	
	private void recordHistory(Command command){
		commandHistory.addFirst(command);
	}
}
